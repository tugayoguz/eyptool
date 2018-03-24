package tr.com.vortechs.bilisim.bys.eyp.tool.dao.impl;

import java.util.List;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import tr.com.vortechs.bilisim.bys.eyp.tool.dao.EvrakEkDao;
import tr.com.vortechs.bilisim.bys.eyp.tool.dao.mapper.EvrakEkDTOMapper;
import tr.com.vortechs.bilisim.bys.eyp.tool.domain.dto.EvrakEkDTO;

@Repository
public class EvrakEkDaoImpl extends BaseDaoImpl<EvrakEkDTO> implements EvrakEkDao {

	@Override
	public List<EvrakEkDTO> getEvrakEkDTOWithEvrakRefNo(Long refNo) {
		String query = "select * from S_EVR_EVRAK_EK where EVRAK_NO = :refNo";
		SqlParameterSource namedParameters = new MapSqlParameterSource("refNo", Long.valueOf(refNo));
		List<EvrakEkDTO> ekler = getTemplate().query(query, namedParameters, new EvrakEkDTOMapper());
		return ekler;
	}

}
