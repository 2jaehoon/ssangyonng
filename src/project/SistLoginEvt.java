package project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.util.HashMap;

public class SistLoginEvt extends WindowAdapter implements ActionListener {
	private SistLogin sl;
	
	public SistLoginEvt(SistLogin sl) {
		this.sl = sl;
	}//SistLoginEvt

	@Override
	public void actionPerformed(ActionEvent ae) {
		System.out.println("Å¬¸¯µÆ´ç");
		if(ae.getSource()==sl.getJbtnLogin()) {
		compareLogin();
		}
		
	}//actionPerformed
	
	public void compareLogin() {
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("admin", "1234");
		hm.put("root", "1111");
		hm.put("administrator", "12345");
		String a = sl.getJtfId().getText();
		String b = sl.getJtfPw().getText();
		
		if(hm.containsKey(a)&&hm.containsValue(hm.get(a))) {
				new asd123();
		}//end if
		
	}
	
	

	
	

}//SistLoginEvt
