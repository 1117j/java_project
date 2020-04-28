package ex;

public class RunTimeExceptionCase {

	public static void main(String[] args) {
		
		try {
		int[] arr = new int[3];
		arr[3] = 20;
		} catch(IndexOutOfBoundsException e) {
			System.out.println(e.getMessage());	
		}
		
		try {
		Object obj = new int[10];
		String str = (String) obj;
		//예외 처리 or instanceof 처리
		}catch(ClassCastException e) {
			System.out.println(e.getMessage());
		}
		
		try {
		int[] arry = new int[-10];
		} catch(NegativeArraySizeException e) {
			System.out.println(e.getMessage());
		}
		
		try {
		String str = null;
		int len = str.length();
		} catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}

			//하나의 try블록에 여러개의 catch 블록 생성 가능;
		// catch의 실행은 위에서 아래로, 첫번째 catch 부터 내려옴.
	}

}
