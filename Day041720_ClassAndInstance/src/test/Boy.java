package test;

public class Boy {
	
	//구슬의 개수
	int numOfMarble;
	
	//구슬의 개수 설정
	void setMarble(int num) {
		numOfMarble=num;
	}
	
	void gameWin(Boy boy, int num ) {
		numOfMarble+=num;
		boy.numOfMarble=num;
		}
	void showData() {
		System.out.println("현재 보유한 구슬의 개수는 "+numOfMarble+"개 입니다.");
	
	}
	
	public static void main(String[]args) {
		
		//철수를 생성해보자
		Boy boy1 = new Boy();
		//영희를 생성하였다. 영희는 남자아이다.
		Boy boy2 = new Boy();
		
		//철수는 구슬을 15개를 보유, 영희는 구슬을 9개 보유
		boy1.setMarble(15);
		boy2.setMarble(9);
		
		System.out.println("철수는 구슬을 "+boy1.numOfMarble+"개 보유했다");
		System.out.println("영희는 구슬을 "+boy2.numOfMarble+"개 보유했다");
		
		//1차 게임에서 어린이 1은 어린이 2의 구슬 2개를 획득한다. 
		System.out.println("1차 게임에서 철수는 영희의 구슬 2개를 획득한다. ");
		
		boy1.gameWin(boy2, 2);
		System.out.println("철수");
		boy1.showData();
		System.out.println("영희");
		boy2.showData();
	}	

}
