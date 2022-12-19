package day1219;

/**
 * 기능을 제공하는 클래스.
 * @author user
 *
 */
public class SsnProcess {
	//기능을 제공하는 클래스 안의 모든 method에서 이 값을 사용하게 위해 인스턴스 변수를 만듬.
	//객체가 생성되고 사용되는 기간동안 이 값은 유지된다.
	private String ssn;
	/**
	 * 주민등록번호의 절대길이
	 * 
	 */
	public static final int SSN_LENGTH=14;
	public static final int DASH_INDEX=6;
	
	
	/**
	 * 매개변수 있는 생성자. 주민번호를 넣어주세요.
	 * @param ssn 저장할 주민번호
	 */
	public SsnProcess(String ssn) {
		this.ssn = ssn;
	}//SsnProcess
	
	public String getSsn() {
		return ssn;
	}//getSsn
	
	//2.입력된 주민번호의 길이가 14자인지 체크하여
	public boolean lengthCheck() {
		return ssn.length()==SSN_LENGTH;
	}//lengthCheck
	
	//입력된 주민번호에 '-'이 올바른 위치에 있는 지 체크하여 boolean으로 반환
	public boolean dashCheck() {
		return ssn.indexOf("-")==SsnProcess.DASH_INDEX;
	}//dashCheck
	
	
	private int genderFlag() {
		int result = 0;
		
		result = Integer.parseInt(ssn.substring(7,8));
		return result;
	}
	
	private int yearPrefix() {
		int year=0;
		
		String tempYear = ssn.substring(0,2);
		String prefixYear = "18";
		int genderFlag = genderFlag();
		if(genderFlag ==1 || genderFlag ==2|| genderFlag ==5|| genderFlag ==6) {
			prefixYear = "19";
		}else if(genderFlag ==1 || genderFlag ==2|| genderFlag ==5|| genderFlag ==6) {
			prefixYear = "20";
		}//end else if
		
		year=Integer.parseInt(prefixYear.concat(tempYear));
		return year;
	}//yearPrefix
	
	
	
	
	//4. 입력된 주민번호에서 생년월일을 연산하여 문자열로 반환
	public String birth() {
		String result = "";
		
		String tempMonth = ssn.substring(2,4);
		String tempDay = ssn.substring(4,6);
		
		result = yearPrefix() + "년" + tempMonth + "월" + tempDay + "일";
		return result;
	}//birth
	
	public int age() {
		int age=0;
		age=2022-yearPrefix()+1;
		return age;
	}//age
	
	//입력된 주민번호에서 성별구해 문자열 반환 메소드\
	//삼항 연산자보다 이게 더 좋다.
	public String gender() {
		String gender = "남자";
		if(genderFlag()%2==0) {
			gender ="여자";
		}//end if
		return gender;
	}//gender
	
	
	public String zodiac() {
		String zodiac="";
		
		//
//		switch(yearPrefix()%12) {
//		case 0: zodiac="원숭이"; break;
//		case 1: zodiac="닭"; break;
//		case 2: zodiac="개"; break;
//		case 3: zodiac="돼지"; break;
//		case 4: zodiac="쥐"; break;
//		case 5: zodiac="소"; break;
//		case 6: zodiac="호랑이"; break;
//		case 7: zodiac="토끼"; break;
//		case 8: zodiac="용"; break;
//		case 9: zodiac="뱀"; break;
//		case 10: zodiac="말"; break;
//		case 11: zodiac="양"; break;
//		}		
		String[] zodiacArr = {"원숭이", "닭", "개", "돼지", "쥐", "소", "호랑이", "토끼", "용", "뱀", "말", "양"};
//		zodiac = zodiacArr[yearPrefix()%12];
		zodiac = "원숭이, 닭, 개, 돼지,쥐, 소, 호랑이, 토끼, 용, 뱀, 말,양".split(",")[yearPrefix()%12];
		return zodiac;
	}
	
	
	
}
