package IEBasic;

public class SwitchCase {

	public static void main(String[] args) {
			
		int menuNum = 1;
		
		switch(menuNum) {
		
		case 1 : 
			System.out.println("1.Simple JAVA");
			break;
		case 2 :
			System.out.println("2.Funny JAVA");
			
		case 3: 
			System.out.println("3.Fantastic JAVA");
			
		default:
			System.out.println("4.The Best Programming");
		}
		
		System.out.println("Do you like coffee?");   //switch 문과 무관


	}

}
