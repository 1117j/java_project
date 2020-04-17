package card;

public class CardMain {

	public static void main(String[] args) {
		
		//인스턴스 생성 
		Card c1 = new Card();
		c1.kind = "heart";
		c1.number = 7;	
				
		//인스턴스 생성
		Card c2 = new Card();
		c2.kind = "spade";
		c2.number = 4;
		
		
		System.out.println("1번 카드모양은" + c1.kind + ", 숫자는"+c1.number+"입니다.");
		System.out.println("1번 카드높이는" + c1.height + ", 폭은"+c1.width+"입니다.");
		System.out.println("2번 카드모양은" + c2.kind + ", 숫자는"+c2.number+"입니다.");
		System.out.println("2번 카드높이는" + c2.height + ", 폭은"+c2.width+"입니다.");
	
		
		
	}
}
