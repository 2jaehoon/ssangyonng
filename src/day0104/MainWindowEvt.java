package day0104;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainWindowEvt extends WindowAdapter  implements ActionListener {
	private MainWindow mw;
	
	public MainWindowEvt(MainWindow mw) {
		this.mw = mw;
		
	}//MainWindowEvt
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		new SubWindow(mw);
		
	}//actionPerformed

	@Override
	public void windowClosing(WindowEvent we) {
		mw.dispose();
	}//windowClosing


}//class
