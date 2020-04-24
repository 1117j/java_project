package scm;

public class Buyer {

	int money = 15400;   // 구매자가 가지고 있는 금액
	int bonusPoint = 0; // 구매자가 보유하고 있는 포인트 
	
	Product[] item; //구매시에 담을 제품 배열 
	int numOfProduct; //구매 제품 개수 
	
	
	//생성자
	Buyer(){
		this.money = 16500;
		this.bonusPoint = 0;
		this.item = new Product[10];
		this.numOfProduct = 0;
		}
	/* void buy(Tv tv) {
	 * }
	 * void buy(Computer com) { //컴퓨터를 구매하기 위해서는
	 * }
	 * void buy(Audio aud) {
	 * }
	 *product 타입의 상속을 통해 처리*/ 
	void buy(Product p) {
		
		//구매하고자 하는 상품의 금액과 나(buyer)의 보유금액을 비교하여 구매여부를 확인하기
		if(money < p.price) {
			System.out.println("보유하신 금액이 부족합니다.");
			return; //return을 이용하여 buy라는 메소드를 종료
		}
		// 구매처리하기 
		this.money -= p.price; //보유한 금액 - 제품의 금액 = money
		this.bonusPoint += p.bonusPoint;  //보유한 포인트 + 제품포인트 
				
		item[numOfProduct++] = p;
		//numOfProduct++;
		
		
		System.out.println(p+" 제품 구매완료!");
		}
		
	
	// 구매내역을 출력해주는 summary라는 메소드를 만들자(배열을 참조 -> 순차적) 
	void summary() {
		
		int sum = 0;	 // 구매 재품의 총액
		int points = 0;	// 구매한 제품들의 포인트 총합 
		
		String itemList = ""; //구매 제품의 이름 목록
		
		for(int i=1; i<numOfProduct;i++) {   //배열 안 for문을 이용한 연산
			itemList += item[i] + ", ";
		points += item[i].bonusPoint;
		}
	
		System.out.println("구매목록 ==================");
		System.out.println("구매하신 제품은 ");
		System.out.println(itemList + "입니다.");
		System.out.println("구매하신 제품 총액은 ");
		System.out.println(sum + "원 입니다. ");
		System.out.println("금일 적립 포인트:  ");
		System.out.println(points + "점 입니다");
	}
}
