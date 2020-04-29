package ex;

import java.util.StringTokenizer;

public class TokenTest {

	public static void main(String[] args) {
		
		String phoneNum = "Tel 82-02-997-2059 test";  //구분자를 따로 정해주지 않으면 공백으로 구분이 되었다면
		
		StringTokenizer st1 = new StringTokenizer(phoneNum);
		
		while(st1.hasMoreTokens()) {
			System.out.println(st1.nextToken());
		}
		
		System.out.println("-----------------------------------------------------");
		
		StringTokenizer st2 = new StringTokenizer(phoneNum, " -");// 하이픈을 넣어보자 
		
		while(st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());  // 하이픈으로 구분되는 결과를 볼 수 있다. 
		}
		
		System.out.println("-------------------------------------------------------");
		
		StringTokenizer st3 = new StringTokenizer(phoneNum, " -", true);
		
		while(st3.hasMoreTokens()) {
			System.out.println(st3.nextToken());
		}

	}

}
