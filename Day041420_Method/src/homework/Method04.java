package homework;

public class Method04 {
	
	boolean prime(int num) {
		boolean result = true;
		int count = 0;
		for(int i =1; i <= 100; i++) {
			if(num%i == 0)
			count += 1;
			if(count >2)
			result = false;
			}
			return result;
			}
	
	

	public static void main(String[] args) {
		Method04 showAllPrimeNum = new Method04();
		
		for(int i = 1; i <=100; i++) {
			if(showAllPrimeNum.prime(i)== true) {
				System.out.println(i+"는 소수입니다.");
			}
		}
	}
}
