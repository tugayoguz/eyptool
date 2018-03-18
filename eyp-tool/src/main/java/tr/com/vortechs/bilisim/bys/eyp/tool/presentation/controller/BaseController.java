package tr.com.vortechs.bilisim.bys.eyp.tool.presentation.controller;

import tr.com.vortechs.bilisim.bys.eyp.tool.presentation.controller.navigator.Navigated;
import tr.com.vortechs.bilisim.bys.eyp.tool.presentation.model.BaseModel;
import tr.com.vortechs.bilisim.bys.eyp.tool.presentation.view.BaseView;

public interface BaseController<V extends BaseView,M extends BaseModel> extends Navigated{
	
	V getView();
	M getModel();
	void bindViewModel();
	void navigateTo(Class<? extends Navigated> target);
}
