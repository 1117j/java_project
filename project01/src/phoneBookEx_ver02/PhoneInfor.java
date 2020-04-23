package phoneBookEx_ver02;

public class PhoneInfor {

	// 1.변수선언하기 
	//4. private : 변수의 직접 참조를 막는다. 정보은닉!! 
	private String name;			//친구의 이름
	private String phoneNum;		//친구의 전화번호
	private String bday;			//친구의 생일 
	
	// 3. 초기화를 위한 생성자 만들기  
	PhoneInfor(String name, String phoneNum, String bday){
		this.name = name;
		this.phoneNum = phoneNum;
		this.bday = bday;
	}
	
	PhoneInfor(String name, String phoneNum){
/*3-1*//*	this.name = name;
			this.phoneNum = phoneNum; */// 3-1 같은 방법으로 해도 되고 아래같은 방법으로 해도된다.
/*3-2*/		this(name, phoneNum, null);// 3-2 값이 들어가지 않아도 되기 때문에 null 입력!// 3-2 방법이 추후 수정시 더 관리가 쉬움
		}
	
	
	// 2. 출력하기(반환없음) 
	void showInfo(){
		//System.out.println("이름: "+ this.name + ", 전화번호: " + this.phoneNum+", 생일: "+ this.bday);
							//매개변수없어서 this안써도되나 일단 쓰세요 
		if(this.bday == null) {
			System.out.println("이름: "+ this.name + ", 전화번호: " + this.phoneNum+", 생일: " + "입력하지 않았습니다 ");}
		else {
			System.out.println("이름: "+ this.name + ", 전화번호: " + this.phoneNum+", 생일: "+ this.bday);
		}
		
	}
}
	