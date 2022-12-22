package day1220;

/**
 * char 데이터형으로 배열 선언
 * @author user
 *
 */
public class UseCharArr {
	
	/**
	 * 1. 입력된 메시지를 받아서 
	 * 2. 문자열을 하나하나 잘라서 배열에 저장
	 * (배열은 문자열을 저장 -> 문자열의 길이가 다르다 -> 배열의 길이가 다르다. )
	 * 3. 배열을 출력. 다른 배열과 다르게 char배열명을 출력하면 문자들이 시작 주소부터 끝주소까지 연결되어 출력된다.
	 * 4. 입력된 메세지가 없다면 hello를
	 * @param msg
	 */
	public void useArr(String msg) {
		//1. 선언) 데이터형[] 배열명 = null;
		char[] arr = null;
		//입력된 문자열이 존재하는 경우만 배열을 생성해서 사용.(numm아니거나 empty가 아닌경우)배열을 생성하여 사용
		if(msg != null && !msg.equals("")) { //객체가 생성되었니?
			//2. 생성 ) 배열명 = new 데이터형[방의 개수];
			arr = new char[msg.length()];
			//3. 값 할당
			for (int i = 0; i < msg.length(); i++ ) {
				arr[i] = msg.charAt(i);
			}
		}else {
			arr = new char[] {'h', 'e', 'l', 'l', 'o' };
		}//end if
		//4. 사용
		System.out.println(arr);
		for (int i = arr.length-1; i > -1; i-- ) {
			System.out.print(arr[i]);
		}
		System.out.println();
	}//useArr

	public static void main(String[] args) {
		//1. 객체화
		UseCharArr uca = new UseCharArr();
		//2. 생성된 객체를 사용해 method 호출
		String msg = "오늘은 화요일 입니다.";//12글자
		uca.useArr(msg);
		msg = "Java는 완벽한 객체지향언어";//16글자
		uca.useArr(msg);

		String str = "";//empty = > 초기화 , 문자열 저장소의 주소는 받았으나 값이 없네!! => 사용불가 => 메쏘드 호출은 가능
		uca.useArr(str);
		String str1 = null; // 초기화 heap의 주소가 없네!!! => 사용불가 => 메소드 호출불가
		uca.useArr(str1);
	}//main

}//class
