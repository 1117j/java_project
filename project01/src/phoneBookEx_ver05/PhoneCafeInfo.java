package phoneBookEx_ver05;

public class PhoneCafeInfo extends PhoneInfo {

	String cafeName;	// 동호회 이름
	String nickName;	// 닉네임
	
	PhoneCafeInfo(
			String name, 
			String phoneNumber, 
			String addr, 
			String email,
			String cafeName,
			String nickName) {
		super(name, phoneNumber, addr, email);
		this.cafeName = cafeName;
		this.nickName = nickName;
	}

	@Override
	public void ShowData() {
		showBasicInfo();
		System.out.println("동호회명 :"+cafeName);
		System.out.println("닉네임 : "+nickName);
	
	}
}
