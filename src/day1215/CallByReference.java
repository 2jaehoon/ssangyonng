package day1215;

/**
 * �ּҴ� �ϳ�.
 * method �Ű������� ������ ���������� ������ �ּҰ� �״�� ���޵ȴ�.
 * @author user
 *
 */
public class CallByReference {
	
	private int i;
	private int j;
	
	public void swap(CallByReference cbr){
		int temp = 0;
		temp = cbr.j;
		cbr.i = cbr.j;
		cbr.j = temp;
		System.out.println("swap method i : " + cbr.i +",j = "+ cbr.j);//15,12
		}

	public static void main(String[] args) {
		CallByReference cbr = new CallByReference();
		cbr.i = 12;
		cbr.j = 15;
		System.out.println("swap �� i : " + cbr.i + ", j = "+ cbr.j);//12,15 
		cbr.swap(cbr); //�ּҰ� ����
		System.out.println("swap �� i : " + cbr.i + ", j = "+ cbr.j); //15,12
		
	}//main


}//class
