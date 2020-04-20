package ex;

public class ArrayAndMethod {
	public static int[] addAllArray(int[] ar, int addVal) {
		for(int i = 0; i < ar.length; i++)
			ar[i]+= addVal;
		return ar;
	}

	public static void main(String[] args) {
		// 원본 배열 생성 ㄱ 
		int[] arr = {1,2,3,4,5};
		// 결과 저장할 배열을 선언 
		int[] ref;
		
		ref = addAllArray(arr,10);
		System.out.println("동일 배열 참조 여부 확인: " + (arr==ref));
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
		
	}
	//배열(배열 참조변수)을 전달받고 정수값도 받아서, 모든 배열의 요소에 더해준다. 전달받은 배열을 반환한다. 

}
