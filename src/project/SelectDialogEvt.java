package project;

import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

import day0104.UseFileDialog;

public class SelectDialogEvt extends WindowAdapter implements ActionListener {
	
	private SelectDialog sd;//has a
	
	private FileDialog fdView;
	private FileDialog fdReport;
	
	private List<String> logLine ;
	private int allCodeCnt;
	
	
	
		
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
			try {
				viewBtn();  
//				connectBrowser(); //2���޼ҵ�
//				servicePerform(); //3���޼ҵ�
//				mostRequestTime(); //4���޼ҵ�
//				unNormalRequest(); //5���޼ҵ�
//				requestError(); //6���޼ҵ�
				
				
//				maxUsedKey(); //���� //1���޼ҵ� 
			} catch (IOException e) {
				e.printStackTrace();
			}
			////////////������ ������� �Ʒ� ���� ���� �ǰ� �����ؾ��� �׷���
			//viewBtn �޼��� �ȿ� ������Ʈ�� ���ǹ����� �ؼ� �ִ� �� ���ƺ���
//			new ViewPrint(sd);       ///////////////////////////////sd�� ���� sd�� ���� �����;ߴ뼭
//			String str=sd.getTitle();
//			System.out.println( str );
			/////�����ִ� ���� viewBtn���� �Ʒ��� �������� Ȯ�ο��
			//�̷��� �Ǹ� Ŭ���ÿ��� ��ȭ���� ������ ������
		}//end if
		
		if( ae.getSource() == sd.getJbtnReport()) {
//			reportBtn();
			String a = SistLogin.jtfId.getText();
			try {
			if(a.trim().equals("root")) {
				System.out.println("Ż��");
				//okay
				JOptionPane.showInternalConfirmDialog(null,"asd");
			}else {
				asd();
			
			}//end if
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}//actionPerformed
	
	public void viewBtn() throws IOException {
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
	
	
	
	public void asd() throws IOException {
		FileDialog fdReport = new FileDialog( sd, "���� ����", FileDialog.SAVE );

		// ������ ������Ʈ�� setVisible�� �ؾ� ��� ����
		fdReport.setVisible(true);
		

		// ���丮��. ���ϸ� ���
		String path = fdReport.getDirectory();
		String name = fdReport.getFile();
		
//		StringWriter sw = new StringWriter();
//		System.out.println(sw);
		

		if (path != null) {
			sd.setTitle("�ٸ��̸����� ���� ���� " + path + name);
			File file = new File(path + name);
			BufferedWriter bw = null;
			try {
				bw = new BufferedWriter(new FileWriter(path + name+".txt")); ////���⼭ �ٲٸ� �� okay
				String msg = ViewPrint.jlblView.getText();
				bw.write(msg);

				bw.flush();
			} finally {
				if (bw != null) {
//					br.close();
					bw.close();

				}
			}

		} // end if
		
	}
	
	
	
	////////////////////////////////////���ϰ����� �޾ƿ;ߵǴ��� ����//////////////////////////////////////////////
	
	
//	1. �ִٻ�� Ű�� �̸��� Ƚ�� | java xxȸ
	public String maxUsedKey() throws IOException {
		logLine = new ArrayList<String>();
		List<String> keyLine = new ArrayList<String>();
		Map<String,Integer> map=new HashMap<String,Integer>();
		Map<String,Integer> maxMap=new HashMap<String,Integer>();
		
		File file = new File(sd.getTitle());
		
		if(file.exists()) {
			BufferedReader br = null;
			try{
				// 2. Stream�� ����� ����
				br = new BufferedReader(new FileReader(file));
				// 3. �� ������ �б� 
				String data = "";
				String key = "";
				allCodeCnt=0;
				while ( (data = br.readLine()) != null) { //\n������ �о� ���δ�.
					allCodeCnt++;
					logLine.add(data);//1986���� ���ִ� �輺��
						if(data.contains("key")){
							key=data.substring( data.indexOf("=")+1, data.indexOf("&"));
							keyLine.add(key);
						}//end if
					}//end while
				
			}//try	
			finally {
				if (br != null) {
					//4. �������
					br.close();
				}//end if
			}//finally
			
		}else {
			JOptionPane.showMessageDialog(null, file + "");
		} // end if
		
		int num=0;
		for(String str : keyLine ) {
			Integer count = map.get(str);
			if( count == null ) {
				map.put(str, 1);
			}else {
				map.put(str, count+1 );
			}//end else
			num++;
		}//end for

		double proportion=(double)num;
		for(String opp : map.keySet() ) {
			
//			System.out.println(opp + " : " + map.get(opp) + "(" + (map.get(opp)/proportion)*100+"%)" );
//			System.out.printf( "%s \t %d��(%.2f%%)\n",opp, map.get(opp), ((map.get(opp)/proportion)*100)  );
			maxMap.put(opp, map.get(opp));
		}//end for
		
		Entry<String, Integer> maxEntry=null;
		
		Set<Entry<String, Integer>> entrySet=maxMap.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			if (maxEntry == null || entry.getValue() > maxEntry.getValue()) {
				maxEntry = entry;
			}//end if
		}//end for
		
		System.out.println( " daf" + maxMap);
//		System.out.println( "�ִٻ�� Ű : " + maxEntry.getKey() + ", �ִٻ�� Ű�� Ƚ�� : " + maxEntry.getValue() );
//		System.out.printf( "%s : %.2f%%", maxEntry.getKey(), ((maxEntry.getValue()/proportion)*100));
		return maxEntry.getKey()+ "   " + maxEntry.getValue() +"ȸ";
	}//maxUsedKey
	
//	2. �������� ����Ƚ��, ����
//		IE - xx (xx%)
//		Chrome - xx (xx%)
	public String connectBrowser() { 

		List<String> browsLine = new ArrayList<String>();//brow �� �б� - > substring�ؾ���.
		int startidx =0;//[]�ε��� ���
		int endidx=0;
		String browser =""; //������ ����  �� Ȯ���Ϸ��� ����
		//browsLine for�� ������
		for(String data : logLine) {
			//�ε���
			startidx = data.indexOf("][",6);
			endidx = data.indexOf("][",startidx+1);
			browser=data.substring( startidx+2, endidx);
			browsLine.add(browser);
//			System.out.println(browser);
		}//end for
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		Integer count =0;
		for(String str : browsLine ) {
//			count = map.get(str);
			count = map.get(str);
			if( count == null ) {
				map.put(str, 1);
			}else {
				map.put(str, count+1 );
			}//end else
		}//end for 
		
		//map�� ����ִ� Ű, �� ���
		String result ="";//���⿡ ���ϰ� �ֱ�/////////////////////////�̰� �ϱ�!!!!!!!!!!!!!!!!!!!!!!!!
		String ind="";
		String proportion="";
		double pp=0;
		
//		String[] arr=new String[10];
//		int i=0;
		for(Entry<String, Integer> a : map.entrySet()) {
			String key=a.getKey();
			Integer value=a.getValue();
			pp=((double)value/allCodeCnt)*100;
			proportion= String.format("%.2f", pp);
			result+=key+" - "+value+ "ȸ,(" + proportion + "%)" + "<br/>";
//			System.out.println(result);
			///���⿡ ������ �־���ϴµ� �����Ÿ��� ���ص� IE - xx (xx%) �̷������� �ȳ�����....HELP ME.. 
			
//			arr[i]=key+" - "+map.get(key);
//			i++;
//			ind=result.concat( key+" - "+map.get(key) );  //1�� ������.
			
		}//end for
		
		
		return result;
		
		
		
	}//connectBrowser
	
//	3. ���񽺸� ���������� ������(200) Ƚ��,����(404) Ƚ��
	public String servicePerform() {
		String succode="200";
		String failcode ="404"; 
		int sucCnt =0;
		int failCnt =0;
		for(String data : logLine) {
			///////////////////////
			//instance������ >>>�̷��� ��� instance������ ī��Ʈ �÷����Ǵ��� �𸣰���. �İ��غ���
//			allCodeCnt++;
			//�ε���
			if(data.contains(succode)) {
				sucCnt++;
			}else if(data.contains(failcode)) {
				failCnt++;
			}
		}//end for
		return "���� ����(200)Ƚ�� : "+sucCnt+"ȸ ,����(404) Ƚ�� : "+failCnt+"ȸ";
		
	}//servicePerform

//	4. ��û�� ���� ���� �ð� [10��]
	public String mostRequestTime() {
		List<String> timeLine = new ArrayList<String>();
		String time =""; //������ ����  �� Ȯ���Ϸ��� ����

		for(String data : logLine) {
			//�ε���
			time=data.substring(data.indexOf(" ")+1,data.indexOf(" ")+3);
			timeLine.add(time);
//			System.out.println(time);
		}//end for
		Map<String, Integer> map = new HashMap<String, Integer>();
		for(String str : timeLine ) {
			Integer count = map.get(str);
			if( count == null ) {
				map.put(str, 1);
		}else {
				map.put(str, count+1 );
		}//end else
		}
		
		//value�� ���� �ִ밪���ϱ�
//		Integer maxKey = (Collections.max(map.values()) );// ����
		
		Entry<String, Integer> maxEntry=null;
		
		Set<Entry<String, Integer>> entrySet=map.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			if (maxEntry == null || entry.getValue() > maxEntry.getValue()) {
				maxEntry = entry;
			}//end if
		}//end for
		
		return "��û�� ���� ���� �ð� : "+maxEntry.getKey()+"��";
	}//mostRequestTime

