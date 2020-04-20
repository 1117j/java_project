package ex;

public class MethodEx {
	
	public static void main(String[] args) {
		System.out.println("시작");
		hiEveryone(12);
		hiEveryone(13);
		byeEveryone();
		System.out.println("프로그램의 끝");
	}

	public static void hiEveryone(int age)
	{
		System.out.println("좋은 아침입니다.");
		System.out.println("제 나이는?"+ age);
	}
	
	public static void byeEveryone() {
		System.out.println("그럼 20000");
	}
	
	
}
