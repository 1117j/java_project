package test;

public class TriangleMain {

	public static void main(String[] args) {
			//스태틱을 붙여주면 전역 메소드
			
			// 삼각형 객체 생성
			//Triangle t = new Triangle();
			
			Triangle tri = new Triangle();
			tri.setData(7,2);
			tri.area();
			
			
			
			// 데이터 설정 
			System.out.println("삼각형의 밑변:"+tri.width+",높이는"+ tri.height);
			
			// 넓이를 구하는 메서드 실행
			System.out.println("삼각형 넓이:"+ tri.area()+"입니다.");
		
		}
	}
