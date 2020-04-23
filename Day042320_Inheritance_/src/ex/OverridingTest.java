package ex;

public class OverridingTest {

	public static void main(String[] args) {
		
		// 다형성: 상위 클래스 타입의 참조변수에 하위클래스(새롭게 만들어지는 클래스)의 인스턴스를 참조
		Speaker sp = new BaseSpeaker();
		
		// 참조변수 sp는 BaseSpeaker 인스턴스 멤버중 Speaker 가 가지던 멤버만 사용한다 
		
				
		sp.showCurrentState();
		//sp.setBaseRate(100);		

		BaseSpeaker bSpeaker = new BaseSpeaker();
		bSpeaker.setVolumeRate(10);
		bSpeaker.setBaseRate(20);
		
		
		bSpeaker.showCurrentState();
		
		System.out.println(bSpeaker);  //toString()
	
	}

}
