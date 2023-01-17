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
		super("���Ϻ���");
		JButton jbtn = new JButton("���� ����");
		jlblOutput = new JLabel("���â");
		jlblOutput.setBorder(new TitledBorder("���"));
		
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
//			fileCopy16(); //���� ������ ���� ����(txt, java, html, css, js, json, xml)�� ���� ����
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		

	}
	
	public void fileCopy8() throws IOException{
		FileDialog fdOpen = new FileDialog(this, "������ ���� ����", FileDialog.LOAD);
		fdOpen.setVisible(true);
				
		String path = fdOpen.getDirectory();
		String fileName  = fdOpen.getFile();
		
		if(path != null) { //������ ������ ��쿡�� ����ȴ�.
			File originalFile = new File(path+fileName);
			//�������ϸ�_copy.Ȯ���ڷ� ���ϸ� ������.
			StringBuilder copyName = new StringBuilder(originalFile.getCanonicalPath());
			copyName.insert(copyName.lastIndexOf("."),"_copy");
			System.out.println(copyName);
			
			File copyFile = new File(copyName.toString());
			
			FileInputStream fis = null;
			FileOutputStream fos = null;
			
			try {
				//1. ��Ʈ�� ����
				fis = new FileInputStream(originalFile);
				fos = new FileOutputStream(copyFile);
				
				// 2. ���Ͽ��� �о����
				byte[] readData = new byte[512];
				int bitCnt = 0;
				while( (bitCnt = fis.read(readData)) != -1 ) {
//					fos.write(readData); //�о�帰 ���� ��Ʈ���� ���
					fos.write(readData,0,bitCnt);
				}//end while
				
				//��Ʈ���� ���� ���� ����
				fos.flush();
				
				jlblOutput.setText(copyFile.toString()+"���� ������ ����Ǿ����ϴ�.");
				
				
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
	 * 16��Ʈ ��Ʈ���� .txt�� ���ϸ� ���� �ȴ�.
	 * @throws IOException
	 */
	public void fileCopy16() throws IOException{ //�̹����� �� �ȴ�.
		FileDialog fdOpen = new FileDialog(this, "������ ���� ����", FileDialog.LOAD);
		fdOpen.setVisible(true);
				
		String path = fdOpen.getDirectory();
		String fileName  = fdOpen.getFile();
		
		if(path != null) { //������ ������ ��쿡�� ����ȴ�.
			File originalFile = new File(path+fileName);
			//�������ϸ�_copy.Ȯ���ڷ� ���ϸ� ������.
			StringBuilder copyName = new StringBuilder(originalFile.getCanonicalPath());
			copyName.insert(copyName.lastIndexOf("."),"_copy");
			System.out.println(copyName);
			
			File copyFile = new File(copyName.toString());
			
			BufferedReader br = null;
			BufferedWriter bw = null;
			
			try {
				//1. ��Ʈ�� ����
				br = new BufferedReader(new FileReader(originalFile));
				bw = new BufferedWriter(new FileWriter(copyFile));
				
				// 2. ���Ͽ��� �о����
				String readData = "";
				while( (readData = br.readLine()) != null ) {
					bw.write(readData + "\n"); //�о�帰 ���� ��Ʈ���� ���
				}//end while
				
				//��Ʈ���� ���� ���� ����
				bw.flush();
				
				jlblOutput.setText(copyFile.toString()+"���� ������ ����Ǿ����ϴ�.");
				
				
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
