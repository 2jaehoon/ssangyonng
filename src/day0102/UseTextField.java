package day0102;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.LayoutManager;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class UseTextField extends JFrame {
	public UseTextField() {
		super("JTextComponent�� ���");
		
		//2. ������Ʈ ����
		JTextField jtfld = new JTextField();
		JPasswordField jpf = new JPasswordField();
		JLabel jlblOutput = new JLabel("���â");
		
		jpf.setEchoChar('*'); //��й�ȣ ������ �ٲٱ�, ���⹮�� ����
		 
		//TitledBorder ����
		TitledBorder tbId = new TitledBorder("���̵�");
		//������Ʈ�� ����
		jtfld.setBorder(tbId);
		
		//jpf.setBorder(new TitledBorder("��й�ȣ"));
		jpf.setBorder(new LineBorder(Color.red));
		jlblOutput.setBorder(new TitledBorder("���â"));
		
		
		
		
		//1. MenuBar ����
		JMenuBar jmb = new JMenuBar();

		//2. Menu ����
		JMenu jm = new JMenu("�޴��� �� ���ڿ�");

		//3. MenuItem ����
		JMenuItem jmi = new JMenuItem("�޴� �����ۿ� �� ���ڿ�");
		
		
		
		//3. ��ġ������ ����
		setLayout(new GridLayout(3,1));
		
		//4. ��ġ
		add(jtfld);
		add(jpf);
		add(jlblOutput);
		
		
		//5. ������ ũ�� ����
		setBounds(1200, 200, 250, 200);
		
		//6. ����ȭ
		setVisible(true);
		
		//7. �����̺�Ʈó��
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
	}//UseTextField

	private LayoutManager GridLayout(int i, int j) {
		// TODO Auto-generated method stub
		return null;
	}

	public static void main(String[] args) {
		new UseTextField();

	}//main

}//class
