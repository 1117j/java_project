package op;

public class Sample {
	public static void main(String[]args) {
		
		int gScore = 150;
		
		int lastScore1 = gScore++;
		System.out.println(lastScore1);
		
		int lastScore2 = gScore--;
		System.out.println(lastScore2);
		
		int lastScore3= gScore;
		System.out.println(lastScore3);
		
	}
}	