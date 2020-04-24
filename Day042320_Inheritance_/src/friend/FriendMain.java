package friend;

public class FriendMain {

	public static void main(String[] args) {
		
		FriendInfoHandler handler = new FriendInfoHandler(10);
		
		while(true) {
			System.out.println("메뉴를 선택해주세요================");
			System.out.println("1. 고등학교 친구 저장");
			System.out.println("2. 대학교 친구 저장");
			System.out.println("3. 친구의 기본정보 출력");
			System.out.println("4. 친구의 전체정보 출력");
			System.out.println("5. 종료=======================");
			
			int choice = handler.kb.nextInt();
			
			handler.kb.nextLine();   //목적: 앞의 버퍼를 클리어하기위한 목적
			
			switch(choice) {
			case 1: case 2: 
				handler.addFriend(choice);
				break;
			case 3: 
				handler.showSimpleData();
				break;
			case 4:
				handler.showAllData();
			case 5: 
				System.out.println("프로그램을 종료합니다.");
				return; 
				break;
				
				
			}
			
			
			
		}
			
	
	}

}
