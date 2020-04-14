package homework;

public class ex9 {

	public static void main(String[] args) {
		// for문을 사용하여 1~10을 곱하자
		int m = 1;
		for(int i = 1; i < 11; i++) {
			m = i * m;
		}
		System.out.println("1~10까지의 곱은" + m);
	}
}
