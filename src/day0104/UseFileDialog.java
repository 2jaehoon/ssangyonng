package day0104;

import java.awt.Frame;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class UseFileDialog extends JFrame {
	
	private JButton jbtnFileOpen;
	private JButton jbtnFileSave;
	
	public UseFileDialog(){
		super("���� ���̾�α� ���� ");
			
		jbtnFileOpen = new JButton("���� ����");
		jbtnFileSave = new JButton("���� ����");
		
		JPanel jpCenter = new JPanel();
		jpCenter.add(jbtnFileOpen);
		jpCenter.add(jbtnFileSave);
		
		
		//�̺�Ʈ ���
		UseFileDialogEvt ufde = new UseFileDialogEvt(this);
		
		//��ư �̺�Ʈ
		jbtnFileOpen.addActionListener(ufde);
		//�Էµ� ufde��ü�� override��  actionperformed method�� ȣ��
		jbtnFileSave.addActionListener(ufde);
		//�Էµ� ufde��ü�� �������̵��� windowClosing method�� ȣ��
	
		
		addWindowListener(ufde);
		
		add(jpCenter);
		
	
		
		setBounds(1200, 200, 600, 400);
		
		setVisible(true);
		
	}//TestWindowEvent
	
	
	

	public JButton getJbtnFileOpen() {
		return jbtnFileOpen;
	}




	public JButton getJbtnFileSave() {
		return jbtnFileSave;
	}




	public static void main(String[] args) {
		new UseFileDialog();
		JOptionPane.showInputDialog("�Է�");
		JOptionPane.showMessageDialog(null, "�ȳ��ϼ���");
		JOptionPane.showConfirmDialog(null, "�ȳ��ϼ���");
		
	}//main

}//class
