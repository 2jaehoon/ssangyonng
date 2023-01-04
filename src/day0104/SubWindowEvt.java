package day0104;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;

public class SubWindowEvt implements ActionListener {
	private SubWindow sw;
	
	public SubWindowEvt(SubWindow sw) {
		this.sw = sw;
		
	}//SubWindowEvt

	@Override
	public void actionPerformed(ActionEvent ae) {
		sw.dispose();
	}//actionPerformed

}
