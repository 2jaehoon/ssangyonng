package day0110;

import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class FileCopy extends JFrame implements ActionListener {
	private JLabel jlblOutput;
	
	
	public FileCopy() {
		super("파일복사");
		JButton jbtn = new JButton("파일 선택");
		jlblOutput = new JLabel("결과창");
		jlblOutput.setBorder(new TitledBorder("결과"));
		
		jbtn.addActionListener(this);
		
		JPanel jpNorth = new JPanel();
		jpNorth.add(jbtn);
		
		add("North", jpNorth);
		add("Center", jlblOutput);
		
		setBounds(100, 100, 500, 400);
		setVisible(true);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent we) {
				dispose();
			}//windowClosing
		});
	}// FileCopy

	@Override
	public void actionPerformed(ActionEvent ae) {
		try {
			fileCopy8();
//			fileCopy16(); //독자 포멧이 없는 파일(txt, java, html, css, js, json, xml)만 복사 가능
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		

	}
	
	public void fileCopy8() throws IOException{
		FileDialog fdOpen = new FileDialog(this, "복사할 파일 선택", FileDialog.LOAD);
		fdOpen.setVisible(true);
				
		String path = fdOpen.getDirectory();
		String fileName  = fdOpen.getFile();
		
		if(path != null) { //파일을 선택한 경우에만 복사된다.
			File originalFile = new File(path+fileName);
			//원본파일명_copy.확장자로 파일명 만들자.
			StringBuilder copyName = new StringBuilder(originalFile.getCanonicalPath());
			copyName.insert(copyName.lastIndexOf("."),"_copy");
			System.out.println(copyName);
			
			File copyFile = new File(copyName.toString());
			
			FileInputStream fis = null;
			FileOutputStream fos = null;
			
			try {
				//1. 스트림 연결
				fis = new FileInputStream(originalFile);
				fos = new FileOutputStream(copyFile);
				
				// 2. 파일에서 읽어들임
				byte[] readData = new byte[512];
				int bitCnt = 0;
				while( (bitCnt = fis.read(readData)) != -1 ) {
//					fos.write(readData); //읽어드린 내용 스트림에 기록
					fos.write(readData,0,bitCnt);
				}//end while
				
				//스트림에 남은 내용 분출
				fos.flush();
				
				jlblOutput.setText(copyFile.toString()+"으로 파일이 복사되었습니다.");
				
				
			}finally {
				if(fis != null) {
					fis.close();
				}//end if
				if(fos != null) {
					fos.close();
				}//end if
			}//end catch
			
			
		}//end if
		
		
	}//fileCopy
	
	
	/**
	 * 16비트 스트림은 .txt인 파일만 복사 된다.
	 * @throws IOException
	 */
	public void fileCopy16() throws IOException{ //이미지는 안 된다.
		FileDialog fdOpen = new FileDialog(this, "복사할 파일 선택", FileDialog.LOAD);
		fdOpen.setVisible(true);
				
		String path = fdOpen.getDirectory();
		String fileName  = fdOpen.getFile();
		
		if(path != null) { //파일을 선택한 경우에만 복사된다.
			File originalFile = new File(path+fileName);
			//원본파일명_copy.확장자로 파일명 만들자.
			StringBuilder copyName = new StringBuilder(originalFile.getCanonicalPath());
			copyName.insert(copyName.lastIndexOf("."),"_copy");
			System.out.println(copyName);
			
			File copyFile = new File(copyName.toString());
			
			BufferedReader br = null;
			BufferedWriter bw = null;
			
			try {
				//1. 스트림 연결
				br = new BufferedReader(new FileReader(originalFile));
				bw = new BufferedWriter(new FileWriter(copyFile));
				
				// 2. 파일에서 읽어들임
				String readData = "";
				while( (readData = br.readLine()) != null ) {
					bw.write(readData + "\n"); //읽어드린 내용 스트림에 기록
				}//end while
				
				//스트림에 남은 내용 분출
				bw.flush();
				
				jlblOutput.setText(copyFile.toString()+"으로 파일이 복사되었습니다.");
				
				
			}finally {
				if(br != null) {
					br.close();
				}//end if
				if(bw != null) {
					bw.close();
				}//end if
			}//end catch
			
			
		}//end if
		
		
	}//fileCopy16
	
	

	public static void main(String[] args) {
		new FileCopy();
	}

}
