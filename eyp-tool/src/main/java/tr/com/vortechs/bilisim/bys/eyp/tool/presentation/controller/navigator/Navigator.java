package tr.com.vortechs.bilisim.bys.eyp.tool.presentation.controller.navigator;


public interface Navigator {
	void register(Navigated navigated);
	void navigateTo(Class<? extends Navigated> source,Class<? extends Navigated> destination);
	Navigated getActiveNavigated();
}
