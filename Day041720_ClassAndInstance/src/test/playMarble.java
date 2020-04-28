package test;

public class playMarble {
	
	int numOfMarble;
	
	void setData(int num) {
		numOfMarble = num;
	}
	
	void winGame(playMarble boy, int num) {
		numOfMarble += num;
		boy.numOfMarble -= num;
	}
	
	void showData() {
		System.out.println("현재 보유한 구슬의 개수는 "+ numOfMarble+ "개 입니다.");
	}
	
	public static void main(String[]args) {
		
		playMarble b1 = new playMarble();
		playMarble b2 = new playMarble();
		
		b1.setData(15);
		b2.setData(9);
		
		System.out.println("1차 게임: b1이 b2의 구슬 2개를 획득한다.");
		b1.winGame(b2, 2);
		System.out.println("b1의 구슬의 개수: ");
		b1.showData();
		System.out.println("b2의 구슬의 개수: ");
		b2.showData();
		
		System.out.println("2차 게임: b2가 b1의 구슬 7개를 획득한다.");
		b2.winGame(b1, 7);
		System.out.println("b1의 구슬의 개수: ");
		b1.showData();
		System.out.println("b2의 구슬의 개수: ");
		b2.showData();

	}	
	
}



