package day0103;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

@SuppressWarnings("serial")
//1. 이벤트 처리 리스너를 구현 JComboBox, JList(ActionEvent, ItemEvent 처리 가능)
public class UseMVCComponent extends JFrame implements ActionListener, ItemListener {
	//이벤트 발생시 사용하게 될 컴포넌트를 인스턴스 변수로 선언
	private DefaultComboBoxModel<String> dcbm;
	private JComboBox<String> jcb;

	
	
	UseMVCComponent(){
		super("MVC Pattern이 도입된 컴포넌트");
		
		//2. 컴포넌트 생성
		//Model 생성
		dcbm = new DefaultComboBoxModel<String>();
		DefaultListModel<String> dlm = new DefaultListModel<String>();
		
		String[] columnNames = {"번호","이름","나이","주소"};
		String[][] rowData = {{"1", "김경태","20", "서울시 강남구 역삼동"},
									{"2", "김규미","21", "서울시 서초구 서초1등"},
									{"3", "김보경","23", "서울시 강남구 역삼동"},
									};
		DefaultTableModel dtm = new DefaultTableModel(rowData, columnNames);
		
		//Model 클래스를 넣어 View 생성
		jcb = new JComboBox<String>(dcbm);
		jcb.setBounds(10, 40, 100, 40);
		
		
		JList<String> jl = new JList<String>(dlm); //스크롤바가 없다.
		jl.setBounds(120,40,200,100);
		JScrollPane jspJl = new JScrollPane(jl);
		jspJl.setBounds(120,40,200,100);
		
		JTable jt = new JTable(dtm);//scrollbar 없다.(스크롤 바가 없으면 컬럼명이 나오지 않는다)
		
		JScrollPane jspJt = new JScrollPane(jt);
		jspJt.setBounds(340, 40, 400, 100);
		
		
		
		
		
		//데이터를 넣을 때에는 Model을 사용한다.
		dcbm.addElement("Java SE");
		dcbm.addElement("Oracle DBMS");
		dcbm.addElement("JDBC");
		dcbm.addElement("456");
		dcbm.addElement("789");
		dcbm.addElement("123");
		
		dlm.addElement("Java는 완벽한 객체지향");
		dlm.addElement("대용량 데이터를 다루는 DBMS");
		dlm.addElement("JAVA와 DBMS를 연동");
		dlm.addElement("456");
		dlm.addElement("789");
		dlm.addElement("151");
		
		dtm.addRow(new String[] {"4", "모민경","24", "수원시 강남구 역삼동"});
		dtm.addRow(new String[] {"5", "박진호","25", "수원시 강남구 역삼동"});
	

		
		
		//이벤트 등록////////
//		jcb.addActionListener(this);
		jcb.addItemListener(this);
		
		
		
		
		
		
		
		
		
		
		
		
		
		//3. 배치
		setLayout(null);
		add(jcb);
		add(jspJl);
		add(jspJt);
		
		//4. 윈도우 크기 설정
		setBounds(1000, 200, 800, 400);
		
		//5. 가시화
		setVisible(true);
		//윈도구 크기변경 막기
		setResizable(false);
		
		//6. 종료처리
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}//UseJComboBox
	
	@Override
	public void itemStateChanged(ItemEvent ie) {
		//JComboBox에서 선택된 아이템의 값을 가져와서 콘솔에 출력
		//기존에 선택된 아이템이 다시 선택되면 변경된 것이 아니므로 값을 얻을 수 없다.
		//기존에 선택된 아이템과 다른 아이템이 선택되어야만 값을 얻을 수 있다.
		
		//이코드를 한 번만 출력할 수 있도록 출력
//		System.out.println("선택된 번호 :" + ItemEvent.SELECTED+ " / " + "변경된 상태 번호 : " + ie.getStateChange());
		//변경 전과 변경 후의 값이 두 번 나오므로 상태 값이 같은 경우에만 출력하도록 설정
		if(ie.getStateChange() == ItemEvent.SELECTED)
		System.out.println(dcbm.getElementAt(jcb.getSelectedIndex()));
	}//itemStateChanged
	
	
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		//JComboBox에서 선택된 아이템의 값을 가져와서 콘솔에 출력
		//기존에 선택된 아이템이 다시 선택되더라도 "클릭" 이기 때문에 값을 얻을 수 있다.
		System.out.println(dcbm.getElementAt(jcb.getSelectedIndex()));
	}//actionPerformed

	
	
	
	
	public static void main(String[] args) {
		new UseMVCComponent();

	}//main






}//class
