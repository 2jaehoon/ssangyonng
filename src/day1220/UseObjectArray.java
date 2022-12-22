package day1220;

/**
 * 객체배열 => 방 하나에 여러 개의 값을 저장해야할 때
 * 
 * @author user
 *
 */
public class UseObjectArray {
	public UseObjectArray() {
		// 1. 선언)
		DataVO[] objectArr = null;
		// 2. 생성 모든 방의 값이 null로 초기화
		objectArr = new DataVO[4];
		// 3. 값 할당
		DataVO dv= new DataVO("김규미", "서울시 강남구 서초동", 21);
		//3-1방의 객체를 생성하고
		objectArr[0] = new DataVO();
		objectArr[1] = dv; //생성된 객체를 넣을 수 있다.
		objectArr[2] = new DataVO("김보경", "경기도 성남시 분당구", 22);
		objectArr[3] = new DataVO("모민경", "제주시 이도동", 22);
		//3-2 방의 생성된 객체에 setter method를 호출하여 값을 넣는다.
		objectArr[0].setName("김경태");
		objectArr[0].setAddr("서울시 강남구 역삼동");
		objectArr[0].setAge(20);
		// 4. 값 사용
		//4-1 방의 객체를 얻고
		//4-2 getter method를 호출하여 값을 얻는다.
		DataVO temp = null;
		for(int i=0; i< objectArr.length;i++) {
			temp=objectArr[i];
//			System.out.println(objectArr[i]);
			System.out.printf("이름 : %s 주소 : %s 나이 : %d\n",objectArr[i].getName(),objectArr[i].getAddr(),objectArr[i].getAge());
		}//end for
	}// UseObjectArray

	public static void main(String[] args) {
		new UseObjectArray();
	}// main

}// class
