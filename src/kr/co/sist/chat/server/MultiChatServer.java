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
	private Thread serverThread; // ��������� ������, ȭ�������� ���ÿ� �����ڸ� �ޱ�
	private ServerSocket server;

	public static Vector<ServerHelper> vecConnectClient; // ��� �����ڸ� �����ϱ����� List

	public MultiChatServer() {
		super(":::::::::::::::::::::: ä�ü��� :::::::::::::::::::::::");

		vecConnectClient = new Vector<ServerHelper>(20);

		jtaClientDisp = new JTextArea();
		jtaClientDisp.setEditable(false);
	    jspCenter = new JScrollPane(jtaClientDisp);
		jspCenter.setBorder(new TitledBorder("������ ����"));

		jbtnOpenServer = new JButton("��������");
		jbtnCloseServer = new JButton("��������");

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
			System.exit(JFrame.ABORT); // ���� JVM���� ������ ��� ��ü�� �����Ѵ�.
		} // end finally
	}// closeServer

	@Override
	public void run() {
		try {
			server = new ServerSocket(55000);
			jtaClientDisp.setText("���� ä�ü��� ���� ��\n");
			// ��� ������ ������ �޴´�.
			Socket someClient = null;
			int connectCnt = 0;// ���° ����������

			ServerHelper sh = null;
			MultiChatClient mcc = null;
			for (int i = 0; vecConnectClient.size() < 21; i++) { // 20��
				someClient = server.accept();// ������ ����.
				// Helper Ŭ������ ����
				sh = new ServerHelper(someClient, jtaClientDisp, jspCenter, connectCnt);
				sh.start(); // �޽��� �б�
				// �����ڸ� �����ϴ� List(Vector)�� �߰�
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
			if (serverThread == null) {// �����尡 �������� �ʾ���.
				serverThread = new Thread(this);
				serverThread.start();
			} else {// �����尡 �����Ǿ���. ������ ���� ��
				JOptionPane.showMessageDialog(this, "������ ���� ���Դϴ�.");
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
