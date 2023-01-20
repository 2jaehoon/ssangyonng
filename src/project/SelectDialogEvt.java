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
//				connectBrowser(); //2번메소드
//				servicePerform(); //3번메소드
//				mostRequestTime(); //4번메소드
//				unNormalRequest(); //5번메소드
//				requestError(); //6번메소드
				
				
//				maxUsedKey(); //보류 //1번메소드 
			} catch (IOException e) {
				e.printStackTrace();
			}
			////////////문제점 열어야지 아래 것이 실행 되게 설정해야함 그래서
			//viewBtn 메서드 안에 뷰포인트를 조건문으로 해서 넣는 게 좋아보임
//			new ViewPrint(sd);       ///////////////////////////////sd로 수정 sd의 값을 가져와야대서
//			String str=sd.getTitle();
//			System.out.println( str );
			/////여기있던 것을 viewBtn으로 아래로 내려보냄 확인요망
			//이렇게 되면 클릭시에만 뷰화면이 열리게 설정됨
		}//end if
		
		if( ae.getSource() == sd.getJbtnReport()) {
//			reportBtn();
			String a = SistLogin.jtfId.getText();
			try {
			if(a.trim().equals("root")) {
				System.out.println("탈락");
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
	
	
	
	public void asd() throws IOException {
		FileDialog fdReport = new FileDialog( sd, "파일 저장", FileDialog.SAVE );

		// 윈도우 컴포넌트는 setVisible을 해야 사용 가능
		fdReport.setVisible(true);
		

		// 디렉토리명. 파일명 얻기
		String path = fdReport.getDirectory();
		String name = fdReport.getFile();
		
//		StringWriter sw = new StringWriter();
//		System.out.println(sw);
		

		if (path != null) {
			sd.setTitle("다른이름으로 파일 저장 " + path + name);
			File file = new File(path + name);
			BufferedWriter bw = null;
			try {
				bw = new BufferedWriter(new FileWriter(path + name+".txt")); ////여기서 바꾸면 됨 okay
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
	
	
	
	////////////////////////////////////리턴값으로 받아와야되는지 생각//////////////////////////////////////////////
	
	
//	1. 최다사용 키의 이름과 횟수 | java xx회
	public String maxUsedKey() throws IOException {
		logLine = new ArrayList<String>();
		List<String> keyLine = new ArrayList<String>();
		Map<String,Integer> map=new HashMap<String,Integer>();
		Map<String,Integer> maxMap=new HashMap<String,Integer>();
		
		File file = new File(sd.getTitle());
		
		if(file.exists()) {
			BufferedReader br = null;
			try{
				// 2. Stream을 사용한 연결
				br = new BufferedReader(new FileReader(file));
				// 3. 줄 단위로 읽기 
				String data = "";
				String key = "";
				allCodeCnt=0;
				while ( (data = br.readLine()) != null) { //\n전까지 읽어 들인다.
					allCodeCnt++;
					logLine.add(data);//1986까지 들어가있는 김성태
						if(data.contains("key")){
							key=data.substring( data.indexOf("=")+1, data.indexOf("&"));
							keyLine.add(key);
						}//end if
					}//end while
				
			}//try	
			finally {
				if (br != null) {
					//4. 연결끊기
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
//			System.out.printf( "%s \t %d번(%.2f%%)\n",opp, map.get(opp), ((map.get(opp)/proportion)*100)  );
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
//		System.out.println( "최다사용 키 : " + maxEntry.getKey() + ", 최다사용 키의 횟수 : " + maxEntry.getValue() );
//		System.out.printf( "%s : %.2f%%", maxEntry.getKey(), ((maxEntry.getValue()/proportion)*100));
		return maxEntry.getKey()+ "   " + maxEntry.getValue() +"회";
	}//maxUsedKey
	
//	2. 브라우저별 접속횟수, 비율
//		IE - xx (xx%)
//		Chrome - xx (xx%)
	public String connectBrowser() { 

		List<String> browsLine = new ArrayList<String>();//brow 다 읽기 - > substring해야함.
		int startidx =0;//[]인덱스 얻기
		int endidx=0;
		String browser =""; //브라우저 라인  값 확인하려고 만듦
		//browsLine for문 돌리기
		for(String data : logLine) {
			//인덱스
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
		
		//map에 들어있는 키, 값 얻기
		String result ="";//여기에 리턴값 넣기/////////////////////////이거 하기!!!!!!!!!!!!!!!!!!!!!!!!
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
			result+=key+" - "+value+ "회,(" + proportion + "%)" + "<br/>";
//			System.out.println(result);
			///여기에 비율도 넣어야하는데 별짓거리를 다해도 IE - xx (xx%) 이런식으로 안나오네....HELP ME.. 
			
//			arr[i]=key+" - "+map.get(key);
//			i++;
//			ind=result.concat( key+" - "+map.get(key) );  //1씩 더나옴.
			
		}//end for
		
		
		return result;
		
		
		
	}//connectBrowser
	
//	3. 서비스를 성공적으로 수행한(200) 횟수,실패(404) 횟수
	public String servicePerform() {
		String succode="200";
		String failcode ="404"; 
		int sucCnt =0;
		int failCnt =0;
		for(String data : logLine) {
			///////////////////////
			//instance변수임 >>>이렇게 계속 instance변수로 카운트 올려도되는지 모르겠음. 셍각해보기
//			allCodeCnt++;
			//인덱스
			if(data.contains(succode)) {
				sucCnt++;
			}else if(data.contains(failcode)) {
				failCnt++;
			}
		}//end for
		return "서비스 성공(200)횟수 : "+sucCnt+"회 ,실패(404) 횟수 : "+failCnt+"회";
		
	}//servicePerform

//	4. 요청이 가장 많은 시간 [10시]
	public String mostRequestTime() {
		List<String> timeLine = new ArrayList<String>();
		String time =""; //브라우저 라인  값 확인하려고 만듦

		for(String data : logLine) {
			//인덱스
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
		
		//value값 기준 최대값구하기
//		Integer maxKey = (Collections.max(map.values()) );// 보류
		
		Entry<String, Integer> maxEntry=null;
		
		Set<Entry<String, Integer>> entrySet=map.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			if (maxEntry == null || entry.getValue() > maxEntry.getValue()) {
				maxEntry = entry;
			}//end if
		}//end for
		
		return "요청이 가장 많은 시간 : "+maxEntry.getKey()+"시";
	}//mostRequestTime

//	5. 비정상적인 요청(403)이 발생한 횟수,비율구하기
	public String unNormalRequest() {
		String errcode ="403"; //브라우저 라인  값 확인하려고 만듦
		boolean flag = false;
		int errcnt =0;
		for(String data : logLine) {
			//인덱스
			flag=data.contains(errcode);
			if(flag) { errcnt++; }
		}//end for
//		System.out.println("403error 개수 :"+errcnt);
		
		//비율
		double pp=(errcnt/(double)allCodeCnt)*100;
		
		String proportion= String.format("%.2f", pp);
		
		return "비정상적요청(403)발생 횟수 : "+errcnt+"회, 비율 : "+proportion +"%";
	}//unNormalRequest

//	6. 요청에 대한 에러(500)가 발생한 횟수, 비율 구하기
	public String requestError() {
		String errcode ="500"; //브라우저 라인  값 확인하려고 만듦
		boolean flag = false;
		int errcnt =0;
		for(String data : logLine) {
			//인덱스
			flag=data.contains(errcode);
			if(flag) { errcnt++; }
		}//end for
//		System.out.println("500error 개수 :"+errcnt);
		
		double pp=(errcnt/(double)allCodeCnt)*100;
		
		String proportion= String.format("%.2f", pp);
		
		return "비정상적요청(505) 발생한 횟수 : "+errcnt+"회, 비율 : "+ proportion +"%";
	}//requestError

//	7. 입력되는 라인에 해당하는 정보출력
//	(예 :1000~1500라인 이 입력되면)
	public String maxUsedValue() throws IOException {
		logLine = new ArrayList<String>();
		List<String> keyLine = new ArrayList<String>();
		Map<String,Integer> map=new HashMap<String,Integer>();
		Map<String,Integer> maxMap=new HashMap<String,Integer>();
		
		File file = new File(sd.getTitle());
		
		if(file.exists()) {
			BufferedReader br = null;
			try{
				// 2. Stream을 사용한 연결
				br = new BufferedReader(new FileReader(file));
				// 3. 줄 단위로 읽기 
				String data = "";
				String key = "";
				
				
				
				
//				while ( (data = br.readLine()) != null) { //\n전까지 읽어 들인다.
//					logLine.add(data);//1986까지 들어가있는 김성태
//						if(data.contains("key")){
//							key=data.substring( data.indexOf("=")+1, data.indexOf("&"));
//							keyLine.add(key);
//						}//end if
//					}//end while
				
				
//				while ( (data = br.readLine()) != null) { //\n전까지 읽어 들인다.		
				allCodeCnt = 0;
					for(int i=(Integer.valueOf(sd.getJtfFirstLine().getText())-1); i<Integer.valueOf(sd.getJtfLastLine().getText()); i++) {
						allCodeCnt++;
					logLine.add(data=br.readLine());//1986까지 들어가있는 김성태
						if(data.contains("key")){
							key=data.substring( data.indexOf("=")+1, data.indexOf("&"));
							keyLine.add(key);
						}//end if
					}//end if
				
				
				
				
				
				
				
			}//try	
			finally {
				if (br != null) {
					//4. 연결끊기
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
//			System.out.printf( "%s \t %d번(%.2f%%)\n",opp, map.get(opp), ((map.get(opp)/proportion)*100)  );
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
//		System.out.println( "최다사용 키 : " + maxEntry.getKey() + ", 최다사용 키의 횟수 : " + maxEntry.getValue() );
//		System.out.printf( "%s : %.2f%%", maxEntry.getKey(), ((maxEntry.getValue()/proportion)*100));
		return maxEntry.getKey()+ "   " + maxEntry.getValue() +"회";
	}//maxUsedValue
	
	

	public void lineInfo() {
		
	}//lineInfo
	
	public String abc() {
		return "오예스";
	}
	

}//SelectDialogEvt
