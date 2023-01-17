package day0105;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

/**
 * �۲�, �� ����
 * @author user
 *
 */
@SuppressWarnings("serial")
public class UseFont extends JFrame {
	
	
	public UseFont() {
		super("�۲� �� �� ����");
		
		JButton jbtn = new JButton("��ư");
		JLabel jlbl = new JLabel("��");
		JTextField jtf = new JTextField("�ؽ�Ʈ �ʵ�");
		JList<String> jlist  = new JList<String>(new String[] {"�����","��Թ�","�躸��","��ΰ�","����ȣ"} );
		JScrollPane jsp = new JScrollPane(jlist);
		setLayout(new FlowLayout());
		
		
		//�۲ú���
		Font font = new Font("�ü�ü", Font.BOLD, 20);
		
		
		//����
		jlbl.setFont(font);
		jbtn.setFont(font);
		jtf.setFont(new Font("�޸�����ü", Font.ITALIC, 25));
		jlist.setFont(new Font("SansSerif", Font.ITALIC | Font.BOLD , 25));
		
		//���ڻ�(�����)
		jlbl.setForeground(Color.blue);
		jbtn.setForeground(Color.gray);
		jtf.setForeground(new Color(0x5F00FF));
		jlist.setForeground(new Color(0x8DDAF8));
		
		
		//�ٴڻ�
		Color c = new Color(0xFF9999);
		jtf.setBackground(c);
		jlist.setBackground(new Color(0xFFFF99));
		
		jlbl.setBackground(Color.RED);//�ٴڻ��� ������ ������Ʈ�� ������ ������ �� ���� �����Ѵ�.
		jlbl.setOpaque(true); //������ �������ϰ� �����Ѵ�.
		
		
		add(jlbl);
		add(jbtn);
		add(jtf);
		add(jsp);
		
		setSize(600,300);
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}//UseFont
	
	



	
	
	
	
	
	

	public static void main(String[] args) {
		new UseFont();
		
	}//main

}//class
