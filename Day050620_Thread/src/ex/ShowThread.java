package ex;
								//이미 만들어져있는 Thread
								//클래스를 상속 
public class ShowThread extends Thread{

	String threadName; 
	
	public ShowThread(String threadName) {
		//생성자로 초기화
		this.threadName = threadName;
	}

	@Override
	public void run() {
		//반복문을 이용해 출력해보자
		for(int i = 0; i<100; i++) {
			System.out.println("안녕하세요. "+ threadName +" 입니다.");
		}
		
	
		
	}
	
	
	
	
}
