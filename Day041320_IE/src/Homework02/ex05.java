package Homework02;

public class ex05 {

	public static void main(String[] args) {
		// char형 변수 ch가 영문자(대문자 또는 소문자)일 때 true인 조건식
		char ch = 'Z';
		if (ch >= 'a' && ch <= 'z') {
			System.out.println("true");}
		else if(ch >='A' && ch <= 'Z') {
			System.out.println("true");}
		else {
			System.out.println("false");	
		}
	}
}
		//(ch >= 'a' && ch <= 'z') || (ch >='A' && ch <= 'Z')