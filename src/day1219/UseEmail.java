package day1219;

public class UseEmail {

	public static void main(String[] args) {
	Email em = new Email("cart_0@naver.com");
	em.asd();

	if(em.getEmail().length()>=7) {
		if(em.getEmail().contains("@")==true&&em.getEmail().contains(".")==true&&em.getEmail().indexOf("@")<em.getEmail().indexOf(".")) {
			System.out.println("��ȿ�� �̸���");
			System.out.println(em.getEmail());
		}else {
			System.out.println("�߸��� �̸���");
		}
	}else {
		System.out.println("�߸��� �̸���");
	}
	
	
	}

}
