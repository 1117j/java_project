package phoneBookEx_ver02;

public class PhoneBookMain {

	public static void main(String[] args) {
		
		PhoneBookManager manager = new PhoneBookManager();
		
		PhoneInfor info = manager.createInstance();
		info.showInfo();
		
	}

}
