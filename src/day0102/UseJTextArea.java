package day0102;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
	//1. 윈도우 컴포넌트 상속
public class UseJTextArea extends JFrame {
	public UseJTextArea() {
		
		//2. 컴포넌트 생성
				JTextArea jta = new JTextArea();
				JTextArea jta2 = new JTextArea();
				
				JScrollPane jsp = new JScrollPane(jta2);
				
				//줄 단위 보호 (입력 텍스트가 JTextArea의 끝에 닿으면 자동 줄 변경)
				jta.setLineWrap(true);
				//단어 보호 (줄을 변경할 때 단어 (띄어쓰기된 텍스트)단위로 줄 변경)
				jta.setWrapStyleWord(true);
				
				//3. 배치 관리자 설정
				setLayout(new GridLayout(2,1));
				
				//4. 배치
				add(jta);
				add(jsp);//컴포넌트를 가진 스크롤바 객체를 배치
				
				//5. 윈도우 크기 설정
				setBounds(1200, 200, 400, 400);
				
				//6. 가시화
				setVisible(true);
				
				//7. 종료 처리
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
	}//UseJTextArea
	

	public static void main(String[] args) {
		new UseJTextArea();
		
		
	}//main

}//class
