package day0104;

import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * 이벤트처리를 위해서 사용하는 인터페이스를 추상 메소드를 여러 개 가진 경우
 * 그에 대한 편의성을 제공하기 위해 XxxAdapter 클래스를 제공한다
 * XxxAdapter클래스를 상속받으면 자식 클래스의 복잡도가 낮아진다.
 * @author user
 *
 */
public class UseFileDialogEvt extends WindowAdapter implements ActionListener{
	private UseFileDialog ufd; //has a
	
	public UseFileDialogEvt(UseFileDialog ufd) {
		this.ufd = ufd;
	
	}//TestWindowListenerImpl




	@Override
	public void windowClosing(WindowEvent we) {
		ufd.dispose();
	}//windowClosing

	@Override
	public void actionPerformed(ActionEvent ae) {
			System.out.println("버튼 클릭!!");		
			//어떤 컴포넌트가 이벤트를 발생시켰는지? 비교.
			//jbtnFileOpen 이 이벤트를 발생시켰는지?
			if (ae.getSource() == ufd.getJbtnFileOpen()) {
				FileDialog fdOpen = new FileDialog(ufd, "파일 열기", FileDialog.LOAD);
				//윈도우 컴포넌트는 setVisible을 해야 사용 가능
				fdOpen.setVisible(true);
				
				//디렉토리명. 파일명 얻기
				String path = fdOpen.getDirectory();
				String name = fdOpen.getFile();
				if(name != null) {
				ufd.setTitle(path + name);//타이틀바에 파일명을 설정
				}//end if
				
				}//end if
			
			
			if (ae.getSource() == ufd.getJbtnFileSave()) {
				FileDialog fdSave = new FileDialog(ufd, "파일 저장", FileDialog.SAVE);
				//윈도우 컴포넌트는 setVisible을 해야 사용 가능
				fdSave.setVisible(true);
				
				//디렉토리명. 파일명 얻기
				String path = fdSave.getDirectory();
				String name = fdSave.getFile();
				if(path != null) {
					
					ufd.setTitle("파일 저 장 " + path + name);
				}
				
			}//end if
			
			
		
					
	}//actionPerformed
	
	
	
	

}//class
