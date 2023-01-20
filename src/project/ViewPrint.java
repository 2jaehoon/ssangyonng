package project;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.io.File;
import java.io.IOException;
import java.net.NoRouteToHostException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class ViewPrint extends JDialog {
	private JButton jbtnClose;
	private JTextArea jtaView;
	static JLabel jlblView;
	private JLabel jlblResult;
	private SelectDialogEvt sde;
	private ImageIcon backImage;
	
	
	
	
	public ViewPrint(SelectDialog sd, SelectDialogEvt sde) throws IOException {
		super(sd, sd.getTitle(),true); //getŸ��Ʋ�� ���� �޾ƿ��� �� ����
		
		//������ ����
		backImage = new ImageIcon("e:/dev/img.png");
		
		JLabel background;
		background=new JLabel( "",backImage,JLabel.CENTER ); //�� ���� �̹���
		background.setBounds(0, 0, 700, 500); //�� ũ��
		add(background);
		
		//"<html>����<br />   <-�ٹٲ� ���� "
		jbtnClose = new JButton("�ݱ�");
		jlblView = new JLabel(    //
				"\t\t\t\t\t<html>\r\r\r\r<br><br><br>1. �ִٻ�� Ű�� �̸��� Ƚ��  |  " + sde.maxUsedKey() + "<br><br>" + 
				"2.�������� ����Ƚ��, ����<br>"+sde.connectBrowser() + "<br>"
							
//						+ "2. �������� ����Ƚ��, ����<br>&nbsp;&nbsp;&nbsp;&nbsp;IE -<br>"+"&nbsp;&nbsp;&nbsp;&nbsp;Chrome -"+"%%<br><br>"
						+ "3."+ sde.servicePerform() + "<br><br>"
						+ "4. ��û�� ���� ���� �ð� | " + sde.mostRequestTime() + "<br><br>"
						+ "5." + sde.unNormalRequest() + "<br><br>"
						+ "6." + sde.requestError() + "<br><br>"
//						+ "7. �ԷµǴ� ���ο� �ش��ϴ� ������� | <br>(��:1000~1500������ �ԷµǸ� �ش� ���ο� �ش��ϴ� ���� �� �ִٻ�� Ű�� �̸��� Ƚ��)"
//						+ sde.maxUsedValue()
					);/////////////////���⿡ ���� �޼ҵ�� �־� �ٰ� ���̵� �޼ҵ� �� ���ֱ� �ƴϸ� �ٸ� ����� �����غ���
		jlblResult=new JLabel("�� �� �� ��");
		
		jlblView.setFont(new Font( "�������", Font.BOLD ,  14 )); //��°� �� ��Ʈ
//		jlblView.setForeground( Color.gray ); // �� ���ڻ�
		
		jlblResult.setFont(new Font( "�ü�ü", Font.BOLD, 24 ));//��°�� �� ��Ʈ

		jbtnClose.setFont(new Font( "�ü�ü", Font.BOLD,  16 ));//��ư ��Ʈ
		jbtnClose.setBackground( new Color( 0xCB1209 ) );//��ư ���� 
		jbtnClose.setForeground( new Color ( 0xF3D11D ) );//�� ���ڻ�
		
		background.add(jbtnClose);
		background.add(jlblView);
		background.add(jlblResult);
		
		
		//'�ݱ�'��ư, ������¶� ũ�⼳��.
		jbtnClose.setBounds(300, 500, 70, 40);
		jlblView.setBounds(0, 0, 700, 500);
		jlblResult.setBounds(260, 20, 200, 70);
		
		//�̺�Ʈ ���
		ViewPrintEvt vpe=new ViewPrintEvt(this);
		
		//��ư�̺�Ʈ
		jbtnClose.addActionListener(vpe);
		
		//�������̺�Ʈ
		addWindowListener(vpe);
		
		//������ ������ ����.
		setBounds(sd.getX()+100, sd.getY()+20, 700, 600);
		setVisible( true );
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		
		
		
	}//ViewPrint
	
	
	
	
	

}//class
