package ex;

public class AddThread extends Thread {
	
	Sum sumInst;
	int start;
	int end;
	
	AddThread(Sum sum, int s, int e){
		sumInst = sum;
		start = s;
		end = e;
	}

	//기억안나면 코드자동화 이용하세요~	
	public void run() {
		for(int i = start; i<= end; i++) {
			sumInst.addNum(i);
		}
	}
	
	
}
