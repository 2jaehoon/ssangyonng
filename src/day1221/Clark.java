package day1221;

/**
 * ��, ��, ��, �Դ� ���� PersonŬ�������� ��� ���� �� �ڽŸ��� Ư¡ ����.
 * 
 * @author user final
 */
public class Clark extends Person {
	public int power;

	/**
	 * Ŭ���� �⺻ ������ ��, �Ϲ��� 3, ��â 5, Ŭ�� 8�� ������.
	 */
	public Clark() {
		power = 8;
	}// Clark

	public String power(String stone) {
		String result = "";
		
		if(stone.equals("���̾Ƹ��")) {
			result = "�����մϴ�. ^��^ ";
			power = 10;
		}else if(stone.equals("ũ���䳪��Ʈ")) {
			result = "�� ���� ~(_0_)~";
			power = 0;
		}else {
			result = "��� ���� �Ѥ�++";
			power=12;
		}//end else
		return result;
	}// power
	
	//�ڽĸ��� Ư¡

	
	
	public String eat() {
		String result = "";
		
		return result;
	}
	
	public String eat(String menu, int price) {
		String result = "";
		
		return result;
	}
	
	
	
	
}//class