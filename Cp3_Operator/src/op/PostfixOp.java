package op;

public class PostfixOp {  
	public static void main(String[] args) {
		
		//하나의 statement의 마침표인 ;(세미콜론)을 사용하는데 ++(혹은--)a는  문장이 끝나기전 증가(혹은 감소)하며, 
		// a++(혹은--)이면, 다음 문장에서 연산자 값이 증가하거나 감소한다. 
		int num1 = 7;   // num1=7
		int num2 = num1++; // num2=7, num1=8  
		int num3 = num1--; // num2=7 num3=8 num1=7
		
		System.out.println(num1++); //출력: num1:8 num2:7 num3:8
		System.out.println(num2); //출력: 7
		System.out.println(num2--); //출력: 7, num2=6
		System.out.println(num3); //출력:8

	
	
}
}
