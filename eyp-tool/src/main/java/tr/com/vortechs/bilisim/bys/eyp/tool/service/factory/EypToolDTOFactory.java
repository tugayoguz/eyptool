package tr.com.vortechs.bilisim.bys.eyp.tool.service.factory;

import java.util.Date;

import tr.com.vortechs.bilisim.bys.eyp.tool.domain.dto.DosyaDTO;
import tr.com.vortechs.bilisim.bys.eyp.tool.domain.dto.EvrakDTO;
import tr.com.vortechs.bilisim.bys.eyp.tool.domain.dto.EvrakDosyaDTO;
import tr.com.vortechs.bilisim.bys.eyp.tool.domain.dto.EvrakEkDTO;
import tr.com.vortechs.bilisim.bys.eyp.tool.domain.dto.EvrakHareketDTO;

public class EypToolDTOFactory {
	public EvrakDTO createNewEvrakDTO(String kurumEvrakNo){
		EvrakDTO evrakDTO = new EvrakDTO();
		evrakDTO.setYazismaTipi("DIÞ");
		evrakDTO.setEvrakTarihi(new Date());
		evrakDTO.setKurumEvrakTarihi(new Date());
		evrakDTO.setKurumEvrakNo(kurumEvrakNo);
		evrakDTO.setKurumDefterBirimNo(1082L);
		evrakDTO.setEvrakCinsi("01");
		
		return evrakDTO;
	}
	
	public EvrakHareketDTO createNewEvrakHareketDTO(EvrakDTO evrakDTO,String evrakTipi){
		EvrakHareketDTO evrakHareketDTO = new EvrakHareketDTO();
		evrakHareketDTO.setEvrakNo(evrakDTO.getId());
		evrakHareketDTO.setEvrakTipi(evrakTipi);
		evrakHareketDTO.setEvrakDurumu("01");
		evrakHareketDTO.setBirimNo(1082L);
		evrakHareketDTO.setBirimEvrakNo(evrakDTO.getKurumEvrakNo());
		evrakHareketDTO.setIslemDurumu("10");
		evrakHareketDTO.setIslemYapanKullaniciNo(1L);//TODO singleton user nesnesinden alýnacak
		evrakHareketDTO.setIslemYapanBirimNo(evrakDTO.getKurumDefterBirimNo());
		evrakHareketDTO.setIslemYapanGorevNo(0L);
		evrakHareketDTO.setDefterBirimNo(evrakDTO.getKurumDefterBirimNo());
		evrakHareketDTO.setSonArsivDurum(0);
		evrakHareketDTO.setSonIlgiDurum(0);
		evrakHareketDTO.setIade(0);
		evrakHareketDTO.setBlsmDagitim(0);
		return evrakHareketDTO;
	}
	public EvrakEkDTO createNewEvrakEkDTO(EvrakDTO evrakDTO,String baslik){
		EvrakEkDTO evrakEkDTO = new EvrakEkDTO();
		evrakEkDTO.setEvrakNo(evrakDTO.getId());
		evrakEkDTO.setEk(baslik);
		return evrakEkDTO;
	}
	
	public EvrakDosyaDTO createNewEvrakDosyaDTO(EvrakDTO evrakDTO,DosyaDTO dosyaDTO){
		EvrakDosyaDTO evrakDosyaDTO = new EvrakDosyaDTO();
		evrakDosyaDTO.setEvrakNo(evrakDTO.getId());
		evrakDosyaDTO.setDosyaNo(dosyaDTO.getId());
		return evrakDosyaDTO;
		
	}

}
