package day1229;

import java.awt.GridLayout;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;
//1. 윈도우 컴포넌트 상속
public class Work1229 extends JFrame {
	
	public void calendar() {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.MONTH,11);
		int end = cal.getActualMaximum(Calendar.DATE);
		cal.set(Calendar.DAY_OF_MONTH, 1);
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK)-1; //-1한 이유는 배열값에 0부터 인덱스 순서가 들어가기에 1~7까지를 0~6으로 수정해야함
//				System.out.println(cal.get(Calendar.MONTH));
	
		
		//2. 컴포넌트 생성
		JButton[] emptyArr = new JButton[dayOfWeek];
		JButton [] jbArr = new JButton[end];
		int day = 1;
		for(int i = 0; i<dayOfWeek; i++) {
			emptyArr[i] = new JButton(" ");
		}
		for(int i = 0; i<end; i++,day++) {
			jbArr[i] = new JButton(day +" ");
		}

		//3.배열관리자 설정
//		int hang = 5, yul = 7;
		setLayout(new GridLayout(5,7));
//		switch(hang) {
//		case 0: case 6: case 9: //1월 7월 10월엔 6주?
//			hang = 6;
//			setLayout(new GridLayout(4,yul));
//		}
//		
		
		//4.배치
		for(int i = 0; i<emptyArr.length; i++) {
			add(emptyArr[i]);
		}	
		
		for(int i = 0; i<end; i++) {
			add(jbArr[i]);
		}
		
		//5. 윈도우 크기 설정 
		setSize(600,600);
		
		//6. 가시화
		setVisible(true);
		
		//7.끝내기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

		
	}

	public static void main(String[] args) {
		Work1229 work = new Work1229();
		work.calendar();
	}

}
