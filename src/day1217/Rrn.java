package day1217;

public class Rrn {
	String ssn;//�ֹ�
	String year;//���Ǻ� 18,19,20 �ο�
	String year2; //�¾�⵵
	String month; //�¾ ��
	String day;//�¾ ��
	String sex;//����
	int zodiacSign;//��
	
	
//	public Rrn() {
//		this("950101-1234567");
//	}
//	��¥�� �ֹι�ȣ�� ������ ó���� �� �Ǵ� ������ ������ ����
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
//1997�� 01�� 25��
public String birthDate() {
	switch(ssn.charAt(7)) {
case '1': case '2': case '5': case '6':
	year="19";
	year= year.concat(year2);
	return year.concat("�� ").concat(month).concat("�� ").concat(day).concat("�� ");
	case '3': case '4': case '7': case '8':
	year="20";
	return year.concat("�� ").concat(month).concat("�� ").concat(day).concat("�� ");
	case '0': case '9':
	year="18";
	return year.concat("�� ").concat(month).concat("�� ").concat(day).concat("�� ");
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
//	return year.concat("�� ").concat(month).concat("�� ").concat(day).concat("�� ");
//} else if(ssn.charAt(7)=='3'||ssn.charAt(7)=='4'||ssn.charAt(7)=='7'||ssn.charAt(7)=='8') {
//	year="20";
//	year= year.concat(year2);
//	return year.concat("�� ").concat(month).concat("�� ").concat(day).concat("�� ");
//}else if(ssn.charAt(7)=='1'||ssn.charAt(7)=='2'||ssn.charAt(7)=='5'||ssn.charAt(7)=='6') {
//	year="18";
//	year= year.concat(year2);
//	return year.concat("�� ").concat(month).concat("�� ").concat(day).concat("�� ");
//}
//return null;
//}





//myyear =  Integer.valueOf(year);
public int getAge() {
	if(ssn.charAt(7)=='1'||ssn.charAt(7)=='2'||ssn.charAt(7)=='5'||ssn.charAt(7)=='6') {
		year="19";
		year= year.concat(year2);
		int myyear =  Integer.valueOf(year);
		return (2022-myyear)+1;
	} else if(ssn.charAt(7)=='3'||ssn.charAt(7)=='4'||ssn.charAt(7)=='7'||ssn.charAt(7)=='8') {
		year="20";
		year= year.concat(year2);
		int myyear =  Integer.valueOf(year);
		return (2022-myyear)+1;
	}else if(ssn.charAt(7)=='1'||ssn.charAt(7)=='2'||ssn.charAt(7)=='5'||ssn.charAt(7)=='6') {
		year="18";
		year= year.concat(year2);
		int myyear =  Integer.valueOf(year);
		return (2022-myyear)+1;
	}
	return 0;
}

//���� 1357 ���� 2468
	public String getSex() {
//		if(ssn.charAt(7)=='1'||ssn.charAt(7)=='3'||ssn.charAt(7)=='5'||ssn.charAt(7)=='7') {
//			sex = "����";
//			return sex;
//		}else if(ssn.charAt(7)=='2'||ssn.charAt(7)=='4'||ssn.charAt(7)=='6'||ssn.charAt(7)=='8') {
//			sex = "����";
//			return sex;
//		}
//		
//		return null;
		char genderNumber = ssn.charAt(7);
		int genderNumber2 = (int)(genderNumber - '0'); //char���� int���� ������ ����
		System.out.println("gender��" + genderNumber2);
		if(genderNumber==0) {
			return null;
		}else {
			return (genderNumber%2==0)?"����":"����";
		}

	}
	
	
	
	
	
		
		
	public String getZodiacSign() {
		if(ssn.charAt(7)=='1'||ssn.charAt(7)=='2'||ssn.charAt(7)=='5'||ssn.charAt(7)=='6') {
			year="19";
			year= year.concat(year2);
			int myyear =  Integer.valueOf(year);
			zodiacSign=myyear%12;
			switch(zodiacSign) {
			case 1: return "�ܳ���";
			case 2: return "��";
			case 3: return "��";
			case 4: return "��";
			case 5: return "��";
			case 6: return "��";
			case 7: return "��";
			case 8: return "��";
			case 9: return "��";
			case 10: return "��";
			case 11:return "��";
			}
		} else if(ssn.charAt(7)=='3'||ssn.charAt(7)=='4'||ssn.charAt(7)=='7'||ssn.charAt(7)=='8') {
			year="20";
			year= year.concat(year2);
			int myyear =  Integer.valueOf(year);
			zodiacSign=myyear%12;
			switch(zodiacSign) {
			case 1: return "�ܳ���";
			case 2: return "��";
			case 3: return "��";
			case 4: return "��";
			case 5: return "��";
			case 6: return "��";
			case 7: return "��";
			case 8: return "��";
			case 9: return "��";
			case 10: return "��";
			case 11:return "��";
			}
		}else if(ssn.charAt(7)=='1'||ssn.charAt(7)=='2'||ssn.charAt(7)=='5'||ssn.charAt(7)=='6') {
			year="18";
			year= year.concat(year2);
			int myyear =  Integer.valueOf(year);
			zodiacSign=myyear%12;
			switch(zodiacSign) {
			case 1: return "�ܳ���";
			case 2: return "��";
			case 3: return "��";
			case 4: return "��";
			case 5: return "��";
			case 6: return "��";
			case 7: return "��";
			case 8: return "��";
			case 9: return "��";
			case 10: return "��";
			case 11:return "��";
			}
		}
		return null;
	}

		


}
