package day1216;

import javax.management.StringValueExp;
import javax.swing.plaf.synth.SynthOptionPaneUI;

/**
 * java.lang.String Ŭ������ ����
 * @author user
 *
 */
public class UseString2 {

	public static void main(String[] args) {
		
		//�⺻�� ����
		String str = "AbcdE";
		//������ ����
		String mail = new String("cart_0@naver.com");
		
		System.out.println(str);
		System.out.println(mail);
		
		System.out.println(str+"�� ���ڼ� " + str.length());
		System.out.println(mail+"�� ���ڼ� " + str.length());
		
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		
		//String str = "AbcdE";
		System.out.println(str.indexOf("b"));
		System.out.println(str.indexOf("d"));
		System.out.println(str.indexOf("cdE"));
		
		str = "JavaScript";
		System.out.println(str+"���� a�� �ε��� " + str.indexOf("a"));//���ʿ��� ���������� ���鼭 a�� ù��° �߰� �ε���
		System.out.println(str+"���� a�� �ε��� " + str.lastIndexOf("a"));//�����ʿ��� �������� ���鼭a�� ù��° �߰� �ε���
		System.out.println(str+"���� k�� �ε��� " + str.indexOf("k"));//���ʿ��� ���������� �������� ���� -1
		System.out.println(str+"���� 2���� �������������� ù��° a�� �ε��� " + str.indexOf("a",2));//���ʿ��� ���������� 2���� �������������� ù��° a�� �ε���
		
		str = "Oracle Java";
		System.out.println(str+"���� 2���� �������������� ù��° " + str.indexOf("a",2));//���ʿ��� ���������� 2���� �������������� ù��° a�� �ε���
		//    012345678910
		//str���� �ι�° �����ϴ� a�� �ε����� ���غ�����
		//��, ó�� a�� ��ġ�� ����� ���� �ִ�.
		System.out.println(str+"���� a�� �ε��� " + str.indexOf("a",str.indexOf("a")+1));
	
		//str���� ù��° a�� �ִٸ� �ι�° �����ϴ� a�� �ε����� ���غ�����
		//��, ó�� a�� ��ġ�� ����� ���� �ִ�.
		int idx=str.indexOf("a");
		if(idx!=-1) {//�ε������� ������ -1���� ������ ������ �ε����� �ִٴ� ������ �Ϸ��� �̷��� ������ �ʿ��ϴ�
			System.out.println(str+"���� a�� �ε��� " + str.indexOf("a",str.indexOf("a")+7));
		}
		//str.indexOf("a",x)�� x���� ���������� a�� ���� ù��° �ε��� ����
		
		//Ư�� �ε����� �ش��ϴ� ���� ���
		//str="Oracle Java";
		System.out.println(str + "���� 5���� �ε����� ���� ��� : " + str.charAt(5));
		System.out.println(str + "���� 10���� �ε����� ���� ��� : " + str.charAt(10));
		//�������� �ʴ� �ε����� ����ϸ� error�� �߻��Ѵ�.
		//System.out.println(str + "���� 10���� �ε����� ���� ��� : " + str.charAt(11));
		
		
		//str="Oracle Java"; <- super string �θ� ���ڿ�
		//���� �������� �� ��ȣ�� ���� ���� ���� ������ +1�� �ؾ� ���ϴ� ���ڿ����� ��µȴ�.
		System.out.println(str + "���� 3~4�� �ε����� �ش��ϴ� �ڽ� ���ڿ� " + str.substring(3,5)); //3~4�ε���
		//���� �������� �� ��ȣ�� ���� ���� ���� ������ +1�� �ؾ� ���ϴ� ���ڿ����� ��µȴ�.
		System.out.println(str + "���� 3~5�� �ε����� �ش��ϴ� �ڽ� ���ڿ� " + str.substring(3,6)); // 3~5�ε���
		
		
		//cart_0@naver.com
		//�����ּ�@�������ּ�
		//mail �������� �ڽ��� �̸��� �ּҰ� �Ҵ�Ǿ� �ִ�.
		//�����ּҿ� ������ �ּҸ� �и��Ͽ� ����غ�����.
		//String emailAddress = mail.substring(0,6);
		String emailAddress = mail.substring(0,mail.indexOf("@"));
		//String domainAddress = mail.substring(7,16);
		//String domainAddress = mail.substring(mail.indexOf("@"),mail.length());
		//substring(�����ε���) => ������ �߶󳽴�. 
		String domainAddress = mail.substring(mail.indexOf("@"));////substring(�����ε���) => ������ �߶󳽴�. 
		System.out.println("���� �ּ� : " + emailAddress + " ������ �ּ� : " +domainAddress );
		
		String str1 = "�ϴÿ��� ���� �������� �ڹٰ����ϼ���.";
		//str1�� ���� ���� 14�ڸ� �ʰ��ϸ� 13�� ������ �����ְ� �ڿ� ...�� �ٿ� ����Ѵ�.
		if(str1.length()>14) {
			System.out.println(str1.substring(0,13) + " ...");
		}
		
		str = "abc";
		str1 = "def";
		//String result = str + str1; //+�� ���ڿ��� ��ĥ�� �ִ�.
		//System.out.println(result);
		String result=" ";
		result = str.concat(str1);
		String a = "";
		a = a.concat(str1);
		System.out.println(a);
		
		System.out.println(result);
		
		
		str = "   a bc    ";
		System.out.printf("%s\n", str.trim());
		
		str = "java";
		
		System.out.println(str.replaceAll("a", "MVC"));
		
		str = "����� ������";
		str1 = "����� ���빮��";
		result = "��⵵ ������ ���뱸";
		System.out.println(str + " �����ΰ���? " + str.startsWith("����"));
		System.out.println(str1 + " �����ΰ���? " + str1.startsWith("����"));
		System.out.println(result + " �����ΰ���? " + result.startsWith("����"));
		
		
		str = "����� ������";
		str1 = "��⵵ �Ȼ�� �꺻��";
		result = "��⵵ ������ ���뱸";
		
		
		System.out.println(str + " �ð��ΰ���? " + str.endsWith("��"));
		System.out.println(str1 + " �ð��ΰ���? " + str1.endsWith("��"));
		System.out.println(result + " �ð��ΰ���? " + result.endsWith("��"));

		//PC�� > ���� ���� >  ģ�� �� >  ��! �μ��� �� ���� ����?
		str = "��! �� �ǽù��̾�? �� ��� �������?"; 	
		System.out.println(str.contains("����")?"���� ����� �� �����ϴ�.":str);

		
		if(str.contains("����")) {
			str = str.replaceAll("��", "�����").replaceAll("��", " * ");
		}//��� �����ؼ� �θ� �� �ִ� > �޽�� ü��
		//��ȯ���� ��ü�� ��� ��ü�� �����ϴ� �޼ҵ带 ��� �����Ͽ� ����� �� �ִ�.
		//str.substring(0).substring(0).length();  �޼ҵ� ü�� �̿��
		System.out.println(str);
		
		int i = 12;
		double d = 12.16;
//		str = i; //string���� int�� ���� x
//		str = i + "";
//		str1 = d + "";
		str = String.valueOf(i); //int i���� ��Ʈ������ ��ȯ������
		str1 = String.valueOf(d);  //double d�� ���� ��Ʈ������ ��ȯ������
		
		System.out.println(str);
		System.out.println(str1);
		
		str1 ="";
		System.out.println(str.isEmpty()); //������ִ�?
		System.out.println(str1.isEmpty());  //������ִ�?
		
		int[] arr = new int [5];
		int b = arr.length;
		
		//if �ȿ� ������ 
		
	}//main

}//class
