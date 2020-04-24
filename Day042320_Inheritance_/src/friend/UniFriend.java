package friend;

public class UniFriend extends Friend {
	
	String major;    //친구의 전공
	int grade;		// 친구의 학년
	
	
	
	public UniFriend(String name, String phoneNum, String addr, 
			String major, int grade) {
		super(name, phoneNum, addr);
		this.major = major;
		this.grade = grade;
		
		
	}

	@Override
	void showData() {
	
		System.out.println("전공: "+ major);
		showBasicInfo();
		System.out.println("학년: "+ grade);

	}

}
