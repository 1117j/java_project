package phoneBookEx_ver03;

import java.util.Scanner;

public class PhoneBookManager {
	
		//ver03. phoneInfor 타입의배열을 만들어보자
		
//		PhoneInfor[] pBooks = new PhoneInfor[100];
//				or
		PhoneInfor[] pBooks;
		
		int cnt = 0; // 입력된 사람의 정보 개수 --> 입력된 배열의 요소 개수를 받는 변수를 초기화.
		//1. 참조할 때 반복의 횟수
		
		Scanner sc = new Scanner(System.in);	
		
		public PhoneBookManager() {
			
			pBooks = new PhoneInfor[100];   //배열을 초기화 해주기
			
		}
		
		
		//저장: 이름, 번호, 생년월일 정보를 대상으로 하는 저장
		//배열에 phoneInfor 타입의 참조값을 저장
		void addInfo(PhoneInfor info) {
			
			//배열에 요소 대입
			pBooks[cnt] = info;
			
			//등록된 정보의 개수를 증가
			cnt++;
		}
		
		void addInfo() {
			
			//배열에 요소 대입
			pBooks[cnt] = createInstance();
			
			
			//등록된 정보의 개수를 증가 
			cnt++;
				

		}

		PhoneInfor createInstance() { 
			
			PhoneInfor info = null;
			
			System.out.println("정보를 저장하기 위한 데이터를 입력합니다.");
			System.out.println("이름을 입력해주세요. >>");
			String name = sc.nextLine();
			
			System.out.println("전화번호를 입력해주세요. >>");
			String phoneNum = sc.nextLine();	
			
			System.out.println("생년월일을 입력해주세요. >>");
			String bday = sc.nextLine();


			if (bday == null || bday.trim().isEmpty()) {
				info = new PhoneInfor(name,phoneNum);
			}else {
				info = new PhoneInfor(name,phoneNum,bday);
			}
		
			return info;
							
			}
			
		//전체 리스트 출력 
		void showAllData(){
		
		//전체 데이터 => 입력된 데이터의 개수 cnt
			for(int i = 0; i <cnt; i++) {
				pBooks[i].showInfo();
				System.out.println("-----------------------------------");
			}
			
		}	
			
		//검색: 이름을 기준으로 데이터를 찾아서 해당 데이터의 정보를 출력
		//배열의 요소 (phoneInfor)의 name 속성값으로 배열의 요소 
		void searchInfo() { 
			System.out.println("검색하고자 하는 이름을 입력해주세요~");
			String name = sc.nextLine();
			
			int searchIndex = -1;
			
			//사용자가 입력한 이름으로 배열에 요소를 검색 -> index 
			
			for(int i = 0; i < cnt; i++) {
			 if(pBooks[i].checkName(name)) {
				 searchIndex = i ;
				 break;
			 }
		}
		
		if( searchIndex < 0) {
			System.out.println("찾는 이름의 데이터가 존재하지 않습니다.");
		}else {
			pBooks[searchIndex].showInfo();
			
		
		}
	}	
		
			//삭제: 이름을 기준으로 데이터를 찾아 해당 데이터를 삭제한다 
			
	void deleteInfo() {
	
		System.out.println("삭제하고자 하는 이름을 입력하세요.");
		String name = sc.nextLine();
		
		int searchIndex = -1;
// 사용자가 입력한 이름으로 배열에 요소를 검색 -> index
		for(int i = 0; i<cnt; i++) {
			if(pBooks[i].checkName(name)) {
				searchIndex = i;
				break;
			}
		}
		//삭제
		//pBooks[2] : 삭제, pBooks[2] = null 
		// 데이터 삭제 후 남아있는 데이터 처리는 데이터를 빈 공란이 없이 순차적으로
		// 재정리 2번이 삭제되었다면 3번 이후 데이터들의 주소 값이 -1 처리되어 재저장.	
	
		if(searchIndex < 0) {
			System.out.println("찾는 이름의 데이터가 존재하지 않습니다.");
		}else {
			//삭제: 검색한 index부터 저장된 위치까지 왼쪽으로 시프트
			for(int i = searchIndex; i <cnt-1; i++) {
				pBooks[i]=pBooks[i+1];
			}
		
		//저장된 정보의 개수를 -1
		cnt--;
		
		System.out.println("요청하신 이름의 정보를 삭제했습니다.");
		
		}
			
		
	}
}
	




