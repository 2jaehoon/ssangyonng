package day1214;

/**
 * Person Ŭ������ ����ϴ� Ŭ����
 * @author user
 *
 */
public class UsePerson {

	public static void main(String[] args) {
		//1. ��üȭ
		Person ogong = new Person();
		//2. �� ����
		ogong.setEye(2);
		ogong.setMouth(1);
		ogong.setName("�տ���");
		ogong.setNose(1);
		//3. ��� ���
		System.out.println(ogong.eat());
		System.out.println(ogong.eat("����", 9000));
		
		
		//�ڽ� �̸��� ��ü�� �����ϰ�, �����ϴ� ������ �Ծ����.
		//1. ��ü ����
		Person jaehoon = new Person();
		//2. �� ����
		jaehoon.setEye(2);
		jaehoon.setMouth(1);
		jaehoon.setName("������");
		jaehoon.setNose(1);
		//3. ��� ���
		System.out.println(jaehoon.eat());
		System.out.println(jaehoon.eat("ġŲ", 18000));

	}//main

}//class
