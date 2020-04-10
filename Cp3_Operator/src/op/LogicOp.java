package op;

public class LogicOp {

	public static void main(String[] args) {
		
		//정수형 데이터 두개를 받는다.
		int num1 = 10, num2 = 20;
		
		//num1 이 num2보다 큰지 확인 : 큰 경우 true, 작은 경우에는 false
		boolean check1 = num1 > num2;
		boolean check2 = num1 == num2;    //논리값
				
		if(num1 == num2) {
			System.out.println("두값은 같습니다");
		}else
			System.out.println("두값은 다릅니다");
					
		if(check1) { 
			System.out.println("num1의 값이 num2보다 큽니다.");
		} else
			System.out.println("num2의 값이 num1보다 큽니다.");
	

	// 1.성인 2.여성중 3.기혼자에게만 메세지를 출력합니다.
	
		int age = 20;
		char gender = 'w';
		
		boolean mCheck = true;
		
		boolean result = age>19 && gender =='w'&& mCheck;

		if(result) {
			System.out.println("메세지를 보냅니다.");
		}
	}
}


	
	
	
	
	
	
	
	
	
	
	
		
	

		 

