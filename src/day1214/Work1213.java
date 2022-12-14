package day1214;

public class Work1213 {
	///////////////////////////1111111111111
	public void myName(){
		System.out.println("이재훈");
	}
	
///////////////////////////////////////////////////	2222222222222222222
	public char myinitial() {
	return 'L';
	}

	
	/////////////////////////////////////////////3333333333333333333333
	public void myScore(int score) {
		if(score>-1 && score<101) {
			if(score<40) {
				System.out.println("과락");
			} else if(score<60){
				System.out.println("다른 과목 참조");
			}else {
				System.out.println("합격");
			}//end if
		}else {
			System.out.println("잘못된 점수");
		}
	}
	
	///////////////////////////////////////////////////////////4444444444444444444
	public void word(char word) {
		if(word>='a'&&word<='z') {
			System.out.println("소문자");
		} else if(word>='A' && word<='Z') {
			System.out.println("대문자");
		} else if(word>='0' && word<='9') {
			System.out.println("숫자");
		}
		
	}
	/////////////////////////////////////////55555555555555555555555
	public int myYear(int myYear) {
		int thisYear = 2022;
		int age = (thisYear-myYear)+1;
		return age;
	}
	/////////////////////////////666666666666666666666
	public int diff(int a, int b) {
		if(a>b) {
			return a;
		}else if(b>a){
			return b;
		}else {
		return a;
		}
	}
	
	//7,8번 method는 비슷한 일을 수행하니 method overload로 해보세요 넵
	////////////////////777777777777777777777
	public void gugudan() {
		for(int i=1;i<10;i++) {
			for(int j=2;j<10;j++) {
				System.out.printf("%dX%d=%d\t", j, i, i*j);
			}
			System.out.println();
		
		}
		System.out.println();
	}
	
	/////////////88888888888888888888
	public void gugudan(int dan) {
		for(int i = 1;i<10;i++) {
			for(int j=2;j<dan+1;j++) {
				System.out.printf("%dX%d=%d\t", j, i, i*j);
			}
			System.out.println();
		}
	}
	
	
	
	
	
	public static void main(String[] args) {
		//1.이름 출력 고정일
		Work1213 wk = new Work1213();
		wk.myName();
		System.out.println();
		
		//2. 이름 이니셜 첫글자 반환 고정 값 (char)
		System.out.println(wk.myinitial());
		System.out.println();
		
		//3. 점수를 입력받아 점수의 판정을 출력하는 것 가변일
		wk.myScore(69);
		System.out.println();
		
		//4. 문자를 입력받아 해당 문자가 대문자, 소문자, 숫자 인지를 판단하여 출력하는 것 가변일
		wk.word('A');
		System.out.println();
		
		//5. 태어난 해를 입력받아 나이를 반환하는 것 가변 값
		System.out.println(wk.myYear(1997));
		System.out.println();
		
		//6. 두 개의 수를 입력 받아 둘 중 큰 수를 반환하는 일을 하는 method
		//같은 수라면 처음 수를 반환한다. 가변값
		System.out.println(wk.diff(3, 3));
		System.out.println();
		
		//7. 구구단 전체단을 출력하는 메쏘드 고정일
		wk.gugudan();
		
		
		//8. 단을 입력받아 입력한 단에 해당하는 구구단을 출력하는 것 가변일
		wk.gugudan(3);
		
		
		
		
		
		
		
		
		

	}

}
