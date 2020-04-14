package homework;

public class ex13 {

	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			if(i%2 != 0 || i == 6)
				continue;
				for(int j=1; j<10; j++) {
				if(i<j)
					break;
				System.out.println(i+"X"+j+"="+ i*j);
			}
		}
	}
}
