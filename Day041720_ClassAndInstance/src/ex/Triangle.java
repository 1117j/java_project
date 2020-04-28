package ex;

public class Triangle {

	int width = 0;
	int height = 0;
	
	void setData(int w, int h) {
		width = w;
		height = h;
	}
	float area() {
		float result = (width * height)/2f;
		return result;
	}
	
	public static void main(String[]args){
		
		Triangle tri = new Triangle();
		tri.setData(15, 22);
		tri.area();
	}	
}
