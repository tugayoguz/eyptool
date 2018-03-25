package tr.com.vortechs.bilisim.bys.eyp.tool.dao;

import java.util.List;

import tr.com.vortechs.bilisim.bys.eyp.tool.domain.dto.EvrakPostaDTO;

public interface EvrakPostaDao extends BaseDao<EvrakPostaDTO>{

	List<EvrakPostaDTO> getEvrakPostaDTOWithRefNo(Long refNo);
}
