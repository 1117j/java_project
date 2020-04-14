package ex;

public class MethodDefAdd {
	public static void main(String[] args) {
		//스태틱이 정의되어 있는 메소드이다.
		System.out.println("Start");
		hiEveryone(10,158.10);
		hiEveryone(20,160);ㅣ
		hiEveryone(30,181);
		hiEveryone(40,182);
		hiEveryone(50,185);
		hiEveryone(60,196);
		System.out.println("End");
	}

	//인사말 출력, 나이받기, 나이를 출력하는 메서드
	public static void hiEveryone(int age, double height) {
		System.out.println("Hello World!");
		System.out.println("제 나이는"+ age + "세 입니다." +"저의 키는"+ height+ "cm입니다.");
		
	}

}
