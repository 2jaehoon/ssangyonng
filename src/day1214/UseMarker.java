package day1214;

/**
 * ��ī�� Ŭ������ ��ü�� ����ϴ� Ŭ����<br>
 * @author user
 *
 */
public class UseMarker {

	/**
	 * Java Application : �ٵ����� ������ �� �ִ� ���α׷�
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(args);
		//1.��ī�� Ŭ������ ��ü ����
		Marker black = new Marker();
		//������ ��ī�� ��ü�� ������ �ִ� ������ ���� ����.
		//black.cap=1;//private ���� ���� �Ұ� > setter method
//		black.setCap(100);
		//2. ������ ��ü�� �� ����
		black.setCap(100);
		black.setBody(2);
		black.setColor("������");
		//3.�������� Ư¡�� ������ method ȣ�� => ��ü�� �����ϴ� ���� ���.
		System.out.printf("%s, �Ѳ� %d��, ��ü %d��, ���� %s\n","������ ��ī�� ��ü�� ������", black.getCap(), black.getBody(), black.getColor());
		
		//3.�������� Ư¡�� ������ method ȣ�� => ��ü�� �����ϴ� ���� ���.
		System.out.println(black.write("�ȳ��ϼ���?"));
		
		// ������ ��ī�� ��ü�� �����ϰ� "�ȳ� �ڹ�" �Ẹ����.
		//1.��ü ����
		Marker red = new Marker();
//		2. �� �Ҵ�
		red.setCap(2);
		red.setBody(1);
		red.setColor("������");
//      3.��ü���.
		System.out.println(red.write("�ȳ� �ڹ�"));
		
		
	}//main

}//class
