package day0102;

import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
//1. ������ ������Ʈ ���
public class UseImageJButton extends JFrame {
	
	public UseImageJButton() {
		super("�̹����� ������ ������Ʈ");
		
		//2. ������Ʈ ����
		//�̹��� ������Ʈ ����;
		 ImageIcon ii = new ImageIcon("E:/dev/workspace/javase_prj/src/day0102/images/img_1.png");
		 ImageIcon ii2 = new ImageIcon("E:/dev/workspace/javase_prj/src/day0102/images/img_2.png");
		 ImageIcon ii3= new ImageIcon("E:/dev/workspace/javase_prj/src/day0102/images/img_3.png");
		 ImageIcon ii4 = new ImageIcon("E:/dev/workspace/javase_prj/src/day0102/images/img_4.png");
		//�̹����� ������ ������Ʈ ����
		JButton jbtn = new JButton("���̾�", ii);
		JButton jbtn2 = new JButton("���ε�", ii2);
		JButton jbtn3= new JButton("����ġ", ii3);
		
		//��ư�� ��ġ ����
		//������ġ ����
		jbtn.setVerticalTextPosition(JButton.BOTTOM);//TOP, CENTER, BOTTOM
		//������ġ ����
		jbtn2.setHorizontalTextPosition(JButton.CENTER); //TOP, CENTER, RIGHT
		
		//����, ������ġ ���� ����
		jbtn3.setVerticalTextPosition(JButton.BOTTOM);//TOP, CENTER, BOTTOM
		jbtn3.setHorizontalTextPosition(JButton.CENTER); //TOP, CENTER, RIGHT
		
		
		//RollOver
		jbtn3.setRolloverIcon(ii4);
		
		//tooltip
		jbtn.setToolTipText("���̾� - ���ڸ� ��Ƽ��");
		jbtn2.setToolTipText("����̸� ��Ƽ��");		
		jbtn3.setToolTipText("�����Ƹ� ��Ƽ��");		
		
		
		
		//3. ��ġ������ ���� BorderLayout => GridLayout
		setLayout(new GridLayout(1,3));
		
		//4. ��ġ
		add(jbtn);
		add(jbtn2);
		add(jbtn3);
		
		
		//5. ������ ũ�� ����
		setBounds(100, 100, 700, 300);
		
		//6. ����ȭ
		setVisible(true);
		
		//7. ���� �̺�Ʈ ó��
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
	}//UseImageJButton

	public static void main(String[] args) {
		new UseImageJButton();
	}

}
