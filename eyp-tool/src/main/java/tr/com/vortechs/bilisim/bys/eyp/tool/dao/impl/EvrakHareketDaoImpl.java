package tr.com.vortechs.bilisim.bys.eyp.tool.dao.impl;

import java.util.List;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import tr.com.vortechs.bilisim.bys.eyp.tool.dao.EvrakHareketDao;
import tr.com.vortechs.bilisim.bys.eyp.tool.dao.mapper.EvrakHareketDTOMapper;
import tr.com.vortechs.bilisim.bys.eyp.tool.domain.dto.EvrakHareketDTO;

@Repository
public class EvrakHareketDaoImpl extends BaseDaoImpl<EvrakHareketDTO> implements EvrakHareketDao{

	@Override
	public List<EvrakHareketDTO> getEvrakHareketDTOWithRefNo(Long refNo) {
		String query = "select * from S_EVR_EVRAK_HAREKET where EVRAK_NO = :refNo";
		SqlParameterSource namedParameters = new MapSqlParameterSource("refNo", Long.valueOf(refNo));
		List<EvrakHareketDTO> hareketler = getTemplate().query(query, namedParameters, new EvrakHareketDTOMapper());
		return hareketler;
	}

}
