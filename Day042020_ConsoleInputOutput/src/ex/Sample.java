package ex;


import java.util.Scanner;


public class Sample {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		//import java.util.Date;
		//Date date = new Date(); 
		
		//단축키: 컨트롤+스페이스 누르기 
			
		System.out.println("이름을 입력하시오");
		
		String str = sc.next();
		
		System.out.println("번호를 입력하시오");
		int num1 = sc.nextInt();
		
		System.out.println("생년월일을 입력하시오");
		int num3 = sc.nextInt();
		
		System.out.printf("입력된 이름은  %s, %d, %d가 맞습니까? \n", str , num1, num3);

		Scanner YesorYes = new Scanner(System.in);
		
		System.out.println("맞으면 1, 틀리면 2를 눌러주세요");

		int Yes = YesorYes.nextInt();
		if (Yes == 1) {
			System.out.println("Saved");}
		else {
			System.out.println("다시입력하시오");
		}
			
		}
	}

