package ex;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		
//		Random rand = new Random();  //생성자에 숫자를 넣을 수 있다.
// ex Random rand = new Random(1);   -> 패턴 발생 		
		//Random rand = new Random(2);
		//값을 넣으면 같은 패턴의 난수를 발생시킴 
		
		Random rand = new Random(System.currentTimeMillis());
		//
		
		for(int i = 0; i < 1; i ++) {
			System.out.println("-------------------");
			System.out.println(rand.nextBoolean());
			System.out.println(rand.nextInt(45)+1);
			System.out.println(rand.nextDouble());
			System.out.println(rand.nextInt(45)+1);
		
		
		
		}	
		

	}

}
