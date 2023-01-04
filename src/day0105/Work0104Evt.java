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
			// getJmiNew�� ������ �� ������ �ڵ�
			//jta�� �ؽ�Ʈ ���� �ʱ�ȭ
			wk.getJta().setText("");
			}
		if (ae.getSource() == wk.getJmiClose()) {
			wk.dispose();
			}
		if (ae.getSource() == wk.getJmiOpen()) {
			FileDialog fdOpen = new FileDialog(wk,"���Ͽ���", FileDialog.LOAD);
			fdOpen.setVisible(true);
			
			String path = fdOpen.getDirectory();
			String name = fdOpen.getFile();
			if(name != null) {
			wk.setTitle(path + name);//Ÿ��Ʋ�ٿ� ���ϸ��� ����
			}//end if
			
			}
		if (ae.getSource() == wk.getJmiSave()) {
			FileDialog fdSave = new FileDialog(wk, "���� ����", FileDialog.SAVE);
			//������ ������Ʈ�� setVisible�� �ؾ� ��� ����
			fdSave.setVisible(true);
			
			//���丮��. ���ϸ� ���
			String path = fdSave.getDirectory();
			String name = fdSave.getFile();
			if(path != null) {
				
				wk.setTitle("���� �� �� " + path + name);
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
