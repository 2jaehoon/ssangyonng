package day1229;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Window;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
//1. 윈도우 컴포넌트를 상속
public class TestAWT2 extends Frame {

	public TestAWT2() {
		super();
		//2. =컴포넌트를 생성
		Button btn= new Button("버튼");
		//3. 컴포넌트 배치 > 프레임에 배치
		add(btn);
		// 4프레임 크기 설정
		setSize(300, 300);
		//5. 프레임을 사용자에게 보여준다.
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
			
		});
	}

	public static void main(String[] args) {
		
		new TestAWT2();
	}

}
