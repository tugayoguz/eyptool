package tr.com.vortechs.bilisim.bys.eyp.tool.service;

import java.util.List;

import tr.com.vortechs.bilisim.bys.eyp.tool.domain.dto.EvrakPostaDTO;

public interface EvrakPostaService extends BaseService{

	List<EvrakPostaDTO> getEvrakPostaDTOWithRefNo(Long refNo);
}
