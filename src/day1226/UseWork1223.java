package day1226;

/**
 * �����ϴ� ���� ����ϴ� Ŭ���� : 
 * ��������� �޾Ƽ� ȭ�� ��� �ۼ�
 * @author user
 *
 */
public class UseWork1223 {
	/**
	 * Work1223���� �����ϴ� ��й�ȣ ������ ����ϴ� �޼ҵ�
	 */
	public void useTempPassword() {
		Work1223 work = new Work1223();
//		char[] tempPass = work.tempPassword1();
		char[] tempPass = work.tempPassword2();
		System.out.println(tempPass);
	}
	
	public void buyLotto(int i) {
		Work1223 work = new Work1223();
		work.lotto(i);
		if(!(i>0&&i<6)) {// 1~5������ ���ڰ� �ƴϸ� �޼��� ����
			System.out.println("1~5������ ������ �Է��� �ּ���");
		}else {	int j=0;


		//������ for������ ���
		for(int[] lottoOne : work.lotto(i)) {
			j++;
			System.out.print(j+"��\t");
			for(int lottoTwo : lottoOne) {
			System.out.print(lottoTwo+ " ");
			}//for
			System.out.println();
		}//for
			
		}//else
	}//buyLotto

	public static void main(String[] args) {
		UseWork1223 uw = new UseWork1223();
		uw.useTempPassword();
		System.out.println("------------------------------------");
		uw.buyLotto(5);

		
	}//main
}//class
