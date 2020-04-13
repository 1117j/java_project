package homework;

public class ex5 {

	public static void main(String[] args) {
		// ex2의 답안 코드를 switch로 바꾸어 보자! 
		int num = -10;
		if (num < 0) {
			System.out.println("0미만");}
		else {
		switch (num/100){
		case 0: 
			System.out.println("0~100");
			break;
		case 1: 
			System.out.println("100~200");
			break;
		case 2: 
			System.out.println("200~300");
			break;
		default : 
			System.out.println("300이상");
		}
	}
}}
