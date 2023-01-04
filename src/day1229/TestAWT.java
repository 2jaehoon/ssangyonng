package day1229;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Window;

@SuppressWarnings("serial")
//1. 윈도우 컴포넌트를 상속
public class TestAWT extends Window {

	public TestAWT(Frame f) {
		super(f);// 앗! 부모클래스의 기본생성자가 없네 error
		//2. =컴포넌트를 생성
		Button btn= new Button("버튼");
		//3. 컴포넌트 배치 > 프레임에 배치
		f.add(btn);
		// 4프레임 크기 설정
		f.setSize(300, 300);
		//5. 프레임을 사용자에게 보여준다.
		f.setVisible(true);
	}

	public static void main(String[] args) {
		Frame f = new Frame();
		new TestAWT(f);
	}

}
