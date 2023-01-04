package day0102;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
// 1. 윈도우 컴포넌트 상속
public class UseButtonGroup extends JFrame {
	public UseButtonGroup() {
		super("버튼 그룹 사용");

		// 2. 컴포넌트 생성
		JTextArea jta = new JTextArea();
		jta.append("약관\n주저리주저리");

		JScrollPane jspCenter = new JScrollPane(jta); // 스크롤 바가 필요한 컴포넌트를 위해

		JRadioButton jrbAgree = new JRadioButton("동의" );
		JRadioButton jrbAgree2 = new JRadioButton("동의안함", true); //true를 쓰면 자동으로 체크 표시가 됨

		//여러개의 라디오 버튼 중 하나만 클릭되어야 할 때
		ButtonGroup bg = new ButtonGroup();
		bg.add(jrbAgree);
		bg.add(jrbAgree2);
		
		JPanel jpSouth = new JPanel(); // BorderLayout 하나의 영역에 여러 컴포넌트 배치
		jpSouth.add(jrbAgree);
		jpSouth.add(jrbAgree2);
		
		
		
		
		// 3. 배치
		add("Center", jspCenter);
		add("South", jpSouth);

		// 4. 윈도우 크기 설정
		setBounds(1000, 200, 500, 500);

		// 5. 가시화
		setVisible(true);
		
		// 6. 종료처리
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}// UseButtonGroup

	public static void main(String[] args) {
		new UseButtonGroup();

	}

}
