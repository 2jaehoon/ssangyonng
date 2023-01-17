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

	private JTextField jtfTalk; //대화입력
	private JTextArea jtaTalkDisplay;//대화출력
	
	private ServerSocket server; //포트 
	private Socket client; //접속자소켓
	private DataInputStream disReadStream; //대화읽기
	private DataOutputStream dosWriteStream;//대화쓰기
	
	public SimpleChatServer() {
		super("::::::::::::::::::::: 채팅서버 :::::::::::::::::::::");
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
		
		
		jtfTalk.addActionListener(this);//메시지를 보낼 수가 없다.
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
			openServer();//서버 포트를 열고, 접속자가 접속한 후 메시지를 무한 루프로 읽는다.
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
	 * 서버 열기
	 * @throws IOException 
	 */
	public void openServer() throws IOException {
		//포트열기
		server=new ServerSocket(52000);
		jtaTalkDisplay.setText("서버가동 중 \n");
		//접속자를 받는다.
		client=server.accept();
		disReadStream=new DataInputStream(client.getInputStream());
		dosWriteStream=new DataOutputStream( client.getOutputStream());
		
		jtaTalkDisplay.append("접속자가 입실\n");
		
		//접속자가 보내오는 대화 읽기
		readMsg();
	}//openServer
	
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
		new SimpleChatServer();
	}//main

}//class
