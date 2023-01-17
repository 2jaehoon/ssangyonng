package kr.co.sist.chat.server;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

import kr.co.sist.chat.client.MultiChatClient;

@SuppressWarnings("serial")
public class MultiChatServer extends JFrame implements ActionListener, Runnable {

	private JTextArea jtaClientDisp;
	private JButton jbtnOpenServer, jbtnCloseServer;

	private JScrollPane jspCenter;
	private Thread serverThread; // 서버실행용 스레드, 화면제공과 동시에 접속자를 받기
	private ServerSocket server;

	public static Vector<ServerHelper> vecConnectClient; // 모든 접속자를 관리하기위한 List

	public MultiChatServer() {
		super(":::::::::::::::::::::: 채팅서버 :::::::::::::::::::::::");

		vecConnectClient = new Vector<ServerHelper>(20);

		jtaClientDisp = new JTextArea();
		jtaClientDisp.setEditable(false);
	    jspCenter = new JScrollPane(jtaClientDisp);
		jspCenter.setBorder(new TitledBorder("접속자 정보"));

		jbtnOpenServer = new JButton("서버실행");
		jbtnCloseServer = new JButton("서버종료");

		JPanel jpSouth = new JPanel();
		jpSouth.add(jbtnOpenServer);
		jpSouth.add(jbtnCloseServer);

		add("Center", jspCenter);
		add("South", jpSouth);

		jbtnOpenServer.addActionListener(this);
		jbtnCloseServer.addActionListener(this);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent we) {
				dispose();
			}// windowClosing

			@Override
			public void windowClosed(WindowEvent we) {
				closeServer();
			}// windowClosed
		});

		setBounds(100, 100, 400, 700);
		setVisible(true);
	}// MultiChatServer

	public void closeServer() {
		try {
			if (server != null) {
				server.close();
			} // end if
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			System.exit(JFrame.ABORT); // 현재 JVM에서 생성된 모든 객체를 종료한다.
		} // end finally
	}// closeServer

	@Override
	public void run() {
		try {
			server = new ServerSocket(55000);
			jtaClientDisp.setText("다중 채팅서버 실행 중\n");
			// 모든 접속자 소켓을 받는다.
			Socket someClient = null;
			int connectCnt = 0;// 몇번째 접속자인지

			ServerHelper sh = null;
			MultiChatClient mcc = null;
			for (int i = 0; vecConnectClient.size() < 21; i++) { // 20명
				someClient = server.accept();// 접속자 있음.
				// Helper 클래스를 생성
				sh = new ServerHelper(someClient, jtaClientDisp, jspCenter, connectCnt);
				sh.start(); // 메시지 읽기
				// 접속자를 관리하는 List(Vector)에 추가
				vecConnectClient.add(sh);
				connectCnt++;
			} // end for

		} catch (IOException e) {
			e.printStackTrace();
		} // end catch
	}// run

	@Override
	public void actionPerformed(ActionEvent ae) {

		if (ae.getSource() == jbtnOpenServer) {
			if (serverThread == null) {// 스레드가 생성되지 않았음.
				serverThread = new Thread(this);
				serverThread.start();
			} else {// 스레드가 생성되었음. 서버가 동작 중
				JOptionPane.showMessageDialog(this, "서버가 동작 중입니다.");
			} // end else
		} // end if

		if (ae.getSource() == jbtnCloseServer) {
			closeServer();
		} // end if

	}// actionPerformed

	public static void main(String[] args) {
		new MultiChatServer();
	}// main

}// class
