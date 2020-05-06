package ex;

public class Increment extends Thread{
	
	int num = 0;
	
	//부터~
	synchronized void increment() {
		num++;
	}
	//~까지
	

	int getNum() {
		return num;
	}	
}

class IncThread extends Thread{
	
	Increment inc;
	
	public IncThread(Increment inc) {
		this.inc = inc;
	}
	
	public void run() {
		
		for(int i = 0; i <10000; i++)
			for(int j= 0; j<10000;j++)
				inc.increment();
	}
}
