package project;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.io.File;
import java.io.IOException;
import java.net.NoRouteToHostException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class ViewPrint extends JDialog {
	private JButton jbtnClose;
	private JTextArea jtaView;
	static JLabel jlblView;
	private JLabel jlblResult;
	private SelectDialogEvt sde;
	private ImageIcon backImage;
	
	
	
	
	public ViewPrint(SelectDialog sd, SelectDialogEvt sde) throws IOException {
		super(sd, sd.getTitle(),true); //get타이틀로 제목 받아오는 거 가능
		
		//바탕색 설정
		backImage = new ImageIcon("e:/dev/img.png");
		
		JLabel background;
		background=new JLabel( "",backImage,JLabel.CENTER ); //라벨 바탕 이미지
		background.setBounds(0, 0, 700, 500); //라벨 크기
		add(background);
		
		//"<html>내용<br />   <-줄바꾸 내용 "
		jbtnClose = new JButton("닫기");
		jlblView = new JLabel(    //
				"\t\t\t\t\t<html>\r\r\r\r<br><br><br>1. 최다사용 키의 이름과 횟수  |  " + sde.maxUsedKey() + "<br><br>" + 
				"2.브라우저별 접속횟수, 비율<br>"+sde.connectBrowser() + "<br>"
							
//						+ "2. 브라우저별 접속횟수, 비율<br>&nbsp;&nbsp;&nbsp;&nbsp;IE -<br>"+"&nbsp;&nbsp;&nbsp;&nbsp;Chrome -"+"%%<br><br>"
						+ "3."+ sde.servicePerform() + "<br><br>"
						+ "4. 요청이 가장 많은 시간 | " + sde.mostRequestTime() + "<br><br>"
						+ "5." + sde.unNormalRequest() + "<br><br>"
						+ "6." + sde.requestError() + "<br><br>"
//						+ "7. 입력되는 라인에 해당하는 정보출력 | <br>(예:1000~1500라인이 입력되면 해당 라인에 해당하는 정보 중 최다사용 키의 이름과 횟수)"
//						+ sde.maxUsedValue()
					);/////////////////여기에 리턴 메소드로 넣어 줄것 보이드 메소드 다 없애기 아니면 다른 방법을 생각해보기
		jlblResult=new JLabel("출 력 결 과");
		
		jlblView.setFont(new Font( "맑은고딕", Font.BOLD ,  14 )); //출력값 라벨 폰트
//		jlblView.setForeground( Color.gray ); // 라벨 글자색
		
		jlblResult.setFont(new Font( "궁서체", Font.BOLD, 24 ));//출력결과 라벨 폰트

		jbtnClose.setFont(new Font( "궁서체", Font.BOLD,  16 ));//버튼 폰트
		jbtnClose.setBackground( new Color( 0xCB1209 ) );//버튼 배경색 
		jbtnClose.setForeground( new Color ( 0xF3D11D ) );//라벨 글자색
		
		background.add(jbtnClose);
		background.add(jlblView);
		background.add(jlblResult);
		
		
		//'닫기'버튼, 내용출력라벨 크기설정.
		jbtnClose.setBounds(300, 500, 70, 40);
		jlblView.setBounds(0, 0, 700, 500);
		jlblResult.setBounds(260, 20, 200, 70);
		
		//이벤트 등록
		ViewPrintEvt vpe=new ViewPrintEvt(this);
		
		//버튼이벤트
		jbtnClose.addActionListener(vpe);
		
		//윈도우이벤트
		addWindowListener(vpe);
		
		//윈도우 사이즈 설정.
		setBounds(sd.getX()+100, sd.getY()+20, 700, 600);
		setVisible( true );
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		
		
		
	}//ViewPrint
	
	
	
	
	

}//class
