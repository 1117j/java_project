package Fruit;
/* 
 작성자: 이혜진
 수정일: 2020.04.17
 수정내용: 생성자로 변수 초기화  
 */

public class FruitBuyer {
	// 속성: 변수 처리 
	// 보유한 나의 돈 
	// 사과의 갯수 
//	int myMoney = 10000;
//	int numOfApple = 0;
	
	int myMoney; 			//변수의 명시적 초기화 변경 
	int numOfApple;
	
	//생성자 ㄱ
	FruitBuyer(){
		myMoney = 5000;
		numOfApple = 0;
	}
	
	FruitBuyer(int money, int num){
		myMoney = money;
		numOfApple = num;
	}
	
	
	//구매기능: 메서드
//	1. 셀러찾기 받기
//	2. 지출해야 할 돈을 정의
//	3. 셀러에게 돈을 주고 판매 요청 : 사과의 갯수
//	4. 사과의 갯수를 받은 사과의 갯수만큼 증가시키기
//	5. 지출한 돈은 나의 돈에서 차감하기(값을 반환하지 않음으로 void처리)	
	// 참조변수: 해당 클래스로 만들어진 주소값을 저장하는 변수이다. 
	//public void buyApple(FruitSeller seller, int money) {
		//구매한 사과의 갯수
//		int num = seller.saleApple(money);
//		numOfApple += num;
//		myMoney -= money;  //return을 쓸 필요가 없다. 
	
	//참조변수: 
	void buyApple(FruitSeller seller, int money) {
	
		//구매한 사과의 개수 
		int num =seller.saleApple(money);
		myMoney -= money;
	}

}
