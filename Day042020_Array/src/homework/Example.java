package homework;

public class Example {

	public static void main(String[] args) {
		int [] arr = new int[5];
		
		System.out.println(arr[0]);
		for(int i = 0; i < arr.length; i++) {
			arr[i]=i*150;
			System.out.println(arr[i]);
		}
	}
}
