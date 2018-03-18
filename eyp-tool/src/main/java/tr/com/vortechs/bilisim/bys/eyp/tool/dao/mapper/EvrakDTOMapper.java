package tr.com.vortechs.bilisim.bys.eyp.tool.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import tr.com.vortechs.bilisim.bys.eyp.tool.domain.dto.EvrakDTO;

public class EvrakDTOMapper implements RowMapper<EvrakDTO>{

	@Override
	public EvrakDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		EvrakDTO evrakDTO = new EvrakDTO();
		evrakDTO.setId(rs.getLong("EVRAK_NO"));
		evrakDTO.setIcerikDosyaNo(rs.getLong("ICERIK_DOSYA_NO"));
		evrakDTO.setEvrakSayi(rs.getString("EVRAK_SAYI"));
		evrakDTO.setEvrakTarihi(rs.getTimestamp("EVRAK_TARIHI"));
		evrakDTO.setKurumNo(rs.getLong("KURUM_NO"));
		evrakDTO.setKonuNo(rs.getLong("KONU_NO"));
		evrakDTO.setGelisSekli(rs.getString("GELIS_SEKLI"));
		evrakDTO.setGizlilik(rs.getString("GIZLILIK"));
		evrakDTO.setSureli(rs.getString("SURELI"));
		evrakDTO.setSureBitisTarihi(rs.getTimestamp("SURE_BITIS_TARIHI"));
		evrakDTO.setIvedilik(rs.getString("IVEDILIK"));
		evrakDTO.setYazismaTipi(rs.getString("YAZISMA_TIPI"));
		evrakDTO.setEvrakTuru(rs.getString("EVRAK_TURU"));
		evrakDTO.setBirimNo(rs.getLong("BIRIM_NO"));
		evrakDTO.setYer(rs.getString("YER"));
		evrakDTO.setAciklama(rs.getString("ACIKLAMA"));
		evrakDTO.setIlgi(rs.getString("ILGI"));
		evrakDTO.setEk(rs.getString("EK"));
		evrakDTO.setLastUpdateData(rs.getTimestamp("LAST_UPDATE_DATE"));
		evrakDTO.setKurumEvrakNo(rs.getString("KURUM_EVRAK_NO"));
		evrakDTO.setKurumEvrakTarihi(rs.getTimestamp("KURUM_EVRAK_TARIHI"));
		evrakDTO.setKonuText(rs.getString("KONU_TEXT"));
		evrakDTO.setKurumDefterBirimNo(rs.getLong("KURUM_DEFTER_BIRIM_NO"));
		evrakDTO.setDagitimAciklama(rs.getString("DAGITIM_ACIKLAMA"));
		evrakDTO.setOnaydanSonraDagit(rs.getString("ONAYDAN_SONRA_DAGIT"));
		evrakDTO.setBelgeStatKazanmayanDokuman(rs.getString("BELGE_STAT_KAZANMAYAN_DOKUMAN"));
		evrakDTO.setElektronikSertifikaSaglayici(rs.getString("ELEKTRONIK_SERTIFIKA_SAGLAYICI"));
		evrakDTO.setZamanDamgasi(rs.getString("ZAMAN_DAMGASI"));
		evrakDTO.setSifrelemeAlgoritmasi(rs.getString("SIFRELEME_ALGORITMASI"));
		evrakDTO.setDigerSayisalIsaretler(rs.getString("DIGER_SAYISAL_ISARETLER"));
		evrakDTO.setFizikselDosya(rs.getString("FIZIKSEL_DOSYA"));
		evrakDTO.setSaklamaYeri(rs.getString("SAKLAMA_YERI"));
		evrakDTO.setRepeatForAllPages(rs.getString("REPEATFORALLPAGES"));
		evrakDTO.setPagesToBeStamped(rs.getString("PAGES_TO_BE_STAMPED"));
		return evrakDTO;
	}

	

}
