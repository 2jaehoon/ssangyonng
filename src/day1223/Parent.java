package day1223;

	/**
	 * 부모클래스:모든자식이 가질 공통특징정의
	 * 부모는 자식의 정보 존재 x => 부모는 자식을 모른다.
	 * 부모는 자신을 확장한 클래스의 정보가 없다. => 부모로 객체를 생성하여 자식으로 할당할 수 없다.
	 * @author user
	 *
	 */
	public class Parent {
		
		public void test() {
			System.out.println("부모제공하는 기능");
		}
		
		/**
		 * 자식에선 쓸순 있지만 변경이 안됨
		 */
		public  final void testMethod() {
			System.out.println("부모 그대로 사용해야하는 기능");
		}
		

}//class
