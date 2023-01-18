package day0105;

import java.awt.FileDialog;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

public class JavaMemoEvt extends WindowAdapter implements ActionListener {
	private JavaMemo jm;

	public JavaMemoEvt(JavaMemo jm) {
		this.jm = jm;
	}// JavaMemoEvt

	@Override
	public void windowClosing(WindowEvent we) {
		
		
		
		
		
		
		
		
		
		
		
		
		jm.dispose();
	}// windowClosing

	public void clearNote() throws IOException {
		if (jm.jtaNote.getText().trim().equals("")) {
			jm.getjtaNote().setText("");
		} else if (jm.getTitle().contains("txt")) {
			int select = JOptionPane.showConfirmDialog(null, "변경되었니??", "선택하세요", JOptionPane.YES_NO_OPTION);
			switch (select) {
			case JOptionPane.OK_OPTION:
				int select2 = JOptionPane.showConfirmDialog(null, "저장하시겠습니까?", "선택하세요", JOptionPane.YES_NO_OPTION);
				switch (select2) {
				case JOptionPane.OK_OPTION:
					fileSave();
				case JOptionPane.NO_OPTION:
					jm.getjtaNote().setText("");
				}
			case JOptionPane.NO_OPTION:
				jm.getjtaNote().setText("");
			}
		} else {
			int select = JOptionPane.showConfirmDialog(null, "저장하시겠습니까?", "선택하세요", JOptionPane.YES_NO_OPTION);

			switch (select) {
			case JOptionPane.OK_OPTION:
				if (jm.getTitle().equals("메모장 짭퉁")) {
					fileNewSave();
				} else {
					fileSave();
				}
				jm.jtaNote.setText("");
				break;
			case JOptionPane.NO_OPTION:
				jm.jtaNote.setText("");

			}// end switch

		} // end else

	}// clearNote

	public void fileOpen() throws IOException {
		FileDialog fdOpen = new FileDialog(jm, "파일열기", FileDialog.LOAD);
		fdOpen.setVisible(true);

		String path = fdOpen.getDirectory();
		String name = fdOpen.getFile();
		if (path != null) {
			jm.setTitle(path + name);// 타이틀바에 파일명을 설정
			// 파일 생성
			File file = new File(path + name);
			if (file.exists()) {
				BufferedReader br = null;
				try {
					// 스트림을 사용한 연결
					br = new BufferedReader(new FileReader(file));
					// 줄 단위로 읽기
					String data = "";
					jm.getjtaNote().setText("");
					while ((data = br.readLine()) != null) {// \n전까지 읽어 들인다,
						jm.getjtaNote().append(data);
						jm.getjtaNote().append("\n");
//						System.out.print(jm.jtaNote.getText()); 디버깅용
						if (jm.jtaNote.getText().contains("Font")) {
							String fontName = jm.jtaNote.getText().substring(
									jm.jtaNote.getText().indexOf("=", jm.jtaNote.getText().indexOf("=") + 1) + 1,
									jm.jtaNote.getText().indexOf(",", jm.jtaNote.getText().indexOf(",") + 1));
//							System.out.println(fontName); 디버깅용
							String fontStyle = jm.jtaNote.getText().substring(
									jm.jtaNote.getText().indexOf("=", jm.jtaNote.getText().indexOf("=") + 15) + 1,
									jm.jtaNote.getText().indexOf(",", jm.jtaNote.getText().indexOf(",") + 15));
//							System.out.println(fontStyle); 디버깅용
							String fontSize = jm.jtaNote.getText().substring(
									jm.jtaNote.getText().lastIndexOf("=", jm.jtaNote.getText().length()) + 1,
									jm.jtaNote.getText().lastIndexOf("]", jm.jtaNote.getText().length()));
//							System.out.println(fontSize);
							int value = 0;
							if (fontStyle.equals("plain")) {
								value = Font.PLAIN;
							} // end if
							if (fontStyle.equals("bold")) {
								value = Font.BOLD;
							} // end if
							if (fontStyle.equals("italic")) {
								value = Font.ITALIC;
							} // end if
							if (fontStyle.equals("bolditalic")) {
								value = Font.ITALIC | Font.BOLD;
							} // end if

							Font font = new Font(fontName, value, Integer.valueOf(fontSize));
							jm.jtaNote.setFont(font);

						} else {
							jm.jtaNote.setFont(new Font("돋움", Font.PLAIN, 12));
						} // end else

//						jm.jtaNote.setFont(jm.jtaNote.getText());
						// 객체오브젝트 ㅇ리이용

					} // end while

				} finally {
					if (br != null) {
						br.close();
					}
//					directory();
				} // end finally
			} else {
				JOptionPane.showMessageDialog(null, file + "삐삐삐삑");

			} // end if
		} // end if

	}// fileOpen

