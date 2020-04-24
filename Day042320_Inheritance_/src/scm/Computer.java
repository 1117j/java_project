package scm;

public class Computer extends Product{

	Computer(int price){
		super(price);
	}
	
		@Override
	public String toString() {
		return "Computer";
	}
	//생성자 때문에 오류생기는 거임.
	
	void display() {
		System.out.println("이것은 무엇인가?");
	}
		
	void music() {
		System.out.println("음악을 듣습니다.");
	}
	
	void programming() {
	 System.out.println("?");
	}
	
	
}
