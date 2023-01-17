package day0113;

//1. Runnable ����
public class UseSleep implements Runnable {

	// 2. run �޼��� �������̵�
	@Override
	public void run() {

		// 3. ������� �����ؾ��ϴ� �ڵ�
			try {
				for (int i = 0; i < 10; i++) {
				Thread.sleep(1000*60); //running���� 1000ms ���� block ���·� �̵�
				System.out.print(i);
				} // end for
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}// run

	public static void main(String[] args) {
		//4. ��üȭ
		UseSleep us = new UseSleep();
		//5. ������� has a
		Thread t = new Thread(us);
		//6. start()
		t.start();
	}// main
	
}// class
