package ex;

public class Man {
// 상위클래스 
// 생성자 초기 	
	
	
	String name;
	
	Man(String name){
	this.name = name;
	}
	
	void tellYourName() {
		System.out.println("나의 이름은 " + name +"입니다");
	}
}
