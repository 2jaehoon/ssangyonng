package day1229;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * 
 * @author user
 *
 */
@SuppressWarnings("serial")
//1. jFrame�� ���
public class TestSwing extends JFrame {
	public TestSwing() {
		super("����~");
		//2. ����� �Ľl��Ʈ�� ����
		JButton jbtn = new JButton("������ư");
		
		//3. ������Ʈ�� ������ ������Ʈ�� ��ġ
		add(jbtn);
		//4. ������ ������Ʈ�� ũ�� ����
		setSize(400,400);
		//5. ����ڿ��� ������ ������Ʈ �����ֱ�
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}//TestSwing

	public static void main(String[] args) {
		new TestSwing();

	}//main

}//class
