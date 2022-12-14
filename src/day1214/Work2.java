package day1214;

/**
 * getter method, setter method�� ���Ե� Ŭ����
 * 
 * �� ������ ��ȿ�� ������ �����ִ� Ŭ����
 * @author user
 *
 */
public class Work2 {

	private int age;
	
	/**
	 * �� method�� ���ؼ��� ���� ������ �� �ֵ��� �����.
	 * 
	 * public void set������(������ ����){
	 * this.������ = �Ű�����;
	 * }
	 * ����� ���̴� 100���� �ʰ��� �� ����. 100���� �ʰ��� ���̰� �ԷµǸ�
	 * 100��� �缳���Ѵ�.
	 * @param age ������ ����
	 */
	public void setAge(int age) {
		if(age > 100) {
			age = 100;
		}//end if
		this.age = age;
	}//setAge
	
	/**
	 * getter method : ��ü�� ���� ��(instance variable)�� ��ȯ�ϴ� ��
	 * @return member ������ ������ ��
	 */
	public int getAge() {
		return age;
	}
	
	
	
	
	/**
	 * ���� ���� ��� => �׻� ������ �������θ� ��� => ����ڰ� ���ϴ� ���·� ����� �� ����.
	 */
	public void useAge() {
		System.out.println(age + "��");
	}//useAge

	public static void main(String[] args) {
	
		
	}

}
