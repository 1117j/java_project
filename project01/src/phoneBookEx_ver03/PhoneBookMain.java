package phoneBookEx_ver03;

import java.util.Scanner;

public class PhoneBookMain {

	public static void main(String[] args) {
		
		PhoneBookManager manager = new PhoneBookManager();
		
		Scanner sc = new Scanner(System.in);
				
		while(true) {
			//사용자의 입력 데이터를 인스턴스 생성
			
			Menu.showMenu();
			
			int selectNum = sc.nextInt();
			
			//sc.nextInt();
			
			switch(selectNum){
			
			case 1: 
				manager.addInfo();
				break;
			
			case 2: 
				manager.searchInfo();
				break;
				
			case 3: 
				manager.deleteInfo();
				break;
				
			case 4: 
				manager.showAllData();
				break;
			
			case 5: 
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
				
				break;
		
			}
		}
	}
}
