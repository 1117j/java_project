package Fruit;

public class FruitBuyer {
	// 속성: 변수 처리 
	// 보유한 나의 돈 
	// 사과의 갯수 
	
	int myMoney;
	int numOfApple;
	
	public FruitBuyer(int money) {
		myMoney=money;
		numOfApple=0;
	}
	
	//구매기능: 메서드
//	1. 셀러찾기 받기
//	2. 지출해야 할 돈을 정의
//	3. 셀러에게 돈을 주고 판매 요청 : 사과의 갯수
//	4. 사과의 갯수를 받은 사과의 갯수만큼 증가시키기
//	5. 지출한 돈은 나의 돈에서 차감하기(값을 반환하지 않음으로 void처리)	
	// 참조변수: 해당 클래스로 만들어진 주소값을 저장하는 변수이다. 
	public void buyApple(FruitSeller seller, int money) {
		//구매한 사과의 갯수
//		int num = seller.saleApple(money);
//		numOfApple += num;
//		myMoney -= money;  //return을 쓸 필요가 없다. 
		
		numOfApple+=seller.saleApple(money);
		myMoney -= money;
	}
	public void showBuyResult() {
		System.out.println("현재잔액은 "+ myMoney);
		System.out.println("사과갯수는 " + numOfApple);
		
		
	}}
