package day1229;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;

@SuppressWarnings("serial")
//1. ������ ������Ʈ ���
public class TestGridLayout extends JFrame {
	
	public TestGridLayout() {
		super("���ڷ��̾ƿ�"); //title bar�� ����
		//2.������Ʈ ����
		JButton jbtn1 = new JButton("��ư1");
		JButton jbtn2 = new JButton("��ư2");
		JButton jbtn3 = new JButton("��ư3");
		
		JComboBox<String> jcb1 = new JComboBox<String>("�����, ��Թ�, �躸��".split(","));
		JComboBox<String> jcb2 = new JComboBox<String>("��ΰ�, ����ȣ, ���¿�".split(","));
		JComboBox<String> jcb3 = new JComboBox<String>("������, ������, �̱���, �̴ܱ�".split(","));
		
		//3.��ġ������ ����
		setLayout(new GridLayout(3,2));
		
		//4. ��ġ
		add(jbtn1);
		add(jbtn2);
		add(jbtn3);
		add(jcb1);
		add(jcb2);
		add(jcb3);

		
		//5. ������ ũ�� ����
		setSize(300, 300);
		
		//6. ����ȭ
		setVisible(true);
		
		//7. ������ ���� ó��
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}//TestGridLayout

	public static void main(String[] args) {
		new TestGridLayout();

	}//main

}//class
