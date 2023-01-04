package day0104;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class SubWindow extends JDialog {
	private JButton jbtn;
	
	public SubWindow(MainWindow mw) {
		super(mw, "자식창-dialog",true);  //마지막 boolean true 모달, false 넌모달
		
		jbtn = new JButton("창 닫기");
		
		JPanel jpSouth = new JPanel();
		jpSouth.add(jbtn);
		
		add("South", jpSouth);
		
		//Dialog에서는 이벤트 등록을 setVisable전에 수행해야 한다.
		//어디서 액션이벤트를 청취할거냐? 바로 서브윈도우 이벤트에서 청취를 한다?
		jbtn.addActionListener(new SubWindowEvt(this));
		
		
		setBounds(mw.getX()+100, mw.getY()+50, 400, 300);
		setVisible(true);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
	}

}//class
