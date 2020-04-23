package op;

import java.util.Scanner;

public class Sample3 {
	
	public static void main(String[] args) {
		
		
		
		int math, eng;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("math Score >>");
		
		math = sc.nextInt();
		
		System.out.println("english Score >>");
		
		eng = sc.nextInt();
				
		
		int sum = math + eng;
		int average = sum/2;
		
		System.out.println("총점: " + sum);
		System.out.println("평균: " + average);
		
		
		
	}

}
