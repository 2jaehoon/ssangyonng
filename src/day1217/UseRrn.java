package day1217;

public class UseRrn {

	public static void main(String[] args) {
		String ssn = "960125-1111111";
		Rrn rrn = new Rrn(ssn);
		if(ssn.length()==14) {
			if(ssn.charAt(6)=='-') {
				System.out.println("입력주민번호 : " + rrn.getSsn());
				System.out.println("생년월일 : " + rrn.birthDate());
				System.out.println("나이 : " + rrn.getAge());
			System.out.println("성별 : " + rrn.getSex());
			System.out.println("띠 : " + rrn.getZodiacSign());
			
				
				
				
			}else {
				System.out.println("-이 정상적인 위치에 없습니다.");
			}	
		}else {
			System.out.println("주민번호의 글자 수가 맞지 않습니다.");
		}
	
		

	}

}
