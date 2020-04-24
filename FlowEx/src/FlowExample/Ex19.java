package FlowExample;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int  score = 11;
		
		while(score < 0) {
			System.out.println("점수를 입력하시오");
			score = scan.nextInt();
					
			
			if(score >=90 ) {
				System.out.println("수");
			}else if (score >=90 ) {
				System.out.println("우");
			}else if (score >=80 ) {
				System.out.println("ㅁ");
			}else if (score >=70 ) {
				System.out.println("ㅇ");
			}else {
				System.out.println("ㄱ");
			}
			
		
		}
	}
}