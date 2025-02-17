package phoneBookEx_ver04;

public class PhoneCafeInfo extends PhoneInfo{
	
	String cafeName;		// 동호회 이름
	String nickName;		// 닉네임 정보 
	

	PhoneCafeInfo(
			String name,
			String phoneNum, 
			String addr, 
			String email, 
			String cafeName, 
			String nickName ) {
		super(name, phoneNum, addr, email);
		this.cafeName = cafeName;
		this.nickName = nickName;
	}

	@Override
	void showAllInfo() {
		showAllInfo();
		System.out.println("동호회 이름: " + cafeName);
		System.out.println("닉네임: "+ nickName);
	}

}
