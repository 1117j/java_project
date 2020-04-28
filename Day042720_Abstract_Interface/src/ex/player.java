package ex;

// class 앞에 abstract가 있는 경우 이 클래스는 추상클래스임을 의미한다. 
// 추상클래스는 미완성된 클래스를 의미한다.

public abstract class player {
	
	
	int currentPos;
	

	player(){
	}
	
		abstract void play(int pos);
		
		
		abstract void stop();

			
		void play() {
			play(currentPos);
		}

}

