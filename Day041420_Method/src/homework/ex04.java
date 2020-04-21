package homework;

//문제4.
//전달되는 값이 소수(prime number)인지 아닌지를 판단하여, 
//소수인경우 true를, 소수가 아닌 경우 false를 반환하는 메서드를 정의하고, 
//이를 이용해서 1이상 100 이하의 소수를 전부 출력할 수 있도록 main 메서드를 정의하자.
//소수: 자기 자신보다 작은 수들을 나누어봐서, 하나라도 나누어지면 소수가 아닌 것


public class ex04 {
	
	int num, count, i; 
	
	for(num = 2; num <=100; num++) {
		count = 0;
		for(i = 2; i < num; i++) {
			if(num%i==0) {
				count+=1;
			}
		if (count==0) {
			System.out.println(num);
		}
		}
	}


	public static void main(String[] args) {

		ex04 Prime = new ex04();
		Prime.num 
		
		
		
	}

}
