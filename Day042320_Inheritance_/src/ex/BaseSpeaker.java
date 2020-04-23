package ex;

public class BaseSpeaker extends Speaker {
	
	private int baseRate;
	
	void setBaseRate(int base) { 
		this.baseRate = base;
		
	}
	
	@Override
	void showCurrentState() {
		
		super.showCurrentState();
		System.out.println("베이스의 크기: " + baseRate);
	}

	@Override
	public String toString() {
		return "BaseSpeaker [baseRate=" + baseRate + "]";
	}
}

