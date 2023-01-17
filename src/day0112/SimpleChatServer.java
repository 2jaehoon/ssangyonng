package day0112;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class SimpleChatServer extends JFrame implements ActionListener {

	private JTextField jtfTalk; //��ȭ�Է�
	private JTextArea jtaTalkDisplay;//��ȭ���
	
	private ServerSocket server; //��Ʈ 
	private Socket client; //�����ڼ���
	private DataInputStream disReadStream; //��ȭ�б�
	private DataOutputStream dosWriteStream;//��ȭ����
	
	public SimpleChatServer() {
		super("::::::::::::::::::::: ä�ü��� :::::::::::::::::::::");
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
		
		
		jtfTalk.addActionListener(this);//�޽����� ���� ���� ����.
		addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent we) {
				try {
					closeServer();
				} catch (IOException e) {
					e.printStackTrace();
				}finally {
					System.exit(0);
				}//end finally
			}//windowClosing
		});
		
		try {
			openServer();//���� ��Ʈ�� ����, �����ڰ� ������ �� �޽����� ���� ������ �д´�.
		} catch (IOException e) {
			e.printStackTrace();
		}//end catch
		
		jtfTalk.requestFocus();
	}//SimpleChatServer
	
	public void closeServer()throws IOException {
		try {
			if( disReadStream != null ) { disReadStream.close(); }//end if
			if( dosWriteStream != null ) { dosWriteStream.close(); }//end if
			if( client != null ) { client.close(); }//end if
		}finally {
			if( server != null ) { server.close(); }//end if
		}//end finally
	}//closeServer
	
	/**
	 * ���� ����
	 * @throws IOException 
	 */
	public void openServer() throws IOException {
		//��Ʈ����
		server=new ServerSocket(52000);
		jtaTalkDisplay.setText("�������� �� \n");
		//�����ڸ� �޴´�.
		client=server.accept();
		disReadStream=new DataInputStream(client.getInputStream());
		dosWriteStream=new DataOutputStream( client.getOutputStream());
		
		jtaTalkDisplay.append("�����ڰ� �Խ�\n");
		
		//�����ڰ� �������� ��ȭ �б�
		readMsg();
	}//openServer
	
	/**
	 * ������ �޽����� ���ѷ����� �д´�.
	 * @throws IOException 
	 */
	public void readMsg()  {
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
		new SimpleChatServer();
	}//main

}//class
