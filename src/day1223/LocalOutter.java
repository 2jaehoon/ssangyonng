package day1223;

/**
 * Ŭ������ ��������ó�� ���
 * @author user
 *
 */
public class LocalOutter {
	int i;
	
	public LocalOutter() {
		System.out.println("�ٱ�Ŭ������ ������");
	}//LocalOutter
	
	public void outMethod(int paramI, final int paramJ) {
		int locI = 0;
		final int locJ = 0;
		
		//////////////////////////////////����Ŭ���� ����/////////////////////////
		class LocalInner{
			int k;
			public LocalInner() {
				System.out.println("LocalInner ������");
			}//LocalInner
			
			public void locMethod() {
				System.out.println("����Ŭ���� �޼ҵ�");
				System.out.println("�ܺ� Ŭ������ �ν��Ͻ� ���� : " + i);
//				paramI=12;//����Ŭ���������� �Ű�����, ���������� �� �Ҵ� �� �� ����.
//				locI=12;
				//JDK1.7������ final�� ���� ������ ����� �� �ִ�.
				System.out.println("�Ű����� ���� : " + paramI +"/"+ paramJ);
				System.out.println("�������� ���� : " + locI + "/" + locJ);
			}
			
		}//class
		//////////////////////////////////����Ŭ���� ��/////////////////////////
		//����Ŭ������ ��üȭ
		LocalInner li = new LocalInner();
		li.locMethod();
	}//outMethod

	public static void main(String[] args) {
		LocalOutter lo = new LocalOutter();
		lo.outMethod(12, 23);
	}//main

}//class
