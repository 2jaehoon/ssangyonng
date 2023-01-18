package project;

import java.awt.GridLayout;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class ViewPrint extends JDialog {
	private JButton jbtnClose;
	private JTextArea jtaView;
	private SelectDialogEvt sde;
	
	
	

	
	
	public ViewPrint(SelectDialog sd, SelectDialogEvt sde) {
		super(sd, sd.getTitle(),true); //getŸ��Ʋ�� ���� �޾ƿ��� �� ����
		
		
		
		
		
		jbtnClose = new JButton("�ݱ�");
		jtaView = new JTextArea( "�� �޸����� �ڹپ��� �������\n"
				+ "�޸������� License�� \n"
				+ "PL(Public License)�� �����Ӱ� \n"
				+ "�����ϰ� ����Ͻ� �� �ֽ��ϴ�.\n"
				+ "�ۼ��� ������\n"+sde.abc()
				+ "");/////////////////���⿡ ���� �޼ҵ�� �־� �ٰ� ���̵� �޼ҵ� �� ���ֱ� �ƴϸ� �ٸ� ����� �����غ���
		
		JPanel jpSouth = new JPanel();
		jpSouth.add(jbtnClose);
		
		add("South",jpSouth);
		add("Center",jtaView);
		
		setBounds(sd.getX()+100, sd.getY()+50, 300, 200);
		setVisible( true );
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		
		
		
	}//ViewPrint
	
	
	
	
	

}//class
