package day0104;

import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * �̺�Ʈó���� ���ؼ� ����ϴ� �������̽��� �߻� �޼ҵ带 ���� �� ���� ���
 * �׿� ���� ���Ǽ��� �����ϱ� ���� XxxAdapter Ŭ������ �����Ѵ�
 * XxxAdapterŬ������ ��ӹ����� �ڽ� Ŭ������ ���⵵�� ��������.
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
			System.out.println("��ư Ŭ��!!");		
			//� ������Ʈ�� �̺�Ʈ�� �߻����״���? ��.
			//jbtnFileOpen �� �̺�Ʈ�� �߻����״���?
			if (ae.getSource() == ufd.getJbtnFileOpen()) {
				FileDialog fdOpen = new FileDialog(ufd, "���� ����", FileDialog.LOAD);
				//������ ������Ʈ�� setVisible�� �ؾ� ��� ����
				fdOpen.setVisible(true);
				
				//���丮��. ���ϸ� ���
				String path = fdOpen.getDirectory();
				String name = fdOpen.getFile();
				if(name != null) {
				ufd.setTitle(path + name);//Ÿ��Ʋ�ٿ� ���ϸ��� ����
				}//end if
				
				}//end if
			
			
			if (ae.getSource() == ufd.getJbtnFileSave()) {
				FileDialog fdSave = new FileDialog(ufd, "���� ����", FileDialog.SAVE);
				//������ ������Ʈ�� setVisible�� �ؾ� ��� ����
				fdSave.setVisible(true);
				
				//���丮��. ���ϸ� ���
				String path = fdSave.getDirectory();
				String name = fdSave.getFile();
				if(path != null) {
					
					ufd.setTitle("���� �� �� " + path + name);
				}
				
			}//end if
			
			
		
					
	}//actionPerformed
	
	
	
	

}//class