	public void directory() {

		String input = "";
		input = JOptionPane.showInputDialog("경로명을 입력하세요");
		File directory = new File(input);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm:ss EEEE");
		if (directory.isDirectory()) {

			File[] childs = directory.listFiles();
			// childs.length가 해당 폴더 안의 파일+하위폴더 갯수
			if (childs.length == 0) {
				System.out.println("파일 또는 폴더가 존재하지 않습니다.");
			} // end if
			System.out.printf("%-30s %-50s %-30s %-30s\n", "파일명", "수정한 날짜", "유형", "크기");
			for (int i = 0; i < childs.length; i++) {

				System.out.printf("%-30s", childs[i].getName());
				System.out.printf("%-50s", sdf.format(childs[i].lastModified()));
				if (childs[i].isDirectory() == true) {
					System.out.printf("%-30s", "폴더");
				} else {
					System.out.printf("%-30s", "파일");
				} // end else
				System.out.printf("%-30s\n", childs[i].length());

			} // end for

		} // end if

	}

	public void fileNewSave() throws IOException {
		FileDialog fdSave = new FileDialog(jm, "파일 저장", FileDialog.SAVE);
		// 윈도우 컴포넌트는 setVisible을 해야 사용 가능
		fdSave.setVisible(true);

		// 디렉토리명. 파일명 얻기
		String path = fdSave.getDirectory();
		String name = fdSave.getFile();

		if (path != null) {
			jm.setTitle("다른이름으로 파일 저장 " + path + name);
			File file = new File(path + name);
			BufferedWriter bw = null;
			try {
				bw = new BufferedWriter(new FileWriter(path + name));
				String msg = jm.getjtaNote().getText();
				bw.write(msg);

				bw.flush();
			} finally {
				if (bw != null) {
//					br.close();
					bw.close();

				}
			}

		} // end if
	}// fileSave

	public void fileSave() throws IOException {
		File file = new File(jm.getTitle());

		boolean createFlag = false;
		if (file.exists()) {
			int select = JOptionPane.showConfirmDialog(null, file + "을 덮어 쓰시겠습니까?", "선택하세요", JOptionPane.YES_NO_OPTION);

			switch (select) {
			case JOptionPane.OK_OPTION:
				createFlag = false;
				break;
			case JOptionPane.NO_OPTION:
				createFlag = true;
			}// end switch

		} // end if

		BufferedWriter bw = null;
		try {
			// 스트림 생성
			if (!createFlag) {
				bw = new BufferedWriter(new FileWriter(file));
				String msg = jm.getjtaNote().getText();
				bw.write(msg);

				bw.flush();
			}

		} finally {
			if (bw != null) {
				bw.close();
			}

		}

	}// fileSave

	public void memoClose() {
		jm.dispose();
	}// memoClose

	public void font() {
		new JavaMemoFont(jm);
	}// font

	public void help() {
		new MemoInfo(jm);
	}// help

	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == jm.getJmiNew()) {
			// getJmiNew이 눌렸을 때 제공할 코드
			// jta의 텍스트 값을 초기화
			try {
				clearNote();

			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		if (ae.getSource() == jm.getJmiClose()) {
			memoClose();
		}
		if (ae.getSource() == jm.getJmiOpen()) {
			try {
				fileOpen();
			} catch (IOException e) {
				System.out.println("제대로 눌러주세유");
				e.printStackTrace();
			}
		}
		if (ae.getSource() == jm.getJmiNewSave()) {
			try {
				fileNewSave();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		if (ae.getSource() == jm.getJmiSave()) {
			try {
				fileSave();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		if (ae.getSource() == jm.getJmiFont()) {
			font();
		}

		if (ae.getSource() == jm.getjmiHelp()) {
			help();
		}

	}// actionPerformed

}// JavaMemoEvt
