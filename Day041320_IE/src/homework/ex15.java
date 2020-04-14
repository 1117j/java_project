package homework;

public class ex15 {

//	n=1 일 때 “현재 인원은 1명 입니다.”
//	n=2 일 때 “현재 인원은 2명 입니다.”
//	n=3 일 때 “현재 인원은 3명 입니다.”
//	n>3 일 때 “현재 많은 사람들이 있습니다.”
	
	public static void main(String[] args) {

		int n = 10;
		switch(n) {
		case 1: 
			System.out.println("현재인원은 1명입니다.");
			break;
		case 2: 
			System.out.println("현재인원은 2명입니다.");
			break;
		case 3: 
			System.out.println("현재인원은 3명입니다.");
			break;
		default: 
			System.out.println("현재많은 사람들이 있습니다");}
		}
	}
