package day1226;

import java.util.Arrays;

//ctrl shift o  ����Ʈ �ϴ� �͸� ����
/**
 * ���� �����ϴ� Ŭ����
 * 
 * @author user
 *
 */
public class Work1223 {

	public char[] tempPassword1() {
		char[] password = new char[8];// 8�� ���� ���� char[] ����
		int index = 0;
		// ��й�ȣ�� ä������ ������ ä���� �� ���� �ݺ� > 8�������� �ݺ���ų �� �ְ�
		while (index != password.length) {// password[]�� ���ǿ� �°� ä����������
			char j = (char) (Math.random() * 123);
			// password�� �� ����//false�ϰ�� ó������ �ٽ� �ݺ�
			if ((j >= '0' && j <= '9') || (j >= 'A' && j <= 'Z') || (j >= 'a' && j <= 'z')) {
				password[index] = j;
				index++;
			} // if
		} // while
		return password;
	}

	public char[] tempPassword2() {
		String str = "abcdefghijklnmopqrstuvwxyzABCDEFGHIJKLNMOPQRSTUVWXYZ0123456789";
		char[] password = new char[8];// 8�� ���� ���� char[] ����
		// �񱳾��� ���ڿ��� ���� �� �ֱ� ����
		for (int i = 0; i < password.length; i++) {
			password[i] = str.charAt((int) (Math.random() * str.length()));
		} // for

		return password;
	}

	public int[][] lotto(int i) {

		int[][] lotto = new int[i][6];// �Էµ� i ��ŭ�� �� 6���� ���� ������ �������迭

		for (int j = 0; j < i; j++) {// �Էµ� ���� ����ŭ �ݺ��ϴ� for
			for (int k = 0; k < lotto[j].length; k++) {// 6���� ���� ����
				lotto[j][k] = (int) (Math.random() * 45 + 1);// �� �濡 1���� 45������ ���� �Է�
				for (int t = 0; t < k; t++) {// �ߺ� ���� �ڵ�
					if (lotto[j][k] == lotto[j][t]) {
						k--;
					} // if
				} // for
			} // for
		} // for
		for (int j = 0; j < i; j++) {// �������� �����ϱ�
			Arrays.sort(lotto[j]);
		}
		return lotto;
	}// lotto

	public void lotto1(int game) {
		if (!(game > 0 && game < 6)) {// 1~5������ ���ڰ� �ƴϸ� �޼��� ����
			System.out.println("1~5������ ������ �Է��� �ּ���");
		} else {
			for (int g = 0; g < game; g++) {
				System.out.print(g + 1 + "��\t");
				int i = 0;
				int[] ball = new int[45];
				int[] lotto = new int[6];
				for (i = 0; i < ball.length; i++) {// ball[]�� 1~45 ���ڸ� �־��ش�
					ball[i] = i + 1;
				} // for
				int temp = 0;// �� �ڸ����� ���� ����
				int j = 0;// ������ �������� ����
				for (i = 0; i < 6; i++) {// ���� ����ŭ �ݺ� 6��
					j = (int) (Math.random() * 45);// 0~44������ ������ ���� ��´�.
					// ������ �ε����� �޾� 0��~5�� �ε����� ���� ��ü
					temp = ball[i];
					ball[i] = ball[j];
					ball[j] = temp;
				} // for
				for (i = 0; i < 6; i++) {// ������ ���� 6���� ���� ���� �迭�� �� �Ҵ�
					lotto[i] = ball[i];
				} // for
				Arrays.sort(lotto);// ����
				for (i = 0; i < 6; i++) {// ���
					System.out.print(lotto[i] + " ");
				} // for
				System.out.println();// �ٹٲ�
			} // for
		} // else
	}// lotto1

}
