package phoneBookEx_ver04;

import java.util.Scanner;

//PhoneInfo 타입의 배열로 친구들의 정보를 저장/수정/삭제/검색/출력
public class PhoneBookManager {
	
	//첫번째. 배열 생성
	//1. 배열 선언
	PhoneInfo[] books; 
	
	//배열에 저장된  요소의 개수 (***)
	int numOfInfo;
	
	Scanner kb;
	
	//생성자를 통해 배열을 생성, 요소의 개수 초기화
	PhoneBookManager(int num){
	
		//배열의 생성
		books = new PhoneInfo[num];
	
		//요소 개수의 초기화
		numOfInfo = 0;
				
		kb = new Scanner(System.in);
	}
	
	
	//두번째. 배열에 정보를 저장하는 기능(2-1 배열에 추가/2-2 사용자로부터 받는 데이터로 인스턴스를 생성)
	//2-1 
	void addInfo(PhoneInfo info) {
		//배열에 numOfInfo(인덱스) 숫자 -> index로 참조값을 저장 
		books[numOfInfo] = info;
		//입력된 정보의 개수를 +1 증가 시킨다. 
		numOfInfo++;	
		
	}
	
	//2-2 사용자로 부터 받은 데이터로 인스턴스 생성
	void createInfo(){
		
		System.out.println("1.일반   2.대학   3.회사   4.동호회");
		
		System.out.println("원하는 번호를 입력해 주세요.");

		//사용자 선택 번호
		//		int select = kb.nextInt();
		//		kb.nextLine();
		int select = Integer.parseInt(kb.nextLine());
		
		
		if(!(select>0 && select<5)) {
		System.out.println("정상적인 메뉴 선택이 아닙니다.\n메뉴를 다시 선택해주세요.");
		return;
		
		}
		
		//2-2-1 기본 정보 수집: 이름, 번호, 주소, 이메일
		System.out.println("이름을 입력해주세요.");
		String name = kb.nextLine();
		
		System.out.println("전화번호를 입력해주세요.");
		String phoneNum = kb.nextLine();
		
		System.out.println("주소를 입력해주세요.");
		String addr = kb.nextLine();
		
		System.out.println("이메일을 입력해주세요.");
		String email = kb.nextLine();
	
		
		PhoneInfo info = null;
		
		
		switch(select) {
		case 1: //2-2-2 기본 클래스로 인스턴스 생성
			info = new PhoneInfo(name, phoneNum, addr, email);
			break;
		case 2: //2-2-3 대학 클래스로 인스턴스 생성
			System.out.println("전공(학과)을 입력해주세요.");
			String major = kb.nextLine();
			System.out.println("학년 정보를 입력하세요.");
			String grade = kb.nextLine();
			
			info = new PhoneUnivInfo(name, phoneNum, addr, email, major, grade);
			break;
			
		case 3: //2-2-4 회사 클래스로 인스턴스 생성
			System.out.println("회사명을 입력하세요.");
			String company = kb.nextLine();
			System.out.println("부서를 입력하세요.");
			String dept = kb.nextLine();
			System.out.println("직급을 입력하세요.");
			String job = kb.nextLine();

			info = new PhoneCompanyInfo(name, phoneNum, addr, email, company, dept, job);
			
			break;
			
		case 4: //2-2-5 동호회 클래스로 인스턴스 생성 
			
			System.out.println("동호회 이름을 입력하세요.");
			String cafeName = kb.nextLine();
			System.out.println("닉네임을 입력하세요.");
			String nickName = kb.nextLine();
			
			info = new PhoneCafeInfo(cafeName, phoneNum, addr, email, cafeName, nickName);
			
			break;
		}
	}
	
		
	
	//세번째. 정보를 출력하는 기능
	void showAllInfo() {
		//for 반복문을 사용하여 for each 반복
		System.out.println("전체 정보를 출력합니다.");
		for(int i = 0; i < numOfInfo; i++) {
			books[i].showAllInfo();
			System.out.println("-------------------");
		}
	}
	
	
	
	int searchIndex(String name) {
		
		int searchIndex = -1;
		//배열의 반복으로 name 값을 비교해서 인덱스값을 찾는다. 
		for(int i = 0; i < numOfInfo; i++) {
			if(books[i].name.equals(name)){
				searchIndex = i;
				break;
			}
		}
		
		return searchIndex;
	}
	
	//네번쨰. 배열의 정보 검색: 이름 기준으로 (기능확장 가능)
	void showInfo() {
		System.out.println("검색하실 이름을 입력하세요.");
		String name = kb.nextLine();
		
		int index = searchIndex(name);
		
		if(index<0) { 
			System.out.println("결과가 없습니다.");
		}else { 
			System.out.println("--------------------");
			books[index].showBasicInfo();
			System.out.println("--------------------");
		}
	}
	
	
	//다섯번째. 배열의 정보를 삭제: 이름을 기준으로 함 
	void deleteInfo() {
		System.out.println("삭제할 이름을 입력하세요.");
		String name = kb.nextLine();
		
		int index = searchIndex(name);
		
		if(index<0) { 
			System.out.println("결과가 없습니다.");
		}else { 
			
			for(int i = index;i < numOfInfo-1 ; i++) {
				books[i] = books[i+1];
				}
			//삭제가 되었으므로 요소의 개수도 -1
			numOfInfo--;
			System.out.println("--------------------");
		
		}
	}
	
	
	//여섯번쨰. 배열의 정보를 수정하는 기능: 이름을 기준으로 함
	void editInfo() {
		System.out.println("변경할 이름을 입력하세요.");
		String name = kb.nextLine();
		
		int index = searchIndex(name);
		
		if(index<0) {
			System.out.println("찾는 결과가 없습니다");
			return;
		}else { 
			
			//저장된 인스턴스가 기본인지 아니면 대학친구인지 회사인지 동호회인지 
			String editName = books[index].name;
			
			System.out.println("수정 데이터 입력을 시작합니다.");
			System.out.println("이름은 " + editName + "입니다.");
			System.out.println("새로운 전화번호를 입력해주세요.");
			String phoneNumber = kb.nextLine();
			System.out.println("새로운 주소를 입력하세요.");
			String addr = kb.nextLine();
			System.out.println("새로운 이메일 주소를 입력하세요.");
			String email = kb.nextLine();
			
			
			
			PhoneInfo info = null; 
			
			// 저장된 인스턴스가 : 기본, 대학, 회사, 동호회
			
			if(books[index] instanceof PhoneUnivInfo) {
				System.out.println("전공을 입력해주세요.");
				String major = kb.nextLine();
				System.out.println("학년을 입력해주세요.");
				String grade = kb.nextLine();
				
			info = new PhoneUnivInfo(editName, phoneNumber, addr, email, major, grade);

			} else if(books[index] instanceof PhoneInfo) {
				info = new PhoneInfo(editName, phoneNumber, addr, email);
			}

			// 배열에 새로운 인스턴스를 저장
			books[index]=info;
		
		
			
		}
	}
}
