package chapter1;

public class Car {

	String color;
	int door;
	
	void drive() {
		System.out.println("운전");
	}

	void stop() {
		System.out.println("브레이크");
	}
}

class FireEngine extends Car{
	void water() {
		System.out.println("물뿌리기");
	}
}

class Ambulance extends Car{
	void siren() {
		
		System.out.println("-----------------------");
	}
 
	public static void main(String[]args) {
		
		Car car = null;
		FireEngine fe1 = new FireEngine();
		FireEngine fe2 = null;
		Ambulance am = null;
				
		fe1.water();
		car =(Car)fe1;
//		car.water();
		
		fe2=(FireEngine)car; //명시적으로 형변환을 해주어야함 
		
			if (car instanceof Ambulance);{
				am = (Ambulance) car;
				am.siren();
			}
	
	}
}