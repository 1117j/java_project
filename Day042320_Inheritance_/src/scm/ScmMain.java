package scm;

public class ScmMain {

	public static void main(String[] args) {

		// 상속관계에서 다형성
		// 상위클래스 타입의 차조변수 = 하위클래스의 인스턴스
		Product p = new Tv(100);    //생성자는 값을 넣어주어야 한다. 
				
		Tv tv = new Tv(10);
		Computer com = new Computer(20);
		Audio aud = new Audio(30);
		
		
		// array(같은 타입 변수를 묶어서 사용) 
		
		//명시적 형변환 Product p1 = (Product) tv;
		Product p1 = (Product)tv; //다형성의 형변환 , 자동 형변환 
		Product p2 = com; 
		Product p3 = aud;  
		int sum = tv.price+ com.price + aud.price;
		//-> 배열을 할 수 있는 조건 만들기 
		
		
		//상위 클래스 타입의 배열 생성
		Product[] products = new Product[3];
		products[0] = new Tv(100);
		products[1] = new Computer(100);
		products[2] = new Audio(100);
		
		//products[0].display(); 형변환을 해주어야 사용가능 
		//명시적인 형변환 --> 상위타입 변수에서 하위타입의 변수로 바꿔줄 때, 명시적인 형변환이 필요함
		// instanceof 연산자 = p1 instacne of COmputer => true/false 
		
		//전달 하는 배열에 컴퓨터가 있다면 프로그래밍을 하겠다.
		for(int i =0; i<products.length;i++) {
				
		if(products[0] instanceof Computer) {
			((Computer)products[0]).programming();
		}
				}
		int sumOfPrice = 0;
		int sumOfPoint = 0;
		
		
		/*
		 * for(int i=0; i<products.length; i++){ System.out.println(products[i]);
		 * sumOfPrice += products[i].price; sumOfPoint += products[i].bonusPoint; }
		 * 
		 * System.out.println("전체 제품 가격의 합: " + sumOfPrice);
		 * System.out.println("전체 제품 포인트의 합: " + sumOfPoint);
		 */
		
		//구매자가 제품을 구매하는 시뮬레이션 프로그램을 만들기 
		//프로그램 만들기 위해선 인스턴스 만들어야 함
		Buyer buyer = new Buyer();  // 구매자를 생성
		//제품이 필요 -> 제품을 생성(인스턴스 목적이 아님) 
		Tv product1 = new Tv(300);
		Computer product2 = new Computer(500);
		Audio product3 = new Audio(300);
		
		
		//Tv 구매
		buyer.buy(product1);
		//컴퓨터 구매 
		buyer.buy(product2);
		//audio 구매 
		buyer.buy(product3);	
		//컴퓨터 구매 
		buyer.buy(product2);
		
		System.out.println("현재 보유금액: " + buyer.money);
		System.out.println("현재 포인트: "+ buyer.bonusPoint);
		
		buyer.summary();
	}

}
