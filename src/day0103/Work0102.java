package day0103;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
//1. ������ ������Ʈ ���
@SuppressWarnings("serial")
public class Work0102 extends JFrame {
	public Work0102() {
		super("����");
		// 2. ������Ʈ ����
		//�̸��� ���� �󺧰� �ؽ�Ʈ �ʵ� ����
		JLabel jlbName = new JLabel("            �̸�");
		JTextField jtfName = new JTextField();
		
		//���̿� ���� �󺧰� �޺� �ڽ� ����
		JLabel jlbAge = new JLabel("            ����");
		JComboBox<String> jcbAge = new JComboBox<String>(" ,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35".split(","));
		
		//������ ���� �󺧰� ��ư�׷����� ��ư�� ��� Ŭ���� �ϳ��� �ǰ� ����
		JLabel jlbSex = new JLabel("            ����");
		JRadioButton jrbSex = new JRadioButton("��");
		JRadioButton jrbSex2 = new JRadioButton("��");
		ButtonGroup bg = new ButtonGroup();
		bg.add(jrbSex);
		bg.add(jrbSex2);
		
		//��ȭ��ȣ�� ���� �󺧰� �ؽ�Ʈ �ʵ� ����
		JLabel jlbNumber = new JLabel("            ��ȭ��ȣ");
		JTextField jtfNumber = new JTextField();
		
		//������ �ؽ�Ʈ ���� ����
		JTextArea jta = new JTextArea();
		//��ũ�ѹٰ� �ʿ��� ������Ʈ�� �߰�
		JScrollPane jsp = new JScrollPane(jta);
		//�� ���� ��ȣ (�Է� �ؽ�Ʈ�� JTextArea�� ���� ������ �ڵ� �� ����)
		jta.setLineWrap(true);
		//�ܾ� ��ȣ (���� ������ �� �ܾ� (����� �ؽ�Ʈ)������ �� ����)
		jta.setWrapStyleWord(true);
		
		//��ư�� 4���� ������ �г��� �����ؼ� �־���
		JButton jbInput = new JButton("�Է�");
		JButton jbUpdate = new JButton("����");
		JButton jbDelete = new JButton("����");
		JButton jbEnd = new JButton("����");
		JTextField asd = new JTextField("asd");
		JPanel jpButton = new JPanel();
		
		jpButton.add(asd);
		jpButton.add(jbInput);
		jpButton.add(jbUpdate);
		jpButton.add(jbDelete);
		jpButton.add(jbEnd);
		
		
	
		//3. ��ġ������, ������Ʈ ũ��
		
		setLayout(null);//��ġ�����ڸ� ���������� ����
		
		//�̸��� ���� �󺧰� �ؽ�Ʈ �ʵ� ũ�� ����
		jlbName.setBounds(0, 10, 80, 40);
		jtfName.setBounds(100, 10, 100, 40);
		
		//���̿� ���� �󺧰� �޺��ڽ� ũ�� ����
		jlbAge.setBounds(0, 60, 80, 40);
		jcbAge.setBounds(100, 60, 100, 40);
		
		//������ ���� �󺧰� ���� ��ư ũ�� ����
		jlbSex.setBounds(0, 110, 80, 40);
		jrbSex.setBounds(100, 110, 50, 40);
		jrbSex2.setBounds(150, 110, 50, 40);
		
		//��ȭ��ȣ�� ���� �󺧰� �ؽ�Ʈ �ʵ� ũ�� ����
		jlbNumber.setBounds(0, 160, 100, 40);
		jtfNumber.setBounds(100, 160, 100, 40);
		
		//������ �ؽ�Ʈ ����ũ�� ����
		jsp.setBounds(220, 10, 250, 190);
		
		//��ư4���� ���� �гο� ���� ũ�� ����
		jpButton.setBounds(130, 210, 260, 100);
		
		
		//4. ��ġ
		//�̸��� ���� �󺧰� �ؽ�Ʈ �ʵ� ��ġ
		add(jlbName);
		add(jtfName);
		
		//���̿� ���� �󺧰� �޺��ڽ� ��ġ
		add(jlbAge);
		add(jcbAge);
		
		//������ ���� �󺧰� ���� ��ư ��ġ
		add(jlbSex);
		add(jrbSex);
		add(jrbSex2);
		
		//��ȭ��ȣ�� ���� �󺧰� �ؽ�Ʈ �ʵ� ��ġ
		add(jlbNumber);
		add(jtfNumber);
		
		//������ �ؽ�Ʈ ���� ��ġ
		add(jsp);
		
		//4���� ��ư�� ��� �г� ��ġ
		add(jpButton);
		
		//5. ������ ũ�� ����
		setBounds(1200, 200, 500, 300);
		
		//6. ����ȭ
		setVisible(true);
		
		//7. ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new Work0102();
		
		
	}//main

}//class
