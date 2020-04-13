package homework;

public class ex3 {
	public static void main(String[] args) {
//		int num1=50, num2=100;
//		int big, diff;
//		big = (num1>num2)? num1:num2;
//		System.out.println(big);
//		diff = (num1>num2)? num1-num2: num2-num1;
//		System.out.println(diff);
		//문제 : if ~ else 형태로 바꾸어보기
		int num1 = 50 , num2 = 100;
		int big, diff;
		if (num1>num2) {
			big = num1;
		System.out.println(big);
		}else {big = num2;
		System.out.println(big);
		}
		
		if (num1>num2) {
			diff = num1- num2;
			System.out.println(diff);
		}else { diff=num2 - num1;
		System.out.println(diff);
		}
		
		
		
		
}
}