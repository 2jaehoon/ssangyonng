package day0105;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class JavaMemoFontEvt extends WindowAdapter implements ActionListener, ListSelectionListener {
	 private JavaMemoFont jmf;
	 private JavaMemo jm;
	 

	 
	

	

	public JavaMemoFontEvt(JavaMemoFont jmf) {
		this.jmf = jmf;
	}//JavaMemoFontEvt
	
	


	public JavaMemoFontEvt(JavaMemo jm) {
		this.jm = jm;
	}




	@Override
	public void windowClosing(WindowEvent we) {
		jmf.dispose();
	}
	




	@Override
	public void actionPerformed(ActionEvent ae) {
		String stringFontValue = (String)jmf.getJlistFont().getSelectedValue();		
		String stringStyleValue = (String)jmf.getJlistStyle().getSelectedValue();
		String stringSizeValue = (String)jmf.getJlistSize().getSelectedValue();
		int value = 0;
		if(stringStyleValue.equals("�Ϲ�")) {
			value =Font.PLAIN;
		}
		if(stringStyleValue.equals("����")) {
			value =Font.BOLD;
		}
		if(stringStyleValue.equals("����Ӳ�")) {
			value = Font.ITALIC;
		}
		if(stringStyleValue.equals("��������Ӳ�")) {
			value = Font.ITALIC |Font.BOLD;
		}

//		Ȯ���� �۵���ų �� �߻�
		if(ae.getSource() ==  jmf.getJbtnOk() ) {
			jmf.dispose();
			jm.jtaNote.setFont(new Font(stringFontValue, value, Integer.valueOf(stringSizeValue)));
			
			//���ϻ���
			File file = new File("e:/dev/temp/dat.txt");
			
			try {
				BufferedWriter bw = new BufferedWriter(new FileWriter(file));
				System.out.println(jm.jtaNote.getFont());
				bw.write(jm.jtaNote.getFont().toString());
				bw.flush();
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
				
			}
			
			
			
			
		
		//�����⸦ �۵���ų �� �߻�
		if(ae.getSource() == jmf.getJbtnExit()) {
			jmf.dispose();
		}
		
//		}
		
	}//actionPerformed

	@Override
	public void valueChanged(ListSelectionEvent le) {
		String stringFontValue = (String)jmf.getJlistFont().getSelectedValue();		
		String stringStyleValue = (String)jmf.getJlistStyle().getSelectedValue();
		String stringSizeValue = (String)jmf.getJlistSize().getSelectedValue();
		int value = 0;

	
		//��Ʈ����Ʈ�� �嵿��ų �� �߻�
		if(le.getSource() == jmf.getJlistFont()) {
			jmf.getJtfFont().setText(stringFontValue);
			jmf.getJtfStyle().setText(stringStyleValue);
			jmf.getJtfSize();
			
			
		jmf.getjlblPreview().setFont(new Font(stringFontValue, 0, 18));
			
		}
		
		
		//��Ÿ�ϸ���Ʈ�� �۵���ų �� �߻�
		if(le.getSource() == jmf.getJlistStyle()) {
			jmf.getJtfStyle().setText(stringStyleValue);
			if(stringStyleValue.equals("�Ϲ�")) {
				value =Font.PLAIN;
			}
			if(stringStyleValue.equals("����")) {
				value =Font.BOLD;
			}
			if(stringStyleValue.equals("����Ӳ�")) {
				value = Font.ITALIC;
			}
			if(stringStyleValue.equals("��������Ӳ�")) {
				value = Font.ITALIC |Font.BOLD;
			}
			jmf.getjlblPreview().setFont(new Font(stringFontValue, value, 18));
			
			}
		
		
		//�������Ʈ�� �۵��ҋ� �߻�
		if(le.getSource() == jmf.getJlistSize()) {
			jmf.getJtfSize();
			jmf.getjlblPreview().setFont(new Font(stringFontValue, value, Integer.valueOf(stringSizeValue)));
			}

		
		
	}

}
