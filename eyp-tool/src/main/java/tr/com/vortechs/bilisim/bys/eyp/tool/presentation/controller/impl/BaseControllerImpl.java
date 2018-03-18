package tr.com.vortechs.bilisim.bys.eyp.tool.presentation.controller.impl;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;

import tr.com.vortechs.bilisim.bys.eyp.tool.presentation.controller.BaseController;
import tr.com.vortechs.bilisim.bys.eyp.tool.presentation.controller.navigator.Navigated;
import tr.com.vortechs.bilisim.bys.eyp.tool.presentation.controller.navigator.Navigator;
import tr.com.vortechs.bilisim.bys.eyp.tool.presentation.model.BaseModel;
import tr.com.vortechs.bilisim.bys.eyp.tool.presentation.view.BaseView;

public abstract class BaseControllerImpl<V extends BaseView,M extends BaseModel> implements BaseController<V,M>{

	@Autowired
	private Navigator navigator;
	
	@Autowired
	private V view;
	
	@Autowired
	private M model;

	@Override
	public V getView() {
		return view;
	}

	@Override
	public M getModel() {
		return model;
	}
	
	@PostConstruct
	public void init()
	{
		view.buildView();
		view.hide();
		bindViewModel();
		navigator.register(this);
	}

	@Override
	public void hide() {
		view.hide();
	}

	@Override
	public void show() {
		System.out.println(view.getClass());
		view.show();
	}

	@Override
	public void navigateTo(Class<? extends Navigated> target) {
		navigator.navigateTo(this.getClass(), target);
	}
	
	

}
