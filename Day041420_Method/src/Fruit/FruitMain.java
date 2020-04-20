package Fruit;

public class FruitMain {

	public static void main(String[] args) {
		
		
		/*셀러 생성
		:인스턴스화 */
		FruitSeller seller = new FruitSeller();
		// new FruitSeller() 객체 생성, 메모리에 변수와 변수의 데이터와 메서드 코드가 저장
		
		//구매자 생성: 인스턴스화 
		FruitBuyer buyer = new FruitBuyer();
		
		//바이어가 사과를 구매 
		buyer.buyApple(seller, 5000);
		System.out.println("구매자가"+buyer.myMoney+"원어치의 사과를 구매하였습니다.");
	
		System.out.println("판매자의 판매정보출력");
		System.out.println("현재 사과의 갯수 :" + seller.numOfApple);
		System.out.println("판매 금액 :"+ seller.myMoney);
		System.out.println("-------------------------------------");
		System.out.println("구매자의 정보");
		System.out.println("현재 남은 금액:"+buyer.myMoney);
		System.out.println("보유한 사과의 갯수:"+buyer.numOfApple);

	}

}
