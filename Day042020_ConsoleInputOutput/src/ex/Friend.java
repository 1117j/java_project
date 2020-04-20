package ex;

public class Friend {
	
	String myName;
	
	//생성자 만들기(초기화)
	Friend(String name){
		myName = name;
		
	}
	
	
	
	
	
	//오버라이딩 : object 클래스의 toString() 메서드를 재 구성한다. 
	// 메서드의 선언부가 원본 메서드의 선언부와 동일해야 한다. 
//1-1	public String toString() {       			// 
//1-1		return "제이름은 " + this.myName + "입니다.";  //구현부는 바뀌어도 됩니다.
//1-1	}
	
	
//2-1	-> source -> generate toString
/*	@Override
	public String toString() {
		return "Friend [myName=" + myName + "]";
	}*/





	// 배열표현은 대괄호[]
	public static void main(String[]args) {
		
		Friend f1 = new Friend("최다니엘");
		Friend f2 = new Friend("유재석");
		
		
		System.out.println(f1.toString());
		System.out.println(f1);
		System.out.println(f2.toString());
		System.out.println(f2);
//		실행결과
/*		ex.Friend@15db9742   -> 클래스이름 @해쉬코드 (16진수)
		ex.Friend@15db9742
		ex.Friend@6d06d69c
		ex.Friend@6d06d69c */
/*		//1-1 public String toString 후 실행결과 
		제이름은 최다니엘입니다.
		제이름은 최다니엘입니다.
		제이름은 유재석입니다.
		제이름은 유재석입니다. */

		
	
	}
	

}
