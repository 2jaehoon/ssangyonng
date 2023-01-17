package day0105;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class JavaMemoFont extends JDialog {
	// �̺�Ʈ �ν��Ͻ� ����
	private DefaultListModel<String> dlmFont;
	private DefaultListModel<String> dlmStyle;
	private DefaultListModel<String> dlmSize;

	private JButton jbtnOk;
	private JButton jbtnExit;

	private JList<String> jlistFont;
	private JList<String> jlistStyle;
	private JList<String> jlistSize;

	private JLabel jlblPreview;

	private JTextField jtfFont;
	private JTextField jtfStyle;
	private JTextField jtfSize;
	
	

	public JavaMemoFont(JavaMemo jm) {
		super(jm, "�۲�", false);

		// ����
		JLabel jlbFont = new JLabel("�۲�(P)");
		JLabel jlbStyle = new JLabel("�۲� ��Ÿ��(Y)");
		JLabel jlbSize = new JLabel("ũ��(S)");

		dlmFont = new DefaultListModel<String>();
		jlistFont = new JList<String>(dlmFont);
		// ������ �� dlmFont �� �߰�
		dlmFont.addElement("����");
		dlmFont.addElement("���� ���");
		dlmFont.addElement("�ü�ü");
		dlmFont.addElement("Serif");
		dlmFont.addElement("SansSerif");

		JScrollPane jspJlistFont = new JScrollPane(jlistFont);
		jtfFont = new JTextField("");
		jlistFont.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); // �ϳ��� ����


		dlmStyle = new DefaultListModel<String>();
		jlistStyle = new JList<String>(dlmStyle);
		// �����͸𵨿� �������߰�
		dlmStyle.addElement("�Ϲ�");
		dlmStyle.addElement("����");
		dlmStyle.addElement("����Ӳ�");
		dlmStyle.addElement("��������Ӳ�");

		JScrollPane jspJlistStyle = new JScrollPane(jlistStyle);
		jtfStyle = new JTextField();
		jlistStyle.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

		dlmSize = new DefaultListModel<String>();
		jlistSize = new JList<String>(dlmSize);
		// �����͸𵨿� ������ �߰�
		dlmSize.addElement("8");
		dlmSize.addElement("9");
		dlmSize.addElement("10");
		dlmSize.addElement("12");
		dlmSize.addElement("14");
		dlmSize.addElement("16");
		dlmSize.addElement("18");
		dlmSize.addElement("20");
		dlmSize.addElement("22");
		dlmSize.addElement("24");
		dlmSize.addElement("26");
		dlmSize.addElement("28");
		dlmSize.addElement("30");
		dlmSize.addElement("32");
		dlmSize.addElement("34");
		dlmSize.addElement("36");
		dlmSize.addElement("38");
		dlmSize.addElement("40");
	

		JScrollPane jspJlistSize = new JScrollPane(jlistSize);
		jtfSize = new JTextField();
		jlistSize.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

		jlblPreview = new JLabel("�۲�Ȯ��ABCde");

		jbtnOk = new JButton("Ȯ��");
		jbtnExit = new JButton("���");

		JPanel jpButton = new JPanel();
		jpButton.add(jbtnOk);
		jpButton.add(jbtnExit);

		TitledBorder tbId = new TitledBorder("����");
		jlblPreview.setBorder(tbId);

		// ����
		setLayout(null);

		// ũ�⼳��

		jlbFont.setBounds(0, 0, 210, 25); // �۲� ����200, 50 �� x,y 0 0
		jlbStyle.setBounds(220, 0, 210, 25);
		jlbSize.setBounds(410, 0, 210, 25);

		jspJlistFont.setBounds(0, 55, 210, 150);
		jtfFont.setBounds(0, 30, 210, 25);

		jspJlistStyle.setBounds(220, 55, 180, 150);
		jtfStyle.setBounds(220, 30, 180, 25);

		jspJlistSize.setBounds(410, 55, 150, 150);
		jtfSize.setBounds(410, 30, 150, 25);

		jlblPreview.setBounds(300, 230, 250, 100);

		jpButton.setBounds(400, 520, 200, 100); // ��ư�г� ���� 200,100 xy 400 520

		// ��ġ
		add(jlbFont);
		add(jlbSize);
		add(jlbStyle);

		add(jpButton);

		add(jspJlistFont);
		add(jtfFont);

		add(jspJlistStyle);
		add(jtfStyle);

		add(jspJlistSize);
		add(jtfSize);

		add(jlblPreview);

		

		// �̺�Ʈ �ο�
		
		jbtnOk.addActionListener(new JavaMemoFontEvt(this));
		jbtnExit.addActionListener(new JavaMemoFontEvt(this));
		jlistFont.addListSelectionListener(new JavaMemoFontEvt(this));
		jlistStyle.addListSelectionListener(new JavaMemoFontEvt(this));
		jlistSize.addListSelectionListener(new JavaMemoFontEvt(this));

//	jlblPreview

		setBounds(jm.getX() + 200, jm.getY() + 150, 600, 600);
		setVisible(true);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);

	}// JavaMemoFont

	// getter
	public JButton getJbtnOk() {
		return jbtnOk;
	}

	public JButton getJbtnExit() {
		return jbtnExit;
	}

	public JTextField getJtfFont() {
		return jtfFont;
	}

	public JTextField getJtfStyle() {
		return jtfStyle;
	}

	public JTextField getJtfSize() {
		return jtfSize;
	}

	public JList<String> getJlistFont() {
		return jlistFont;
	}

	public JList<String> getJlistStyle() {
		return jlistStyle;
	}

	public JList<String> getJlistSize() {
		return jlistSize;
	}

	public JLabel getjlblPreview() {
		return jlblPreview;

	}

}// class
