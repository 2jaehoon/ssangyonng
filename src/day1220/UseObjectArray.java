package day1220;

/**
 * ��ü�迭 => �� �ϳ��� ���� ���� ���� �����ؾ��� ��
 * 
 * @author user
 *
 */
public class UseObjectArray {
	public UseObjectArray() {
		// 1. ����)
		DataVO[] objectArr = null;
		// 2. ���� ��� ���� ���� null�� �ʱ�ȭ
		objectArr = new DataVO[4];
		// 3. �� �Ҵ�
		DataVO dv= new DataVO("��Թ�", "����� ������ ���ʵ�", 21);
		//3-1���� ��ü�� �����ϰ�
		objectArr[0] = new DataVO();
		objectArr[1] = dv; //������ ��ü�� ���� �� �ִ�.
		objectArr[2] = new DataVO("�躸��", "��⵵ ������ �д籸", 22);
		objectArr[3] = new DataVO("��ΰ�", "���ֽ� �̵���", 22);
		//3-2 ���� ������ ��ü�� setter method�� ȣ���Ͽ� ���� �ִ´�.
		objectArr[0].setName("�����");
		objectArr[0].setAddr("����� ������ ���ﵿ");
		objectArr[0].setAge(20);
		// 4. �� ���
		//4-1 ���� ��ü�� ���
		//4-2 getter method�� ȣ���Ͽ� ���� ��´�.
		DataVO temp = null;
		for(int i=0; i< objectArr.length;i++) {
			temp=objectArr[i];
//			System.out.println(objectArr[i]);
			System.out.printf("�̸� : %s �ּ� : %s ���� : %d\n",objectArr[i].getName(),objectArr[i].getAddr(),objectArr[i].getAge());
		}//end for
	}// UseObjectArray

	public static void main(String[] args) {
		new UseObjectArray();
	}// main

}// class
