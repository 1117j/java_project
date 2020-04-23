package ex;

public class Tv {

	boolean power;
	int channel;
	
	void power() {
		power = !power;
	}
	
	void ChannelUp() {
		channel++;
	}
	
	void ChannelDown() {
		channel--;
	}
	
	void display() {
		System.out.println("tv가 출력됩니다. ");
	}
	
}
