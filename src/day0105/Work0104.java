package day0105;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class Work0104 extends JFrame  {
	//�̺�Ʈ �߻� �ν��Ͻ� ������ ����
	private JMenuItem jmiNew;
	private JMenuItem jmiClose;
	private JMenuItem jmiOpen;
	private JMenuItem jmiSave;
	private JMenuItem jmiMemoinf;
	
	private JTextArea jta;

	public Work0104() {
		super("�޸��� ¬��");

		
		//������Ʈ ����
		//�޴��� ����
		JMenuBar jmb = new JMenuBar();
		
		//�޴� ����
		JMenu jmFile = new JMenu("����");
		JMenu jmEmpty = new JMenu("�����");
		JMenu jmWrite = new JMenu("����");
		JMenu jmEmpty2 = new JMenu("�����.");
		JMenu jmHelp = new JMenu("����");
		
		//������ ����
		 jmiNew = new JMenuItem("����");
		 jmiClose = new JMenuItem("�ݱ�");
		 jmiOpen = new JMenuItem("����");
		 jmiSave = new JMenuItem("����");
		
		jmiMemoinf = new JMenuItem("�޸��� ����");
		
		 jta = new JTextArea();
		
		//��ġ
		//�޴��������� �޴��� ��ġ
		jmFile.add(jmiNew);
		jmFile.add(jmiOpen);
		jmFile.add(jmiSave);
		jmFile.add(jmiClose);
		
		jmHelp.add(jmiMemoinf);
		
		//�޴��� �޴��ٿ� ��ġ
		jmb.add(jmFile);
		jmb.add(jmEmpty);
		jmb.add(jmWrite);
		jmb.add(jmEmpty2);
		jmb.add(jmHelp);
		
		//�޴��ٸ� �����ӿ� ��ġ
		setJMenuBar(jmb);
		
		add(jta);
		
		
		
		//�̺�Ʈ ���
		Work0104Evt we = new Work0104Evt(this);
		
		
		//�̺�Ʈ ����
		jmiNew.addActionListener(we);
		jmiClose.addActionListener(we);
		jmiOpen.addActionListener(we);
		jmiSave.addActionListener(we);
		jmiMemoinf.addActionListener(we);
		
		addWindowListener(we);
		
		
		//ũ�� ����
		setBounds(1200, 200, 600, 600);
		
		//����ȭ
		setVisible(true);

		
	}//Work0104
	
	//getter�� �����̺� �� �������� work0104��
	public JMenuItem getJmiNew() {
		return jmiNew;
	}
	
	public JMenuItem getJmiClose() {
		return jmiClose;
	}
	public JMenuItem getJmiOpen() {
		return jmiOpen;
	}
	public JMenuItem getJmiSave() {
		return jmiSave;
	}
	public JMenuItem getJmiMemoinf() {
		return jmiMemoinf;
	}
	
	public JTextArea getJta() {
		return jta;
	}
	

	
	

	public static void main(String[] args) {
		new Work0104();

	}//main

}//class
