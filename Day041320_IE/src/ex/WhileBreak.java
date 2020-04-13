package ex;

public class WhileBreak {

	public static void main(String[] args) {
		
		int i = 0;
		int sum = 0;
		
		// 무한 반복
		while (true) {
			if(sum>100){
				break;
			}
			System.out.println(0);
			i++;
			sum += i;
		}
		
		System.out.println("마지막값은?:"+i);
		System.out.println("합이 100이 넘어가는 시점은:" +sum);
	}

}
