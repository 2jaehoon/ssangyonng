package day1207;

public class Work1207 {

	public static void main(String[] args) {
		//1.
		int i = 12;
		i = ~(i)+1;
		System.out.println("i의 2의 보수 : " + i);
		System.out.println();
		//2
		int temp1 = 10, temp2 = 20;
		System.out.println("++temp1 + temp2-- : "+(++temp1 + temp2--));
		//전위연산자로 템프1값이 먼저 증가해 11 후위 연산자로 템프2값은 출력후 감소하니 31이 출력
		System.out.println("temp1 =" + temp1 + "/temp2 = " + temp2);
		//먼저 증가한 템프1은 11 출력후 나중에 감소한 템프2 는 19
		System.out.println();
		//3
		int temp3 = 0;
		temp3 = Integer.MAX_VALUE;
		System.out.println("temp3<<4 : " + (temp3<<4));
		System.out.println();
		//4
		int temp4 = 0;
		temp4= Integer.MAX_VALUE;
		System.out.println("temp4&65535 : " + (temp4&65535));
		System.out.println();
		
		

		
		

	}

}
