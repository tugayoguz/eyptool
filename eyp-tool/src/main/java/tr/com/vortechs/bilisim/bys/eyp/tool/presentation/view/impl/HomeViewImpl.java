package tr.com.vortechs.bilisim.bys.eyp.tool.presentation.view.impl;

import javax.swing.JButton;
import javax.swing.JFrame;

import tr.com.vortechs.bilisim.bys.eyp.tool.core.View;
import tr.com.vortechs.bilisim.bys.eyp.tool.presentation.view.HomeView;

@View
public class HomeViewImpl extends BaseViewImpl implements HomeView{

	private JFrame frame;
	private JButton button;

	
	@Override
	public void buildView() {
		frame = new JFrame("HelloWorldSwing");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button = new JButton("Jump!");
		frame.getContentPane().add(button);
	}
	
	@Override
	public void show() {
		 frame.pack();
	     frame.setVisible(true);
	}

	@Override
	public void hide() {
		 frame.pack();
	     frame.setVisible(false);
	}

	@Override
	public JButton getButton() {
		return button;
	}

}
