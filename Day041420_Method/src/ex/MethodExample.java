package ex;

public class MethodExample{

	
	int a, b;
	
	public void set(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public void sum() {
		System.out.println(this.a+this.b);
	}
	
	public void avg() {
		System.out.println((this.a+this.b)/2);
	}
	
	
	public static void main(String[]args) {
		
	 MethodExample cal = new MethodExample();
	 cal.set(6,9);
	 cal.sum();
	 cal.avg();
 }
	
}