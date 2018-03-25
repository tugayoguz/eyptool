package tr.com.vortechs.bilisim.bys.eyp.tool.service.builder.impl;

import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.apache.poi.openxml4j.util.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import dpt.eYazisma.tipler.Araclar;
import dpt.eYazisma.tipler.OzetModu;
import dpt.eYazisma.tipler.Paket;
import dpt.eYazisma.tipler.PaketModu;
import tr.com.vortechs.bilisim.bys.eyp.tool.context.EypToolConstants;
import tr.com.vortechs.bilisim.bys.eyp.tool.domain.dto.EvrakDTO;
import tr.com.vortechs.bilisim.bys.eyp.tool.domain.dto.EvrakEkDTO;
import tr.com.vortechs.bilisim.bys.eyp.tool.service.EvrakSifreService;
import tr.com.vortechs.bilisim.bys.eyp.tool.service.builder.EypBuilder;
import urn.dpt.eyazisma.schema.xsd.koddagitimturu.STKodDagitimTuru;
import urn.dpt.eyazisma.schema.xsd.kodivedilik.STKodIvedilik;
import urn.dpt.eyazisma.schema.xsd.tipler.CTDagitim;
import urn.dpt.eyazisma.schema.xsd.tipler.CTEk;
import urn.dpt.eyazisma.schema.xsd.tipler.CTGercekSahis;
import urn.dpt.eyazisma.schema.xsd.tipler.CTIletisimBilgisi;
import urn.dpt.eyazisma.schema.xsd.tipler.CTImza;
import urn.dpt.eyazisma.schema.xsd.tipler.CTKisi;
import urn.dpt.eyazisma.schema.xsd.tipler.CTKurumKurulus;
import urn.un.unece.uncefact.codelist.specification.unqualifieddatatypesschemaModule._2.NameType;
import urn.un.unece.uncefact.codelist.specification.unqualifieddatatypesschemaModule._2.TextType;

@Component
public class EypBuilderImpl implements EypBuilder{

	@Autowired
	private EvrakSifreService sifreService;

	private Paket paket;
	private String path = "";

	public EypBuilderImpl() throws Exception{
		paket = Paket.ac(path + UUID.randomUUID(), PaketModu.Olustur);


	}

	@Override
	public EypBuilder addEvrak(EvrakDTO evrak) throws Exception {
		String ustYazi = "ustyazitemp.pdf";
		TextType konu = new TextType(); 
		konu.setValue(evrak.getKonuText());
		paket.getUstveri().konuBelirle(konu);
		paket.getUstveri().belgeNoBelirle(evrak.getEvrakSayi());

		Files.write(Paths.get(path + ustYazi),sifreService.sifreCoz(evrak.getIcerik().getDosyaIcerik()));
		paket.ustYaziEkle(path + ustYazi, "application/pdf", OzetModu.SHA256);

		paket.getUstveri().belgeIdBelirle(UUID.randomUUID());
		paket.getUstveri().tarihBelirle(Calendar.getInstance());
		paket.getUstveri().dosyaAdiBelirle(evrak.getKonuText());


		paket.paketAnahtarKelimeleriBelirle(evrak.getId()+","+evrak.getKonuText());  // Paketin Core bileşeninin unsurları tanımlanmaktadır.
		paket.paketBasligiBelirle(evrak.getKonuText()); 
		paket.paketDurumuBelirle("Son"); 
		paket.paketOlusturulmaTarihiBelirle(new Date()); 
		paket.paketSonGuncelleyenBelirle(EypToolConstants.kurumAdi); 
		paket.paketGuncellemeTarihiBelirle(new Nullable<Date>(new Date())); 

		return this;
	}

	@Override
	public EypBuilder addEk(List<EvrakEkDTO> ekler)  throws Exception {
		for(EvrakEkDTO ekDTO : ekler){
			CTEk ek = new CTEk();
			}
		return this;
	}

	@Override
	public Paket buildInstance()  throws Exception {
		System.out.println("1");
		paket.ustveriOlustur();
		System.out.println("2");
		paket.belgeHedefOlustur();
		System.out.println("3");
		paket.belgeImzaOlustur();
		System.out.println("4");
		paket.ekleriKontrolEt();
		System.out.println("5");
		paket.ilgileriKontrolEt();
		System.out.println("6");
		paket.getPaketOzeti().ekle(OzetModu.SHA256, new byte[3], new URI("/HariciBilesen/UDF_dosyasi/eYazışma.udf"), true);
		System.out.println("7");
		paket.paketOzetiOlustur(); 
		System.out.println("8");
		paket.kapat();
		return paket;
	}

