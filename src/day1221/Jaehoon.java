package day1221;

public class Jaehoon extends Person {
	int effortScore;
	
	
	/**
	 * ��������� 100�� �����̶��
	 * ���� 80��
	 *
	 */
	public Jaehoon() {
		effortScore = 80;
	}
	
	//���� ����Ϸ��� �Ѵ� �������?
	public String effort(int effortScore) {
		String result = "";
		if(effortScore<40) {
		 result = "�ǿ��� ������� �̤�";
		}else if(effortScore<60){
			result = "�����ѵ���?";
		}else {
			result = "�ǿ��� �ջ�";
		}
		
		
		return result;
	}
	
	

}//Jaehoon
