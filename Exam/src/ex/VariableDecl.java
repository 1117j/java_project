package ex;

public class VariableDecl {

	public static void main(String[] args) {
		double num1, num2, result;   // 실수 : double  
		num1 = 1.00000001;
		num2 = 2.00000001;
		
		result = num1 + num2;
		System.out.println(result);
		
		double num3 = num1 * 10000000;
		double num4 = num2 * 10000000;
		double result1 = num3 + num4;
		System.out.println(result1/10000000);
		
		// 주의: 정밀도 떨어짐.. 

	}

}
