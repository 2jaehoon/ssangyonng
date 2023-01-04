package day1227;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.StringTokenizer;

public class Work1226 {
	public StringBuilder bakFileName(String fileName) {
		StringBuilder sb = new StringBuilder(fileName);
		if (fileName.contains(".")) {//. Æ÷ÇÔ½Ã
			sb.deleteCharAt(fileName.indexOf(".")).append("_bak");
		} else {
			sb.append("_bak");
		}
		return sb;
	}

	public String[] csvData(String csvData) {
		StringTokenizer stk = new StringTokenizer(csvData, ",.~ ", false);
//		StringTokenizer stn = "±è°æÅÂ,±è±Ô¹Ì,±èº¸°æ,¸ð¹Î°æ.¹ÚÁøÈ£~¾öÅÂ¿µ,À±»óÁØ À±Áö¿ø.ÀÌ±æÇå,ÀÌ´Ü±º";
		String[] arr = new String[stk.countTokens()];
		
		int i = 0;
		while (stk.hasMoreTokens()) {
			arr[i] = stk.nextToken();
			if (arr[i].charAt(0) == '±è') {
				arr[i]=arr[i].replace('±è', ' ').trim();
				
			} 
			i++;
		} // end while

		return arr;
	}

	public String cal(int num) {
		String str = "";
		Date date = new Date(); 
		switch (num) {
		case 0:
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd EEEE a HH:mm:ss", Locale.KOREA);
			str = sdf.format(date);
			break;
		case 1:
			SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd EEEE a HH:mm:ss", Locale.ENGLISH);
			str = sdf1.format(date);
			break;
		case 2:
			SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd EEEE a HH:mm:ss", Locale.JAPAN);
			str = sdf2.format(date);
			break;
		case 3:
			SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd EEEE a HH:mm:ss", Locale.CANADA);
			str = sdf3.format(date);
			break;
		}
		return str;
	}

}// class
