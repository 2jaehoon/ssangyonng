package day0113;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class SimpleChatClientThread extends JFrame implements ActionListener, Runnable{

	private JTextField jtfTalk;
	private JTextArea jtaTalkDisplay;
	
	private Socket client;
	private DataInputStream disReadStream;
	private DataOutputStream dosWriteStream;
	private Thread thread;
	
	public SimpleChatClientThread() {
		super("::::::::::::::::::::: ä��Ŭ���̾�Ʈ :::::::::::::::::::::");
		jtfTalk=new JTextField();
		jtaTalkDisplay=new JTextArea();
		JScrollPane jspCenter=new JScrollPane( jtaTalkDisplay );
		
		jtfTalk.setBorder(new TitledBorder("��ȭ�Է�"));
		jspCenter.setBorder(new TitledBorder("��ȭ"));
		
		jtaTalkDisplay.setEditable(false);
		
		add("Center", jspCenter);
		add("South", jtfTalk);
		
		
		setBounds(100, 100, 400, 600);
		setVisible(true);
		
		
		
		
		jtfTalk.addActionListener(this);//�޽����� ������ �ڵ�
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent we) {
				try {
					closeClient();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally {
					System.exit(0);
				}
				
			}//windowClosing
			
		});
		
		try { //���� ���� �� �޽����� ���� ������ �о���δ�.
			connectToServer();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}//end catch
		
		jtfTalk.requestFocus();
	}//SimpleChatClient
	
	public void closeClient() throws IOException{
		
		try {
		if(disReadStream != null ) {
			disReadStream.close();
		}//end if
		if(dosWriteStream != null ) {
			dosWriteStream.close();
		}//end if
		}finally {
			if(client != null) {
				client.close();
			}//end if
		}//end finally
		
		
	}//closeClient
	
	
	
	
	
	public void connectToServer() throws UnknownHostException, IOException {
		String ip=JOptionPane.showInputDialog(
				"������ ������ ip�ּҸ� �Է�\n 132,133,134,135,162,137,139,140,141,142,143,144,146,149,150,151,152,154");
		//�Է¹��� ip�� ������ ���� => ������ ������ �õ�
		client=new Socket("211.63.89."+ip, 55000);
		//��Ʈ�� 
		disReadStream=new DataInputStream(client.getInputStream());
		dosWriteStream=new DataOutputStream( client.getOutputStream());
		
		jtaTalkDisplay.setText("������ �����Ͽ����ϴ�.\n");
		
		//�޽��� ���ÿ� �б�
		if(thread == null) {
			//1. ��ü ����(this�� �ҷ��͵� �� this(�Ű����� ����))
			//2. 
			thread = new Thread(this); //���� ��ü�� has a ����� Thread�� ����
			thread.start();
		}//end if
	}//connectToServer
	
	/**
	 * ������ �޽����� ���ѷ����� �д´�.
	 * @throws IOException 
	 */
	@Override
	//run method�� �������̵�
	public void run()  {
		//���ÿ� ó���Ǿ���� �ڵ� ����
		String msg="";
		try {
			while(true) {
				//�޽����� �о� �鿩
				msg=disReadStream.readUTF();
				//��ȭâ�� ����Ѵ�. 
				jtaTalkDisplay.append(msg +" \n");
			}//end while
		}catch(IOException ie) {
			JOptionPane.showMessageDialog(this, "��ȭ��밡 ������ ���� �Ͽ����ϴ�.");
			ie.printStackTrace();
		}//end catch
	}//readMsg
	
	/**
	 *�����ڿ��� �޽����� ������ �� 
	 */
	public void sendMsg() {
	
		if( dosWriteStream != null ) {
			String msg=jtfTalk.getText().trim();
			if( !msg.isEmpty() ) {
				try {
					//��ȭâ�� ��ȭ�� �ø���
					jtaTalkDisplay.append("[ ���� ] : "+msg+"\n");
					//�޼����� ������
					dosWriteStream.writeUTF("[ ���� ] : "+msg);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}//end if
			
		}//end if
		
	}//sendMsg
	
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		sendMsg();
		jtfTalk.setText("");
	}//actionPerformed

	public static void main(String[] args) {
		new SimpleChatClientThread();
	}//main

}//class
