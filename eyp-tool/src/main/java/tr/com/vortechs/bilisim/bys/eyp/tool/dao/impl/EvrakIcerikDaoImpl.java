package tr.com.vortechs.bilisim.bys.eyp.tool.dao.impl;


import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import tr.com.vortechs.bilisim.bys.eyp.tool.dao.EvrakIcerikDao;
import tr.com.vortechs.bilisim.bys.eyp.tool.dao.mapper.EvrakIcerikDTOMapper;
import tr.com.vortechs.bilisim.bys.eyp.tool.domain.dto.EvrakIcerikDTO;

@Repository
public class EvrakIcerikDaoImpl extends BaseDaoImpl<EvrakIcerikDTO> implements EvrakIcerikDao{

	@Override
	public EvrakIcerikDTO getEvrakIcerikWithId(Long id) {
		String query = "select * from S_ICR_DOSYA_ICERIK where DOSYA_NO = :id";
		SqlParameterSource namedParameters = new MapSqlParameterSource("id", Long.valueOf(id));
		EvrakIcerikDTO icerik = getTemplate().queryForObject(query, namedParameters, new EvrakIcerikDTOMapper());
		return icerik;
	}

}
