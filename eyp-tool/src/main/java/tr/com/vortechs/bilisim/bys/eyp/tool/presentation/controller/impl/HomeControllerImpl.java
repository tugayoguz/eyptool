package tr.com.vortechs.bilisim.bys.eyp.tool.presentation.controller.impl;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import tr.com.vortechs.bilisim.bys.eyp.tool.core.Controller;
import tr.com.vortechs.bilisim.bys.eyp.tool.presentation.controller.HomeController;
import tr.com.vortechs.bilisim.bys.eyp.tool.presentation.model.HomeModel;
import tr.com.vortechs.bilisim.bys.eyp.tool.presentation.view.HomeView;

@Controller
public class HomeControllerImpl extends BaseControllerImpl<HomeView, HomeModel> implements HomeController{

	@Override
	public void bindViewModel()
	{
		getView().getButton().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				getModel().jump();
			}
		});
	}

}