//	5. ���������� ��û(403)�� �߻��� Ƚ��,�������ϱ�
	public String unNormalRequest() {
		String errcode ="403"; //������ ����  �� Ȯ���Ϸ��� ����
		boolean flag = false;
		int errcnt =0;
		for(String data : logLine) {
			//�ε���
			flag=data.contains(errcode);
			if(flag) { errcnt++; }
		}//end for
//		System.out.println("403error ���� :"+errcnt);
		
		//����
		double pp=(errcnt/(double)allCodeCnt)*100;
		
		String proportion= String.format("%.2f", pp);
		
		return "����������û(403)�߻� Ƚ�� : "+errcnt+"ȸ, ���� : "+proportion +"%";
	}//unNormalRequest

//	6. ��û�� ���� ����(500)�� �߻��� Ƚ��, ���� ���ϱ�
	public String requestError() {
		String errcode ="500"; //������ ����  �� Ȯ���Ϸ��� ����
		boolean flag = false;
		int errcnt =0;
		for(String data : logLine) {
			//�ε���
			flag=data.contains(errcode);
			if(flag) { errcnt++; }
		}//end for
//		System.out.println("500error ���� :"+errcnt);
		
		double pp=(errcnt/(double)allCodeCnt)*100;
		
		String proportion= String.format("%.2f", pp);
		
		return "����������û(505) �߻��� Ƚ�� : "+errcnt+"ȸ, ���� : "+ proportion +"%";
	}//requestError

