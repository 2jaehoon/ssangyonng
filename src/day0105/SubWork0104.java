package day0105;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class SubWork0104 extends JDialog {
	private JButton jbtn;
	private JTextArea jta;
	
	
	public SubWork0104 (Work0104 wk) {
	super(wk, "�޸��� ����",true);
	
	jbtn = new JButton("�ݱ�");
	jta = new JTextArea("�� �޸����� �ڹپ��� �������\n"
			+ "�޸������� License�� \n"
			+ "PL(Public License)�� �����Ӱ� \n"
			+ "�����ϰ� ����Ͻ� �� �ֽ��ϴ�.\n"
			+ "�ۼ��� ������\n"
			+ "");
	
	JPanel jpSouth = new JPanel();
	jpSouth.add(jbtn);
	
	add("South", jpSouth);
	add("Center", jta);
	
	jbtn.addActionListener(new SubWork0104Evt(this));
	
	setBounds(wk.getX()+100, wk.getY()+50, 300, 200);
	setVisible(true);
	setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		
		
	}//SubWork0104
	

}//class
