package day1228;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import javax.swing.JOptionPane;

/**
 * 1. �̸�, �ڹ�����, ����Ŭ ������ ,����Ͽ� �ԷµǸ� WorkVO�� �Է°��� �ְ�, WorkVO��ü�� List�� �߰��ϴ� �۾��� �� ��
 * 2. ����� �ԷµǸ� List�� ����ִ� ���� ��� console�� ��� ��� //getter method �̸� �ڹ����� ����Ŭ���� ����
 * ��Թ� 100 92 xx ����� 98 96 xxx 3. y�� Y�� �ԷµǸ� ������� �ʰ� ����
 * 
 * @author user
 *
 */
public class Test {

	public static void main(String[] args) {

//		new Test();
		String name = "";
		String[] nameArr = new String[3];
		WorkVO wv = new WorkVO();
		boolean exitFlag = false;
		do {
			name = JOptionPane.showInputDialog("�̸�, �ڹ�����, ����Ŭ ������ �Է�\n \"���\"�� �Է��Ͻø� ����մϴ�.\n �׸� �νǷ��� Y | y�� �Է����ּ���.");

			if (name != null) {
				if (name.contains(",")) {
					System.out.println("-----------------------------------------");
					System.out.println("�̸�\t\t�ڹ�����\t\t����Ŭ����\t");
					System.out.println("-----------------------------------------");
					nameArr = name.split(",");
					wv.setName(nameArr[0]);
					wv.setJava(Integer.valueOf(nameArr[1]));
					wv.setOracle(Integer.valueOf(nameArr[2]));
					
//					String name2 = "";
//					String[] nameArr2 = new String[3];
//								name2 = JOptionPane.showInputDialog("�̸�, �ڹ�����, ����Ŭ ������ �Է�\n \"���\"�� �Է��Ͻø� ����մϴ�.\n �׸� �νǷ��� Y | y�� �Է����ּ���.");
//								nameArr2 = name2.split(",");
//								WorkVO wv1 = new WorkVO();
//								wv1.setName(nameArr[0]);
//								wv1.setJava(Integer.valueOf(nameArr[1]));
//								wv1.setOracle(Integer.valueOf(nameArr[2]));
//								wv_list.add(wv1);
//								WorkVO w2 = wv_list.get(1);
//								System.out.print(w2.getName() + "\t\t");
//								System.out.print(w2.getJava() + "\t\t");
//								System.out.print(w2.getOracle() + "\t\t");
								
					
			
					List<WorkVO> wv_list = new ArrayList<WorkVO>();
					wv_list.add(wv);
					WorkVO w1 = wv_list.get(0);
					
					String put = "";
					put = JOptionPane.showInputDialog("\"���\"<<�� ���� �ߴ�");
					switch(put) {
					case "���":
					System.out.print(w1.getName() + "\t\t");
					System.out.print(w1.getJava() + "\t\t");
					System.out.print(w1.getOracle() + "\t\t");
					}

				}
				System.out.println();
				exitFlag = name.toLowerCase().equals("y");
			} // end if

		} while (!exitFlag);
		System.out.println("����� �ּż� ��");

	}// main

}// class
