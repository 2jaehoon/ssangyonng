package day1217;

public class UseRrn {

	public static void main(String[] args) {
		String ssn = "960125-1111111";
		Rrn rrn = new Rrn(ssn);
		if(ssn.length()==14) {
			if(ssn.charAt(6)=='-') {
				System.out.println("�Է��ֹι�ȣ : " + rrn.getSsn());
				System.out.println("������� : " + rrn.birthDate());
				System.out.println("���� : " + rrn.getAge());
			System.out.println("���� : " + rrn.getSex());
			System.out.println("�� : " + rrn.getZodiacSign());
			
				
				
				
			}else {
				System.out.println("-�� �������� ��ġ�� �����ϴ�.");
			}	
		}else {
			System.out.println("�ֹι�ȣ�� ���� ���� ���� �ʽ��ϴ�.");
		}
	
		

	}

}
