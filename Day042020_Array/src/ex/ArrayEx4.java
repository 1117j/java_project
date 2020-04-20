package ex;

public class ArrayEx4 {

	public static void main(String[] args) {
		
		int[] ball = new int[45];
//		ㄴ 정수 45개를 저장 할 수 있는 배열을 생성
		
//// 각 배열의 요소에 1~45 숫자를 초기화, 인덱스 처리를 위해 for 반복문을 사용한다.
		for(int i = 0 ; i < ball.length ; i++) {
			ball[i] = i + 1; }
//			// 제일 첫번째 수는 1부터 나와야 하기 때문에 +1을 한다. 
//		}
//		for (int i = 0; i < ball.length; i++)
//			System.out.println(ball[i]); //1~45까지 나오는지 확인하기 위한 프린트
		
		
		
//		for (int i = 0; i < 5; i++)
//			System.out.println(ball[i]);
	
		System.out.println("--------------------------");
		
		int temp = 0;
		int j = 0; 
		
		for(int i = 0; i < 10000; i++) {    //그냥 많이 돌리기 위해서 10000번 입력
			j = (int)(Math.random()*44)+1;
					
			temp = ball[0];
			ball[0] =ball[j];
			ball[j] = temp;
		}
	
//		temp = ball[0];
//		ball[0] =ball[1];
//		ball[1] = temp;
		
		for (int i = 0; i < 6; i++)
			System.out.println(ball[i]+" ");
		}
}
