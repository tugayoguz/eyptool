package tr.com.vortechs.bilisim.bys.eyp.tool.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tr.com.vortechs.bilisim.bys.eyp.tool.dao.EvrakPostaDao;
import tr.com.vortechs.bilisim.bys.eyp.tool.domain.dto.EvrakPostaDTO;
import tr.com.vortechs.bilisim.bys.eyp.tool.service.EvrakPostaService;

@Service
public class EvrakPostaServiceImpl extends BaseServiceImpl implements EvrakPostaService{

	@Autowired
	private EvrakPostaDao evrakPostaDao;
	
	@Override
	public List<EvrakPostaDTO> getEvrakPostaDTOWithRefNo(Long refNo) {
		return getEvrakPostaDao().getEvrakPostaDTOWithRefNo(refNo);
	}

	public EvrakPostaDao getEvrakPostaDao() {
		return evrakPostaDao;
	}

	public void setEvrakPostaDao(EvrakPostaDao evrakPostaDao) {
		this.evrakPostaDao = evrakPostaDao;
	}
	
	

}
