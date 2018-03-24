package tr.com.vortechs.bilisim.bys.eyp.tool.dao.impl;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import tr.com.vortechs.bilisim.bys.eyp.tool.dao.EvrakDao;
import tr.com.vortechs.bilisim.bys.eyp.tool.dao.mapper.EvrakDTOMapper;
import tr.com.vortechs.bilisim.bys.eyp.tool.domain.dto.EvrakDTO;

@Repository
public class EvrakDaoImpl extends BaseDaoImpl<EvrakDTO> implements EvrakDao{

	@Override
	public EvrakDTO getEvrakDTOWithRefNo(Long refNo) {
		String query = "select * from S_EVR_EVRAK where EVRAK_NO = :refNo";
		SqlParameterSource namedParameters = new MapSqlParameterSource("refNo", Long.valueOf(refNo));
		EvrakDTO evrakDTO = getTemplate().queryForObject(query, namedParameters, new EvrakDTOMapper());
		return evrakDTO;
	}

}
