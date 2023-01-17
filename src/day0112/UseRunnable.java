package day0112;

//1. Runnable 구현
public class UseRunnable implements Runnable {

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
		// 4. 객체화
		UseRunnable ur = new UseRunnable();
		// 5. Thread 클래스를 has a로 객체화
		Thread t = new Thread(ur);
		// 6. Thread 객체의 start 호출 => has a 관계의 run()가 호출된다.
		t.start();
		System.out.println("===========");
		ur.work();
	}// main

}// main
