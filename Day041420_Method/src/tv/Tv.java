package tv;

public class Tv {

	// Tv의 속성(변수) -> 멤버 변수, 인스턴스 변수 
	String color; 		// 색상 값
	boolean power;		// 전원 상태
	int channel;		// 채널 값

	//tv의 기능 -> 메서드 , 클래스의 멤버
	//tv 전원 on, off 기능
	void power() {
		power = ! power ;	
	}
	// 채널을 올리는 
	void channelUp() {
		//channel = channel +1;
		//channel ++;
		++channel; 
	}
	void channelDown() {
		channel--;
	}
	
	// 채널값을 변경하는 : 채널값을 받아서 변경(매개변수 정해야함) 
	void channelChange(int ch){
		channel = ch;
	}

}


