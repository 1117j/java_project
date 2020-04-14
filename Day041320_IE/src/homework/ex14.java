package homework;

public class ex14 {

	public static void main(String[] args) {
		for(int A = 0; A < 10; A++) {
			for(int B = 0; B < 10; B++){
				int result;
				result = A + B;
				if(result != 9)
					continue;
			System.out.println(A+","+B);}
		}
	}
}
