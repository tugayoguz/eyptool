package tr.com.vortechs.bilisim.bys.eyp.tool.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tr.com.vortechs.bilisim.bys.eyp.tool.dao.EvrakHareketDao;
import tr.com.vortechs.bilisim.bys.eyp.tool.domain.dto.EvrakHareketDTO;
import tr.com.vortechs.bilisim.bys.eyp.tool.service.EvrakHareketService;

@Service
public class EvrakHareketServiceImpl extends BaseServiceImpl implements EvrakHareketService {

	@Autowired
	private EvrakHareketDao evrakHareketDao;
	
	@Override
	public List<EvrakHareketDTO> getEvrakHareketDTOWithRefNo(Long refNo) {
		return getEvrakHareketDao();
	}

	public EvrakHareketDao getEvrakHareketDao() {
		return evrakHareketDao;
	}

	public void setEvrakHareketDao(EvrakHareketDao evrakHareketDao) {
		this.evrakHareketDao = evrakHareketDao;
	}
	
	

	
}
