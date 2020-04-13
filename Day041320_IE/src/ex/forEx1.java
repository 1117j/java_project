package ex;

public class forEx1 {

	public static void main(String[] args) {
		// 1~10까지의 합 구하기
		// 반복 +1 씩
		
		//연산의 합을 담는 변수
		int sum = 0;
		for ( int i = 1 ; i <= 10; i++) {
			sum = sum + i;
		}
		System.out.println(sum);

		int i = 1;
	
		while(i<=10) {
			System.out.println(i);
			sum += i;
			i++;
		}

	
	}

}
