package tr.com.vortechs.bilisim.bys.eyp.tool.presentation.view.impl;

import javax.annotation.PostConstruct;

import tr.com.vortechs.bilisim.bys.eyp.tool.presentation.view.BaseView;

public abstract class  BaseViewImpl implements BaseView{

	@PostConstruct
	public void init()
	{
		buildView();
	}
}
