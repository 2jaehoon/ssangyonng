package day0103;

import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

@SuppressWarnings("serial")
//1. Window Component ���, �̺�Ʈ�� ó���� Listener ����
public class TestEvent2 extends JFrame implements ActionListener{
	//2. �̺�Ʈ ó���� ���� �ִ� interface�� ����
	private JTextField jtfName;
	private JTextArea jtaNameView;
	
	public TestEvent2() {
		super("���� ���� ���̾ƿ�");
		
		//2. ������Ʈ�� ����
		JLabel jlblName = new JLabel("�̸�");
		jtfName = new JTextField(15);
		JButton jbtnAdd = new JButton("�Է�");
		jtaNameView = new JTextArea(); //j�� ��ũ���� ����
		JScrollPane jspJtaNameView = new JScrollPane(jtaNameView);
		
		//�������� �⺻ ���̾ƿ��� �������̾ƿ��̶� ���� ����
		
		
		//������Ʈ�� �̺�Ʈ�� �����ϱ� ���ؼ� �̺�Ʈ û�㸦 ��Ͻ�Ų��.
		//��ư�� Ŭ������ �׼��̺�Ʈ�� �߻��ϰ�
		jbtnAdd.addActionListener(this);
		//TextField�� ���ͷ� �׼��̺�Ʈ�� �߻��Ѵ�.
		jtfName.addActionListener(this);
		
		
		
		
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
		 add("North", jpNorth);
		add("Center", jspJtaNameView);
		
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
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//JTextField���� ���� �����ͼ�
		String text = jtfName.getText();
		//JTextArea�� ���� �߰�
		jtaNameView.append(text+"\n");
		//JTextField�� ���� �ʱ�ȭ
		jtfName.setText("");//empty�� �Է��ϸ� ���� �����Ǵ� ȿ���� ��´�.
		
	}//actionPerformed

	public static void main(String[] args) {
		new TestEvent2();
	}//main


}//class
