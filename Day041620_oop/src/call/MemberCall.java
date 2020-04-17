package call;

public class MemberCall {

	//인스턴스 변수
	int iv = 10;
	
	//클래스 변수, 스태틱 변수
	static int cv = 20;
	
	int iv2 = cv;
	static int cv2 = new MemberCall().iv;
	static void staticMethod() {
		System.out.println(cv);
		//static int cv2 = iv;
		MemberCall mc = new MemberCall();
		System.out.println(mc.iv);
	
		
	void instanceMethod(){
		System.out.println(cv);
		System.out.println(iv);
		

	}

}
}

