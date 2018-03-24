package tr.com.vortechs.bilisim.bys.eyp.tool.service;

import tr.com.vortechs.bilisim.bys.eyp.tool.domain.dto.EvrakDTO;

public interface EvrakService extends BaseService {

	 EvrakDTO getEvrakDTOWithRefNo(Long refNo);
}
