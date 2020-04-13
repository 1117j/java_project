package ex;

public class WhileContinue {

	public static void main(String[] args) {
		// 1~10 중 3의 배수 제외 출력
		// 1~10 중 3의 배수만 출력
		
		for(int i = 1; i<=10;i++) {
			
			if(i%3!=0)  //i없으면 3의 배수 제외 출력, i = 논리부정
				
				continue;
			System.out.println(i);
		}

	}

}
