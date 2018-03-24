package tr.com.vortechs.bilisim.bys.eyp.tool.dao;


import java.util.List;

import tr.com.vortechs.bilisim.bys.eyp.tool.domain.dto.EvrakEkDTO;

public interface EvrakEkDao extends BaseDao<EvrakEkDTO>{

	List<EvrakEkDTO> getEvrakEkDTOWithEvrakRefNo(Long refNo);
}
