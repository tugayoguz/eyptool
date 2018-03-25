package tr.com.vortechs.bilisim.bys.eyp.tool.presentation.model.impl;

import org.springframework.beans.factory.annotation.Autowired;

import tr.com.vortechs.bilisim.bys.eyp.tool.core.Model;
import tr.com.vortechs.bilisim.bys.eyp.tool.presentation.controller.LoginController;
import tr.com.vortechs.bilisim.bys.eyp.tool.presentation.model.LoginModel;

@Model
public class LoginModelImpl extends BaseModelImpl implements LoginModel{

	@Autowired
	private LoginController controller;

	@Override
	public boolean login(String username,String password) 
	{
		//TODO check username password
		// put to context
		return true;
	}
	
	
}
