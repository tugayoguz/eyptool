package tr.com.vortechs.bilisim.bys.eyp.tool.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import tr.com.vortechs.bilisim.bys.eyp.tool.domain.dto.EvrakEkDTO;

public class EvrakEkDTOMapper implements RowMapper<EvrakEkDTO>{

	@Override
	public EvrakEkDTO mapRow(ResultSet rs, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		EvrakEkDTO evrakEkDTO = new EvrakEkDTO();
		evrakEkDTO.setId(rs.getLong("EK_NO"));
		evrakEkDTO.setEvrakNo(rs.getLong("EVRAK_NO"));
		evrakEkDTO.setEk(rs.getString("EK"));
		evrakEkDTO.setIcerikDosyaNo(rs.getLong("ICERIK_DOSYA_NO"));
		evrakEkDTO.setLastUpdateDate(rs.getString("LAST_UPDATE_DATE"));
		evrakEkDTO.setEkImzalanir(rs.getString("EK_IMZALANIR"));
		evrakEkDTO.setEkSurumlenebilir(rs.getString("EK_SURUMLENEBILIR"));
		return evrakEkDTO;
	}

}
