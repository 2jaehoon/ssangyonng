package day1205;
/**

관계연산자 (연산의 결과는 true | false가 나온다)
>, <, >=, <=, ==, !=

*/
class Operator4
{
	public static void main(String[] args) 
	{
		int i=10, j=20, k=10;
 
    //== 같으면 true, 다르면 false
	System.out.println(i+"=="+k+"="+(i==k)); //true
	System.out.println(i+"=="+j+"="+(i==j)); //false

	//!= 같으면 false, 다르면 true
	System.out.println(i+"!="+k+"="+(i!=k)); //false
	System.out.println(i+"!="+j+"="+(i!=j)); //true
	}
}

