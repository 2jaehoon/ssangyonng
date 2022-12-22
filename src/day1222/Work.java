package day1222;

public class Work implements Fly{
	
	
	public String methodA(Fly fly) {
		return fly.drivingForce();
	}
	
	public String methodB(Fly fly) {
		return fly.upwardForce();
	}


	@Override
	public String drivingForce() {
		return "워크에서의 오버라이딩 드라이빙";
	}

	@Override
	public String upwardForce() {
		return "워크에서의 오버라이딩 업워드";
	}

	
public static void main(String[] args) {
	Fly fly = new Work();
	System.out.println(fly.drivingForce());
	System.out.println(fly.upwardForce());
	
	}
}
