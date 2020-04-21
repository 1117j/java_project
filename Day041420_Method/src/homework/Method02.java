package homework;

public class Method02 {
	// 두 개의 정수 받기, 두수 절대값을 계산 후 출력하는 메서드, 이 메서드를 호출하는 메인메서드 정의하기
	//* 단 메서드 호출 시 전달되는 값의 순서에 상관없이 절대값이 계산되어서 출력되어야 한다. 
	int Abs1=0;
	int Abs2=0; 		// 1. 두개의 정수를 받는다. 
	
	void value(int a, int b) {
		Abs1 = a; 					// 2. 결과값을 반환
		Abs2 = b;
		
	if (a < 0) {
		Abs1 = a * (-1);}			//3. 조건식
	else;
	System.out.println(Abs1);
	if (b < 0) {
		Abs2 = b * (-1);}
	else;
	System.out.println(Abs2);
	}
	
	//혹은 간단하게 System.out.println(a+"의 절대값 = "+Math.abs(a));하면 된다...ㅠㅠ
	

}
