package day1220;

/**
 * char ������������ �迭 ����
 * @author user
 *
 */
public class UseCharArr {
	
	/**
	 * 1. �Էµ� �޽����� �޾Ƽ� 
	 * 2. ���ڿ��� �ϳ��ϳ� �߶� �迭�� ����
	 * (�迭�� ���ڿ��� ���� -> ���ڿ��� ���̰� �ٸ��� -> �迭�� ���̰� �ٸ���. )
	 * 3. �迭�� ���. �ٸ� �迭�� �ٸ��� char�迭���� ����ϸ� ���ڵ��� ���� �ּҺ��� ���ּұ��� ����Ǿ� ��µȴ�.
	 * 4. �Էµ� �޼����� ���ٸ� hello��
	 * @param msg
	 */
	public void useArr(String msg) {
		//1. ����) ��������[] �迭�� = null;
		char[] arr = null;
		//�Էµ� ���ڿ��� �����ϴ� ��츸 �迭�� �����ؼ� ���.(numm�ƴϰų� empty�� �ƴѰ��)�迭�� �����Ͽ� ���
		if(msg != null && !msg.equals("")) { //��ü�� �����Ǿ���?
			//2. ���� ) �迭�� = new ��������[���� ����];
			arr = new char[msg.length()];
			//3. �� �Ҵ�
			for (int i = 0; i < msg.length(); i++ ) {
				arr[i] = msg.charAt(i);
			}
		}else {
			arr = new char[] {'h', 'e', 'l', 'l', 'o' };
		}//end if
		//4. ���
		System.out.println(arr);
		for (int i = arr.length-1; i > -1; i-- ) {
			System.out.print(arr[i]);
		}
		System.out.println();
	}//useArr

	public static void main(String[] args) {
		//1. ��üȭ
		UseCharArr uca = new UseCharArr();
		//2. ������ ��ü�� ����� method ȣ��
		String msg = "������ ȭ���� �Դϴ�.";//12����
		uca.useArr(msg);
		msg = "Java�� �Ϻ��� ��ü������";//16����
		uca.useArr(msg);

		String str = "";//empty = > �ʱ�ȭ , ���ڿ� ������� �ּҴ� �޾����� ���� ����!! => ���Ұ� => �޽�� ȣ���� ����
		uca.useArr(str);
		String str1 = null; // �ʱ�ȭ heap�� �ּҰ� ����!!! => ���Ұ� => �޼ҵ� ȣ��Ұ�
		uca.useArr(str1);
	}//main

}//class
