package day0104;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class SubWindow extends JDialog {
	private JButton jbtn;
	
	public SubWindow(MainWindow mw) {
		super(mw, "�ڽ�â-dialog",true);  //������ boolean true ���, false �͸��
		
		jbtn = new JButton("â �ݱ�");
		
		JPanel jpSouth = new JPanel();
		jpSouth.add(jbtn);
		
		add("South", jpSouth);
		
		//Dialog������ �̺�Ʈ ����� setVisable���� �����ؾ� �Ѵ�.
		//��� �׼��̺�Ʈ�� û���Ұų�? �ٷ� ���������� �̺�Ʈ���� û�븦 �Ѵ�?
		jbtn.addActionListener(new SubWindowEvt(this));
		
		
		setBounds(mw.getX()+100, mw.getY()+50, 400, 300);
		setVisible(true);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
	}

}//class
