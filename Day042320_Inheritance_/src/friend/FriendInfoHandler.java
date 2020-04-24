package friend;

import java.util.Scanner;

public class FriendInfoHandler {
	
	/* Friend 타입의 정보를 저장할 배열을 가진다. 
	 * 친구 정보를 저장하는 기능 
	 * 친구 정보의 기본 정보 출력 
	 * 친구 정보 상세 정보 출력 기능 */

	Friend[] myFriends; //Friend 타입의 배열을 선언
	int numOfFriend; // 저장된 친구의 정보 개수
	
	Scanner kb;

	// 초기화: 저장공간(사이즈) 크기를 받아서 배열 생성
	FriendInfoHandler(int num) {
		myFriends = new Friend[num];
		numOfFriend = 0 ; 	
	}	
	
	// 친구정보를 저장하는 기능
	// 1. 배열에 저장하는 기능
	// 2. 사용자에게 데이터를 받아 사용자 요청에 맞는 인스턴스 생성
	
	
	//1. 배열저장 기능
	void addFriendInfo(Friend f) {    //배열에 저장
		myFriends[numOfFriend] = f;
		numOfFriend++;    // 증감 해주지 않으면 5개를 입력해도 하나만 저장이 된다.
	}
	
	//2. 사용자에게 데이터를 받아 사용자 요청에 맞는 인스턴스 생성
	// HighFriend / UniFriend
	void addFriend(int choice) {
		
				
		// 기본정보 받기 
		String name = kb.nextLine();
		String phoneNum = kb.nextLine();
		String addr =kb.nextLine();
		
		if (choice == 1) {
			
			String work = kb.nextLine();
			// HighFriend 인스턴스 생성
			friend = new highFriend(name, phoneNum, addr, work);
		} else {
			String major = kb.nextLine();
			String grade = kb.nextLine();
			Integer.parseInt(grade); //정수로 반환해주는 메소드이다. 
			
			friend = new UniFriend(name, phoneNum, addr, major, grade);		}
		
		// UnivFriend 인스턴스 생성
			
		//addFriendInfo 호츨 
	}
	
	
	// 친구정보의 기본 정보 출력
	
	void showSimpleData() {
		System.out.println("친구의 기본 정보를 출력합니다.");
	
		for(int i=1; i<numOfFriend; i++) {
			myFrineds[i].showBasicInfo();
			System.out.println"========================");
		}
	
	}
	
	void showAllData() {
		System.out.println("친구의 모든 정보를 출력합니다.");
		for(int i=1; i<numOfFriend; i++) {
			myFrineds[i].showData();
			System.out.println"========================");
	
	}
	
	
	

}
