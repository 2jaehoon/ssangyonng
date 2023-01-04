package day0102;

import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
//1. 윈도우 컴포넌트 상속
public class UseImageJButton extends JFrame {
	
	public UseImageJButton() {
		super("이미지를 가지는 컴포넌트");
		
		//2. 컴포넌트 생성
		//이미지 컴포넌트 생성;
		 ImageIcon ii = new ImageIcon("E:/dev/workspace/javase_prj/src/day0102/images/img_1.png");
		 ImageIcon ii2 = new ImageIcon("E:/dev/workspace/javase_prj/src/day0102/images/img_2.png");
		 ImageIcon ii3= new ImageIcon("E:/dev/workspace/javase_prj/src/day0102/images/img_3.png");
		 ImageIcon ii4 = new ImageIcon("E:/dev/workspace/javase_prj/src/day0102/images/img_4.png");
		//이미지를 적용한 컴포넌트 생성
		JButton jbtn = new JButton("라이언", ii);
		JButton jbtn2 = new JButton("프로도", ii2);
		JButton jbtn3= new JButton("어피치", ii3);
		
		//버튼의 위치 변경
		//수직위치 변경
		jbtn.setVerticalTextPosition(JButton.BOTTOM);//TOP, CENTER, BOTTOM
		//수평위치 변경
		jbtn2.setHorizontalTextPosition(JButton.CENTER); //TOP, CENTER, RIGHT
		
		//수직, 수평위치 같이 변경
		jbtn3.setVerticalTextPosition(JButton.BOTTOM);//TOP, CENTER, BOTTOM
		jbtn3.setHorizontalTextPosition(JButton.CENTER); //TOP, CENTER, RIGHT
		
		
		//RollOver
		jbtn3.setRolloverIcon(ii4);
		
		//tooltip
		jbtn.setToolTipText("라이언 - 사자를 모티브");
		jbtn2.setToolTipText("댕댕이를 모티브");		
		jbtn3.setToolTipText("복숭아를 모티브");		
		
		
		
		//3. 배치관리자 변경 BorderLayout => GridLayout
		setLayout(new GridLayout(1,3));
		
		//4. 배치
		add(jbtn);
		add(jbtn2);
		add(jbtn3);
		
		
		//5. 윈도우 크기 설정
		setBounds(100, 100, 700, 300);
		
		//6. 가시화
		setVisible(true);
		
		//7. 종료 이벤트 처리
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
	}//UseImageJButton

	public static void main(String[] args) {
		new UseImageJButton();
	}

}
