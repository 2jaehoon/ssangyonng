package day1219;

public class UseEmail {

	public static void main(String[] args) {
	Email em = new Email("cart_0@naver.com");

	if(em.email.length()>=7) {
		if(em.email.contains("@")==true&&em.email.contains(".")==true&&em.email.indexOf("@")<em.email.indexOf(".")) {
			System.out.println("��ȿ�� �̸���");
			System.out.println(em.email);
		}else {
			System.out.println("�߸��� �̸���");
		}
	}else {
		System.out.println("�߸��� �̸���");
	}
	
	
	}

}
