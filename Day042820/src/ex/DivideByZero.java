package ex;

public class DivideByZero {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 0;
		
		try {
			//예외 발생 지점
			int div = num1/num2;
			System.out.println("연산의 결과는 : " + div);		
		}
		catch(ArithmeticException e) {  			//예외처리 
			System.out.println("0으로 나눌 수 없습니다.");
			System.out.println(e.getMessage());
		//e.printStackTrace();  //예외가 발생하는 지 확인 해 볼 떄 사용 
		}finally {System.out.println("무조건 실행하는 finally 블록입니다.");
		}
		System.out.println("프로그램을 종료합니다.");

	}
}

