package day0102;

import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

@SuppressWarnings("serial")
		//1. ������ ������Ʈ ���
public class UseJMenu extends JFrame {
	public UseJMenu() {
		super("�޴�����");
		//2. ������Ʈ ����
		//�޴��� ����
		JMenuBar jmb = new JMenuBar();
		
		//�޴� ����
		JMenu jmFile = new JMenu("����");
		JMenu jmhelp = new JMenu("����");
		
		//�޴� ������ ����
		JMenuItem jmiNew = new JMenuItem("����");
		JMenuItem jmiOpen = new JMenuItem("����");
		JMenuItem jmiSave = new JMenuItem("����");
		JMenuItem jmiInfo = new JMenuItem("����");
		
		
		//3. ��ġ
		//�޴������� -> �޴� ��ġ
		
		
		jmFile.add(jmiNew);
		jmFile.addSeparator();
		
		jmFile.add(jmiOpen);
		jmFile.addSeparator();
		
		jmFile.add(jmiSave);
		
		
		jmhelp.add(jmiInfo);
	
		
		//�޴� -> �޴��� ��ġ
		jmb.add(jmFile);
		jmb.add(jmhelp);
		
		
		//�޴��ٸ� Frame�� ��ġ
		setJMenuBar(jmb);
		
		//4. ũ�� ����
		setBounds(1200, 200, 600, 600);
		
		
		
		//5. ����ȭ
		setVisible(true);
		
		//6. ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
	}//UseJMenu

	public static void main(String[] args) {
		new UseJMenu();
		
	}//main

}//class
