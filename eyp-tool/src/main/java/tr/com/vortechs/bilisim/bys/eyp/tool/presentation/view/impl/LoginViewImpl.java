package tr.com.vortechs.bilisim.bys.eyp.tool.presentation.view.impl;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import tr.com.vortechs.bilisim.bys.eyp.tool.core.View;
import tr.com.vortechs.bilisim.bys.eyp.tool.presentation.view.LoginView;

@View
public class LoginViewImpl extends BaseViewImpl implements LoginView{

	private JFrame frame;
	private JLabel l1, l2, l3;
	private JTextField tf1;
	private JButton loginButton;
	private JPasswordField p1;
	
	@Override
	public void buildView() {
		  frame = new JFrame("EYP Tool");
		  frame.setSize(600, 300);
		  frame.setLayout(null);
		  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  l1 = new JLabel("Biliþim EYP Tool");
		 // l1.setForeground(Color.blue);
		 // l1.setFont(new Font("Serif", Font.BOLD, 20));
		  l2 = new JLabel("Kullanýcý adý");
		  l3 = new JLabel("Þifre");
		  tf1 = new JTextField();
		  p1 = new JPasswordField();
		  loginButton = new JButton("Giriþ");
		 
		  l1.setBounds(100, 30, 400, 30);
		  l2.setBounds(80, 70, 200, 30);
		  l3.setBounds(80, 110, 200, 30);
		  tf1.setBounds(300, 70, 200, 30);
		  p1.setBounds(300, 110, 200, 30);
		  loginButton.setBounds(150, 160, 100, 30);
		 
		  frame.add(l1);
		  frame.add(l2);
		  frame.add(tf1);
		  frame.add(l3);
		  frame.add(p1);
		  frame.add(loginButton);
		 
	}
	
	@Override
	public void show() {
		// frame.pack();
	     frame.setVisible(true);
	}

	@Override
	public void hide() {
	//	 frame.pack();
	     frame.setVisible(false);
	}

	@Override
	public JButton getLoginButton() {
		return loginButton;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return tf1.getText();
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return new String(p1.getPassword());
	}


}
