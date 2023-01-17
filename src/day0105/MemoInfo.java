package day0105;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class MemoInfo extends JDialog {
	private JButton jbtnClose;
	private JTextArea jtaInfo;
	
	
	public MemoInfo (JavaMemo jm) {
	super(jm, "�޸��� ����",true);
	
	jbtnClose = new JButton("�ݱ�");
	jtaInfo = new JTextArea("�� �޸����� �ڹپ��� �������\n"
			+ "�޸������� License�� \n"
			+ "PL(Public License)�� �����Ӱ� \n"
			+ "�����ϰ� ����Ͻ� �� �ֽ��ϴ�.\n"
			+ "�ۼ��� ������\n"
			+ "");
	
	JPanel jpSouth = new JPanel();
	jpSouth.add(jbtnClose);
	
	add("South", jpSouth);
	add("Center", jtaInfo);
	
	jbtnClose.addActionListener(new MemoInfoEvt(this));
	
	setBounds(jm.getX()+100, jm.getY()+50, 300, 200);
	setVisible(true);
		
		
	}//MemoInfo
	

}//class
