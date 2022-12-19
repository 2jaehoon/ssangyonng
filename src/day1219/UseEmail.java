package day1219;

public class UseEmail {

	public static void main(String[] args) {
	Email em = new Email("cart_0@naver.com");

	if(em.email.length()>=7) {
		if(em.email.contains("@")==true&&em.email.contains(".")==true&&em.email.indexOf("@")<em.email.indexOf(".")) {
			System.out.println("유효한 이메일");
			System.out.println(em.email);
		}else {
			System.out.println("잘못된 이메일");
		}
	}else {
		System.out.println("잘못된 이메일");
	}
	
	
	}

}
