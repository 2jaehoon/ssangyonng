
package day1207;



class Test{
	public static void main(String[] args) {
		System.out.println("char �ּҰ� : " + (int)Character.MIN_VALUE + ", �ִ밪 : " + Character.MAX_VALUE);


		int year=2020;
		System.out.println( year+"����" + (year%4==0||(year%100==0 && year%400 !=0)?"����":"���"));
	}
}
