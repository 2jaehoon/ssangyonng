package day0112;

//1. Runnable ����
public class UseRunnable implements Runnable {

	// 2. run method�� Override
	@Override
	public void run() {
		// 3. Thread�� �����ؾ��� �ڵ�(���ÿ� ����Ǿ�� �� �ڵ�)
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
		// 4. ��üȭ
		UseRunnable ur = new UseRunnable();
		// 5. Thread Ŭ������ has a�� ��üȭ
		Thread t = new Thread(ur);
		// 6. Thread ��ü�� start ȣ�� => has a ������ run()�� ȣ��ȴ�.
		t.start();
		System.out.println("===========");
		ur.work();
	}// main

}// main
