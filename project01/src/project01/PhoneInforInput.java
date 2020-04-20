package project01;

import java.util.Scanner;

public class PhoneInforInput {

	public static void main(String[] args) {
		
		Scanner Input = new Scanner(System.in);
		
		while(true) {
		System.out.println("이름을 입력하시오");	
		String str = Input.next();
		
		System.out.println("핸드폰 번호 입력해주세요(숫자만)");
		int num1 = Input.nextInt();
		
		System.out.println("생년월일을 숫자로 입력해주세요~(YYMMDD)");
		int num3 = Input.nextInt();
		
		System.out.printf("입력된 정보  %s, %d, %d가 맞습니까? \n", str , num1, num3);

		Scanner YesorNo = new Scanner(System.in);
		
		System.out.println("맞으면 1, 맞지않다면 1을 제외한 아무숫자나 눌러주세요");

		int Saved  = YesorNo.nextInt();
		
		if (Saved != 1) {
			System.out.println("다시입력하십시오.");
			}
		else {
			System.out.println("저장되었습니다.");
			break;
		}
			
		}
	
	}

}
