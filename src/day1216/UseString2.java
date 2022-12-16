package day1216;

import javax.management.StringValueExp;
import javax.swing.plaf.synth.SynthOptionPaneUI;

/**
 * java.lang.String 클래스의 사용법
 * @author user
 *
 */
public class UseString2 {

	public static void main(String[] args) {
		
		//기본형 형식
		String str = "AbcdE";
		//참조형 형식
		String mail = new String("cart_0@naver.com");
		
		System.out.println(str);
		System.out.println(mail);
		
		System.out.println(str+"의 글자수 " + str.length());
		System.out.println(mail+"의 글자수 " + str.length());
		
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		
		//String str = "AbcdE";
		System.out.println(str.indexOf("b"));
		System.out.println(str.indexOf("d"));
		System.out.println(str.indexOf("cdE"));
		
		str = "JavaScript";
		System.out.println(str+"에서 a의 인덱스 " + str.indexOf("a"));//왼쪽에서 오른쪽으로 가면서 a의 첫번째 발견 인덱스
		System.out.println(str+"에서 a의 인덱스 " + str.lastIndexOf("a"));//오른쪽에서 왼쪽으로 가면서a의 첫번째 발견 인덱스
		System.out.println(str+"에서 k의 인덱스 " + str.indexOf("k"));//왼쪽에서 오른쪽으로 존재하지 않음 -1
		System.out.println(str+"에서 2부터 마지막까지에서 첫번째 a의 인덱스 " + str.indexOf("a",2));//왼쪽에서 오른쪽으로 2부터 마지막까지에서 첫번째 a의 인덱스
		
		str = "Oracle Java";
		System.out.println(str+"에서 2부터 마지막까지에서 첫번째 " + str.indexOf("a",2));//왼쪽에서 오른쪽으로 2부터 마지막까지에서 첫번째 a의 인덱스
		//    012345678910
		//str에서 두번째 등장하는 a의 인덱스를 구해보세요
		//단, 처음 a의 위치는 변경될 수도 있다.
		System.out.println(str+"에서 a의 인덱스 " + str.indexOf("a",str.indexOf("a")+1));
	
		//str에서 첫번째 a가 있다면 두번째 등장하는 a의 인덱스를 구해보세요
		//단, 처음 a의 위치는 변경될 수도 있다.
		int idx=str.indexOf("a");
		if(idx!=-1) {//인덱스값이 없으면 -1값이 나오기 때문에 인덱스가 있다는 가정을 하려면 이러한 문장이 필요하다
			System.out.println(str+"에서 a의 인덱스 " + str.indexOf("a",str.indexOf("a")+7));
		}
		//str.indexOf("a",x)면 x부터 마지막까지 a를 찻는 첫번째 인덱스 나열
		
		//특정 인덱스에 해당하는 문자 얻기
		//str="Oracle Java";
		System.out.println(str + "에서 5번쨰 인덱스의 문자 얻기 : " + str.charAt(5));
		System.out.println(str + "에서 10번쨰 인덱스의 문자 얻기 : " + str.charAt(10));
		//존재하지 않는 인덱스를 사용하면 error가 발생한다.
		//System.out.println(str + "에서 10번쨰 인덱스의 문자 얻기 : " + str.charAt(11));
		
		
		//str="Oracle Java"; <- super string 부모 문자열
		//제일 마지막에 끝 기호가 덮어 씌어 지기 때문에 +1로 해야 원하는 문자열까지 출력된다.
		System.out.println(str + "에서 3~4의 인덱스에 해당하는 자식 문자열 " + str.substring(3,5)); //3~4인덱스
		//제일 마지막에 끝 기호가 덮어 씌어 지기 때문에 +1로 해야 원하는 문자열까지 출력된다.
		System.out.println(str + "에서 3~5의 인덱스에 해당하는 자식 문자열 " + str.substring(3,6)); // 3~5인덱스
		
		
		//cart_0@naver.com
		//메일주소@도메인주소
		//mail 변수에는 자신의 이메일 주소가 할당되어 있다.
		//메일주소와 도메인 주소를 분리하여 출력해보세요.
		//String emailAddress = mail.substring(0,6);
		String emailAddress = mail.substring(0,mail.indexOf("@"));
		//String domainAddress = mail.substring(7,16);
		//String domainAddress = mail.substring(mail.indexOf("@"),mail.length());
		//substring(시작인덱스) => 끝까지 잘라낸다. 
		String domainAddress = mail.substring(mail.indexOf("@"));////substring(시작인덱스) => 끝까지 잘라낸다. 
		System.out.println("메일 주소 : " + emailAddress + " 도메인 주소 : " +domainAddress );
		
		String str1 = "하늘에는 영광 땅에서는 자바공부하세요.";
		//str1의 글자 수가 14자를 초과하면 13자 까지만 보여주고 뒤에 ...을 붙여 출력한다.
		if(str1.length()>14) {
			System.out.println(str1.substring(0,13) + " ...");
		}
		
		str = "abc";
		str1 = "def";
		//String result = str + str1; //+로 문자열은 합칠수 있다.
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
		
		str = "서울시 강남구";
		str1 = "서울시 동대문구";
		result = "경기도 수원시 영통구";
		System.out.println(str + " 서울인가요? " + str.startsWith("서울"));
		System.out.println(str1 + " 서울인가요? " + str1.startsWith("서울"));
		System.out.println(result + " 서울인가요? " + result.startsWith("서울"));
		
		
		str = "서울시 강남구";
		str1 = "경기도 안산시 산본리";
		result = "경기도 수원시 영통구";
		
		
		System.out.println(str + " 시골인가요? " + str.endsWith("리"));
		System.out.println(str1 + " 시골인가요? " + str1.endsWith("리"));
		System.out.println(result + " 시골인가요? " + result.endsWith("리"));

		//PC방 > 서든 어택 >  친구 집 >  야! 민수야 너 지금 어디야?
		str = "어! 나 피시방이야? 넌 어딘데 씨방새야?"; 	
		System.out.println(str.contains("씨방")?"욕은 사용할 수 없습니다.":str);

		
		if(str.contains("씨방")) {
			str = str.replaceAll("씨", "사랑해").replaceAll("방", " * ");
		}//계속 연결해서 부를 수 있다 > 메쏘드 체인
		//반환형이 객체인 경우 객체가 제공하는 메소드를 계속 연결하여 사용할 수 있다.
		//str.substring(0).substring(0).length();  메소드 체인 이용법
		System.out.println(str);
		
		int i = 12;
		double d = 12.16;
//		str = i; //string형에 int값 저장 x
//		str = i + "";
//		str1 = d + "";
		str = String.valueOf(i); //int i값을 스트링으로 변환시켜줌
		str1 = String.valueOf(d);  //double d의 값을 스트링으로 변환시켜줌
		
		System.out.println(str);
		System.out.println(str1);
		
		str1 ="";
		System.out.println(str.isEmpty()); //비워져있니?
		System.out.println(str1.isEmpty());  //비워져있니?
		
		int[] arr = new int [5];
		int b = arr.length;
		
		//if 안에 있으면 
		
	}//main

}//class
