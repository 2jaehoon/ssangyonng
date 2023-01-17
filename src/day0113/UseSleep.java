package day0113;

//1. Runnable 구현
public class UseSleep implements Runnable {

	// 2. run 메서드 오버라이드
	@Override
	public void run() {

		// 3. 쓰레드로 동작해야하는 코드
			try {
				for (int i = 0; i < 10; i++) {
				Thread.sleep(1000*60); //running에서 1000ms 동안 block 상태로 이동
				System.out.print(i);
				} // end for
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}// run

	public static void main(String[] args) {
		//4. 객체화
		UseSleep us = new UseSleep();
		//5. 쓰레드와 has a
		Thread t = new Thread(us);
		//6. start()
		t.start();
	}// main
	
}// class
