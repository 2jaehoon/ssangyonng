package day1228;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import javax.swing.JOptionPane;

/**
 * 1. 이름, 자바점수, 오라클 점수가 ,사용하여 입력되면 WorkVO에 입력값을 넣고, WorkVO객체를 List에 추가하는 작업을 할 것
 * 2. 출력이 입력되면 List에 들어있는 값을 모두 console에 모두 출력 //getter method 이름 자바점수 오라클점수 총점
 * 김규미 100 92 xx 김경태 98 96 xxx 3. y나 Y가 입력되면 출력하지 않고 종료
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
			name = JOptionPane.showInputDialog("이름, 자바점수, 오라클 점수를 입력\n \"출력\"을 입력하시면 출력합니다.\n 그만 두실려면 Y | y를 입력해주세요.");

			if (name != null) {
				if (name.contains(",")) {
					System.out.println("-----------------------------------------");
					System.out.println("이름\t\t자바점수\t\t오라클점수\t");
					System.out.println("-----------------------------------------");
					nameArr = name.split(",");
					wv.setName(nameArr[0]);
					wv.setJava(Integer.valueOf(nameArr[1]));
					wv.setOracle(Integer.valueOf(nameArr[2]));
					
//					String name2 = "";
//					String[] nameArr2 = new String[3];
//								name2 = JOptionPane.showInputDialog("이름, 자바점수, 오라클 점수를 입력\n \"출력\"을 입력하시면 출력합니다.\n 그만 두실려면 Y | y를 입력해주세요.");
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
					put = JOptionPane.showInputDialog("\"출력\"<<을 써라고 했다");
					switch(put) {
					case "출력":
					System.out.print(w1.getName() + "\t\t");
					System.out.print(w1.getJava() + "\t\t");
					System.out.print(w1.getOracle() + "\t\t");
					}

				}
				System.out.println();
				exitFlag = name.toLowerCase().equals("y");
			} // end if

		} while (!exitFlag);
		System.out.println("사용해 주셔서 ㄳ");

	}// main

}// class
