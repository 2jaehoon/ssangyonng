package day1215;

/**
 * Person Ŭ������ ����ϴ� Ŭ����
 * @author user
 *
 */
public class UsePerson {

	public static void main(String[] args) {
		//1. ��üȭ
		Person ogong = new Person();
		//2. �� ������ personŬ�������� �����ڷ� ����
		ogong.setName("�տ���");
		//3. ��� ���
		System.out.printf("�� %d �� %d �� %d\n",ogong.getEye(), ogong.getNose(), ogong.getMouth());
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
		
		
		Person jinban  = new Person(3,1,1);
		jinban.setName("õ����");
		System.out.printf("�� %d �� %d �� %d\n",jinban.getEye(), jinban.getNose(), jinban.getMouth());
		System.out.println(jinban.eat());
		System.out.println(jinban.eat("����", 9000));
		
		

	}//main

}//class
