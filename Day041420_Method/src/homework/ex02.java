package homework;
// 두 개의 정수 받기, 두수 절대값을 계산 후 출력하는 메서드, 이 메서드를 호출하는 메인메서드 정의하기
//* 단 메서드 호출 시 전달되는 값의 순서에 상관없이 절대값이 계산되어서 출력되어야 한다. 

public class ex02 {

	public static void main(String[] args) {
			
	abs(-10,20);
		
	}		
		
	static void abs(int a, int b) {
		System.out.println(a>=0? a: -a);
		System.out.println(b>=0? b: -b);
	}
	
	
			
		}
	


