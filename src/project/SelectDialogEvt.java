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
			////////////������ ������� �Ʒ� ���� ���� �ǰ� �����ؾ��� �׷���
			//viewBtn �޼��� �ȿ� ������Ʈ�� ���ǹ����� �ؼ� �ִ� �� ���ƺ���
//			new ViewPrint(sd);       ///////////////////////////////sd�� ���� sd�� ���� �����;ߴ뼭
//			String str=sd.getTitle();
//			System.out.println( str );
			/////�����ִ� ���� viewBtn���� �Ʒ��� �������� Ȯ�ο��
			//�̷��� �Ǹ� Ŭ���ÿ��� ��ȭ���� ������ ������
		}//end if
		
		if( ae.getSource() == sd.getJbtnReport()) {
			reportBtn();
		}//end if
		
	}//actionPerformed
	
	public void viewBtn() {
		fdView=new FileDialog( sd, "���� ����", FileDialog.LOAD );
		fdView.setDirectory("E:\\project");
		fdView.setVisible( true );
		
		//���丮��, ���ϸ� ���
		String path=fdView.getDirectory();
		String name=fdView.getFile();
		
		if( name !=null ) {
			sd.setTitle( path + name );
			new ViewPrint(sd,this); //���Ӱ��� ������ �� Ŭ���ÿ��� ������ ����
		}//end if
	}//viewBtn
	
	
	public void reportBtn() {
		fdReport=new FileDialog( sd, "���� ����", FileDialog.SAVE );
		fdReport.setDirectory("E:\\project");
		fdReport.setVisible( true );
		
		//���丮��, ���ϸ� ���
		String path=fdReport.getDirectory();
		String name=fdReport.getFile();
		
		if( name !=null ) {
			sd.setTitle( path + name );
		}//end if
		
	}//reportBtn
	
	
	
	////////////////////////////////////���ϰ����� �޾ƿ;ߵǴ��� ����//////////////////////////////////////////////
	
	
//	1. �ִٻ�� Ű�� �̸��� Ƚ�� | java xxȸ
	public void maxUsedKey() {
		System.out.println("test");
	}//maxUsedKey
	
//	2. �������� ����Ƚ��, ����
//		IE - xx (xx%)
//		Chrome - xx (xx%)
	public void connectBrowser() {
		
	}//connectBrowser
	
//	3. ���񽺸� ���������� ������(200) Ƚ��,����(404) Ƚ��
	public void servicePerform() {
		
	}//servicePerform

//	4. ��û�� ���� ���� �ð� [10��]
	public void mostRequestTime() {
		
	}//mostRequestTime

//	5. ���������� ��û(403)�� �߻��� Ƚ��,�������ϱ�
	public void unNormalRequest() {
		
	}//unNormalRequest

//	6. ��û�� ���� ����(500)�� �߻��� Ƚ��, ���� ���ϱ�
	public void requestError() {
		
	}//requestError

//	7. �ԷµǴ� ���ο� �ش��ϴ� �������
//	(�� :1000~1500���� �� �ԷµǸ�)
	public void lineInfo() {
		
	}//lineInfo
	
	public String abc() {
		return "������";
	}
	

}//SelectDialogEvt
