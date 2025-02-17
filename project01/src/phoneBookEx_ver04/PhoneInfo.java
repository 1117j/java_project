package phoneBookEx_ver04;

//상속을 위한 기본 클래스를 구성하기
//인스턴스 생성의 목적이 없다 
public class PhoneInfo {
	
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
	// 기본 정보 출력 메서드
	void showBasicInfo() {
		System.out.println("이름: "+name);
		System.out.println("전화번호: " +phoneNum);
		System.out.println("주소: "+ addr);
		System.out.println("이메일 주소: "+ email);
	}
	
	
	// 전체 정보 출력 메서드 
	void showAllInfo() {
		//상속 후 오버라이딩을 통해 재 구성 
		showBasicInfo();
	}
	

}
