package Fruit;

//작성자 : 이혜진 
//수정일 : 2020. 04. 17
//수정내용 : 생성자로 변수 초기화 


public class FruitSeller {

//		속성은 (변수로 표현한다) 
//		사과의 갯수
//		수입
//		사과의 가격
		int numOfApple; // 사과의 갯수, 멤버 변수, 인스턴스 변수
		int myMoney; // 수입
		final int APPLE_PRICE;
		public FruitSeller(int money, int appleNum, int price) {
			myMoney = money;
			numOfApple = appleNum;
			APPLE_PRICE = price;
		}
		
		int price = 1000; // 사과의 가격
		//*변수 만들때 주석 달아주세요~!	by. 쌤
		//판매기능: 메서드
		//1. 돈을 받는다 . 2. 받은 돈의 사과 갯수 구하기. 
		//3. 나의 사과 갯수에서 반환 사과 갯수 빼주기
		//4. 받은 금액은 나의 수입으로 더해주기 5. 사과의 갯수 반환하기 
		//6. 반환 데이터 int return 사과의 갯수 
		
		int saleApple(int money){
			int num = money/APPLE_PRICE;
			//numOfApple = numOfApple - num;
			numOfApple -= num;
			myMoney += money; // money = myMoney + money
			
			return num; 
		}
		
		void showResult() {
			System.out.println("남은 사과는 "+ numOfApple);
			System.out.println("판매 수익은 "+ myMoney);
		}
		
	
	}
