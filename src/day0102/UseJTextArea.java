package day0102;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
	//1. ������ ������Ʈ ���
public class UseJTextArea extends JFrame {
	public UseJTextArea() {
		
		//2. ������Ʈ ����
				JTextArea jta = new JTextArea();
				JTextArea jta2 = new JTextArea();
				
				JScrollPane jsp = new JScrollPane(jta2);
				
				//�� ���� ��ȣ (�Է� �ؽ�Ʈ�� JTextArea�� ���� ������ �ڵ� �� ����)
				jta.setLineWrap(true);
				//�ܾ� ��ȣ (���� ������ �� �ܾ� (����� �ؽ�Ʈ)������ �� ����)
				jta.setWrapStyleWord(true);
				
				//3. ��ġ ������ ����
				setLayout(new GridLayout(2,1));
				
				//4. ��ġ
				add(jta);
				add(jsp);//������Ʈ�� ���� ��ũ�ѹ� ��ü�� ��ġ
				
				//5. ������ ũ�� ����
				setBounds(1200, 200, 400, 400);
				
				//6. ����ȭ
				setVisible(true);
				
				//7. ���� ó��
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
	}//UseJTextArea
	

	public static void main(String[] args) {
		new UseJTextArea();
		
		
	}//main

}//class
