package Homework02;

public class ex04 {

	public static void main(String[] args) {
		//char형 변수 ch가 숫자(‘0’~‘9’)일 때 true인 조건식
		char ch = '0';
		if (!(ch >= '0'&& ch <= '9')) {
			System.out.println("false");
		}
		else {
			System.out.println("true");
		}
	}

}
