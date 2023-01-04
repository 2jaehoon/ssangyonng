package day1229;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class StudentProcess {
	static final int IN = 3;
	private List<WorkVO> list = new ArrayList<WorkVO>();

	public StudentProcess() {
		list = new ArrayList<WorkVO>();
	}

	/**
	 * �л��� ������ �Է¹޾� list�� �߰�
	 * 
	 * @param wVO
	 */
	public boolean inputStudentinfo(String data) {
		boolean flag = false;

		String[] temp = data.split(","); // �޸��� �������� ���ڿ� ������
		switch (temp.length) {
		case IN: { // �Է°�(String)�� ,�� 2����?
			WorkVO wv = new WorkVO(temp[0], Integer.parseInt(temp[1]), Integer.parseInt(temp[2])); // ��ü ����
			list.add(wv); // list�� ��ü ���
			flag = true;// �Է¼���
		} // end switch
		}
		return flag;
	}

	public void PrintStudentList() {
		WorkVO wv = null; // WorkVO ��ü�� �Ҵ��� ��ü�� �ʱ�ȭ

		// 2�� ��¿� WorkVO ��ü�� �̸�, �ڹ� ����, ����Ŭ ������ ������ ���� �ʱ�ȭ
		String name = "";
		int java = 0;
		int oracle = 0;

		System.out.println("�̸�\t�ڹ�\t����Ŭ\t����");
		for (int i = 0; i < list.size(); i++) {// list�� ù��~�������
			wv = list.get(i); // ��ü ��

			name = wv.getName(); // �� ��ü�� �̸�, �ڹ�����, ����Ŭ ���� ���
			java = wv.getJava();
			oracle = wv.getOracle();

			// ����ϱ�
			System.out.println(name + "\t" + java + "\t" + oracle + "\t" + (java + oracle));
		} // WorkVO ��ü�� �̸�,�ڹ�����,����Ŭ���� + ���� ����� ���� for��
	}

	public void inputMenu() {
		String input = ""; // �Է°��� ������ ���� �ʱ�ȭ
		boolean exitFlag = false; // While�� �ݺ��� �����ϱ� ���� ���� �ʱ�ȭ
		String msg = "";
		do {
			input = JOptionPane.showInputDialog("�̸�,�ڹ�����,����Ŭ ������ �Է��ϼ���\n�׸��ν÷��� Y �Ǵ� y�� �Է����ּ���");

			if (input != null) { // ��Ҹ� ������ �ʾҴٸ�
				exitFlag = input.toLowerCase().equals("y");
			} else { // ��Ҹ� �����ٸ�
				break;
			}
			
			if(!exitFlag) {
			msg="�Էµ������� ������ Ȯ�����ּ���.";
			if(inputStudentinfo(input)){
				msg="�л��� ������ �ԷµǾ����ϴ�.";
			}
				JOptionPane.showMessageDialog(null, msg);
			}
			

			if (input.equals("���")) {
				PrintStudentList();
				break;
			} // ����� ���� if��

		} while (!exitFlag);
		System.out.println("������ּż� ��");
	}

	public static void main(String[] args) {

		System.out.println("�ý��� ����");

	}// main

}// class
