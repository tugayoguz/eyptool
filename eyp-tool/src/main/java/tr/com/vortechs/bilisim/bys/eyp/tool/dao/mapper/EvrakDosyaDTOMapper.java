package tr.com.vortechs.bilisim.bys.eyp.tool.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import tr.com.vortechs.bilisim.bys.eyp.tool.domain.dto.EvrakDosyaDTO;

public class EvrakDosyaDTOMapper implements RowMapper<EvrakDosyaDTO>{

	@Override
	public EvrakDosyaDTO mapRow(ResultSet rs, int arg1) throws SQLException {
		// TODO Auto-generated method stub,
		EvrakDosyaDTO evrakDosyaDTO = new EvrakDosyaDTO();
		evrakDosyaDTO.setEvrakNo(rs.getLong("EVRAK_NO"));
		evrakDosyaDTO.setDosyaNo(rs.getLong("DOSYA_NO"));
		evrakDosyaDTO.setDosyaBolumNo(rs.getLong("DOSYA_BOLUM_NO"));
		evrakDosyaDTO.setAciklama(rs.getString("ACIKLAMA"));
		return evrakDosyaDTO;
	}

}
