package day1222;

/**
 * ��, ��, ��, �Դ� ���� PersonŬ�������� ��� ���� �� �ڽŸ��� Ư¡ ����.
 * �������� ������ Fly interface���� ����(������ �ٸ� ���� �� �� �ִ�.)
 * ���� �� �ڽŸ��� Ư¡ ����
 * final Ŭ������ ����� �� �� ���� Ŭ������ ����ϴ� Ŭ���������� �����Ǵ� ����� ��������
 * ���ϰ� �״�� ��븸 �� �� �ִ� ���°� �ȴ�.
 * @author user final
 */
public final class Clark extends Person implements Fly{
	public int power;

	/**
	 * Ŭ���� �⺻ ������ ��, �Ϲ��� 3, ��â 5, Ŭ�� 8�� ������.
	 */
	public Clark() {
		power = 8;
	}// Clark

	@Override
	public String[] language() {
		String[] lang = "����, �ܰ��".split(",");
		return lang;
	}

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

	
	
	
	@Override
	public String eat(String menu, int price) {
		String result = getName() + "�� ����������� " + menu + "�� ������ " + price +  "$ ���� ��Դ´�.";
		
		return result;
	}
	
	@Override
	public String eat() {
		String result = getName() + "�� ������ ���� �Դ´�.";
		
		return result;
	}

	@Override
	public String drivingForce() {
		String result = "������ �ݾ ������?";
		return result;
	}

	@Override
	public String upwardForce() {
		String result = "����";
		return result;
	}
	
	
	
}//class