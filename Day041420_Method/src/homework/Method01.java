package homework;

public class Method01 {
	// 두개의정수를 전달받아, 두 수의 사칙연산 결과를 출력하는 메서드와 
			//이 메서드를 호출하는 메인메서드를 정의해보자. 단 나눗셈은 몫과 나머지 각각 출력
	//1. 매개변수 : 정수 2개, 2. 처리: 사칙연산 결과출력 -> 반환 x으로 void 사용!
	
	 	int add = 0;
	 	int sub = 0;
	 	int mul = 0;
	 	int div = 0;
	 	int bal = 0;
	 	
	 	void cal(int a, int b) {
	 		add = a + b;
	 		mul = a * b;
	 		
	 	if (a>b) {
	 		sub = a-b;
	 		div = a/b;
	 		bal = a%b;
	 	}
	 	else {
	 		sub = b-a;
	 		div = b/a;
	 		bal = b%a;
	 	}
	 	
	 	System.out.println("숫자1: "+ a + "숫자2: "+ b);
	 	System.out.println("덧셈: "+add);
	 	System.out.println("뺄셈: "+sub);
	 	System.out.println("나눗셈: "+div + " 나머지는: "+ bal );
	 	System.out.println("곱셈: "+mul);
	 	}
}
