package day0105;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SubWork0104Evt implements ActionListener {
	private SubWork0104 sw;
	
	public SubWork0104Evt(SubWork0104 sw) {
		this.sw = sw;
	}//SubWork0104Evt

	@Override
	public void actionPerformed(ActionEvent e) {
		sw.dispose();
	}//actionPerformed

}
