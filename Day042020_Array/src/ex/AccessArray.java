package ex;

public class AccessArray {

	public static void main(String[] args) {
		
		// int 타입의 정수 데이터 3개를 저장할 수 있는 배열을 생성
		//배열의 이름은 arr로 선언해보자~!
		
		int[] arr;
//		ㄴ배열의 선언
		arr = new int[3];
//		ㄴ배열 인스턴스 생성: 각 요소의 저장공간 생성
		
// 		배열 요소에 참조 ㄱ
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		
		//배열에서 나올 수 있는 오류 두가지 중 array index out of bounds 나오면 범위지정이 잘못된 것! 
		
		int sum = arr[0]+ arr[1] + arr[2];
		System.out.println("숫자들의 합은: "+ sum);
		
	}

}
