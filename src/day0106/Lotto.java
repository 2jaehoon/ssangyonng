package day0106;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Lotto {
	private int input;

	public void randomLotto() {
		int[] lottonumber = new int[6];
		for (int i = 0; i < lottonumber.length; i++) {
			lottonumber[i] = (int) (Math.random() * 45) + 1;
		} // end for
		for (int i = 0; i < lottonumber.length; i++) {
			System.out.print(lottonumber[i] + " ");
		} // end for
		System.out.println();
		System.out.println("계속하시겠습니까? (Y/N)");
		
	}//randomLotto

	public Lotto() {
		try {
			randomLotto();
			//switch 버전
			a: while (true) {
				input = System.in.read();
				switch (input) {
				case 89: case 121:
					randomLotto();
					break;
				case 78: case 110:
					break a;
				}//end switch
			}//end while

////////////////////////////////////////////////////////////////////////////////////////
			//if 버전
//			while(true) {
//				input = System.in.read();
//				if(input==89||input==121) {
//					randomLotto();
//				}else if(input==78||input==110) {
//					break;
//				}
//			}
///////////////////////////////////////////////////////////////////////////////////////			
		} catch (IOException e) {
			e.printStackTrace();
		}//end catch
	}// lotto
	
	
	

	public static void main(String[] args) {
		new Lotto();
		

	}//main

}//class
