package tr.com.vortechs.bilisim.bys.eyp.tool.domain.dto;

import java.util.Date;

public class EvrakDTO extends BaseDTO{

	private Long icerikDosyaNo;
	
	private String evrakSayi;
	
	private Date evrakTarihi;
	
	private Long kurumNo;
	
	private Long konuNo;
	
	private String gelisSekli;
	
	private String gizlilik;
	
	private String sureli;
	
	private Date sureBitisTarihi;
	
	private String ivedilik;
	
	private String yazismaTipi;
	
	private String evrakTuru;
	
	private Long birimNo;
	
	private String yer;
	
	private String aciklama;
	
	private String ilgi;
	
	private String ek;
	
	private Date lastUpdateData;
	
	private String kurumEvrakNo;
	
	private Date kurumEvrakTarihi;
	
	private String konuText;
	
	private Long kurumDefterBirimNo;
	
	private String dagitimAciklama;
	
	private String onaydanSonraDagit;
	
	private String evrakCinsi;
	
	private Long bolumNo;
	
	private String kisiselBilgi;
	
	private String bilgiEdinme;
	
	private Long uretildigiEvrakNo;
	
	private String uretici;
	
	private String yazar;
	
	private String belgeReferansNo;
	
	private String telifHaklariKanunKapsami;
	
	private String guvenliElektronikImza;
	
	private String belgeStatKazanmayanDokuman;
	
	private String elektronikSertifikaSaglayici;
	
	private String zamanDamgasi;
	
	private String sifrelemeAlgoritmasi;
	
	private String digerSayisalIsaretler;
	
	private String fizikselDosya;
	
	private String saklamaYeri;
	
	private String repeatForAllPages;
	
	private String pagesToBeStamped;
	
	private EvrakIcerikDTO icerik;

	
	//GETTER AND SETTER
	
	public Long getIcerikDosyaNo() {
		return icerikDosyaNo;
	}

	public EvrakIcerikDTO getIcerik() {
		return icerik;
	}

	public void setIcerik(EvrakIcerikDTO icerik) {
		this.icerik = icerik;
	}

	public void setIcerikDosyaNo(Long icerikDosyaNo) {
		this.icerikDosyaNo = icerikDosyaNo;
	}

	public String getEvrakSayi() {
		return evrakSayi;
	}

	public void setEvrakSayi(String evrakSayi) {
		this.evrakSayi = evrakSayi;
	}

	public Date getEvrakTarihi() {
		return evrakTarihi;
	}

	public void setEvrakTarihi(Date evrakTarihi) {
		this.evrakTarihi = evrakTarihi;
	}

	public Long getKurumNo() {
		return kurumNo;
	}

	public void setKurumNo(Long kurumNo) {
		this.kurumNo = kurumNo;
	}

	public Long getKonuNo() {
		return konuNo;
	}

	public void setKonuNo(Long konuNo) {
		this.konuNo = konuNo;
	}

	public String getGelisSekli() {
		return gelisSekli;
	}

	public void setGelisSekli(String gelisSekli) {
		this.gelisSekli = gelisSekli;
	}

	public String getGizlilik() {
		return gizlilik;
	}

	public void setGizlilik(String gizlilik) {
		this.gizlilik = gizlilik;
	}

	public String getSureli() {
		return sureli;
	}

	public void setSureli(String sureli) {
		this.sureli = sureli;
	}

	public Date getSureBitisTarihi() {
		return sureBitisTarihi;
	}

	public void setSureBitisTarihi(Date sureBitisTarihi) {
		this.sureBitisTarihi = sureBitisTarihi;
	}

	public String getIvedilik() {
		return ivedilik;
	}

	public void setIvedilik(String ivedilik) {
		this.ivedilik = ivedilik;
	}

	public String getYazismaTipi() {
		return yazismaTipi;
	}

	public void setYazismaTipi(String yazismaTipi) {
		this.yazismaTipi = yazismaTipi;
	}

	public String getEvrakTuru() {
		return evrakTuru;
	}

	public void setEvrakTuru(String evrakTuru) {
		this.evrakTuru = evrakTuru;
	}

	public Long getBirimNo() {
		return birimNo;
	}

	public void setBirimNo(Long birimNo) {
		this.birimNo = birimNo;
	}

	public String getYer() {
		return yer;
	}

	public void setYer(String yer) {
		this.yer = yer;
	}

	public String getAciklama() {
		return aciklama;
	}

	public void setAciklama(String aciklama) {
		this.aciklama = aciklama;
	}

	public String getIlgi() {
		return ilgi;
	}

	public void setIlgi(String ilgi) {
		this.ilgi = ilgi;
	}

	public String getEk() {
		return ek;
	}

	public void setEk(String ek) {
		this.ek = ek;
	}

	public Date getLastUpdateData() {
		return lastUpdateData;
	}

	public void setLastUpdateData(Date lastUpdateData) {
		this.lastUpdateData = lastUpdateData;
	}

	public String getKurumEvrakNo() {
		return kurumEvrakNo;
	}

	public void setKurumEvrakNo(String kurumEvrakNo) {
		this.kurumEvrakNo = kurumEvrakNo;
	}

