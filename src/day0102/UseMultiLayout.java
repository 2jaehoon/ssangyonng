package day0102;

import java.awt.TextArea;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

@SuppressWarnings("serial")
//1. Window Component ���
public class UseMultiLayout extends JFrame {
	
	public UseMultiLayout() {
		super("���� ���� ���̾ƿ�");
		
		//2. ������Ʈ�� ����
		JLabel jlblName = new JLabel("�̸�");
		JTextField jtfName = new JTextField(15);
		JButton jbtnAdd = new JButton("�Է�");
		
		JTextArea jtaNameView = new JTextArea(); //j�� ��ũ���� ����
		
		//�������� �⺻ ���̾ƿ��� �������̾ƿ��̶� ���� ����
		
		//3. ��ġ 
		//�򸮰� �򸮰� ����־ �������� ���� �� ���� ���δ�.
//		add("North", jlblName);
//		add("North", jtfName);
//		add("North", jbtnAdd);
		
		//�����̳� ������Ʈ�� ����ؾ� �Ѵ�. ���� �������� �ϱ� ���ؼ�
		 JPanel jpNorth =  new JPanel(); //FlowLayout
		 jpNorth.add(jlblName);
		 jpNorth.add(jtfName);
		 jpNorth.add(jbtnAdd);
		
		 //���� ���� ������Ʈ�� ���� JPanel�� ������ ������Ʈ�� ��ġ
		 add("South", jpNorth);
		add("Center", jtaNameView);
		
		//4. ������ ũ�� ����
		//setSize(400, 300);
		//��ġ ����(������Ʈ Ŭ�������� ��ӹ���)
		//setLocation(1200, 200);
		//ũ��,��ġ �ѹ��� ����
		setBounds(1200, 200, 400, 300);
		
		//5. ����ڿ��� �����ֱ�
		setVisible(true);
		
		//6. ���� ó��
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}//UseMultiLayout

	public static void main(String[] args) {
		new UseMultiLayout();
	}//main

}//class
