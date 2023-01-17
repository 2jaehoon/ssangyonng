package day0113;

public class UseSleep2 implements Runnable{
	
	public UseSleep2() {
		
	}
	
	@Override
	public void run() {
		System.out.print("Loding\t");
			try {
				for(int i=0; i<4; i++) {
					Thread.sleep(1000*2);
					System.out.print(". . . ");
				}
				System.out.print(" ");
				System.out.println("Finish");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}
	
	public void jum() {
		
			try {
				for(int i=0; i<3; i++) {
				Thread.sleep(1000);
				System.out.print(". ");
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	public static void main(String[] args) {
	 UseSleep2 us2 = new UseSleep2();
		Thread t  = new Thread(us2);
		t.start();
		us2.jum();

	}

	

}
