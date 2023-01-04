package day0102;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
// 1. ������ ������Ʈ ���
public class UseButtonGroup extends JFrame {
	public UseButtonGroup() {
		super("��ư �׷� ���");

		// 2. ������Ʈ ����
		JTextArea jta = new JTextArea();
		jta.append("���\n������������");

		JScrollPane jspCenter = new JScrollPane(jta); // ��ũ�� �ٰ� �ʿ��� ������Ʈ�� ����

		JRadioButton jrbAgree = new JRadioButton("����" );
		JRadioButton jrbAgree2 = new JRadioButton("���Ǿ���", true); //true�� ���� �ڵ����� üũ ǥ�ð� ��

		//�������� ���� ��ư �� �ϳ��� Ŭ���Ǿ�� �� ��
		ButtonGroup bg = new ButtonGroup();
		bg.add(jrbAgree);
		bg.add(jrbAgree2);
		
		JPanel jpSouth = new JPanel(); // BorderLayout �ϳ��� ������ ���� ������Ʈ ��ġ
		jpSouth.add(jrbAgree);
		jpSouth.add(jrbAgree2);
		
		
		
		
		// 3. ��ġ
		add("Center", jspCenter);
		add("South", jpSouth);

		// 4. ������ ũ�� ����
		setBounds(1000, 200, 500, 500);

		// 5. ����ȭ
		setVisible(true);
		
		// 6. ����ó��
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}// UseButtonGroup

	public static void main(String[] args) {
		new UseButtonGroup();

	}

}
