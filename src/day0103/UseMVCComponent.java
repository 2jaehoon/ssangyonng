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
//1. �̺�Ʈ ó�� �����ʸ� ���� JComboBox, JList(ActionEvent, ItemEvent ó�� ����)
public class UseMVCComponent extends JFrame implements ActionListener, ItemListener {
	//�̺�Ʈ �߻��� ����ϰ� �� ������Ʈ�� �ν��Ͻ� ������ ����
	private DefaultComboBoxModel<String> dcbm;
	private JComboBox<String> jcb;

	
	
	UseMVCComponent(){
		super("MVC Pattern�� ���Ե� ������Ʈ");
		
		//2. ������Ʈ ����
		//Model ����
		dcbm = new DefaultComboBoxModel<String>();
		DefaultListModel<String> dlm = new DefaultListModel<String>();
		
		String[] columnNames = {"��ȣ","�̸�","����","�ּ�"};
		String[][] rowData = {{"1", "�����","20", "����� ������ ���ﵿ"},
									{"2", "��Թ�","21", "����� ���ʱ� ����1��"},
									{"3", "�躸��","23", "����� ������ ���ﵿ"},
									};
		DefaultTableModel dtm = new DefaultTableModel(rowData, columnNames);
		
		//Model Ŭ������ �־� View ����
		jcb = new JComboBox<String>(dcbm);
		jcb.setBounds(10, 40, 100, 40);
		
		
		JList<String> jl = new JList<String>(dlm); //��ũ�ѹٰ� ����.
		jl.setBounds(120,40,200,100);
		JScrollPane jspJl = new JScrollPane(jl);
		jspJl.setBounds(120,40,200,100);
		
		JTable jt = new JTable(dtm);//scrollbar ����.(��ũ�� �ٰ� ������ �÷����� ������ �ʴ´�)
		
		JScrollPane jspJt = new JScrollPane(jt);
		jspJt.setBounds(340, 40, 400, 100);
		
		
		
		
		
		//�����͸� ���� ������ Model�� ����Ѵ�.
		dcbm.addElement("Java SE");
		dcbm.addElement("Oracle DBMS");
		dcbm.addElement("JDBC");
		dcbm.addElement("456");
		dcbm.addElement("789");
		dcbm.addElement("123");
		
		dlm.addElement("Java�� �Ϻ��� ��ü����");
		dlm.addElement("��뷮 �����͸� �ٷ�� DBMS");
		dlm.addElement("JAVA�� DBMS�� ����");
		dlm.addElement("456");
		dlm.addElement("789");
		dlm.addElement("151");
		
		dtm.addRow(new String[] {"4", "��ΰ�","24", "������ ������ ���ﵿ"});
		dtm.addRow(new String[] {"5", "����ȣ","25", "������ ������ ���ﵿ"});
	

		
		
		//�̺�Ʈ ���////////
//		jcb.addActionListener(this);
		jcb.addItemListener(this);
		
		
		
		
		
		
		
		
		
		
		
		
		
		//3. ��ġ
		setLayout(null);
		add(jcb);
		add(jspJl);
		add(jspJt);
		
		//4. ������ ũ�� ����
		setBounds(1000, 200, 800, 400);
		
		//5. ����ȭ
		setVisible(true);
		//������ ũ�⺯�� ����
		setResizable(false);
		
		//6. ����ó��
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}//UseJComboBox
	
	@Override
	public void itemStateChanged(ItemEvent ie) {
		//JComboBox���� ���õ� �������� ���� �����ͼ� �ֿܼ� ���
		//������ ���õ� �������� �ٽ� ���õǸ� ����� ���� �ƴϹǷ� ���� ���� �� ����.
		//������ ���õ� �����۰� �ٸ� �������� ���õǾ�߸� ���� ���� �� �ִ�.
		
		//���ڵ带 �� ���� ����� �� �ֵ��� ���
//		System.out.println("���õ� ��ȣ :" + ItemEvent.SELECTED+ " / " + "����� ���� ��ȣ : " + ie.getStateChange());
		//���� ���� ���� ���� ���� �� �� �����Ƿ� ���� ���� ���� ��쿡�� ����ϵ��� ����
		if(ie.getStateChange() == ItemEvent.SELECTED)
		System.out.println(dcbm.getElementAt(jcb.getSelectedIndex()));
	}//itemStateChanged
	
	
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		//JComboBox���� ���õ� �������� ���� �����ͼ� �ֿܼ� ���
		//������ ���õ� �������� �ٽ� ���õǴ��� "Ŭ��" �̱� ������ ���� ���� �� �ִ�.
		System.out.println(dcbm.getElementAt(jcb.getSelectedIndex()));
	}//actionPerformed

	
	
	
	
	public static void main(String[] args) {
		new UseMVCComponent();

	}//main






}//class
