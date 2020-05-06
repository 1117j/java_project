package ex;

public class ThreadMain2 {
	
	public static void main(String[]args) {
		
		// Runnable을 구현하는 인스턴스 생성
		AdderThread at1 = new AdderThread(1, 50);
		AdderThread at2 = new AdderThread(51, 100);
		
		
		//Thread 인스턴스를 생성 
		//상속받을 필요 없음(Runnable)
		// Thread 인스턴스 네임= new 
		Thread t1 = new Thread(at1);
		Thread t2 = new Thread(at2);
		
		//실행의 흐름을 생성
		t1.start(); //run() 호출 프로그램 실행
		t2.start(); 
		
		//t1.join(3000);   3000동안 t1을 실행시키기
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("1부터 100까지의 합 : " + (at1.getNum()+(at2.getNum())));
		
	}

}
