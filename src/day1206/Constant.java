package day1206;
/**
��� : ������ ���ó�� ���(������ ��� ������ �Ұ�)
Ŭ���� �ʵ忡�� �����ϰ�, ��𿡼��� ����� �� �ִ�.
���α׷����� ���ذ��� ����� ����ؾ� �� ��.
�ۼ���)
public static final �������� ����� = ��;
*/

//constant�� �ۼ���ġ�� �����Ǿ� �ִ�. �޽�� �ȿ��� ���� ����.
class Constant {
	public static final int MAX_SCORE=100;
	public static final int MIN_SCORE=0;
	public static void main(String[] args) {
		//public static final int MAX_SCORE=100;      //error
		//Ŭ������ ���� ����� �ٷ� ���
		System.out.println("�ְ��� : "+MAX_SCORE);
		//Ŭ������ ����Ͽ� ��� ���
		System.out.println("������ : "+Constant.MIN_SCORE);
		
		//Constant.MAX_SCORE=99; // ������ ������ �ƴϸ� �� �Ҵ� �� �� ����.
		int myScore=88; 
		
		System.out.println("ȹ������ : " + myScore + "�� �ְ����� : " + Constant.MAX_SCORE + 
			"��, ȹ�������� �ְ� ������ �� : " + (Constant.MAX_SCORE - myScore)+ "��"); 
		
	
	}//Constant
}//Class
