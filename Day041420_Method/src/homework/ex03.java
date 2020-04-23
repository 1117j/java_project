package homework;

public class ex03 {
//문제3. 원의 반지름 정보를 전달하면, 
//원의 넓이를 계산해서 반환하는 메서드와 원의 둘레를 계산해서 반환하는 메서드를 각각 정의하고, 
//이를 호출하는 main메서드를 정의하자.
//(2*π*r), (π*r∧2)	
	
public static void main(String[]args) {
	System.out.println("원의 넓이를 반환해보자! 원의 넓이는 "+ area(5));
	System.out.println("원의 둘레를 반환해보자! 원의 둘레는 "+round(5));
}
	
	
	
static float area (float a) {
	final float PI = 3.14f;
	///Math.PI: Math 클래스의 파이를 이용할 수 도 있다.
	float area = 2*PI*a;
	
	return area;
}

static float round(float a) {
	final float PI =3.14f;
	float round = PI*(float)Math.pow(a, 2);
	//Math.pow(a,b) -> Math클래스의 pow 는 'a의 b제곱'
	
	
	return round;
}
	
}




// 
// 
// 
//
