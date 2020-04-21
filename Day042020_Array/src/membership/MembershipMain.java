package membership;

public class MembershipMain {

	public static void main(String[] args) {
	
		
		// 회원 정보 5개를 저장할 수 있는 배열을 생성
		// member 타입의 인스턴스와 참조값을 저장하는 메모리 공간
		// member m1, m2 , m3, m4, m5
		Member[] members = new Member[5];
		
		members[0] = new Member("sunny", "가나다", "sunny@gmail,com");
		members[1] = new Member("unny", "나다라", "ssuunn@gmail,com");
		members[2] = new Member("jenn", "북치기", "yuyuyu@gmail,com");
		members[3] = new Member("ellie", "빅토리", "ehlloe@gmail,com");
		members[4] = new Member("vic", "햄토리", "kikiik@gmail,com");
		
		members[0].showInfo();
		members[1].showInfo();
		members[3].showInfo();
		members[4].showInfo();
		
		
		
		
		
		//1-1
//		Member member = new Member[5]
//				("helloh", "가나다", "helloh@gmail.com");
//	
//		//매개변수가없는 생성자가 정의되어야 해요~ 
//		
//		member.showInfo();
//		System.out.println("-----------------------------");
//		System.out.println(member);//member.toString() 호출
//			

	}

}
