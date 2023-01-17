package day0102;

import java.util.HashMap;

public class asdasd {

	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("이재훈", "1541");//키, 값  키와 값이 2개가 들어간다
		hm.put("오미자", "1234");//키, 값  키와 값이 2개가 들어간다
		hm.put("오미자", "1234");//키, 값  키와 값이 2개가 들어간다
		hm.put("오미자", "1234");//키, 값  키와 값이 2개가 들어간다
		hm.put("이미루", "1234");//키, 값  키와 값이 2개가 들어간다
		hm.put("이미ㅈ루", "1234");//키, 값  키와 값이 2개가 들어간다
		hm.put("이미ㅈ루", "1234");//키, 값  키와 값이 2개가 들어간다
		
		
		String str = "이재훈"; //jtfid.gettext
		String str2 = "1234"; //jtfpw.gettext
		
		System.out.println(hm.containsKey("이미루"));
	}

}
