package day0105;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

/**
 * 글꼴, 색 변경
 * @author user
 *
 */
@SuppressWarnings("serial")
public class UseFont extends JFrame {
	
	
	public UseFont() {
		super("글꼴 및 색 변경");
		
		JButton jbtn = new JButton("버튼");
		JLabel jlbl = new JLabel("라벨");
		JTextField jtf = new JTextField("텍스트 필드");
		JList<String> jlist  = new JList<String>(new String[] {"김경태","김규미","김보경","모민경","박진호"} );
		JScrollPane jsp = new JScrollPane(jlist);
		setLayout(new FlowLayout());
		
		
		//글꼴변경
		Font font = new Font("궁서체", Font.BOLD, 20);
		
		
		//적용
		jlbl.setFont(font);
		jbtn.setFont(font);
		jtf.setFont(new Font("휴먼편지체", Font.ITALIC, 25));
		jlist.setFont(new Font("SansSerif", Font.ITALIC | Font.BOLD , 25));
		
		//글자색(전경색)
		jlbl.setForeground(Color.blue);
		jbtn.setForeground(Color.gray);
		jtf.setForeground(new Color(0x5F00FF));
		jlist.setForeground(new Color(0x8DDAF8));
		
		
		//바닥색
		Color c = new Color(0xFF9999);
		jtf.setBackground(c);
		jlist.setBackground(new Color(0xFFFF99));
		
		jlbl.setBackground(Color.RED);//바닥색이 투명한 컴포넌트는 불투명도 설정한 후 색을 설정한다.
		jlbl.setOpaque(true); //투명도를 불투명하게 설정한다.
		
		
		add(jlbl);
		add(jbtn);
		add(jtf);
		add(jsp);
		
		setSize(600,300);
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}//UseFont
	
	



	
	
	
	
	
	

	public static void main(String[] args) {
		new UseFont();
		
	}//main

}//class
