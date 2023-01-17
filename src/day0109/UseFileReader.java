package day0109;

import java.awt.FileDialog;
import java.awt.Frame;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;

public class UseFileReader {
	public UseFileReader() throws IOException {

		Frame f = new Frame();
		FileDialog fd = new FileDialog(f, "파일열기", FileDialog.LOAD);
		fd.setVisible(true);
		String path = fd.getDirectory();
		String name = fd.getFile();
		if (path != null) {
			// 1. File 생성
			File file = new File(path + name);
			if (file.exists()) {
				BufferedReader br = null;
				try {
					// 2. Stream을 사용한 연결
					br = new BufferedReader(new FileReader(file));
					// 3. 줄 단위로 읽기 
					String data = "";
					while ( (data = br.readLine()) != null) { //\n전까지 읽어 들인다.
						System.out.println(data);
					}//end while
				} finally {
					if (br != null) {
						//4. 연결끊기
						br.close();
					}
				}
			} else {
				JOptionPane.showMessageDialog(null, file + "");
			} // end if
		} // end if
		f.dispose();
	}// UseFileReader

	public static void main(String[] args) {
		try {
			new UseFileReader();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}// main

}// class
