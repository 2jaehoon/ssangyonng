package day1221;

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
	
	
	
	
}//class
