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
		return "��ũ������ �������̵� ����̺�";
	}

	@Override
	public String upwardForce() {
		return "��ũ������ �������̵� ������";
	}

	
public static void main(String[] args) {
	Fly fly = new Work();
	System.out.println(fly.drivingForce());
	System.out.println(fly.upwardForce());
	
	}
}
