package day0104;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class UseJOptionPane extends JFrame implements ActionListener {

	private JButton jbtnInput, jbtnMsg, jbtnConfirm;

	public UseJOptionPane() {
		super("JOptionPane ����");
		jbtnInput = new JButton("jbtnInputDialog");
		jbtnMsg = new JButton("jbtnMsgDialog");
		jbtnConfirm = new JButton("jbtnConfirmDialog");

		JPanel jpNorth = new JPanel();
		jpNorth.add(jbtnInput);
		jpNorth.add(jbtnMsg);
		jpNorth.add(jbtnConfirm);

		// �̺�Ʈ ���
		jbtnInput.addActionListener(this);
		jbtnMsg.addActionListener(this);
		jbtnConfirm.addActionListener(this);

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent we) {
				dispose();
			}// windowClosing

		});

		// ��ġ
		add("North", jpNorth);

		// ũ�� ����
		setBounds(100, 100, 400, 200);

		// ����ȭ
		setVisible(true);

	}// UseJOptionPane

	@Override
	public void actionPerformed(ActionEvent ae) {

		if (ae.getSource() == jbtnInput) {
			String name = JOptionPane.showInputDialog("����� �̸��� �Է����ּ���!", "ȫ�浿");
			JOptionPane.showMessageDialog(this, name + "�� �ȳ��ϼ���?");
		}//end if

		if (ae.getSource() == jbtnMsg) {
//			JOptionPane.showMessageDialog(this, "������ �������Դϴ�.");
			JOptionPane.showMessageDialog(this, "������ �������Դϴ�.", "������ ������", 
					JOptionPane.PLAIN_MESSAGE);

		}//end if

		if (ae.getSource() == jbtnConfirm) {
			int flag = JOptionPane.showConfirmDialog(this, "���� �����Ͻðڽ��ϱ�?");
			String msg = "";
			switch(flag) {//0,1,2
			case JOptionPane.OK_OPTION: msg = "���� �����ϰڽ��ϴ�."; break;
			case JOptionPane.NO_OPTION: msg = "���� ���� �ʽ��ϴ�."; break;
			case JOptionPane.CANCEL_OPTION: msg = "�۾� ���.";
			}//end switch
			JOptionPane.showMessageDialog(this, msg);
			
			
		}//end if

	}// actionPerformed

	public static void main(String[] args) {
		new UseJOptionPane();

	}// main

}// class