//	7. �ԷµǴ� ���ο� �ش��ϴ� �������
//	(�� :1000~1500���� �� �ԷµǸ�)
	public String maxUsedValue() throws IOException {
		logLine = new ArrayList<String>();
		List<String> keyLine = new ArrayList<String>();
		Map<String,Integer> map=new HashMap<String,Integer>();
		Map<String,Integer> maxMap=new HashMap<String,Integer>();
		
		File file = new File(sd.getTitle());
		
		if(file.exists()) {
			BufferedReader br = null;
			try{
				// 2. Stream�� ����� ����
				br = new BufferedReader(new FileReader(file));
				// 3. �� ������ �б� 
				String data = "";
				String key = "";
				
				
				
				
//				while ( (data = br.readLine()) != null) { //\n������ �о� ���δ�.
//					logLine.add(data);//1986���� ���ִ� �輺��
//						if(data.contains("key")){
//							key=data.substring( data.indexOf("=")+1, data.indexOf("&"));
//							keyLine.add(key);
//						}//end if
//					}//end while
				
				
//				while ( (data = br.readLine()) != null) { //\n������ �о� ���δ�.		
				allCodeCnt = 0;
					for(int i=(Integer.valueOf(sd.getJtfFirstLine().getText())-1); i<Integer.valueOf(sd.getJtfLastLine().getText()); i++) {
						allCodeCnt++;
					logLine.add(data=br.readLine());//1986���� ���ִ� �輺��
						if(data.contains("key")){
							key=data.substring( data.indexOf("=")+1, data.indexOf("&"));
							keyLine.add(key);
						}//end if
					}//end if
				
				
				
				
				
				
				
			}//try	
			finally {
				if (br != null) {
					//4. �������
					br.close();
				}//end if
			}//finally
			
		}else {
			JOptionPane.showMessageDialog(null, file + "");
		} // end if
		
		int num=0;
		for(String str : keyLine ) {
			Integer count = map.get(str);
			if( count == null ) {
				map.put(str, 1);
			}else {
				map.put(str, count+1 );
			}//end else
			num++;
		}//end for

		double proportion=(double)num;
		for(String opp : map.keySet() ) {
			
//			System.out.println(opp + " : " + map.get(opp) + "(" + (map.get(opp)/proportion)*100+"%)" );
//			System.out.printf( "%s \t %d��(%.2f%%)\n",opp, map.get(opp), ((map.get(opp)/proportion)*100)  );
			maxMap.put(opp, map.get(opp));
		}//end for
		
		Entry<String, Integer> maxEntry=null;
		
		Set<Entry<String, Integer>> entrySet=maxMap.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			if (maxEntry == null || entry.getValue() > maxEntry.getValue()) {
				maxEntry = entry;
			}//end if
		}//end for
		
		System.out.println( " daf" + maxMap);
//		System.out.println( "�ִٻ�� Ű : " + maxEntry.getKey() + ", �ִٻ�� Ű�� Ƚ�� : " + maxEntry.getValue() );
//		System.out.printf( "%s : %.2f%%", maxEntry.getKey(), ((maxEntry.getValue()/proportion)*100));
		return maxEntry.getKey()+ "   " + maxEntry.getValue() +"ȸ";
	}//maxUsedValue
	
	

	public void lineInfo() {
		
	}//lineInfo
	
	public String abc() {
		return "������";
	}
	

}//SelectDialogEvt
