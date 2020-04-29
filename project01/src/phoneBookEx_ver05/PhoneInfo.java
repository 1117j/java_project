package phoneBookEx_ver05;

/*2020.04.29
수정내용: 인터페이스 구현으로 메서드 오버라이딩 생략
 		PhoneInfo 클래스-> 추상클래스*/
 		


public abstract class PhoneInfo implements Info {
// abstract : 추상 키워드 
	String name;
	String phoneNum;
	String addr;
	String email;
	
	//생성자를 통한 초기화 
	PhoneInfo(String name, 
			String phoneNum, 
			String addr, 
			String email){
		this.name = name;
		this.phoneNum = phoneNum;
		this.addr = addr;
		this.email = email;
	}

		void showBasicInfo() {
			System.out.println("이름: "+name);
			System.out.println("전화번호: " +phoneNum);
			System.out.println("주소: "+ addr);
			System.out.println("이메일 주소: "+ email);
		}

		// 전체 정보 출력 메서드
		void showAllInfo() {
			// 상속 후 오버라이딩을 통해 재 구성
			showBasicInfo();
			
		}

	}
