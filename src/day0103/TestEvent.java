package day0103;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * 
 * @author user
 *
 */
@SuppressWarnings("serial")
//1. ������ ������Ʈ ���, �̺�Ʈ ������ ����
public class TestEvent extends JFrame implements ActionListener{
	public TestEvent() {
		super("����~");
		//2. ����� �Ľl��Ʈ�� ����
		JButton jbtn = new JButton("������ư");
		
		////////////////////////JVM�� ����ڰ� ��ư�� �������� �˼� �ֵ��� �̺�Ʈ ��Ͻ�Ŵ////////////////////////////////////////////////////////
		jbtn.addActionListener(this);//�̺�Ʈ�� �߻��Ǿ��� �� ó���� ��ü�� �� �ڽ��̴�.
		
		//3. ������Ʈ�� ������ ������Ʈ�� ��ġ
		add(jbtn);
		//4. ������ ������Ʈ�� ũ�� ����
		setSize(400,400);
		//5. ����ڿ��� ������ ������Ʈ �����ֱ�
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}//TestSwing
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		System.out.println(ae);
		//�̺�Ʈ�� �߻����� �� ����ڿ��� ������ �ڵ�
		System.out.println("���� ��ư Ŭ���ϼ̾��?");
		dispose();//��ư�� ������ ���α׷� ����
	}//actionPerformed

	public static void main(String[] args) {
		new TestEvent();

	}//main


}//class
