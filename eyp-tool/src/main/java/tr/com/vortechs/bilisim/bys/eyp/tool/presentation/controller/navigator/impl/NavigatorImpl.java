package tr.com.vortechs.bilisim.bys.eyp.tool.presentation.controller.navigator.impl;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import tr.com.vortechs.bilisim.bys.eyp.tool.core.Navigator;
import tr.com.vortechs.bilisim.bys.eyp.tool.presentation.controller.navigator.Navigated;

@Navigator
public class NavigatorImpl implements tr.com.vortechs.bilisim.bys.eyp.tool.presentation.controller.navigator.Navigator{

	private Map<Class<? extends Navigated>,Navigated> navigatedMap;
	private Navigated activeNavigated;
	
	
	@Override
	public void register(Navigated navigated) {
		System.out.println(navigated.getClass());
		navigatedMap.put(navigated.getClass(), navigated);
	}
	
	@PostConstruct
	public void init()
	{
		navigatedMap = new HashMap<Class<? extends Navigated>, Navigated>();
	}

	@Override
	public Navigated getActiveNavigated() {
		return activeNavigated;
	}

	@Override
	public void navigateTo(Class<? extends Navigated> source, Class<? extends Navigated> destination) {
		if(navigatedMap.containsKey(source) && navigatedMap.containsKey(destination)){
			System.out.println(source.getName());
			System.out.println(destination.getName());
			navigatedMap.get(source).hide();
			activeNavigated = navigatedMap.get(destination);
			activeNavigated.show();
		}else{
			//TODO add logger or throw exception
			System.out.println("source or target not exist in navigation map!");
		}
		
	}


}
