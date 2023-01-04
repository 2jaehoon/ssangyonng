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
	super(wk, "메모장 정보",true);
	
	jbtn = new JButton("닫기");
	jta = new JTextArea("이 메모장은 자바언어로 만들어진\n"
			+ "메모장으로 License는 \n"
			+ "PL(Public License)로 자유롭게 \n"
			+ "배포하고 사용하실 수 있습니다.\n"
			+ "작성자 이재훈\n"
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
