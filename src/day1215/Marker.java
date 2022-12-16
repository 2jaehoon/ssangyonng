package day1215;

/**
 * ��ī���� ������� �߻�ȭ�Ͽ� ���� Ŭ����<br>
 * ����� Ư¡ : �Ѳ�, ��ü, ��<br>
 * ������ Ư¡ : ����<br>
 * ����)<br>
 * ��ü ���� �� ���<br>
 * Marker ��ü�� = new Marker();
 * @author user
 *
 */
public class Marker {
	private int cap; //�Ѳ��� ������ ������ ����  //0���� �ڵ��ʱ�ȭ
	private int body; // ��ü�� ������ ������ ���� //0���� �ڵ��ʱ�ȭ
	private String color; //���� ������ ���� //null���� �ڵ� �ʱ�ȭ

	
	/**
	 * ��ī�� Ŭ������ �⺻ ������<br>
	 * ��ü�� ������ �� ������ �־���� �⺻ ���� ����<br>
	 * ���� �ϳ�, ��ü �ϳ�, �������� ��ī�� ��ü
	 */
	public Marker() {
		this(1,1,"������");//��ü���� ���� �����ڸ� ȣ���Ѵ�. ��ȣ..(�ߺ��ڵ带 ���� �� �ִ�)
	}//Marker
	
	/**
	 * �����ִ� ������ (�������� Overloading)<br>
	 * �Ѳ��� ��ü, ���� �Է� �޾Ƽ� ��ī�� ��ü�� ������ �� ����ϴ� ������
	 * ���� "����", "����", "�Ķ�" ���� ����
	 * �ش� ���� �ƴϸ� "����" ������ �ڵ� ���� 
	 * @param cap �Ѳ��� ��
	 * @param body ��ü�� ��
	 * @param color ������ ��
	 */
	public Marker(int cap, int body, String color) {
//		switch(color) {
//		case "������" :
//			color = "������";
//			break;
//		case "������" :
//			color = "������";
//			break;
//		case "�Ķ���" :
//			color = "�Ķ���";
//			break;
//			default : color = "������";
//			}
		if(color.equals("������")||color.equals("�Ķ���")||color.equals("������")) {
			
		}else {color = "������";
		}
		
		
		this.cap=cap;
		this.body=body;
		this.color=color;
	}//Marker
	
	
	
	
	
	
	
	
	
	
	/**
	 * ������ ��ī�� ��ü�� �Ѳ� ������ �����ϴ� ��.
	 * �Ѳ��� �ϳ� �̻� ������ �� ����.
	 * @param cap ������ �Ѳ��� ����
	 */
	public void setCap(int cap) {
		if(cap>1) {
			cap =1;
		}
		this.cap = cap;
	}//setCap
	
	/**
	 * ������ ��ī�� ��ü�� �Ѳ� ������ ��ȯ�ϴ� ��
	 * @return ��ī�� ��ü�� ������ �Ѳ��� ��
	 */
	public int getCap()
	{
		return cap;
	}//getCap
	
	/**
	 * ������ ��ī�� ��ü�� ��ü ������ �����ϴ� ��.
	 * @param body ������ ��ü�� ����
	 */
	public void setBody(int body) {
		this.body = body;
	}//setBody
	
	/**
	 * ������ ��ī�� ��ü�� ��ü ������ ��ȯ�ϴ� ��
	 * @return ��ī�� ��ü�� ����
	 */
	public int getBody() {
		return body;
	}//getBody
	
	
	/**
	 * ������ ��ī�� ��ü�� ���� �����ϴ� ��
	 * @param color ������ ��
	 */
	public void setColor(String color) {
		this.color = color;
	}//setColor
	
	
	/**
	 * ������ ��ī�� ��ü�� ���� ��ȯ�ϴ� ��
	 * @return color ������ ��
	 */
	public String getColor() {
		return color;
	}//getColor
	
	
	
	
	
	
	
	/**
	 * ������ ��ī�� ��ü�� ����Ͽ� ĥ�ǿ� �޽����� ���� �� ����.
	 * @param msg ĥ�ǿ� ����� �޽���
	 * @return ����ϴ� �ൿ.
	 */
	public String write(String msg) {
		return "ĥ�ǿ� " + color +  "�� ��ī������ \""+msg+"\"�� ����.";
	}//write

}//class
