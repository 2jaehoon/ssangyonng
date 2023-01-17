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
		FileDialog fd = new FileDialog(f, "���Ͽ���", FileDialog.LOAD);
		fd.setVisible(true);
		String path = fd.getDirectory();
		String name = fd.getFile();
		if (path != null) {
			// 1. File ����
			File file = new File(path + name);
			if (file.exists()) {
				BufferedReader br = null;
				try {
					// 2. Stream�� ����� ����
					br = new BufferedReader(new FileReader(file));
					// 3. �� ������ �б� 
					String data = "";
					while ( (data = br.readLine()) != null) { //\n������ �о� ���δ�.
						System.out.println(data);
					}//end while
				} finally {
					if (br != null) {
						//4. �������
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
