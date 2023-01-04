package day1229;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class StudentProcess {
	static final int IN = 3;
	private List<WorkVO> list = new ArrayList<WorkVO>();

	public StudentProcess() {
		list = new ArrayList<WorkVO>();
	}

	/**
	 * 학생의 정보를 입력받아 list에 추가
	 * 
	 * @param wVO
	 */
	public boolean inputStudentinfo(String data) {
		boolean flag = false;

		String[] temp = data.split(","); // 콤마를 기준으로 문자열 나누기
		switch (temp.length) {
		case IN: { // 입력값(String)에 ,가 2개니?
			WorkVO wv = new WorkVO(temp[0], Integer.parseInt(temp[1]), Integer.parseInt(temp[2])); // 객체 생성
			list.add(wv); // list에 객체 담기
			flag = true;// 입력성공
		} // end switch
		}
		return flag;
	}

	public void PrintStudentList() {
		WorkVO wv = null; // WorkVO 객체를 할당할 객체명 초기화

		// 2번 출력용 WorkVO 객체의 이름, 자바 점수, 오라클 점수를 저장할 변수 초기화
		String name = "";
		int java = 0;
		int oracle = 0;

		System.out.println("이름\t자바\t오라클\t총점");
		for (int i = 0; i < list.size(); i++) {// list의 첫방~끝방까지
			wv = list.get(i); // 객체 얻어서

			name = wv.getName(); // 그 객체의 이름, 자바점수, 오라클 점수 얻고
			java = wv.getJava();
			oracle = wv.getOracle();

			// 출력하기
			System.out.println(name + "\t" + java + "\t" + oracle + "\t" + (java + oracle));
		} // WorkVO 객체의 이름,자바점수,오라클점수 + 총점 출력을 위한 for문
	}

	public void inputMenu() {
		String input = ""; // 입력값을 저장할 변수 초기화
		boolean exitFlag = false; // While문 반복을 제어하기 위한 변수 초기화
		String msg = "";
		do {
			input = JOptionPane.showInputDialog("이름,자바점수,오라클 점수를 입력하세요\n그만두시려면 Y 또는 y를 입력해주세요");

			if (input != null) { // 취소를 누르지 않았다면
				exitFlag = input.toLowerCase().equals("y");
			} else { // 취소를 눌렀다면
				break;
			}
			
			if(!exitFlag) {
			msg="입력데이터의 형식을 확인해주세요.";
			if(inputStudentinfo(input)){
				msg="학생의 점수가 입력되었습니다.";
			}
				JOptionPane.showMessageDialog(null, msg);
			}
			

			if (input.equals("출력")) {
				PrintStudentList();
				break;
			} // 출력을 위한 if문

		} while (!exitFlag);
		System.out.println("사용해주셔서 ㄳ");
	}

	public static void main(String[] args) {

		System.out.println("시스템 종료");

	}// main

}// class
