package phoneBookEx_ver06;

public abstract class PhoneInfo {
		// 상속을 위해 기본 클래스를 구성
		
	//지우기 //sw public abstract class PhoneInfo implements Info {
		String name;
		String phoneNum;
		String addr;
		String email;
		
		//인스턴스 변수를 초기화하기
		public PhoneInfo(String name, String phoneNum, String addr, String email) {
			this.name = name;
			this.phoneNum = phoneNum;
			this.addr = addr;
			this.email = email;
		}
		
		//showBasicInfo를 통해 기본 정보 출력하기 
		public void showBasicInfo() {
			System.out.println("이름 : "+ name);
			System.out.println("전화번호 : "+ phoneNum);
			System.out.println("주소 : "+ addr);
			System.out.println("이메일 : "+ email);
			
		}
		//interface구현으로 메서드 오버라이딩 생략


}
