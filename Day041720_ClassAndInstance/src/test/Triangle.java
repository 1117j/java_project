package test;

public class Triangle {
	
	//변수: 밑변, 높이
	int width; // 밑변의 데이터
	int height; // 높이 데이터
	
	//밑변과 높이 데이터를 변경하는 메서드 
	
	//생성자 : 인스턴스 생성시 반드시 한번 실행 -> 인스턴스 변수들의초기화 작업
			//생략 가능(default Constructor)

	
	void setData(int w, int h) {
		width=w;
		height=h;}
	
		//삼각형의 넓이를 구해서 반환하는 메서드
	float area() {
		float result =width * height /2f;
		return result;
	}

}
