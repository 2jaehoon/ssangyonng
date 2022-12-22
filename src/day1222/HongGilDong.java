package day1222;

/**
 * ����� ���� Ư¡�� PersonŬ�������� ����ϰ�(�ڵ��� ���뼺) ȫ�浿 class�� �ڽŸ��� Ư¡�� 
 * �ο��ϴ� ���� �����Ѵ�.
 * @author user
 *
 */
public class HongGilDong extends Person {

	private int level;
	
	
	/**
	 * ȫ�浿�� �⺻ ������
	 * �ο��� ������ 6���� ����
	 * �ο��� 10�� ������ ����, �Ϲ����� 3���� ������.
	 */
	public HongGilDong() {
		level=6;
		
	}//HongGilDong
	
	public String fight(int level) {
		String result = "";
		if(this.level>level) {//�̱�
			result = "�̰��. s('. ^)V";
			this.level++;
			if(this.level>10) {
				this.level=10;
			}//end if
		}else if(this.level<level) {//��
			result = "���� �ФФФ�";
			this.level--;
			if(this.level<1) {
				this.level=1;
			}
		}else {//���
			result = "�Ѥ�+";
		}//end els��	
		return result;
	}//fight
	
	public int getLevel() {
		return level;
	}
	
	@Override
	public String[] language() {
		String[] lang = {"�ѱ���", "���־�", "����"};
		
		return lang;
	}

	public String eat() {
		String result = getName() + "�� ������ ���� �Դ´�";
		
		return result;
	}
	
	@Override
	public String eat(String menu, int p) {
		//�θ�Ŭ������ getName �޼ҵ带 ����Ѵ�.
		return getName() + "�� �ָ����� " + menu + " �� ������ " + p + " Ǭ ���� ��Դ´�.";
	}
	
	
	
}//class
