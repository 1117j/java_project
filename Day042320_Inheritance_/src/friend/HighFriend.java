package friend;

public class HighFriend extends Friend {

	 String work;
	 
	 public HighFriend(String name, String phoneNum, String addr, String work) {
		 super(name, phoneNum, addr);
		 this.work = work;
		  
	 }
	 	
	 @Override
	 void showData() {
		super.showData();
		System.out.println("직업: " + work);
	}
}
