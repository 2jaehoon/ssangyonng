package day1222;

import java.text.SimpleDateFormat;

import javax.security.sasl.SaslException;
import javax.swing.text.SimpleAttributeSet;

/**
 * Override ����
 * @author user
 *
 */
public class TestOverride {
	
	@Override
	public String toString() {
		return "��ü�� ������� �� ��µ� �޽���";
	}

	public static void main(String[] args) {
		
		String str = new String("������ �� �߿�");
		//������ ���������� �ּҸ� ������ �ְ� ��ü�� ����ϸ� heap�� �߼Ҹ� ��µȴ�.
		System.out.println(str);//println method�� �Է¹��� ��ü�� toString()�� ȣ���Ͽ� ��ü�� ���� �޽����� ����Ѵ�.
		//�ڹ��� ��� Ŭ������ Object �ΰ���? ��
		//��� Ŭ������ Object�� method�� ����� �� �ֳ���? ��
		//������Ʈ Ŭ������ �ڽ��� ��Ʈ�� Ŭ�������� toString�� �������̵尡 �Ǿ� �ֱ� ������
		//String���� ���ÿ� ��ü�� �ּҰ� �ƴ϶� �� ���� ��ȯ�ȴ�.
		
		TestOverride to = new TestOverride();
		System.out.println(to);//�ּҰ� �ƴ� ���� ��µǵ��� ����� ������
		//toString method�� Override�� ����.
		
		SimpleDateFormat sdf = new SimpleDateFormat();
		System.out.println(sdf); //toString method�� Override���� �ʾҴ�.
		
		Integer i = new Integer(2022);
		System.out.println(i); //toString method�� Override�ߴ�.
		
		
	}//main

}//class
