package ex;

public class Ex {
	
	public int Triangle(int height,int width) {
		int result;
		result = (height * width)/2;
		System.out.println(result);
		return result;		
	}
	
	
	
	public static void main(String[]args) {
		Ex Tri = new Ex();
		Tri.Triangle(10, 10);
	
	}

}
