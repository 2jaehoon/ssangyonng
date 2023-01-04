package day1228;

import java.util.Stack;

/**
 * Stack�� ���
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
			useMethodStack(); // ��� ȣ��(recusive call) ���� : �޼��� ������ ũ�⺸�� ���� ȣ���ؾ� error�� �߻����� �ʴ´�.
		}//end if
	}//useMethodStack
	
	public void useStack() {
		//1. ����) is a ������ ��üȭ�� ���� �ʴ´�.(pop, push, empty�� Stack���� �����ϴ� �޼��带 ����� �� ����.)
		Stack<String> stack = new Stack<String>();
		//2. �� �Ҵ�)
		stack.push("1. ���ִ� ���� �弼��. ");
		stack.push("2. �ϼ̽��ϴ�. ");
		stack.push("3. ����");
		stack.push("4. ���� �ð� ����");
		//3. �� ��� ) item  pop���� ����
		while( !stack.empty()) {
		System.out.print(stack.pop()); //Stack���� ���� �����ʹ� �������.
		}
System.out.println();
	//�θ�Ŭ���� ���Ϳ��� �����ϴ� �޼��� ��� => stack X
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
