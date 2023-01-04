package day0102;

import java.awt.Color;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;

@SuppressWarnings("serial")
public class UseManualLayout extends JFrame {
		//1. ������ ������Ʈ ���
	public UseManualLayout() {
		super("������ġ");
		
		//2. ������Ʈ�� ����
		JButton jbtn = new JButton("��ư");
		
		Vector<String> vec = new Vector<String>();
		vec.add("�����");
		vec.add("��Թ�");
		vec.add("�躸��");
		vec.add("��ΰ�");		
		JList<String> jlist = new JList<String>(vec);
		
		JLabel jlbl = new JLabel("��");
		jlbl.setBackground(Color.pink);
		jlbl.setOpaque(true); //������
		
		//3. ��ǥ ����
		jbtn.setLocation(100, 40);
		
		//4. ũ�� ����
		jbtn.setSize(80,40);
		
		jlist.setBounds(180, 80, 250, 100);
		jlbl.setBounds(430, 180, 90, 30);
		
		//5. ��ġ������ ���� (BorderLayout �⺻ ���̾ƿ�)
		setLayout(null);
		
		//6. ��ġ
		add(jbtn);
		add(jlist);
		add(jlbl);
		
		//7. ������ ũ�� ����
		setBounds(1200,200, 600, 400);
		
		//8. �����ֱ�
		setVisible(true);
		
		//9. ����ó��
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}//UseManualLayout
	

	public static void main(String[] args) {
		new UseManualLayout();

	}//main

}//class
