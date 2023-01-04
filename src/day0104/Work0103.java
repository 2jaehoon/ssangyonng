package day0104;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
		//1. ������ ������Ʈ ���
public class Work0103 extends JFrame implements ActionListener{
	//�̺�Ʈ���� ����� ������Ʈ �ν��Ͻ� ������ ����
	private JMenuItem jmiNew;
	private JMenuItem jmiOpen;
	private JMenuItem jmiExit;
	private JTextArea jta;
	
	public Work0103() {
		super("�޴�����");
		//2. ������Ʈ ����
		//�޴��� ����
		JMenuBar jmb = new JMenuBar();
		
		//�޴� ����
		JMenu jmFile = new JMenu("����");
		JMenu jmhelp = new JMenu("����");
		
		//�޴� ������ ����
		 jmiNew = new JMenuItem("����");
		 jmiOpen = new JMenuItem("����");
		 jmiExit = new JMenuItem("�ݱ�");
		JMenuItem jmiInfo = new JMenuItem("����");
		
		jta = new JTextArea();
		
		
		//3. ��ġ
		//�޴������� -> �޴� ��ġ
		
		
		jmFile.add(jmiNew);
		jmFile.addSeparator();
		
		jmFile.add(jmiOpen);
		jmFile.addSeparator();
		
		jmFile.add(jmiExit);
		
		
		jmhelp.add(jmiInfo);
	
		
		//�޴� -> �޴��� ��ġ
		jmb.add(jmFile);
		jmb.add(jmhelp);
		
		
		//�޴��ٸ� Frame�� ��ġ
		setJMenuBar(jmb);
		
		add(jta);
		
		
		//�̺�Ʈ ����
		jmiNew.addActionListener(this);
		jmiOpen.addActionListener(this);
		jmiExit.addActionListener(this);
		
		
		
		//4. ũ�� ����
		setBounds(1200, 200, 600, 600);
		
		
		
		//5. ����ȭ
		setVisible(true);
		
		//6. ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}//UseJMenu
	
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == jmiNew) {
			// miNew�� ������ �� ������ �ڵ�
			//jta�� �ؽ�Ʈ ���� �ʱ�ȭ
			jta.setText("");
			}

		if (ae.getSource() == jmiOpen) {
			// jmiOpen�� ������ �� ������ �ڵ�
			//jta�� ���� �� �߰�
			jta.append("����");
		}
		if (ae.getSource() == jmiExit) {
			// jmiExit�� ������ �� ������ �ڵ�
			//�ݱ�
			dispose();
		}
		
		
	}

	public static void main(String[] args) {
		new Work0103();
		
	}//main


}//class
