package ex;

class Car{
	int gasolinegauge; //가솔린 게이지 변수 
	
	Car(int gasolinegauge){
		this.gasolinegauge= gasolinegauge;
	}
}
		
class HybridCar extends Car {					// Car클래스를 상속, 
	
	int electronicGauge;
	
	HybridCar(int gasolinegauge, int electronicGauge) {
		super(gasolinegauge);		//상위 클래스의 상속자 호출
		this.electronicGauge = electronicGauge;
	}

		}


class HybridWaterCar extends HybridCar {
	int waterGauge;
	HybridWaterCar(int gasolinegaug, int electronicGuage, int waterGuage) {
		super(gasolinegaug, electronicGuage);
		this.waterGauge = waterGuage;
	}




	public void showCurrentGauge() {
		System.out.println("잔여가솔린: " + gasolinegauge);
		System.out.println("잔여가솔린: "  + electronicGauge);
		System.out.println("잔여가솔린: "  + waterGauge);
	}
}
