package tr.com.vortechs.bilisim.bys.eyp.tool.app;

import java.sql.SQLException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import tr.com.vortechs.bilisim.bys.eyp.tool.presentation.controller.LoginController;

public class BysEypToolApp
{
	public static void main(String[] args) throws SQLException {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BysEypToolConfiguration.class);
		LoginController controller = context.getBean(LoginController.class);
		controller.getView().show();
	}
}
