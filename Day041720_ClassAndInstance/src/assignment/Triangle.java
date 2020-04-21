package assignment;

public class Triangle {
/*[문제1]
 밑변과 높이 정보를 지정할 수 있는 Triangle 클래스를 정의하자.
 끝으로 밑변과 높이 정보를 변경시킬 수 있는 메서드와 삼각형의 넓이를 계산해서 반환하는 메서드도 함께 정의하자.
 
 1. 변수 : 밑변과 높이 
 2. 밑변과 높이 변경 메소드 생성
 3. 삼각형 넓이를 반환 메소드
*/
	
	int height, width;
	
	void Data(int h, int w) {  // 리턴값이 없이 그냥 보여줄때는 void를 사용한다. 
		height = h;
		width = w;
	}
		
	float area(int height, int width){
		float result = (height*width)/2f;
		return result;				
	}

	public static void main(String[]args) {
		
	Triangle tri = new Triangle();
	
	tri.Data(3, 5);
	System.out.println("삼각형의 밑변: "+ tri.width +", 삼각형의 높이: " 
	+ tri.height);
	
	float area = tri.area(tri.height, tri.width);
	System.out.println("삼각형의 넓이는 : "+area+"입니다.");

	}
	
	
}
