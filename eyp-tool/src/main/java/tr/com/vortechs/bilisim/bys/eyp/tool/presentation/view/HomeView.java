package tr.com.vortechs.bilisim.bys.eyp.tool.presentation.view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public interface HomeView extends BaseView{
	JButton getDosyaSecButton();
	void openDosyaSecDialog();
	JTextField getEypExportEvrakNoTextField();
	JButton getEvrakNoSorgulaButton();
	JButton getEvrakNoAlaniSilButton();
	JLabel getEypExportEvrakKonuLabel();
}
