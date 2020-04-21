package ex;

public class TwoDimenArray {

	public static void main(String[] args) {
		// 2차원 배열을 연습해보자
		//1차원 배열 선언,생성
		
		int[][] arr = new int[3][4];
		
		// arr[행의 위치][1차원 배열의 index 0~,1,2,3....]
		// arr[0~2][0~3까지]  -> 표형태로 생각을 한다면 구구단 그르니까 반복문 for
		
		System.out.println("2차원 배열의 사이즈(요소의 개수): "+arr.length );
		// ㄴ[실행결과] 2차원 배열의 사이즈(요소의 개수): 3    
		// ㄴ 행을 보여주는 것을 알 수 있다.
		
		System.out.println("arr[0] 1차원 배열의 사이즈: "+ arr[0].length);
		System.out.println("arr[1] 1차원 배열의 사이즈: "+ arr[1].length);
		System.out.println("arr[2] 1차원 배열의 사이즈: "+ arr[2].length);
		
		System.out.println("----------------------------------");
		//2차원 배열의 요소 참조 방법 
		//2차원 배열의 행의 반복ㄱ
		for(int i = 0; i <  arr.length; i++) {
// 						ㄴ i값은 행을 가르킨다. 
//							1차원 배열의 요소 참조 반복 ㄱ 
			for(int j = 0; j < arr[i].length; j++) {
                              //ㄴarr의 i열의 length만큼
				
				arr[i][j]=i+j;
								
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();  //열을 떨어뜨리기 위한 출력

	}

	}}
