package day0103;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
//1. 윈도우 컴포넌트 상속
@SuppressWarnings("serial")
public class Work0102 extends JFrame {
	public Work0102() {
		super("숙제");
		// 2. 컴포넌트 생성
		//이름에 대한 라벨과 텍스트 필드 생성
		JLabel jlbName = new JLabel("            이름");
		JTextField jtfName = new JTextField();
		
		//나이에 대한 라벨과 콤보 박스 생성
		JLabel jlbAge = new JLabel("            나이");
		JComboBox<String> jcbAge = new JComboBox<String>(" ,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35".split(","));
		
		//성별에 대한 라벨과 버튼그룹으로 버튼을 묶어서 클릭이 하나만 되게 설정
		JLabel jlbSex = new JLabel("            성별");
		JRadioButton jrbSex = new JRadioButton("남");
		JRadioButton jrbSex2 = new JRadioButton("여");
		ButtonGroup bg = new ButtonGroup();
		bg.add(jrbSex);
		bg.add(jrbSex2);
		
		//전화번호에 대한 라벨과 텍스트 필드 설정
		JLabel jlbNumber = new JLabel("            전화번호");
		JTextField jtfNumber = new JTextField();
		
		//우측의 텍스트 지역 설정
		JTextArea jta = new JTextArea();
		//스크롤바가 필요한 컴포넌트를 추가
		JScrollPane jsp = new JScrollPane(jta);
		//줄 단위 보호 (입력 텍스트가 JTextArea의 끝에 닿으면 자동 줄 변경)
		jta.setLineWrap(true);
		//단어 보호 (줄을 변경할 때 단어 (띄어쓰기된 텍스트)단위로 줄 변경)
		jta.setWrapStyleWord(true);
		
		//버튼을 4개를 생성해 패널을 생성해서 넣어줌
		JButton jbInput = new JButton("입력");
		JButton jbUpdate = new JButton("변경");
		JButton jbDelete = new JButton("삭제");
		JButton jbEnd = new JButton("종료");
		JTextField asd = new JTextField("asd");
		JPanel jpButton = new JPanel();
		
		jpButton.add(asd);
		jpButton.add(jbInput);
		jpButton.add(jbUpdate);
		jpButton.add(jbDelete);
		jpButton.add(jbEnd);
		
		
	
		//3. 배치관리자, 컴포넌트 크기
		
		setLayout(null);//배치관리자를 수동관리로 병경
		
		//이름에 대한 라벨과 텍스트 필드 크기 설정
		jlbName.setBounds(0, 10, 80, 40);
		jtfName.setBounds(100, 10, 100, 40);
		
		//나이에 대한 라벨과 콤보박스 크기 설정
		jlbAge.setBounds(0, 60, 80, 40);
		jcbAge.setBounds(100, 60, 100, 40);
		
		//성별에 대한 라벨과 라디오 버튼 크기 설정
		jlbSex.setBounds(0, 110, 80, 40);
		jrbSex.setBounds(100, 110, 50, 40);
		jrbSex2.setBounds(150, 110, 50, 40);
		
		//전화번호에 대한 라벨과 텍스트 필드 크기 설정
		jlbNumber.setBounds(0, 160, 100, 40);
		jtfNumber.setBounds(100, 160, 100, 40);
		
		//우측의 텍스트 지역크기 설정
		jsp.setBounds(220, 10, 250, 190);
		
		//버튼4개를 모은 패널에 대한 크기 설정
		jpButton.setBounds(130, 210, 260, 100);
		
		
		//4. 배치
		//이름에 대한 라벨과 텍스트 필드 배치
		add(jlbName);
		add(jtfName);
		
		//나이에 대한 라벨과 콤보박스 배치
		add(jlbAge);
		add(jcbAge);
		
		//성별에 대한 라벨과 라디오 버튼 배치
		add(jlbSex);
		add(jrbSex);
		add(jrbSex2);
		
		//전화번호에 대한 라벨과 텍스트 필드 배치
		add(jlbNumber);
		add(jtfNumber);
		
		//우측의 텍스트 지역 배치
		add(jsp);
		
		//4개의 버튼이 담긴 패널 배치
		add(jpButton);
		
		//5. 윈도우 크기 설정
		setBounds(1200, 200, 500, 300);
		
		//6. 가시화
		setVisible(true);
		
		//7. 종료
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new Work0102();
		
		
	}//main

}//class
