package project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.HashMap;

import javax.swing.JOptionPane;

public class SistLoginEvt extends WindowAdapter implements ActionListener {
	private SistLogin sl;
	
	public SistLoginEvt(SistLogin sl) {
		this.sl = sl;
	}//SistLoginEvt

	@Override
	public void actionPerformed(ActionEvent ae) {
//		if(ae.getSource()==sl.getJbtnLogin() || ae.getSource()==sl.getJtfPw() || ae.getSource()==sl.getJtfId()); 
		inputPlz();
	}//actionPerformed
	
	public void inputPlz() {
		String i = sl.getJtfId().getText();
		String j = new String(sl.getJtfPw().getPassword()); 
		
		if(i.isEmpty()) {
			JOptionPane.showMessageDialog( null , "Id�� �Է����ּ���.");
		}else if(j.isEmpty()) {
			JOptionPane.showMessageDialog( null , "PassWord�� �Է����ּ���.");
		}else {
			compareLogin();
		}//end if
	}//inputPlz

	public void compareLogin() {
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("admin", "1234");
		hm.put("root", "1111");
		hm.put("administrator", "12345");
		String a = sl.getJtfId().getText();
		//sl.getJtfPw()�� JtfPw�� �ּ�
		//JPasswordField�� getPassword�޼ҵ�� ���� �����ü� �ְ� �� ���� char[]�� ����ִ�.
		//StringŬ���� �����ڿ� String(char[] value)�� ��й�ȣ�� ������
		//String�� �־��ش�.
		String b = new String(sl.getJtfPw().getPassword()); 
		if(hm.containsKey(a)) {
		    if(hm.get(a).equals(b)) {
		    	new SelectDialog(sl);
		    	sl.dispose();
		    	
		    }else {
		       JOptionPane.showMessageDialog( null , "PassWord ������ �߸��Ǿ����ϴ�.");
		    }//end else
		 }else {
		    JOptionPane.showMessageDialog( null , "�α��� ������ �߸��Ǿ����ϴ�.");
		 }//end else
	
	}//compareLogin
	
	@Override
	public void windowClosing(WindowEvent e) {
		sl.dispose();
	}//windowClosing

}//SistLoginEvt
