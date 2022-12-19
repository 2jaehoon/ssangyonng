package day1217;

public class Rrn {
	String ssn;//주민
	String year;//조건별 18,19,20 부여
	String year2; //태어난년도
	String month; //태어난 달
	String day;//태어난 일
	String sex;//성별
	int zodiacSign;//띠
	
	
//	public Rrn() {
//		this("950101-1234567");
//	}
//	어짜피 주민번호를 없으면 처리가 안 되는 구조라 있으나 마나
public Rrn(String ssn) {
		this.ssn = ssn;
		this.year2 = ssn.substring(0,2);
		this.month=ssn.substring(2,4);
		this.day=ssn.substring(4,6);
	}

public String getSsn() {
	return ssn;
}




//970125-1111111	
//1997년 01월 25일
public String birthDate() {
	switch(ssn.charAt(7)) {
case '1': case '2': case '5': case '6':
	year="19";
	year= year.concat(year2);
	return year.concat("년 ").concat(month).concat("월 ").concat(day).concat("일 ");
	case '3': case '4': case '7': case '8':
	year="20";
	return year.concat("년 ").concat(month).concat("월 ").concat(day).concat("일 ");
	case '0': case '9':
	year="18";
	return year.concat("년 ").concat(month).concat("월 ").concat(day).concat("일 ");
	}
	return null;
}

//public String birthDate() {
//	String year = null;
//	String year2=ssn.substring(0,2);
//	String month=ssn.substring(2,4);
//	String day=ssn.substring(4,6);
//if(ssn.charAt(7)=='1'||ssn.charAt(7)=='2'||ssn.charAt(7)=='5'||ssn.charAt(7)=='6') {
//	year="19";
//	year= year.concat(year2);
//	return year.concat("년 ").concat(month).concat("월 ").concat(day).concat("일 ");
//} else if(ssn.charAt(7)=='3'||ssn.charAt(7)=='4'||ssn.charAt(7)=='7'||ssn.charAt(7)=='8') {
//	year="20";
//	year= year.concat(year2);
//	return year.concat("년 ").concat(month).concat("월 ").concat(day).concat("일 ");
//}else if(ssn.charAt(7)=='1'||ssn.charAt(7)=='2'||ssn.charAt(7)=='5'||ssn.charAt(7)=='6') {
//	year="18";
//	year= year.concat(year2);
//	return year.concat("년 ").concat(month).concat("월 ").concat(day).concat("일 ");
//}
//return null;
//}





//myyear =  Integer.valueOf(year);
public int getAge() {
	if(ssn.charAt(7)=='1'||ssn.charAt(7)=='2'||ssn.charAt(7)=='5'||ssn.charAt(7)=='6') {
		year="19";
	} else if(ssn.charAt(7)=='3'||ssn.charAt(7)=='4'||ssn.charAt(7)=='7'||ssn.charAt(7)=='8') {
		year= year.concat(year2);
		year="20";
	}else  {
		year="18";
	}
		year= year.concat(year2);
		int myyear =  Integer.valueOf(year);
		return (2022-myyear)+1;
	
	}




//남자 1357 여자 2468
	public String getSex() {
//		if(ssn.charAt(7)=='1'||ssn.charAt(7)=='3'||ssn.charAt(7)=='5'||ssn.charAt(7)=='7') {
//			sex = "남자";
//			return sex;
//		}else if(ssn.charAt(7)=='2'||ssn.charAt(7)=='4'||ssn.charAt(7)=='6'||ssn.charAt(7)=='8') {
//			sex = "여자";
//			return sex;
//		}
//		
//		return null;
		char genderNumber = ssn.charAt(7);
		int genderNumber2 = (int)(genderNumber - '0'); //char에서 int값을 가지게 변경
		//System.out.println("gender값" + genderNumber2);
		if(genderNumber2==0) {
			return null;
		}else {
			return (genderNumber2%2==0)?"여자":"남자";
		}

	}
	
		
	public String getZodiacSign() {
		if(ssn.charAt(7)=='1'||ssn.charAt(7)=='2'||ssn.charAt(7)=='5'||ssn.charAt(7)=='6') {
			year="19";
		} else if(ssn.charAt(7)=='3'||ssn.charAt(7)=='4'||ssn.charAt(7)=='7'||ssn.charAt(7)=='8') {
			year="20";
		}else {
			year="18";
		}
		year= year.concat(year2);
			int myyear =  Integer.valueOf(year);
			zodiacSign=myyear%12;
			String zodiac="";
			switch(zodiacSign) {
			case 1: zodiac= "잔나비";break;
			case 2: zodiac= "닭";break;
			case 3: zodiac= "개";break;
			case 4: zodiac= "쥐";break;
			case 5: zodiac= "소";break;
			case 6: zodiac= "범";break;
			case 7: zodiac= "토";break;
			case 8: zodiac= "용";break;
			case 9: zodiac= "뱀";break;
			case 10: zodiac= "말";break;
			case 11:zodiac= "양";break;
			}
			return zodiac;
	}//getZodiacSign

	}
