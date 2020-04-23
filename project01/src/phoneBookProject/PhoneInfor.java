package phoneBookProject;

public class PhoneInfor {
/* Version 0.1
 * 작성자 : 이혜진
 * 작성일: 2020.04.20
 * 작성내용: 전화번호 관리 프로그램(이름, 전화번호, 생년월일)
--------------------------------------------------------------------------
Version 0.1 전화번호 관리 프로그램. 
PhoneInfor 라는 이름의 클래스를 정의해 보자. 
클래스는 다음의 데이터들의 문자열 형태로 저장이 가능 해야 하며, 저장된 데이터의 적절한 출력이 가능하도록 메소드 정의
• 이름            name              String
• 전화번호       phoneNumber     String
• 생년월일       birthday            String 
단, 생년월일 정보는 저장할 수도 있고, 저장 않을 수도 있게끔 생성자 생성.
1. 전화번호 저장
2. 전화번호 보기(번호, 이름, 분류)
3. 전화번호 검색
4. 전화번호 삭제 */
	//1. 데이터 문자열 형태로 저장 
	String name;
	String phoneNumber;
	String birthday;
	
	//2. 생성자 
	PhoneInfor(String name, String phoneNumber, String birthday){
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.birthday = birthday;
	}
	
	PhoneInfor(String name, String phoneNumber){
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
		
	//3. 데이터를 출력
	void showData() {
		if(birthday==null)
			System.out.println("이  름: "+ name +", 전화번호: " + phoneNumber + ", 생년월일 : 입력하지 않았습니다." );
		else
			System.out.println("이  름: "+ name +", 전화번호: " + phoneNumber + ", 생년월일 : "+ birthday );
	}
	public static void main(String[] args) {
		PhoneInfor user01 = new PhoneInfor("가나다", "010-3404-1234");
		PhoneInfor user02 = new PhoneInfor("다라마", "010-1231-4545", "11년11월17일");
		
		user01.showData();
		user02.showData();
	}

}


	

