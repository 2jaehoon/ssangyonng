package day0112;

/**
 * ������� Thread�� ���
 * 
 * @author user
 *
 */
//1. Thread�� ��ӹ޴´�.
public class UseThread extends Thread {

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
		// 4. ��üȭF
		UseThread ut = new UseThread();
		// 5. star method�� ȣ���Ͽ� Thread�� �����ϵ��� �Ѵ�.
		long st = System.currentTimeMillis();
		ut.start(); //run�� �ִ� �ڵ带 ����
		System.out.println("------------------");
		ut.work();
		long et = System.currentTimeMillis();
		System.out.println("������ �ð�: " + (et-st) + "ms"); //start()�� �����带 �����ϸ� ������ �ð��� �� ���� ���� ������
	}// main

}// class