	public Date getKurumEvrakTarihi() {
		return kurumEvrakTarihi;
	}

	public void setKurumEvrakTarihi(Date kurumEvrakTarihi) {
		this.kurumEvrakTarihi = kurumEvrakTarihi;
	}

	public String getKonuText() {
		return konuText;
	}

	public void setKonuText(String konuText) {
		this.konuText = konuText;
	}

	public Long getKurumDefterBirimNo() {
		return kurumDefterBirimNo;
	}

	public void setKurumDefterBirimNo(Long kurumDefterBirimNo) {
		this.kurumDefterBirimNo = kurumDefterBirimNo;
	}

	public String getDagitimAciklama() {
		return dagitimAciklama;
	}

	public void setDagitimAciklama(String dagitimAciklama) {
		this.dagitimAciklama = dagitimAciklama;
	}

	public String getOnaydanSonraDagit() {
		return onaydanSonraDagit;
	}

	public void setOnaydanSonraDagit(String onaydanSonraDagit) {
		this.onaydanSonraDagit = onaydanSonraDagit;
	}

	public String getEvrakCinsi() {
		return evrakCinsi;
	}

	public void setEvrakCinsi(String evrakCinsi) {
		this.evrakCinsi = evrakCinsi;
	}

	public Long getBolumNo() {
		return bolumNo;
	}

	public void setBolumNo(Long bolumNo) {
		this.bolumNo = bolumNo;
	}

	public String getKisiselBilgi() {
		return kisiselBilgi;
	}

	public void setKisiselBilgi(String kisiselBilgi) {
		this.kisiselBilgi = kisiselBilgi;
	}

	public String getBilgiEdinme() {
		return bilgiEdinme;
	}

	public void setBilgiEdinme(String bilgiEdinme) {
		this.bilgiEdinme = bilgiEdinme;
	}

	public Long getUretildigiEvrakNo() {
		return uretildigiEvrakNo;
	}

	public void setUretildigiEvrakNo(Long uretildigiEvrakNo) {
		this.uretildigiEvrakNo = uretildigiEvrakNo;
	}

	public String getUretici() {
		return uretici;
	}

	public void setUretici(String uretici) {
		this.uretici = uretici;
	}

	public String getYazar() {
		return yazar;
	}

	public void setYazar(String yazar) {
		this.yazar = yazar;
	}

	public String getBelgeReferansNo() {
		return belgeReferansNo;
	}

	public void setBelgeReferansNo(String belgeReferansNo) {
		this.belgeReferansNo = belgeReferansNo;
	}

	public String getTelifHaklariKanunKapsami() {
		return telifHaklariKanunKapsami;
	}

	public void setTelifHaklariKanunKapsami(String telifHaklariKanunKapsami) {
		this.telifHaklariKanunKapsami = telifHaklariKanunKapsami;
	}

	public String getGuvenliElektronikImza() {
		return guvenliElektronikImza;
	}

	public void setGuvenliElektronikImza(String guvenliElektronikImza) {
		this.guvenliElektronikImza = guvenliElektronikImza;
	}

	public String getBelgeStatKazanmayanDokuman() {
		return belgeStatKazanmayanDokuman;
	}

	public void setBelgeStatKazanmayanDokuman(String belgeStatKazanmayanDokuman) {
		this.belgeStatKazanmayanDokuman = belgeStatKazanmayanDokuman;
	}

	public String getElektronikSertifikaSaglayici() {
		return elektronikSertifikaSaglayici;
	}

	public void setElektronikSertifikaSaglayici(String elektronikSertifikaSaglayici) {
		this.elektronikSertifikaSaglayici = elektronikSertifikaSaglayici;
	}

	public String getZamanDamgasi() {
		return zamanDamgasi;
	}

	public void setZamanDamgasi(String zamanDamgasi) {
		this.zamanDamgasi = zamanDamgasi;
	}

	public String getSifrelemeAlgoritmasi() {
		return sifrelemeAlgoritmasi;
	}

	public void setSifrelemeAlgoritmasi(String sifrelemeAlgoritmasi) {
		this.sifrelemeAlgoritmasi = sifrelemeAlgoritmasi;
	}

	public String getDigerSayisalIsaretler() {
		return digerSayisalIsaretler;
	}

	public void setDigerSayisalIsaretler(String digerSayisalIsaretler) {
		this.digerSayisalIsaretler = digerSayisalIsaretler;
	}

	public String getFizikselDosya() {
		return fizikselDosya;
	}

	public void setFizikselDosya(String fizikselDosya) {
		this.fizikselDosya = fizikselDosya;
	}

	public String getSaklamaYeri() {
		return saklamaYeri;
	}

	public void setSaklamaYeri(String saklamaYeri) {
		this.saklamaYeri = saklamaYeri;
	}

	public String getRepeatForAllPages() {
		return repeatForAllPages;
	}

	public void setRepeatForAllPages(String repeatForAllPages) {
		this.repeatForAllPages = repeatForAllPages;
	}

	public String getPagesToBeStamped() {
		return pagesToBeStamped;
	}

	public void setPagesToBeStamped(String pagesToBeStamped) {
		this.pagesToBeStamped = pagesToBeStamped;
	}
	
	
	
	
}
	
