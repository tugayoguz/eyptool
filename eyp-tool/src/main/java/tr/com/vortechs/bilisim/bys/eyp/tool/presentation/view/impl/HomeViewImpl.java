package tr.com.vortechs.bilisim.bys.eyp.tool.presentation.view.impl;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;

import tr.com.vortechs.bilisim.bys.eyp.tool.context.ViewMessages;
import tr.com.vortechs.bilisim.bys.eyp.tool.core.View;
import tr.com.vortechs.bilisim.bys.eyp.tool.presentation.view.HomeView;

@View
public class HomeViewImpl extends BaseViewImpl implements HomeView{

	private JFrame frame;
	private JTabbedPane jtp;

	private JPanel eypImportPanel;
	private JButton dosyaSec;

	private JPanel eypExportPanel;
	private JTextField eypExportEvrakNoTextField;
	private JLabel eypExportEvrakKonuLabel;
	private JButton evrakNoSorgulaButton;
	private JButton evrakNoAlaniSilButton;
	
	private JFileChooser dosyaSecPop;


	@Override
	public void buildView() {
		frame = new JFrame(ViewMessages.FRAME_HEADER);
		frame.setSize(600, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jtp = new JTabbedPane();
		// start eyp import panel
		eypImportPanel = new JPanel();

		dosyaSec = new JButton(ViewMessages.UPLOAD_EYP_BUTTON_TEXT);
		eypImportPanel.add(dosyaSec);
		// end of eyp import panel
		// start eyp export panel
		eypExportPanel = new JPanel();
		eypExportPanel.setLayout(new BoxLayout(eypExportPanel, BoxLayout.Y_AXIS));
		// row1
		JPanel row1 = new JPanel();
		row1.add(new JLabel("Evrak No:"));
		eypExportEvrakNoTextField = new JTextField(25);
		row1.add(eypExportEvrakNoTextField);
		evrakNoSorgulaButton = new JButton(ViewMessages.COMMON_SEARCH);
		row1.add(evrakNoSorgulaButton);
		evrakNoAlaniSilButton = new JButton(ViewMessages.COMMON_CLEAR);
		row1.add(evrakNoAlaniSilButton);
		eypExportPanel.add(row1);
		//row 2
		JPanel row2 = new JPanel();
		row2.add(new JLabel("Evrak Konu"));
		eypExportEvrakKonuLabel = new JLabel();
		row2.add(eypExportEvrakKonuLabel);
		eypExportPanel.add(row2);
		// end of eyp export panel

		frame.getContentPane().add(jtp);
		jtp.addTab(ViewMessages.IMPORT_TAB_HEADER,eypImportPanel);
		jtp.addTab(ViewMessages.EXPORT_TAB_HEADER, eypExportPanel);
		
		
		dosyaSecPop=new JFileChooser("Open");
		//sets the text and language of all the components in JFileChooser
		
		dosyaSecPop = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
		dosyaSecPop.setDialogTitle("Lütfen evrak olarak eklemek istediðinig E-Yazýþma paketini seçiniz");
		dosyaSecPop.setAcceptAllFileFilterUsed(false);
		FileNameExtensionFilter filter = new FileNameExtensionFilter("E-Yazisma Paketi (.eyp)", "eyp");
		dosyaSecPop.addChoosableFileFilter(filter);
		
		

	}

	@Override
	public void show() {
		frame.setVisible(true);
	}

	@Override
	public void hide() {
		frame.setVisible(false);
	}

	@Override
	public JButton getDosyaSecButton() {
		return dosyaSec;
	}
	
	
	@Override
	public JTextField getEypExportEvrakNoTextField() {
		return eypExportEvrakNoTextField;
	}

	@Override
	public JButton getEvrakNoSorgulaButton() {
		return evrakNoSorgulaButton;
	}

	@Override
	public JButton getEvrakNoAlaniSilButton() {
		return evrakNoAlaniSilButton;
	}
	
	@Override
	public JLabel getEypExportEvrakKonuLabel() {
		return eypExportEvrakKonuLabel;
	}

	@Override
	public void openDosyaSecDialog() {
		int returnValue = dosyaSecPop.showOpenDialog(null);
		if (returnValue == JFileChooser.APPROVE_OPTION) {
			System.out.println(dosyaSecPop.getSelectedFile().getPath());
		}
		
	}


}
