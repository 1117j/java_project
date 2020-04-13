package homework;

public class ex8 {

	public static void main(String[] args) {
		int num = 0;
		int sum = 0;
		while(num <= 1000)
		{if(num % 14==0) {
			System.out.println(num);
			sum = sum + num; 
			} num++;}
		System.out.println("합은"+sum);
		}}
