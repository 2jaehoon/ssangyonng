package day1229;

import java.awt.Button;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

@SuppressWarnings("serial")
//1. ������ ������Ʈ ���
public class TestFlowLayout extends JFrame {
	
	public TestFlowLayout() {
		super("FlowLayout ����");
		//2. ������Ʈ ����
		JButton jbtn = new JButton("��ư");
		JCheckBox jcb = new JCheckBox("�α��� ����");
		//Visual Component 
		JRadioButton jrbM = new JRadioButton("����");
		JRadioButton jrbF = new JRadioButton("����");
		
		//RadioButton�� Group���� ������ ������ ��� ���õȴ�.
		ButtonGroup bg = new ButtonGroup();//Non-Visual Component
		bg.add(jrbM);
		bg.add(jrbF);
		
		JTextField jtf = new JTextField(10);
		
		//3. ��ġ�����ڸ� ���� BorderLayout => FlowLayout
		setLayout(new FlowLayout());
		
		//4. ��ġ
		add(jbtn); //������Ʈ�� add��ġ�Ǵ� ������� ����ũ�⸦ ������ ��ġ�ȴ�.
		add(jcb); //������Ʈ�� add��ġ�Ǵ� ������� ����ũ�⸦ ������ ��ġ�ȴ�.
		add(jrbM); //������Ʈ�� add��ġ�Ǵ� ������� ����ũ�⸦ ������ ��ġ�ȴ�.
		add(jrbF); //������Ʈ�� add��ġ�Ǵ� ������� ����ũ�⸦ ������ ��ġ�ȴ�.
		add(jtf); //������Ʈ�� add��ġ�Ǵ� ������� ����ũ�⸦ ������ ��ġ�ȴ�.
		
		//5. ������ ũ�� ����
		setSize(600, 300);
		
		//6. ����ȭ
		setVisible(true);
		
		//7. ������ ����ó��
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}//TestFlowLayout

	public static void main(String[] args) {
		new TestFlowLayout();
	}//main

}//class
