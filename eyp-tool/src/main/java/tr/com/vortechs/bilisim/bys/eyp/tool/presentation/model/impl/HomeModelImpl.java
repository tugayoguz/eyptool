package tr.com.vortechs.bilisim.bys.eyp.tool.presentation.model.impl;

import org.springframework.beans.factory.annotation.Autowired;

import tr.com.vortechs.bilisim.bys.eyp.tool.context.AppContext;
import tr.com.vortechs.bilisim.bys.eyp.tool.core.Model;
import tr.com.vortechs.bilisim.bys.eyp.tool.presentation.model.HomeModel;
import tr.com.vortechs.bilisim.bys.eyp.tool.service.EvrakService;

@Model
public class HomeModelImpl extends BaseModelImpl implements HomeModel{
	
	@Autowired
	private EvrakService evrakService;

	@Override
	public String evrakNoIleEvrakSorgula(String evrakNo) {
		String result = "";
		try {
			Long refNo = Long.parseLong(evrakNo);
			AppContext.currentEvrak = evrakService.getEvrakDTOWithRefNo(refNo);
			result = AppContext.currentEvrak.getKonuText();
		}catch (Exception e) {
			result = "Lütfen geçerli formatta bir referans numarasý giriniz";
		}
		return result;
	}
}
