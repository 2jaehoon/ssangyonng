package day1214;

public class Work1213 {
	///////////////////////////1111111111111
	public void myName(){
		System.out.println("������");
	}
	
///////////////////////////////////////////////////	2222222222222222222
	public char myinitial() {
	return 'L';
	}

	
	/////////////////////////////////////////////3333333333333333333333
	public void myScore(int score) {
		if(score>-1 && score<101) {
			if(score<40) {
				System.out.println("����");
			} else if(score<60){
				System.out.println("�ٸ� ���� ����");
			}else {
				System.out.println("�հ�");
			}//end if
		}else {
			System.out.println("�߸��� ����");
		}
	}
	
	///////////////////////////////////////////////////////////4444444444444444444
	public void word(char word) {
		if(word>='a'&&word<='z') {
			System.out.println("�ҹ���");
		} else if(word>='A' && word<='Z') {
			System.out.println("�빮��");
		} else if(word>='0' && word<='9') {
			System.out.println("����");
		}
		
	}
	/////////////////////////////////////////55555555555555555555555
	public int myYear(int myYear) {
		int thisYear = 2022;
		int age = (thisYear-myYear)+1;
		return age;
	}
	/////////////////////////////666666666666666666666
	public int diff(int a, int b) {
		if(a>b) {
			return a;
		}else if(b>a){
			return b;
		}else {
		return a;
		}
	}
	
	//7,8�� method�� ����� ���� �����ϴ� method overload�� �غ����� ��
	////////////////////777777777777777777777
	public void gugudan() {
		for(int i=1;i<10;i++) {
			for(int j=2;j<10;j++) {
				System.out.printf("%dX%d=%d\t", j, i, i*j);
			}
			System.out.println();
		
		}
		System.out.println();
	}
	
	/////////////88888888888888888888
	public void gugudan(int dan) {
		for(int i = 1;i<10;i++) {
			for(int j=2;j<dan+1;j++) {
				System.out.printf("%dX%d=%d\t", j, i, i*j);
			}
			System.out.println();
		}
	}
	
	
	
	
	
	public static void main(String[] args) {
		//1.�̸� ��� ������
		Work1213 wk = new Work1213();
		wk.myName();
		System.out.println();
		
		//2. �̸� �̴ϼ� ù���� ��ȯ ���� �� (char)
		System.out.println(wk.myinitial());
		System.out.println();
		
		//3. ������ �Է¹޾� ������ ������ ����ϴ� �� ������
		wk.myScore(69);
		System.out.println();
		
		//4. ���ڸ� �Է¹޾� �ش� ���ڰ� �빮��, �ҹ���, ���� ������ �Ǵ��Ͽ� ����ϴ� �� ������
		wk.word('A');
		System.out.println();
		
		//5. �¾ �ظ� �Է¹޾� ���̸� ��ȯ�ϴ� �� ���� ��
		System.out.println(wk.myYear(1997));
		System.out.println();
		
		//6. �� ���� ���� �Է� �޾� �� �� ū ���� ��ȯ�ϴ� ���� �ϴ� method
		//���� ����� ó�� ���� ��ȯ�Ѵ�. ������
		System.out.println(wk.diff(3, 3));
		System.out.println();
		
		//7. ������ ��ü���� ����ϴ� �޽�� ������
		wk.gugudan();
		
		
		//8. ���� �Է¹޾� �Է��� �ܿ� �ش��ϴ� �������� ����ϴ� �� ������
		wk.gugudan(3);
		
		
		
		
		
		
		
		
		

	}

}
