package day1229;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

/**
 * ��,��,��,��. ����� ��ġ�� ������ �ڵ���ġ ������
 * @author user
 *
 */
@SuppressWarnings("serial")
//1. ������ ������Ʈ ��� (TestBorderLayout Ŭ������ ������ ������Ʈ�� �ȴ�.)
public class TestBorderLayout extends JFrame {
	
	public TestBorderLayout() {
		super("��� ���̾ƿ� ����.");
		//2. ����� ������Ʈ�� ����.
		JButton jbtnNorth = new JButton("North-��ư");//Ŭ������ �� ���� �� �� �ִ� ������Ʈ
		JButton jbtnWest = new JButton("West-��ư");
		
		JLabel jlblEast = new JLabel("East-��");//�ܼ��� �޽����� �̸��� �����ϴ� ������Ʈ �̸�ǥ
		JLabel jlblSouth = new JLabel("South-��");
		
		JTextArea jtaCenter = new JTextArea();//���� ���� �ؽ�Ʈ�� �Է��� �� �ִ� ������Ʈ
		jtaCenter.setText("Center-JTextArea");
		
		//JButton JLabel JTextArea �� ���� ���̴� ������Ʈ�� Visual Component��� �Ѵ�.
		//3. ��ġ�����ڸ� ���� setLayout(new BorderLayout() );
		setLayout(new BorderLayout());  //BorderLayout �� ���� ������ �ʴ� ������Ʈ�� Non-Visual Component��� �Ѵ�.
		
		//4. ��ġ : add(������Ʈ��); BorderLayout�� Center�� ��ġ�� �ȴ�.
		add("North", jbtnNorth);
		add(jlblSouth, "South");
		//BorderLayout�� Constant(���)�� ����Ͽ� ����
		add(BorderLayout.WEST,jbtnWest);
		add(jlblEast, BorderLayout.EAST);
		
		add("Center", jtaCenter);
		
		//5. �������� ũ�� ����
		setSize(400, 400);
		
		//6. ����ڿ��� �����ֱ�
		setVisible(true);
		
		//7. ���� ó��
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	}//TestBorderLayout

	public static void main(String[] args) {
		new TestBorderLayout();

	}//main

}
