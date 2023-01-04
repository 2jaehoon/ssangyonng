package day0103;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import day0104.TestWindowEvent;

/**
 * 
 * @author user
 *
 */
@SuppressWarnings("serial")
//1. ������ ������Ʈ ���, �̺�Ʈ ������ ����
public class TestEventCompare extends JFrame implements ActionListener{
	private JButton jbtn1;
	private JButton jbtn2;
	
	public TestEventCompare() {
		super("�̺�Ʈ ��~");
		//2. ����� �Ľl��Ʈ�� ����
		 jbtn1 = new JButton("������ư1");
		jbtn2 = new JButton("������ư2");
		
		////////////////////////JVM�� ����ڰ� ��ư�� �������� �˼� �ֵ��� �̺�Ʈ ��Ͻ�Ŵ////////////////////////////////////////////////////////
		setLayout(new GridLayout(2,1));
		
		
		
		//3. ������Ʈ�� ������ ������Ʈ�� ��ġ
		add(jbtn1);
		add(jbtn2);
		
		
		//�̺�Ʈ ���
		jbtn1.addActionListener(this);
		jbtn2.addActionListener(this);
		
		
		
		//4. ������ ������Ʈ�� ũ�� ����
		setSize(400,400);
		//5. ����ڿ��� ������ ������Ʈ �����ֱ�
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}//TestSwing
	
	@Override
	public void actionPerformed(ActionEvent ae) {
//		System.out.println(ae.getSource()); ����� ������Ʈ �ּ� ��������
		//�̺�Ʈ�� �߻����� �� ����ڿ��� ������ �ڵ�
		if (ae.getSource() == jbtn1) {
			// btn�� ������ �� ������ �ڵ�
			System.out.println("��ư1");	
			new TestWindowEvent();
			}

		if (ae.getSource() == jbtn2) {
			// btn2�� ������ �� ������ �ڵ�
			System.out.println("��ư2");
		}
		
		
//		dispose();//��ư�� ������ ���α׷� ����
	}//actionPerformed

	public static void main(String[] args) {
		new TestEventCompare();

	}//main


}//class



