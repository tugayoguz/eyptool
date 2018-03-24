package tr.com.vortechs.bilisim.bys.eyp.tool.service;

import tr.com.vortechs.bilisim.bys.eyp.tool.domain.dto.EvrakIcerikDTO;

public interface EvrakIcerikService extends BaseService {

	EvrakIcerikDTO getEvrakIcerikWithId(Long id);
}
