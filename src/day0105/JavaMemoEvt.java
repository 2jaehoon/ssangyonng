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
			int select = JOptionPane.showConfirmDialog(null, "����Ǿ���??", "�����ϼ���", JOptionPane.YES_NO_OPTION);
			switch (select) {
			case JOptionPane.OK_OPTION:
				int select2 = JOptionPane.showConfirmDialog(null, "�����Ͻðڽ��ϱ�?", "�����ϼ���", JOptionPane.YES_NO_OPTION);
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
			int select = JOptionPane.showConfirmDialog(null, "�����Ͻðڽ��ϱ�?", "�����ϼ���", JOptionPane.YES_NO_OPTION);

			switch (select) {
			case JOptionPane.OK_OPTION:
				if (jm.getTitle().equals("�޸��� ¬��")) {
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
		FileDialog fdOpen = new FileDialog(jm, "���Ͽ���", FileDialog.LOAD);
		fdOpen.setVisible(true);

		String path = fdOpen.getDirectory();
		String name = fdOpen.getFile();
		if (path != null) {
			jm.setTitle(path + name);// Ÿ��Ʋ�ٿ� ���ϸ��� ����
			// ���� ����
			File file = new File(path + name);
			if (file.exists()) {
				BufferedReader br = null;
				try {
					// ��Ʈ���� ����� ����
					br = new BufferedReader(new FileReader(file));
					// �� ������ �б�
					String data = "";
					jm.getjtaNote().setText("");
					while ((data = br.readLine()) != null) {// \n������ �о� ���δ�,
						jm.getjtaNote().append(data);
						jm.getjtaNote().append("\n");
//						System.out.print(jm.jtaNote.getText()); ������
						if (jm.jtaNote.getText().contains("Font")) {
							String fontName = jm.jtaNote.getText().substring(
									jm.jtaNote.getText().indexOf("=", jm.jtaNote.getText().indexOf("=") + 1) + 1,
									jm.jtaNote.getText().indexOf(",", jm.jtaNote.getText().indexOf(",") + 1));
//							System.out.println(fontName); ������
							String fontStyle = jm.jtaNote.getText().substring(
									jm.jtaNote.getText().indexOf("=", jm.jtaNote.getText().indexOf("=") + 15) + 1,
									jm.jtaNote.getText().indexOf(",", jm.jtaNote.getText().indexOf(",") + 15));
//							System.out.println(fontStyle); ������
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
							jm.jtaNote.setFont(new Font("����", Font.PLAIN, 12));
						} // end else

//						jm.jtaNote.setFont(jm.jtaNote.getText());
						// ��ü������Ʈ �����̿�

					} // end while

				} finally {
					if (br != null) {
						br.close();
					}
//					directory();
				} // end finally
			} else {
				JOptionPane.showMessageDialog(null, file + "�߻߻߻�");

			} // end if
		} // end if

	}// fileOpen

	public void directory() {

		String input = "";
		input = JOptionPane.showInputDialog("��θ��� �Է��ϼ���");
		File directory = new File(input);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm:ss EEEE");
		if (directory.isDirectory()) {

			File[] childs = directory.listFiles();
			// childs.length�� �ش� ���� ���� ����+�������� ����
			if (childs.length == 0) {
				System.out.println("���� �Ǵ� ������ �������� �ʽ��ϴ�.");
			} // end if
			System.out.printf("%-30s %-50s %-30s %-30s\n", "���ϸ�", "������ ��¥", "����", "ũ��");
			for (int i = 0; i < childs.length; i++) {

				System.out.printf("%-30s", childs[i].getName());
				System.out.printf("%-50s", sdf.format(childs[i].lastModified()));
				if (childs[i].isDirectory() == true) {
					System.out.printf("%-30s", "����");
				} else {
					System.out.printf("%-30s", "����");
				} // end else
				System.out.printf("%-30s\n", childs[i].length());

			} // end for

		} // end if

	}

	public void fileNewSave() throws IOException {
		FileDialog fdSave = new FileDialog(jm, "���� ����", FileDialog.SAVE);
		// ������ ������Ʈ�� setVisible�� �ؾ� ��� ����
		fdSave.setVisible(true);

		// ���丮��. ���ϸ� ���
		String path = fdSave.getDirectory();
		String name = fdSave.getFile();

		if (path != null) {
			jm.setTitle("�ٸ��̸����� ���� ���� " + path + name);
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
			int select = JOptionPane.showConfirmDialog(null, file + "�� ���� ���ðڽ��ϱ�?", "�����ϼ���", JOptionPane.YES_NO_OPTION);

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
			// ��Ʈ�� ����
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
			// getJmiNew�� ������ �� ������ �ڵ�
			// jta�� �ؽ�Ʈ ���� �ʱ�ȭ
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
				System.out.println("����� �����ּ���");
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
