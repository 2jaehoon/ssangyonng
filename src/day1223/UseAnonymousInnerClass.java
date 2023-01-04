package day1223;

/**
 * Anonymous Inner class의 사용 
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
				System.out.println("메소드");
			}
			@Override
			public String drivingForce() {
				method();
				return "구현할 추진력";
			}

			@Override
			public String upwardForce() {
				return "구현할 양력";
			}
			
		});
	

	}//main

}//class
