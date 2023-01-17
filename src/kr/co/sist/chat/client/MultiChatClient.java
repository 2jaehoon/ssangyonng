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
		super("::::::::::::::::: ä��Ŭ���̾�Ʈ :::::::::::::::::::::::::");
		
		
		

		jtfServerIp = new JTextField("211.63.89.", 10);
		jtfNick = new JTextField(10);
		jtfTalk = new JTextField(10);

		jbtConnectServer = new JButton("��������");
		jbtnCapture = new JButton("ĸó");

		jtaTalkDisp = new JTextArea();
		jtaTalkDisp.setEditable(false);
		jspJtaTalk = new JScrollPane(jtaTalkDisp);

		JPanel jpNorth = new JPanel();
		jpNorth.setBorder(new TitledBorder("��������"));
		jpNorth.add(new JLabel("����ip"));
		jpNorth.add(jtfServerIp);
		jpNorth.add(new JLabel("��ȭ��"));
		jpNorth.add(jtfNick);
		jpNorth.add(jbtConnectServer);
		jpNorth.add(jbtnCapture);

		jspJtaTalk.setBorder(new TitledBorder("��ȭ"));
		jtfTalk.setBorder(new TitledBorder("��ȭ�Է�"));

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
		if (!dir.exists()) {// ���丮�� ���ٸ�
			dir.mkdirs(); // ���丮 ����
		} // end if
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd_HHmmss");
		String saveDate = sdf.format(new Date());

		File saveFile = new File(dir.getAbsolutePath() + "/java_chat_" + saveDate + ".txt");

		BufferedWriter bw = null;

		try {
			bw = new BufferedWriter(new FileWriter(saveFile));
			bw.write(jtaTalkDisp.getText());
			bw.flush();
			JOptionPane.showMessageDialog(this, saveFile + "�� ����Ǿ����ϴ�.");
		} finally {
			if (bw != null) {
				bw.close();
			} // end if
		} // end finally

	}// capture

	public void connectToServer() throws UnknownHostException, IOException {

		if (connectThread != null) {// ������ ����� ����
			JOptionPane.showMessageDialog(this, "������ ���ӵ� �����Դϴ�");
			return; // early return ���� ���ϰ� ��밡��
		} // end if
		String nick = jtfNick.getText().trim();
		if (nick.isEmpty()) {
			JOptionPane.showMessageDialog(this, "��ȭ���� �ʼ� �Է�!!!!!!");
			return; // ��ȯ���� void�� �� �Ʒ����� �ڵ带 �������� �ʰ� ȣ���� ������ ���ư�
		} // end if

		String ip = jtfServerIp.getText().replaceAll(" ", "");
		// �Էµ� ip�� ���� ���� : ������ ������ �õ�
		someClient = new Socket(ip, 55000);
		// �����͸� �ְ� ���� �� �ֵ��� ��Ʈ���� �����Ѵ�.
		disReadStream = new DataInputStream(someClient.getInputStream());
		dosWriteStream = new DataOutputStream(someClient.getOutputStream());
		
		// �г����� ����
		dosWriteStream.writeUTF(jtfNick.getText());
		dosWriteStream.flush();

		jtaTalkDisp.setText("������ �����Ͽ����ϴ�.\n");

		connectThread = new Thread(this);
		connectThread.start(); // �޽����� ���� �� �ִ� ����

	}// connectToServer

	@Override
	public void run() {
		if (disReadStream != null) {
			String revMsg = "";
			try {
				while (true) {
					// �޽����� �о�鿩
					revMsg = disReadStream.readUTF();
					// ��ȭâ�� �Ѹ���.
					jtaTalkDisp.append(revMsg + "\n");
					//��ũ�ѹٰ� ���� ���. => �о�帰 �޽�����ŭ ��ũ�ѹٸ� ������
					//���� ��ũ�ѹٸ� �����ͼ�, ���� ��ũ�ѹ��� �ְ� ������ �� ����
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
			//�޽����� ���� �� ��ȭ �Է�â�� �ʱ�ȭ�Ѵ�.
			jtfTalk.setText("");
		}//end if
	}// sendMsg

	@Override
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == jbtConnectServer) {// ���������̴�
			try {
				connectToServer();
			} catch (UnknownHostException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} // end catch
		} // end if

		if (ae.getSource() == jbtnCapture) {// ĸó?
			try {
				capture();
			} catch (IOException e) {
				e.printStackTrace();
			} // end catch
		} // end if

		if (ae.getSource() == jtfTalk) {// ��ȭ���� �Է�?
			try {
				sendMsg();
			} catch (IOException e) {
				JOptionPane.showMessageDialog(this, "������ ����Ǿ����ϴ�.");
				e.printStackTrace();
			}
		} // end if
	}// actionPerformed
	
	

	public static void main(String[] args) {
		new MultiChatClient();
	}// main

}// class
