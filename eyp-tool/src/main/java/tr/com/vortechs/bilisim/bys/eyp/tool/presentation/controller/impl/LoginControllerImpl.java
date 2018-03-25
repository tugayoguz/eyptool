package tr.com.vortechs.bilisim.bys.eyp.tool.presentation.controller.impl;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.springframework.stereotype.Controller;

import tr.com.vortechs.bilisim.bys.eyp.tool.presentation.controller.LoginController;
import tr.com.vortechs.bilisim.bys.eyp.tool.presentation.model.LoginModel;
import tr.com.vortechs.bilisim.bys.eyp.tool.presentation.view.LoginView;

@Controller
public class LoginControllerImpl extends BaseControllerImpl<LoginView, LoginModel> implements LoginController{

	@Override
	public void bindViewModel()
	{
		getView().getLoginButton().addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				if(getModel().login(getView().getUsername(), getView().getPassword())) {
					navigateTo(HomeControllerImpl.class);
				}
				
			}
		});
	}

}
