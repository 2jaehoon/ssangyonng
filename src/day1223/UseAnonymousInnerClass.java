package day1223;

/**
 * Anonymous Inner class�� ��� 
 * @author user
 *
 */
public class UseAnonymousInnerClass {
	
	public  UseAnonymousInnerClass() {
		
	}
	
	public void useFly(Fly f) {
		System.out.println(f.drivingForce());
		System.out.println(f.upwardForce());
	}
	
	

	public static void main(String[] args) {
		UseAnonymousInnerClass uaic = new UseAnonymousInnerClass();
		uaic.useFly(new Fly() {
			public void method() {
				System.out.println("�޼ҵ�");
			}
			@Override
			public String drivingForce() {
				method();
				return "������ ������";
			}

			@Override
			public String upwardForce() {
				return "������ ���";
			}
			
		});
	

	}//main

}//class
