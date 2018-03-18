package tr.com.vortechs.bilisim.bys.eyp.tool.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Test2 {
	
	@Autowired
	private Test1 test1;
	
	public void sayHello2Mark()
	{
		test1.sayHello("mark");
	}
}
