
package day1207;



class Test{
	public static void main(String[] args) {
		System.out.println("char 최소값 : " + (int)Character.MIN_VALUE + ", 최대값 : " + Character.MAX_VALUE);


		int year=2020;
		System.out.println( year+"년은" + (year%4==0||(year%100==0 && year%400 !=0)?"윤년":"평년"));
	}
}
