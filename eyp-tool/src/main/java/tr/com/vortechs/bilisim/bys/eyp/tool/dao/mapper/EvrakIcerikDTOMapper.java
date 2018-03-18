package tr.com.vortechs.bilisim.bys.eyp.tool.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import tr.com.vortechs.bilisim.bys.eyp.tool.domain.dto.EvrakIcerikDTO;

public class EvrakIcerikDTOMapper implements RowMapper<EvrakIcerikDTO>{

	@Override
	public EvrakIcerikDTO mapRow(ResultSet rs, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		EvrakIcerikDTO evrakIcerikDTO = new EvrakIcerikDTO();
		evrakIcerikDTO.setId(rs.getLong("DOSYA_NO"));
		evrakIcerikDTO.setDosyaIcerik(rs.getBytes("DOSYA_ICERIK"));
		evrakIcerikDTO.setGiaNot(rs.getBytes("GIA_NOT"));
		evrakIcerikDTO.setImza2Icerik(rs.getBytes("IMZA2_ICERIK"));
		evrakIcerikDTO.setImza2IcerikBilgisi(rs.getBytes("IMZA2_ICERIK_BILGISI"));
		evrakIcerikDTO.setImzaIcerik(rs.getBytes("IMZA_ICERIK"));
		evrakIcerikDTO.setImzaIcerikBilgisi(rs.getBytes("IMZA_ICERIK_BILGISI"));
		evrakIcerikDTO.setIndeksIcerik(rs.getBytes("INDEKS_ICERIK"));
		evrakIcerikDTO.setOzet(rs.getBytes("OZET"));
		
		return evrakIcerikDTO;
	}

}
