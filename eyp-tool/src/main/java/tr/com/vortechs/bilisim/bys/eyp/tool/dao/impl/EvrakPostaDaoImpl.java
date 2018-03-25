package tr.com.vortechs.bilisim.bys.eyp.tool.dao.impl;

import java.util.List;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import tr.com.vortechs.bilisim.bys.eyp.tool.dao.EvrakPostaDao;
import tr.com.vortechs.bilisim.bys.eyp.tool.dao.mapper.EvrakPostaDTOMapper;
import tr.com.vortechs.bilisim.bys.eyp.tool.domain.dto.EvrakPostaDTO;

@Repository
public class EvrakPostaDaoImpl extends BaseDaoImpl<EvrakPostaDTO> implements EvrakPostaDao{

	@Override
	public List<EvrakPostaDTO> getEvrakPostaDTOWithRefNo(Long refNo) {
		String query = "select * from S_EVR_POSTA where EVRAK_NO = :refNo";
		SqlParameterSource namedParameters = new MapSqlParameterSource("refNo", Long.valueOf(refNo));
		List<EvrakPostaDTO> evrakPostaDTOList = getTemplate().query(query, namedParameters, new EvrakPostaDTOMapper());
		return evrakPostaDTOList;
	}

	
}
