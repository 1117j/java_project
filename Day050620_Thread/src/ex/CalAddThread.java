package ex;

public class CalAddThread extends Thread {

	Calculator cal;
	
	public CalAddThread(Calculator c) {
		cal = c;
		
	}
}
