package day1227;


/**
 * 숙제
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
		String str[] = work.csvData("김경태,김규미,김보경,모민경.박진호~엄태영,윤상준 윤지원.이길헌,이단군");
		
//		StringTokenizer stn = work.csvData("김경태,김규미,김보경,모민경.박진호~엄태영,윤상준 윤지원.이길헌,이단군");
//		String token = "";
//		while (stn.hasMoreTokens()) {
//			token = stn.nextToken();
//			if (token.charAt(0) == '김') {
//				System.out.print(token.replace('김', ' ').trim() + " ");
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
