package tr.com.vortechs.bilisim.bys.eyp.tool.dao;


import tr.com.vortechs.bilisim.bys.eyp.tool.domain.dto.EvrakIcerikDTO;

public interface EvrakIcerikDao extends BaseDao<EvrakIcerikDTO>{

	EvrakIcerikDTO getEvrakIcerikWithId(Long id);
}
