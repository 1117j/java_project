package ex;

public class Number {
	
	int num;
	
//	Number(){
//		System.out.println("생성자 호출");
//		num = 1000;
//	}
	
	Number (int n){
		System.out.println("생성자 호출");
		num = n;
	}
	public static void main(String[] args) {
		Number n1 = new Number(10000000);
		System.out.println(n1.num);
	}
}
	
