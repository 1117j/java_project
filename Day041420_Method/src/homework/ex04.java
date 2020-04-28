package homework;

//문제4.
//전달되는 값이 소수(prime number)인지 아닌지를 판단하여, 
//소수인경우 true를, 소수가 아닌 경우 false를 반환하는 메서드를 정의하고, 
//이를 이용해서 1이상 100 이하의 소수를 전부 출력할 수 있도록 main 메서드를 정의하자.
//소수: 자기 자신보다 작은 수들을 나누어봐서, 하나라도 나누어지면 소수가 아닌 것

public class ex04 {
	
	boolean prime(int num) {
		boolean result = true;
		int count = 0;
		 // 1~100 사이에 나누어 떨어지는 숫자가 있는지 for문으로 확인
		for(int i = 1; i <=100; i++){
		if(num%i==0)
		count += 1;
		if (count>2) //1과 자기자신 외 더 나눌 수 있다면(분할자가 2개보다 많음) 소수가 아님
		result = false;
		}
		return result;
		}
	

		public static void main(String[] args) { 
		ex04 primeNum = new ex04();
	
		for(int i=1; i<=100; i++) {
		if (primeNum.prime(i)==true) {
		System.out.println(i+"은 소수 입니다.");}
		}
	}	
}
