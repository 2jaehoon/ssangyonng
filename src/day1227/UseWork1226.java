package day1227;


/**
 * ����
 * 
 * @author user
 *
 */
public class UseWork1226 {
	public void useBak() {
		Work1226 work = new Work1226();
		StringBuilder sb = work.bakFileName("example");
		System.out.println(sb);
	}// useBak

	public void useCSV() {
		Work1226 work = new Work1226();
		String str[] = work.csvData("�����,��Թ�,�躸��,��ΰ�.����ȣ~���¿�,������ ������.�̱���,�̴ܱ�");
		
//		StringTokenizer stn = work.csvData("�����,��Թ�,�躸��,��ΰ�.����ȣ~���¿�,������ ������.�̱���,�̴ܱ�");
//		String token = "";
//		while (stn.hasMoreTokens()) {
//			token = stn.nextToken();
//			if (token.charAt(0) == '��') {
//				System.out.print(token.replace('��', ' ').trim() + " ");
//			} else {
//				System.out.print(token + " ");
//			}
//		} // end while
		for(int i=0; i<str.length; i++) {
			System.out.print(str[i] + " ");
		}
		System.out.println();
	}// useCSV

	public void useCal() {
		Work1226 work = new Work1226();
		String cal = work.cal(2);
		System.out.println(cal);
	}

	public static void main(String[] args) {
		UseWork1226 uw = new UseWork1226();
		uw.useBak();
		uw.useCSV();
		uw.useCal();

	}// main

}// class
