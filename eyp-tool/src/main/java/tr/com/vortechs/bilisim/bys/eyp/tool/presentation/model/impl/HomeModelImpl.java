package tr.com.vortechs.bilisim.bys.eyp.tool.presentation.model.impl;

import tr.com.vortechs.bilisim.bys.eyp.tool.core.Model;
import tr.com.vortechs.bilisim.bys.eyp.tool.presentation.model.HomeModel;

@Model
public class HomeModelImpl extends BaseModelImpl implements HomeModel{

	@Override
	public void jump() {
		System.out.println("jump!");
	}
}
