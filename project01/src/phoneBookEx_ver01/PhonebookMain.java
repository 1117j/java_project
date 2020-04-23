package phoneBookEx_ver01;

public class PhonebookMain {

	public static void main(String[] args) {
		
		phoneInfor info= new phoneInfor("손흥민","010-2222-2222");
		phoneInfor info02 = new phoneInfor("이지혜","010-4270-6666","92년 11월생" );
		
		info.showInfo();
		
		System.out.println("-----------------------------------");
		
		info02.showInfo();
		
	}

}
