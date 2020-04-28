package homework;

public class Method03 {

	float radius = 0; 
	
	void setData(float num) {
		radius = num;
	}
	
	void round() {
		float rnd = (float)(2*Math.PI*radius);
		System.out.println("원의 둘레는 "+ rnd+"입니다.");
	}
	
	void circleArea() {
		float area  = (float)(Math.PI*(Math.pow(radius, 2)));
		System.out.println("원의 넓이는" + area + "입니다");
	}

	public static void main(String[]args) {
		
		Method03 circle = new Method03();
		
		circle.setData(7);
		circle.round();
		circle.circleArea();
			
	}
}

