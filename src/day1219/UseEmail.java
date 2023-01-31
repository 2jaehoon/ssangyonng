package day1219;

public class UseEmail {

	public static void main(String[] args) {
	Email em = new Email("cart_0@naver.com");
	em.asd();

	if(em.getEmail().length()>=7) {
		if(em.getEmail().contains("@")==true&&em.getEmail().contains(".")==true&&em.getEmail().indexOf("@")<em.getEmail().indexOf(".")) {
			System.out.println("유효한 이메일");
			System.out.println(em.getEmail());
		}else {
			System.out.println("잘못된 이메일");
		}
	}else {
		System.out.println("잘못된 이메일");
	}
	
	
	}

}
