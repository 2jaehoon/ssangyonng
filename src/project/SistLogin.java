package project;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

@SuppressWarnings("serial")
//1. ������ ������Ʈ ���
public class SistLogin extends JFrame {
	//�̺�Ʈ���� ����� ������Ʈ �ν��Ͻ� ������ ����
	private JButton jbtnLogin;
	private ImageIcon sistImage;
	private JLabel jlblId;
	private JLabel jlblPw;
	private JLabel jlblSist;
	private JTextField jtfId;
	private JTextField jtfPw;
	


	public SistLogin() {
		super("�α���");
		
		//2. ������Ʈ ����
		jbtnLogin = new JButton("�α���");
		sistImage = new ImageIcon("e:/dev/img.png");
		jlblId = new JLabel("���̵𿡿�");
		jlblPw = new JLabel("��й�ȣ����");
		jlblSist = new JLabel(sistImage);
		jtfId = new JTextField();
		jtfPw = new JTextField();
		
		//3. ��ġ ����
		setLayout(null);
		
		
		//��Ʈ ����
		
		
		
		
		
		//ũ�� ����
		jlblSist.setBounds(45, 0, 500, 500);
		jbtnLogin.setBounds(400,680,150,50);
		jlblId.setBounds(100,510,100,50);
		jtfId.setBounds(250, 510, 200, 50);
		jlblPw.setBounds(100, 580, 100, 50);
		jtfPw.setBounds(250, 580, 200, 50);
		
		//�̺�Ʈ ó��
		SistLoginEvt sle = new SistLoginEvt(this);
		
		//�̺�Ʈ ����
		jbtnLogin.addActionListener(sle);
		
		
		
		
		
		
		//��ġ
		add(jlblSist);
		add(jbtnLogin);
		add(jlblId);
		add(jtfId);
		add(jlblPw);
		add(jtfPw);
		
		
		
		//
		
		
		//������ ũ�� ����
		setBounds(50, 50, 600, 800);
		
		
		
		//����ȭ
		setVisible(true);
		
		//����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
		
		
		
		
		
	}//SistLogin


	public JTextField getJtfId() {
		return jtfId;
	}



	public JButton getJbtnLogin() {
		return jbtnLogin;
	}


	


	public JTextField getJtfPw() {
		return jtfPw;
	}



	
	
	
	

}//JFrame
