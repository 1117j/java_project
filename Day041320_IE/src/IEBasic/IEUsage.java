package IEBasic;

public class IEUsage {

	public static void main(String[] args) {
		
		int num = 2;
		
		// 양수판별 : 양수일 때"양수입니다" 출력
		
		if (num >0) {
			System.out.println("num은 양수입니다.");
		}
		//짝수 홀수 판별하기
		if ((num%2)==0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
			}
	}

}