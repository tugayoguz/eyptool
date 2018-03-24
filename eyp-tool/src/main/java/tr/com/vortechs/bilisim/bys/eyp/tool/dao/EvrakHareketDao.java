package tr.com.vortechs.bilisim.bys.eyp.tool.dao;


import java.util.List;

import tr.com.vortechs.bilisim.bys.eyp.tool.domain.dto.EvrakHareketDTO;

public interface EvrakHareketDao extends BaseDao<EvrakHareketDTO>{

	List<EvrakHareketDTO> getEvrakHareketDTOWithRefNo(Long refNo);
}
