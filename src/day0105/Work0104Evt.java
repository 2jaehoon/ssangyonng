package day0105;

import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Work0104Evt extends WindowAdapter implements ActionListener {
	private Work0104 wk;
	

	public Work0104Evt(Work0104 wk) {
		this.wk = wk;
	}//Work0104Evt

	@Override
	public void actionPerformed(ActionEvent ae) {
//		jmiNew.addActionListener(we);
//		jmiClose.addActionListener(we);
//		jmiOpen.addActionListener(we);
//		jmiSave.addActionListener(we);
//		jmiMemoinf.addActionListener(we);
		if (ae.getSource() == wk.getJmiNew()) {
			// getJmiNew이 눌렸을 때 제공할 코드
			//jta의 텍스트 값을 초기화
			wk.getJta().setText("");
			}
		if (ae.getSource() == wk.getJmiClose()) {
			wk.dispose();
			}
		if (ae.getSource() == wk.getJmiOpen()) {
			FileDialog fdOpen = new FileDialog(wk,"파일열기", FileDialog.LOAD);
			fdOpen.setVisible(true);
			
			String path = fdOpen.getDirectory();
			String name = fdOpen.getFile();
			if(name != null) {
			wk.setTitle(path + name);//타이틀바에 파일명을 설정
			}//end if
			
			}
		if (ae.getSource() == wk.getJmiSave()) {
			FileDialog fdSave = new FileDialog(wk, "파일 저장", FileDialog.SAVE);
			//윈도우 컴포넌트는 setVisible을 해야 사용 가능
			fdSave.setVisible(true);
			
			//디렉토리명. 파일명 얻기
			String path = fdSave.getDirectory();
			String name = fdSave.getFile();
			if(path != null) {
				
				wk.setTitle("파일 저 장 " + path + name);
			}
			
			}

		
		if (ae.getSource() == wk.getJmiMemoinf()) {
		new SubWork0104(wk);
		}
	}//actionPerformed

	@Override
	public void windowClosing(WindowEvent ae) {
		wk.dispose();
	}//windowClosing
	
	

}
