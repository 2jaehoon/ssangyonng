package day0106;

import java.util.Random;

/**
 * 예외 강제 발생
 * 
 * @author user
 *
 */
public class UseThrow {

	public void test() throws Exception {
		System.out.println("예외 발생전");

		if (new Random().nextBoolean()) {
			throw new Exception("예외 발생시 제공할 메시지");
		} // end if

		System.out.println("예외 발생하지 않을 실행될 코드");

	}// test

	public static void main(String[] args) {
		UseThrow ut = new UseThrow();

		try {
			ut.test();
		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
		}

	}// main

}// class
