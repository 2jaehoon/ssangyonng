package day0105;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MemoInfoEvt extends WindowAdapter implements ActionListener {
	private MemoInfo mi;
	
	public MemoInfoEvt(MemoInfo mi) {
		this.mi = mi;
	}//MemoInfoEvt
	

	@Override
	public void actionPerformed(ActionEvent ae) {
		mi.dispose();
	}//actionPerformed
	
	@Override
	public void windowClosing(WindowEvent we) {
		mi.dispose();
	}
	

}
