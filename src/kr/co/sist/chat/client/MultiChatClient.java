package kr.co.sist.chat.client;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import day0112.SimpleDataServer;
import kr.co.sist.chat.server.ServerHelper;

@SuppressWarnings("serial")
public class MultiChatClient extends JFrame implements ActionListener, Runnable {

	private JTextField jtfServerIp, jtfTalk;
	private JTextField jtfNick;
	private JButton jbtConnectServer, jbtnCapture;
	private JTextArea jtaTalkDisp;

	private Thread connectThread;

	private Socket someClient;
	private DataInputStream disReadStream;
	private DataOutputStream dosWriteStream;
	private JScrollPane jspJtaTalk;
	
	
	

	
	
	public MultiChatClient() {
		super("::::::::::::::::: 채팅클라이언트 :::::::::::::::::::::::::");
		
		
		

		jtfServerIp = new JTextField("211.63.89.", 10);
		jtfNick = new JTextField(10);
		jtfTalk = new JTextField(10);

		jbtConnectServer = new JButton("서버접속");
		jbtnCapture = new JButton("캡처");

		jtaTalkDisp = new JTextArea();
		jtaTalkDisp.setEditable(false);
		jspJtaTalk = new JScrollPane(jtaTalkDisp);

		JPanel jpNorth = new JPanel();
		jpNorth.setBorder(new TitledBorder("접속정보"));
		jpNorth.add(new JLabel("서버ip"));
		jpNorth.add(jtfServerIp);
		jpNorth.add(new JLabel("대화명"));
		jpNorth.add(jtfNick);
		jpNorth.add(jbtConnectServer);
		jpNorth.add(jbtnCapture);

		jspJtaTalk.setBorder(new TitledBorder("대화"));
		jtfTalk.setBorder(new TitledBorder("대화입력"));

		add("North", jpNorth);
		add("Center", jspJtaTalk);
		add("South", jtfTalk);

		jbtConnectServer.addActionListener(this);
		jbtnCapture.addActionListener(this);
		jtfTalk.addActionListener(this);

		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent we) {
				dispose();
			}// windowClosing

			@Override
			public void windowClosed(WindowEvent we) {
				try {
					if (disReadStream != null) {
						disReadStream.close();
					} // end if
					if (dosWriteStream != null) {
						dosWriteStream.close();
					} // end if
					if (someClient != null) {
						someClient.close();
					} // end if
				} catch (IOException ie) {
					ie.printStackTrace();
				} finally {
					System.exit(JFrame.ABORT);
				} // end if
			}// windowClosed

		});

		setBounds(100, 100, 700, 400);
		setVisible(true);

	}// MultiChatClient

	public void capture() throws IOException {
		File dir = new File("e:/javachat");
		if (!dir.exists()) {// 디렉토리가 없다면
			dir.mkdirs(); // 디렉토리 생성
		} // end if
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd_HHmmss");
		String saveDate = sdf.format(new Date());

		File saveFile = new File(dir.getAbsolutePath() + "/java_chat_" + saveDate + ".txt");

		BufferedWriter bw = null;

		try {
			bw = new BufferedWriter(new FileWriter(saveFile));
			bw.write(jtaTalkDisp.getText());
			bw.flush();
			JOptionPane.showMessageDialog(this, saveFile + "로 저장되었습니다.");
		} finally {
			if (bw != null) {
				bw.close();
			} // end if
		} // end finally

	}// capture

	public void connectToServer() throws UnknownHostException, IOException {

		if (connectThread != null) {// 서버와 연결된 상태
			JOptionPane.showMessageDialog(this, "서버와 접속된 상태입니다");
			return; // early return 쓰면 편하게 사용가능
		} // end if
		String nick = jtfNick.getText().trim();
		if (nick.isEmpty()) {
			JOptionPane.showMessageDialog(this, "대화명은 필수 입력!!!!!!");
			return; // 반환형이 void일 때 아랫줄의 코드를 실행하지 않고 호출한 곳으로 돌아가
		} // end if

		String ip = jtfServerIp.getText().replaceAll(" ", "");
		// 입력된 ip로 소켓 생성 : 서버에 접속을 시도
		someClient = new Socket(ip, 55000);
		// 데이터를 주고 받을 수 있도록 스트림을 연결한다.
		disReadStream = new DataInputStream(someClient.getInputStream());
		dosWriteStream = new DataOutputStream(someClient.getOutputStream());
		
		// 닉네임을 전송
		dosWriteStream.writeUTF(jtfNick.getText());
		dosWriteStream.flush();

		jtaTalkDisp.setText("서버에 접속하였습니다.\n");

		connectThread = new Thread(this);
		connectThread.start(); // 메시지를 읽을 수 있는 상태

	}// connectToServer

	@Override
	public void run() {
		if (disReadStream != null) {
			String revMsg = "";
			try {
				while (true) {
					// 메시지를 읽어들여
					revMsg = disReadStream.readUTF();
					// 대화창에 뿌린다.
					jtaTalkDisp.append(revMsg + "\n");
					//스크롤바가 따로 논다. => 읽어드린 메시지만큼 스크롤바를 내리자
					//수직 스크롤바를 가져와서, 수집 스크롤바의 최고 값으로 값 설정
					jspJtaTalk.getVerticalScrollBar().setValue(jspJtaTalk.getVerticalScrollBar().getMaximum());
				} // end while
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} // end catch

		} // end if
	}// run

	public void sendMsg() throws IOException{
		if(dosWriteStream!=null) {
			String msg = jtfTalk.getText().trim();
			String nick = jtfNick.getText().trim();
			if(!msg.isEmpty()) {
				dosWriteStream.writeUTF("[ "+nick+ " ]"+ msg);
				dosWriteStream.flush();
				
			}//end if
			//메시지를 보낸 후 대화 입력창을 초기화한다.
			jtfTalk.setText("");
		}//end if
	}// sendMsg

	@Override
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == jbtConnectServer) {// 서버접속이니
			try {
				connectToServer();
			} catch (UnknownHostException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} // end catch
		} // end if

		if (ae.getSource() == jbtnCapture) {// 캡처?
			try {
				capture();
			} catch (IOException e) {
				e.printStackTrace();
			} // end catch
		} // end if

		if (ae.getSource() == jtfTalk) {// 대화내용 입력?
			try {
				sendMsg();
			} catch (IOException e) {
				JOptionPane.showMessageDialog(this, "서버가 종료되었습니다.");
				e.printStackTrace();
			}
		} // end if
	}// actionPerformed
	
	

	public static void main(String[] args) {
		new MultiChatClient();
	}// main

}// class
