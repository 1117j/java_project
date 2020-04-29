package ex;

public class AutoBoxingUnboxing {

	public static void main(String[] args) {
	
		
		Integer iValue = new Integer(10);
		
		Integer iValuue = 10;  //auto Boxing 
		
		double dValue = 3.14;	//new Dobule(3.14); autoBoxing
		System.out.println(iValue);
		System.out.println(iValuue);
		System.out.println(iValue.toString());
		System.out.println(iValuue.toString());

		int num1 = iValue; //가능  Auto Unboxing
		double num2 = dValue;
		
		System.out.println(num1);
		System.out.println(num2);

	}

}
