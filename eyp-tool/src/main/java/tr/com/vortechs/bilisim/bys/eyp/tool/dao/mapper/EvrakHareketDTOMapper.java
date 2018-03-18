package tr.com.vortechs.bilisim.bys.eyp.tool.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import tr.com.vortechs.bilisim.bys.eyp.tool.domain.dto.EvrakHareketDTO;

public class EvrakHareketDTOMapper implements RowMapper<EvrakHareketDTO>{

	@Override
	public EvrakHareketDTO mapRow(ResultSet rs, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		EvrakHareketDTO evrakHareketDTO = new EvrakHareketDTO();
		evrakHareketDTO.setId(rs.getLong("HAREKET_NO"));
		evrakHareketDTO.setOncekiHareketNo(rs.getLong("ONCEKI_HAREKET_NO"));
		evrakHareketDTO.setEvrakNo(rs.getLong("EVRAK_NO"));
		evrakHareketDTO.setEvrakTipi(rs.getString("EVRAK_TIPI"));
		evrakHareketDTO.setEvrakDurumu(rs.getString("EVRAK_DURUMU"));
		evrakHareketDTO.setHareketTuru(rs.getString("HAREKET_TURU"));
		evrakHareketDTO.setHareketTarihi(rs.getTimestamp("HAREKET_TARIHI"));
		evrakHareketDTO.setHareketNot(rs.getString("HAREKET_NOT"));
		evrakHareketDTO.setBirimNo(rs.getLong("BIRIM_NO"));
		evrakHareketDTO.setBirimEvrakNo(rs.getString("BIRIM_EVRAK_NO"));
		evrakHareketDTO.setBirimEvrakTarihi(rs.getTimestamp("BIRIM_EVRAK_TARIHI"));
		evrakHareketDTO.setDosyaNo(rs.getLong("DOSYA_NO"));
		evrakHareketDTO.setIslemDurumu(rs.getString("ISLEM_DURUMU"));
		evrakHareketDTO.setIslemTarihi(rs.getTimestamp("ISLEM_TARIHI"));
		evrakHareketDTO.setIlgiliKullaniciNo(rs.getLong("ILGILI_KULLANICI_NO"));
		evrakHareketDTO.setIlgiliBirimNo(rs.getLong("ILGILI_BIRIM_NO"));
		evrakHareketDTO.setIlgiliGorevNo(rs.getLong("ILGILI_GOREV_NO"));
		evrakHareketDTO.setIslemYapanKullaniciNo(rs.getLong("ISLEM_YAPAN_KULLANICI_NO"));
		evrakHareketDTO.setIslemYapanBirimNo(rs.getLong("ISLEM_YAPAN_BIRIM_NO"));
		evrakHareketDTO.setIslemYapanGorevNo(rs.getLong("ISLEM_YAPAN_GOREV_NO"));
		evrakHareketDTO.setSureBitisTarihi(rs.getString("SURE_BITIS_TARIHI"));
		evrakHareketDTO.setTaskInstanceId(rs.getLong("TASKINSTANCE_ID"));
		evrakHareketDTO.setLastUpdateData(rs.getTimestamp("LAST_UPDATE_DATE"));
		evrakHareketDTO.setDefterBirimNo(rs.getLong("DEFTER_BIRIM_NO"));
		evrakHareketDTO.setProcessInstanceId(rs.getLong("PROCESSINSTANCE_ID"));
		evrakHareketDTO.setSonArsivDurum(rs.getInt("SON_ARSIV_DURUM"));
		evrakHareketDTO.setSonIlgiDurum(rs.getInt("SON_ILGI_DURUM"));
		evrakHareketDTO.setSaklamaPlaniNo(rs.getLong("SAKLAMA_PLAN_NO"));
		evrakHareketDTO.setTasfiyeTarihi(rs.getString("TASFIYE_TARIHI"));
		evrakHareketDTO.setTasfiyeIslemi(rs.getString("TASFIYE_ISLEMI"));
		evrakHareketDTO.setTasfiyeEdildi(rs.getString("TASFIYE_EDILDI"));
		evrakHareketDTO.setIade(rs.getInt("IADE"));
		evrakHareketDTO.setBlsmNodeId(rs.getLong("BLSM_NODE_ID"));
		evrakHareketDTO.setBlsmProcDefId(rs.getLong("BLSM_PROC_DEF_ID"));
		evrakHareketDTO.setBlsmDagitim(rs.getInt("BLSM_DAGITIM"));
		return evrakHareketDTO;
	}

}
