package day1205;
/**

���迬���� (������ ����� true | false�� ���´�)
>, <, >=, <=, ==, !=

*/
class Operator4
{
	public static void main(String[] args) 
	{
		int i=10, j=20, k=10;
 
    //== ������ true, �ٸ��� false
	System.out.println(i+"=="+k+"="+(i==k)); //true
	System.out.println(i+"=="+j+"="+(i==j)); //false

	//!= ������ false, �ٸ��� true
	System.out.println(i+"!="+k+"="+(i!=k)); //false
	System.out.println(i+"!="+j+"="+(i!=j)); //true
	}
}