	@Override
	public EypBuilder setEvrakOlusturan() throws Exception {

		CTKurumKurulus olusturan = new CTKurumKurulus();
		olusturan.setKKK(EypToolConstants.kkk); 

		olusturan.setAdi(new NameType());
		olusturan.getAdi().setValue(EypToolConstants.kurumAdi);

		CTIletisimBilgisi ib = new CTIletisimBilgisi();

		ib.setUlke(new NameType());
		ib.getUlke().setValue(EypToolConstants.ulke);

		ib.setIl(new NameType());
		ib.getIl().setValue(EypToolConstants.il);

		ib.setIlce(new NameType());
		ib.getIlce().setValue(EypToolConstants.ilce);

		ib.setAdres(new TextType());
		ib.getAdres().setValue(EypToolConstants.address);

		ib.setEPosta(EypToolConstants.eposta); 
		ib.setTelefon(EypToolConstants.telefon);
		ib.setTelefonDiger(EypToolConstants.digerTelefon);
		ib.setWebAdresi(EypToolConstants.webSitesi);

		olusturan.setIletisimBilgisi(ib);

		paket.getUstveri().olusturanBelirle(olusturan);
		return this;
	}

	@Override
	public EypBuilder addDagitim() throws Exception {
		CTDagitim dagitim = new CTDagitim();
		dagitim.setKurumKurulus(new CTKurumKurulus());
		dagitim.getKurumKurulus().setKKK("24306170");
		dagitim.setDagitimTuru(STKodDagitimTuru.GRG);
		dagitim.setIvedilik(STKodIvedilik.NRM);
		paket.getUstveri().dagitimEkle(dagitim);
		return this;
	}

	@Override
	public EypBuilder addHedef() throws Exception {
		CTDagitim dagitim1 = new CTDagitim();
		CTKurumKurulus dagitim1kurum = new CTKurumKurulus();
		dagitim1kurum.setKKK("24301012");
		NameType adiDagitim1kurum = new NameType();
		adiDagitim1kurum.setValue("Cumhurbaşkanlığı");
		dagitim1kurum.setAdi(adiDagitim1kurum);
		CTIletisimBilgisi ibDagitim1kurum = new CTIletisimBilgisi();
		ibDagitim1kurum.setUlke(new NameType());
		ibDagitim1kurum.getUlke().setValue("Türkiye");
		ibDagitim1kurum.setIl(new NameType());
		ibDagitim1kurum.getIl().setValue("Ankara");
		dagitim1kurum.setIletisimBilgisi(ibDagitim1kurum);
		dagitim1.setDagitimTuru(STKodDagitimTuru.GRG);
		dagitim1.setIvedilik(STKodIvedilik.IVD);
		dagitim1.setKurumKurulus(dagitim1kurum);

		paket.getBelgeHedef().hedefEkle(Araclar.dagitim2Hedef(dagitim1));
		return this;
	}

	@Override
	public EypBuilder addImza() throws Exception {
		CTImza imza1 = new CTImza();
		imza1.setImzalayan(new CTGercekSahis());
		imza1.getImzalayan().setKisi(new CTKisi());
		imza1.getImzalayan().getKisi().setIlkAdi(new NameType());
		imza1.getImzalayan().getKisi().getIlkAdi().setValue("Ahmet");
		imza1.getImzalayan().getKisi().setIkinciAdi(new NameType());
		imza1.getImzalayan().getKisi().getIkinciAdi().setValue("Demir");
		imza1.getImzalayan().getKisi().setOnEk(new TextType());
		imza1.getImzalayan().getKisi().getOnEk().setValue("Sayın");
		imza1.getImzalayan().getKisi().setSoyadi(new NameType());
		imza1.getImzalayan().getKisi().getSoyadi().setValue("Öztürk");
		imza1.getImzalayan().getKisi().setUnvan(new NameType());
		imza1.getImzalayan().getKisi().getUnvan().setValue("Doktor");
		imza1.getImzalayan().setTCKN("23908236712");
		imza1.setMakam(new NameType());
		imza1.getMakam().setValue("Daire Başkanı");
		imza1.setTCYK("234567891");
		imza1.setYetkiDevreden(new CTGercekSahis());
		imza1.getYetkiDevreden().setKisi(new CTKisi());
		imza1.getYetkiDevreden().getKisi().setIlkAdi(new NameType());
		imza1.getYetkiDevreden().getKisi().getIlkAdi().setValue("Kamuran");
		imza1.getYetkiDevreden().getKisi().setSoyadi(new NameType());
		imza1.getYetkiDevreden().getKisi().getSoyadi().setValue("Deniz");
		imza1.getYetkiDevreden().getKisi().setUnvan(new NameType());
		imza1.getYetkiDevreden().getKisi().getUnvan().setValue("Müsteþar");
		imza1.setVekaletVeren(new CTGercekSahis());
		imza1.getVekaletVeren().setKisi(new CTKisi());
		imza1.getVekaletVeren().getKisi().setIlkAdi(new NameType());
		imza1.getVekaletVeren().getKisi().getIlkAdi().setValue("Selim");
		imza1.getVekaletVeren().getKisi().setSoyadi(new NameType());
		imza1.getVekaletVeren().getKisi().getSoyadi().setValue("Yılmaz");
		imza1.getVekaletVeren().getKisi().setUnvan(new NameType());
		imza1.getVekaletVeren().getKisi().getUnvan().setValue("Bakan");
		paket.getBelgeImza().imzaEkle(imza1);
		return this;
	}

}
