package ex;

public class ThreadMain1 {
	
	public static void main(String[] args) {
		//Thread 인스턴스를 생성하자
		ShowThread st1 = new ShowThread("___멋진쓰레드");
		ShowThread st2 = new ShowThread("예쁜쓰레드");
		
		//우선순위가 높은 쓰레드의 실행(1~10) setPriority사용한다. 
		//st1.setPriority(1);
		st1.setPriority(Thread.MAX_PRIORITY);
		st2.setPriority(1);
		
		//Thread 실행 : 새로운 프로그램 코드 실행의 흐름
		//start 메서드를 호출해야만 쓰레드가 실행된다. 
		st1.start();	//바로실행x, 실행대기 상태에서 자신의 차례가 되면 실행
		st2.start();
		
		for (int i =0; i < 100 ; i++) {
			System.out.println("메인쓰레드가 실행중입니다. ");
		}
	}

}
