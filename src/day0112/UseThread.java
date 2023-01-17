package day0112;

/**
 * 상속으로 Thread를 사용
 * 
 * @author user
 *
 */
//1. Thread를 상속받는다.
public class UseThread extends Thread {

	// 2. run method를 Override
	@Override
	public void run() {
		// 3. Thread로 동작해야할 코드(동시에 실행되어야 할 코드)
		for (int i = 0; i < 1000; i++) {
			System.out.println("rum i =====> " + i);
		} // end for
	}// run

	public void work() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("work i =====> " + i);
		} // end for
	}// work

	public static void main(String[] args) {
		// 4. 객체화F
		UseThread ut = new UseThread();
		// 5. star method를 호출하여 Thread가 동작하도록 한다.
		long st = System.currentTimeMillis();
		ut.start(); //run에 있는 코드를 시작
		System.out.println("------------------");
		ut.work();
		long et = System.currentTimeMillis();
		System.out.println("종료한 시간: " + (et-st) + "ms"); //start()로 쓰레드를 실행하면 끝나는 시간을 알 수가 없다 ㅇㅅㅇ
	}// main

}// class
