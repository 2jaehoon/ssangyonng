package day1215;

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
		//1.��ī�� Ŭ������ ��ü ����, �⺻ �����ڷ� ��ü�� ������ �� �Ҵ� �Ǿ�� �� ���� ����.
		Marker black = new Marker();
		//2. �����ڷ� �̹� �� ���� ����
		//3.�������� Ư¡�� ������ method ȣ�� => ��ü�� �����ϴ� ���� ���.
		System.out.printf("%s, �Ѳ� %d��, ��ü %d��, ���� %s\n","������ ��ī�� ��ü�� ������", black.getCap(), black.getBody(), black.getColor());
		
		//3.�������� Ư¡�� ������ method ȣ�� => ��ü�� �����ϴ� ���� ���.
		System.out.println(black.write("�ȳ��ϼ���?"));
		
		// ������ ��ī�� ��ü�� �����ϰ� "�ȳ� �ڹ�" �Ẹ����.
		//�����ε�
		//1.��ü ���� 
		Marker red = new Marker(1,1,"�Ķ���");
		//2.�����ڷ� �̹� �� �������� 
//      3.��ü���. : getter method
		System.out.println(red.write("�ȳ� �ڹ�"));
		
		
	}//main

}//class
