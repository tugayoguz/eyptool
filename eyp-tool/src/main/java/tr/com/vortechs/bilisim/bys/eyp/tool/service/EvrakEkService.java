package tr.com.vortechs.bilisim.bys.eyp.tool.service;

import java.util.List;

import tr.com.vortechs.bilisim.bys.eyp.tool.domain.dto.EvrakEkDTO;

public interface EvrakEkService extends BaseService{

	List<EvrakEkDTO> getEvrakEkWithEvrakRefNo(Long refNo);
}
