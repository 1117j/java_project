package ex;

public class Animal {
	
	String name;   //객체 변수(인스턴스 변수, 멤버 변수, 속성)
	
	public void setName(String name) {
//		this.name = name;
	}
//	
	
	public static void main(String[] args) {
		Animal cat = new Animal();
		System.out.println(cat.name);
		
		Animal dog = new Animal();
		System.out.println(dog.name);
		System.out.println("-----------------------");
		
		cat.setName("jane");
		dog.setName("jonathan");
		
		System.out.println(cat.name);
		System.out.println(dog.name);
		
		
	}

}
