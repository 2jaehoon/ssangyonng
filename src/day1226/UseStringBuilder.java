package day1226;

/**
 * �� ���ڿ��� �ٷ�� Ŭ����
 * @author user
 *
 */
public class UseStringBuilder {
	public void useStringBuffer() {
		//1. ����)
		StringBuffer sb = new StringBuffer(); //1. �⺻������
		//2. ��� ���)
		//�� �߰�
		sb.append("�ȳ��ϼ���?");
		sb.append(2022);
		System.out.println(sb);//��ü�� ����ߴµ� �ּҰ� �ƴ� ���ڿ��� ���
		//Object�� �ִ� toString()�� StringBuilder���� Override �߱� ������
		System.out.println("6��° ���� : " + sb.charAt(6));

		//�� ����) ���εǴ� ���� ���ڿ��� ó���Ѵ�.
		sb.insert(6, "���� ����� ").insert(17, "�� �Դϴ�.");
		System.out.println(sb);
		
		//�� ���� delete(���� �ε���, ���ε���+1);
		sb.delete(13, 24).delete(6, 12);
		System.out.println(sb);
		
		//�� ������ reverse
		sb.reverse();
		sb.reverse();
		System.out.println(sb);
		
	}//useStringBuffer
	public void useStringBuilder() {
		//1. ����)
		StringBuilder sb = new StringBuilder(); //1. �⺻������
		//2. ��� ���)
		//�� �߰�
		sb.append("�ȳ��ϼ���?");
		sb.append(2022);
		System.out.println(sb);//��ü�� ����ߴµ� �ּҰ� �ƴ� ���ڿ��� ���
		//Object�� �ִ� toString()�� StringBuilder���� Override �߱� ������
		System.out.println("6��° ���� : " + sb.charAt(6));

		//�� ����) ���εǴ� ���� ���ڿ��� ó���Ѵ�.
		sb.insert(6, "���� ����� ").insert(17, "�� �Դϴ�.");
		System.out.println(sb);
		
		//�� ���� delete(���� �ε���, ���ε���+1);
		sb.delete(13, 24).delete(6, 12);
		System.out.println(sb);
		
		//�� ������ reverse
		sb.reverse();
		sb.reverse();
		System.out.println(sb);
		
	}//useStringBuilder

	public static void main(String[] args) {
		UseStringBuilder usb = new UseStringBuilder();
		System.out.println("useStringBuffer---------------------------------------------------");
		usb.useStringBuffer();
		System.out.println("useStringBuilder---------------------------------------------------");
		usb.useStringBuilder();
		
		
	}//main

}//class
