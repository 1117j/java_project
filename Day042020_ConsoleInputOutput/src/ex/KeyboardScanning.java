package ex;


import java.util.Scanner;


public class KeyboardScanning {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		//import java.util.Date;
		//Date date = new Date(); 
		
		//단축키: 컨트롤+스페이스 누르기 
			
		System.out.println("숫자를 입력하시오");
		
		int num1 = sc.nextInt();
		
		System.out.println("숫자를 입력하시오");
		int num2 = sc.nextInt();
		
		System.out.println("숫자를 입력하시오");
		int num3 = sc.nextInt();

		int sum = num1 + num2 + num3;
		
		System.out.printf("입력된 정수 %d, %d, %d의 합은 %d \n", num1 , num2, num3, sum);
		

		
	}

}
