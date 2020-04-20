package Homework02;

public class ex06 {
	public static void main(String[] args) {
// 조건 1. int형 변수 year가 400으로 나눠떨어지거나 (조건 1 ||)
// 조건 2. 또는 4로 나눠떨어지고 100으로나눠떨어지지않을 때 (조건2 &&) true인 조건식
		int year = 2400;
		if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
			System.out.println("true");}
		else {
			System.out.println("false");
		}
	}
}
//