package day1226;

import java.util.Arrays;

//ctrl shift o  임포트 하는 것만 정리
/**
 * 일을 제공하는 클래스
 * 
 * @author user
 *
 */
public class Work1223 {

	public char[] tempPassword1() {
		char[] password = new char[8];// 8개 방을 가진 char[] 생성
		int index = 0;
		// 비밀번호가 채워지지 않으면 채워질 때 까지 반복 > 8번까지만 반복시킬 수 있게
		while (index != password.length) {// password[]가 조건에 맞게 채워질때까지
			char j = (char) (Math.random() * 123);
			// password에 들어갈 조건//false일경우 처음부터 다시 반복
			if ((j >= '0' && j <= '9') || (j >= 'A' && j <= 'Z') || (j >= 'a' && j <= 'z')) {
				password[index] = j;
				index++;
			} // if
		} // while
		return password;
	}

	public char[] tempPassword2() {
		String str = "abcdefghijklnmopqrstuvwxyzABCDEFGHIJKLNMOPQRSTUVWXYZ0123456789";
		char[] password = new char[8];// 8개 방을 가진 char[] 생성
		// 비교없이 문자열을 뽑을 수 있기 떄문
		for (int i = 0; i < password.length; i++) {
			password[i] = str.charAt((int) (Math.random() * str.length()));
		} // for

		return password;
	}

	public int[][] lotto(int i) {

		int[][] lotto = new int[i][6];// 입력된 i 만큼의 행 6개의 열을 가지는 이차원배열

		for (int j = 0; j < i; j++) {// 입력된 게임 수만큼 반복하는 for
			for (int k = 0; k < lotto[j].length; k++) {// 6개의 숫자 생성
				lotto[j][k] = (int) (Math.random() * 45 + 1);// 각 방에 1부터 45사이의 숫자 입력
				for (int t = 0; t < k; t++) {// 중복 제거 코드
					if (lotto[j][k] == lotto[j][t]) {
						k--;
					} // if
				} // for
			} // for
		} // for
		for (int j = 0; j < i; j++) {// 오름차순 정렬하기
			Arrays.sort(lotto[j]);
		}
		return lotto;
	}// lotto

	public void lotto1(int game) {
		if (!(game > 0 && game < 6)) {// 1~5사이의 숫자가 아니면 메서드 종료
			System.out.println("1~5사이의 정수를 입력해 주세요");
		} else {
			for (int g = 0; g < game; g++) {
				System.out.print(g + 1 + "번\t");
				int i = 0;
				int[] ball = new int[45];
				int[] lotto = new int[6];
				for (i = 0; i < ball.length; i++) {// ball[]에 1~45 숫자를 넣어준다
					ball[i] = i + 1;
				} // for
				int temp = 0;// 두 자릿수를 섞을 변수
				int j = 0;// 난수를 제공받을 변수
				for (i = 0; i < 6; i++) {// 열의 수만큼 반복 6번
					j = (int) (Math.random() * 45);// 0~44까지의 랜덤한 값을 얻는다.
					// 랜덤한 인덱스를 받아 0번~5번 인덱스의 수를 교체
					temp = ball[i];
					ball[i] = ball[j];
					ball[j] = temp;
				} // for
				for (i = 0; i < 6; i++) {// 정렬을 위해 6개의 방을 가진 배열에 값 할당
					lotto[i] = ball[i];
				} // for
				Arrays.sort(lotto);// 정렬
				for (i = 0; i < 6; i++) {// 출력
					System.out.print(lotto[i] + " ");
				} // for
				System.out.println();// 줄바꿈
			} // for
		} // else
	}// lotto1

}
