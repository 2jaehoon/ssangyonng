package day0112;

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
public class SimpleChatClient extends JFrame implements ActionListener {

	private JTextField jtfTalk;
	private JTextArea jtaTalkDisplay;
	
	private Socket client;
	private DataInputStream disReadStream;
	private DataOutputStream dosWriteStream;
	
	public SimpleChatClient() {
		super("::::::::::::::::::::: 채팅클라이언트 :::::::::::::::::::::");
		jtfTalk=new JTextField();
		jtaTalkDisplay=new JTextArea();
		JScrollPane jspCenter=new JScrollPane( jtaTalkDisplay );
		
		jtfTalk.setBorder(new TitledBorder("대화입력"));
		jspCenter.setBorder(new TitledBorder("대화"));
		
		jtaTalkDisplay.setEditable(false);
		
		add("Center", jspCenter);
		add("South", jtfTalk);
		
		
		setBounds(100, 100, 400, 600);
		setVisible(true);
		
		
		
		
		jtfTalk.addActionListener(this);//메시지를 보내는 코드
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
		
		try { //서버 접속 후 메시지를 무한 루프로 읽어들인다.
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
				"접속할 서버의 ip주소를 입력\n 132,133,134,135,162,137,139,140,141,142,143,144,146,149,150,151,152,154");
		//입력받은 ip로 소켓을 생성 => 서버에 연결을 시도
		client=new Socket("211.63.89."+ip, 52000);
		//스트림 
		disReadStream=new DataInputStream(client.getInputStream());
		dosWriteStream=new DataOutputStream( client.getOutputStream());
		
		jtaTalkDisplay.setText("서버에 접속하였습니다.\n");
		
		//메시지 읽기
		readMsg();
	}//connectToServer
	
	/**
	 * 보내온 메시지를 무한루프로 읽는다.
	 * @throws IOException 
	 */
	public void readMsg()  {
		String msg="";
		try {
			while(true) {
				//메시지를 읽어 들여
				msg=disReadStream.readUTF();
				//대화창에 출력한다. 
				jtaTalkDisplay.append(msg +" \n");
			}//end while
		}catch(IOException ie) {
			JOptionPane.showMessageDialog(this, "대화상대가 접속을 종료 하였습니다.");
			ie.printStackTrace();
		}//end catch
	}//readMsg
	
	/**
	 *접속자에게 메시지를 보내는 일 
	 */
	public void sendMsg() {
	
		if( dosWriteStream != null ) {
			String msg=jtfTalk.getText().trim();
			if( !msg.isEmpty() ) {
				try {
					//대화창에 대화를 올리고
					jtaTalkDisplay.append("[ 재훈 ] : "+msg+"\n");
					//메세지를 보내자
					dosWriteStream.writeUTF("[ 재훈 ] : "+msg);
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
		new SimpleChatClient();
	}//main

}//class
