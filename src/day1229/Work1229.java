package day1229;

import java.awt.GridLayout;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;
//1. ������ ������Ʈ ���
public class Work1229 extends JFrame {
	
	public void calendar() {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.MONTH,11);
		int end = cal.getActualMaximum(Calendar.DATE);
		cal.set(Calendar.DAY_OF_MONTH, 1);
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK)-1; //-1�� ������ �迭���� 0���� �ε��� ������ ���⿡ 1~7������ 0~6���� �����ؾ���
//				System.out.println(cal.get(Calendar.MONTH));
	
		
		//2. ������Ʈ ����
		JButton[] emptyArr = new JButton[dayOfWeek];
		JButton [] jbArr = new JButton[end];
		int day = 1;
		for(int i = 0; i<dayOfWeek; i++) {
			emptyArr[i] = new JButton(" ");
		}
		for(int i = 0; i<end; i++,day++) {
			jbArr[i] = new JButton(day +" ");
		}

		//3.�迭������ ����
//		int hang = 5, yul = 7;
		setLayout(new GridLayout(5,7));
//		switch(hang) {
//		case 0: case 6: case 9: //1�� 7�� 10���� 6��?
//			hang = 6;
//			setLayout(new GridLayout(4,yul));
//		}
//		
		
		//4.��ġ
		for(int i = 0; i<emptyArr.length; i++) {
			add(emptyArr[i]);
		}	
		
		for(int i = 0; i<end; i++) {
			add(jbArr[i]);
		}
		
		//5. ������ ũ�� ���� 
		setSize(600,600);
		
		//6. ����ȭ
		setVisible(true);
		
		//7.������
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

		
	}

	public static void main(String[] args) {
		Work1229 work = new Work1229();
		work.calendar();
	}

}
