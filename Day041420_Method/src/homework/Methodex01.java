package homework;
//[메서드 문제1번 풀이]
//두개의정수를 전달받아, 두 수의 사칙연산 결과를 출력하는 메서드와 
//이 메서드를 호출하는 메인메서드를 정의해보자. 단 나눗셈은 몫과 나머지 각각 출력
public class Methodex01 {
	
	int add, sub, mul, div, def;
	
	void result(int a, int b) {
		add = a + b;
		mul = a * b;
		
		if(a>b) {
			div = a / b;
			def = a % b;
			sub = a - b;
		}else {
			div = b / a;
			def = b % a;
			sub = b - a;}
		System.out.println(add);
		System.out.println(mul);
		System.out.println(def);
		System.out.println(sub);
		System.out.println(div);
	}

	public static void main(String[]args) {
		
		Methodex01 cal = new Methodex01();
			cal.result(6,10);
	
	}


}

