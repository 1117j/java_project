package IEBasic;

public class SwitchCaseBreak {

		public static void main(String[] args) {
			
		int menuNum = 1;
		
		switch(menuNum) {
		
		case 1 : 
			System.out.println("1.Simple JAVA");
			break;
		case 2 :
			System.out.println("2.Funny JAVA");
			break;
		case 3: 
			System.out.println("3.Fantastic JAVA");
			break;
		default:
			System.out.println("4.The Best Programming");
		}// break 가 들어가면 {}에 있는 내용을 종료하고 아래로 넘어간다. 
		
		
	
		System.out.println("Hello world!");   //switch 문과 무관
	
	
			

	}

}
