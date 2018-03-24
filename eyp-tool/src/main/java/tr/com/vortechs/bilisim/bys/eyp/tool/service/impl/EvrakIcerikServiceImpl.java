package tr.com.vortechs.bilisim.bys.eyp.tool.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tr.com.vortechs.bilisim.bys.eyp.tool.dao.EvrakIcerikDao;
import tr.com.vortechs.bilisim.bys.eyp.tool.domain.dto.EvrakIcerikDTO;
import tr.com.vortechs.bilisim.bys.eyp.tool.service.EvrakIcerikService;

@Service
public class EvrakIcerikServiceImpl extends BaseServiceImpl implements EvrakIcerikService {

	@Autowired
	private EvrakIcerikDao evrakIcerikDao;
	
	public EvrakIcerikDTO getEvrakIcerikWithId(Long id){
		return getEvrakIcerikDao().getEvrakIcerikWithId(id);
	}

	public EvrakIcerikDao getEvrakIcerikDao() {
		return evrakIcerikDao;
	}

	public void setEvrakIcerikDao(EvrakIcerikDao evrakIcerikDao) {
		this.evrakIcerikDao = evrakIcerikDao;
	}
	
	
}
