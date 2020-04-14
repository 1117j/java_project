package homework;

public class ex01 {

		// 두개의정수를 전달받아, 두 수의 사칙연산 결과를 출력하는 메서드와 
		//이 메서드를 호출하는 메인메서드를 정의해보자. 단 나눗셈은 몫과 나머지 각각 출력
//1. 매개변수 : 정수 2개, 2. 처리: 사칙연산 결과출력 -> 반환 x으로 void 사용!
	public static void main(String[] args) {
		Method01 sum = new Method01();
	
		int result = sum.cal(1, 2);
		System.out.println("a+b=");
		System.out.println(result);
		;
		
	}

}
