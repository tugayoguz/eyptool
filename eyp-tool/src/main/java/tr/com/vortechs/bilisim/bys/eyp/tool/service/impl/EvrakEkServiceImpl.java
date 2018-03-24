package tr.com.vortechs.bilisim.bys.eyp.tool.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tr.com.vortechs.bilisim.bys.eyp.tool.dao.EvrakEkDao;
import tr.com.vortechs.bilisim.bys.eyp.tool.domain.dto.EvrakEkDTO;
import tr.com.vortechs.bilisim.bys.eyp.tool.service.EvrakEkService;
import tr.com.vortechs.bilisim.bys.eyp.tool.service.EvrakIcerikService;

@Service
public class EvrakEkServiceImpl extends BaseServiceImpl implements EvrakEkService{

	@Autowired
	private EvrakEkDao evrakEkDao;
	
	@Autowired
	private EvrakIcerikService evrakIcerikService;
	
	public List<EvrakEkDTO> getEvrakEkWithEvrakRefNo(Long refNo){
		List<EvrakEkDTO> evrakEkDTOList = new ArrayList<EvrakEkDTO>();
		for (EvrakEkDTO evrakEkDTO : evrakEkDTOList) {
			evrakEkDTO.setEvrakIcerikDTO(getEvrakIcerikService().getEvrakIcerikWithId(evrakEkDTO.getIcerikDosyaNo()));
		}
		return evrakEkDTOList;
	}

	public EvrakEkDao getEvrakEkDao() {
		return evrakEkDao;
	}

	public void setEvrakEkDao(EvrakEkDao evrakEkDao) {
		this.evrakEkDao = evrakEkDao;
	}

	public EvrakIcerikService getEvrakIcerikService() {
		return evrakIcerikService;
	}

	public void setEvrakIcerikService(EvrakIcerikService evrakIcerikService) {
		this.evrakIcerikService = evrakIcerikService;
	}
	
	
}
