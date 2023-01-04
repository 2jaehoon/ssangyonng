package day1228;

import java.util.Stack;

/**
 * Stack의 사용
 * @author user
 *
 */
public class TestStack {
	int cnt;
	public void useMethodStack() {
		System.out.println("useStack");
		System.out.println(cnt);
		cnt++;
		if(cnt < 12000) {
			useMethodStack(); // 재귀 호출(recusive call) 주의 : 메서드 스텍의 크기보다 적게 호출해야 error가 발생하지 않는다.
		}//end if
	}//useMethodStack
	
	public void useStack() {
		//1. 생성) is a 관계의 객체화를 하지 않는다.(pop, push, empty의 Stack에서 제공하는 메서드를 사용할 수 없다.)
		Stack<String> stack = new Stack<String>();
		//2. 값 할당)
		stack.push("1. 맛있는 점심 드세요. ");
		stack.push("2. 하셨습니다. ");
		stack.push("3. 수고");
		stack.push("4. 오전 시간 동안");
		//3. 값 얻기 ) item  pop으로 얻음
		while( !stack.empty()) {
		System.out.print(stack.pop()); //Stack에서 꺼낸 데이터는 사라진다.
		}
System.out.println();
	//부모클래스 벡터에서 제공하는 메서드 사용 => stack X
//		for(int i =stack.size()-1; i>=0; i--) {
//			System.out.println(stack.get(i));
//		}
		
		System.out.println(stack);
	}//useStack
	

	public static void main(String[] args) {
		TestStack ts = new TestStack();
		ts.useStack();
//		ts.useMethodStack();
	}//main

}//class
