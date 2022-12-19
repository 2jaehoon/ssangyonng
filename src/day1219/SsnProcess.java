package day1219;

/**
 * ����� �����ϴ� Ŭ����.
 * @author user
 *
 */
public class SsnProcess {
	//����� �����ϴ� Ŭ���� ���� ��� method���� �� ���� ����ϰ� ���� �ν��Ͻ� ������ ����.
	//��ü�� �����ǰ� ���Ǵ� �Ⱓ���� �� ���� �����ȴ�.
	private String ssn;
	/**
	 * �ֹε�Ϲ�ȣ�� �������
	 * 
	 */
	public static final int SSN_LENGTH=14;
	public static final int DASH_INDEX=6;
	
	
	/**
	 * �Ű����� �ִ� ������. �ֹι�ȣ�� �־��ּ���.
	 * @param ssn ������ �ֹι�ȣ
	 */
	public SsnProcess(String ssn) {
		this.ssn = ssn;
	}//SsnProcess
	
	public String getSsn() {
		return ssn;
	}//getSsn
	
	//2.�Էµ� �ֹι�ȣ�� ���̰� 14������ üũ�Ͽ�
	public boolean lengthCheck() {
		return ssn.length()==SSN_LENGTH;
	}//lengthCheck
	
	//�Էµ� �ֹι�ȣ�� '-'�� �ùٸ� ��ġ�� �ִ� �� üũ�Ͽ� boolean���� ��ȯ
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
	
	
	
	
	//4. �Էµ� �ֹι�ȣ���� ��������� �����Ͽ� ���ڿ��� ��ȯ
	public String birth() {
		String result = "";
		
		String tempMonth = ssn.substring(2,4);
		String tempDay = ssn.substring(4,6);
		
		result = yearPrefix() + "��" + tempMonth + "��" + tempDay + "��";
		return result;
	}//birth
	
	public int age() {
		int age=0;
		age=2022-yearPrefix()+1;
		return age;
	}//age
	
	//�Էµ� �ֹι�ȣ���� �������� ���ڿ� ��ȯ �޼ҵ�\
	//���� �����ں��� �̰� �� ����.
	public String gender() {
		String gender = "����";
		if(genderFlag()%2==0) {
			gender ="����";
		}//end if
		return gender;
	}//gender
	
	
	public String zodiac() {
		String zodiac="";
		
		//
//		switch(yearPrefix()%12) {
//		case 0: zodiac="������"; break;
//		case 1: zodiac="��"; break;
//		case 2: zodiac="��"; break;
//		case 3: zodiac="����"; break;
//		case 4: zodiac="��"; break;
//		case 5: zodiac="��"; break;
//		case 6: zodiac="ȣ����"; break;
//		case 7: zodiac="�䳢"; break;
//		case 8: zodiac="��"; break;
//		case 9: zodiac="��"; break;
//		case 10: zodiac="��"; break;
//		case 11: zodiac="��"; break;
//		}		
		String[] zodiacArr = {"������", "��", "��", "����", "��", "��", "ȣ����", "�䳢", "��", "��", "��", "��"};
//		zodiac = zodiacArr[yearPrefix()%12];
		zodiac = "������, ��, ��, ����,��, ��, ȣ����, �䳢, ��, ��, ��,��".split(",")[yearPrefix()%12];
		return zodiac;
	}
	
	
	
}
