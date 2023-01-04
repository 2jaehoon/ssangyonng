package day1229;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class lotto {
	public lotto() {
		Set<String> set= new HashSet<String>();	

		set.add(String.valueOf((int)(Math.random()*45)+1));
		set.add(String.valueOf((int)(Math.random()*45)+1));
		set.add(String.valueOf((int)(Math.random()*45)+1));
		set.add(String.valueOf((int)(Math.random()*45)+1));
		set.add(String.valueOf((int)(Math.random()*45)+1));
		set.add(String.valueOf((int)(Math.random()*45)+1));

		
		String[] temp = new String[6];
		set.toArray(temp);
		
		for(String str : temp) {
			System.out.print(str + " ");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new lotto();
	}

}
