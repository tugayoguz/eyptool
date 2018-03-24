package tr.com.vortechs.bilisim.bys.eyp.tool.service;

import java.util.List;

import tr.com.vortechs.bilisim.bys.eyp.tool.domain.dto.EvrakHareketDTO;

public interface EvrakHareketService extends BaseService {

	List<EvrakHareketDTO> getEvrakHareketDTOWithRefNo(Long refNo);
}
