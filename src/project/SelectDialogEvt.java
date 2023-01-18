package project;

import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JDialog;

import day0104.UseFileDialog;

public class SelectDialogEvt extends WindowAdapter implements ActionListener {
	
	private SelectDialog sd;//has a
	
	private FileDialog fdView;
	private FileDialog fdReport;
	
	
		
	public SelectDialogEvt( SelectDialog sd ) {//has a
		this.sd=sd;
	}//SelectDialogEvt
	

	@Override
	public void windowClosing(WindowEvent we) {
		sd.dispose();
	}//windowClosing

	@Override
	public void actionPerformed(ActionEvent ae) {
		
		if( ae.getSource() == sd.getJbtnView()) {
			viewBtn();
			////////////문제점 열어야지 아래 것이 실행 되게 설정해야함 그래서
			//viewBtn 메서드 안에 뷰포인트를 조건문으로 해서 넣는 게 좋아보임
//			new ViewPrint(sd);       ///////////////////////////////sd로 수정 sd의 값을 가져와야대서
//			String str=sd.getTitle();
//			System.out.println( str );
			/////여기있던 것을 viewBtn으로 아래로 내려보냄 확인요망
			//이렇게 되면 클릭시에만 뷰화면이 열리게 설정됨
		}//end if
		
		if( ae.getSource() == sd.getJbtnReport()) {
			reportBtn();
		}//end if
		
	}//actionPerformed
	
	public void viewBtn() {
		fdView=new FileDialog( sd, "파일 열기", FileDialog.LOAD );
		fdView.setDirectory("E:\\project");
		fdView.setVisible( true );
		
		//디렉토리명, 파일명 얻기
		String path=fdView.getDirectory();
		String name=fdView.getFile();
		
		if( name !=null ) {
			sd.setTitle( path + name );
			new ViewPrint(sd,this); //네임값을 받을시 즉 클릭시에만 열리게 설정
		}//end if
	}//viewBtn
	
	
	public void reportBtn() {
		fdReport=new FileDialog( sd, "파일 저장", FileDialog.SAVE );
		fdReport.setDirectory("E:\\project");
		fdReport.setVisible( true );
		
		//디렉토리명, 파일명 얻기
		String path=fdReport.getDirectory();
		String name=fdReport.getFile();
		
		if( name !=null ) {
			sd.setTitle( path + name );
		}//end if
		
	}//reportBtn
	
	
	
	////////////////////////////////////리턴값으로 받아와야되는지 생각//////////////////////////////////////////////
	
	
//	1. 최다사용 키의 이름과 횟수 | java xx회
	public void maxUsedKey() {
		System.out.println("test");
	}//maxUsedKey
	
//	2. 브라우저별 접속횟수, 비율
//		IE - xx (xx%)
//		Chrome - xx (xx%)
	public void connectBrowser() {
		
	}//connectBrowser
	
//	3. 서비스를 성공적으로 수행한(200) 횟수,실패(404) 횟수
	public void servicePerform() {
		
	}//servicePerform

//	4. 요청이 가장 많은 시간 [10시]
	public void mostRequestTime() {
		
	}//mostRequestTime

//	5. 비정상적인 요청(403)이 발생한 횟수,비율구하기
	public void unNormalRequest() {
		
	}//unNormalRequest

//	6. 요청에 대한 에러(500)가 발생한 횟수, 비율 구하기
	public void requestError() {
		
	}//requestError

//	7. 입력되는 라인에 해당하는 정보출력
//	(예 :1000~1500라인 이 입력되면)
	public void lineInfo() {
		
	}//lineInfo
	
	public String abc() {
		return "오예스";
	}
	

}//SelectDialogEvt
