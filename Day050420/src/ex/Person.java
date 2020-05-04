package ex;

import java.util.Iterator;
import java.util.TreeSet;

public class Person implements Comparable<Person> {
								//<>객체와 비교하는 Comparable
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	
	}
	
	void showData() {
		System.out.println("이름은 " + this.name + "이고, 나이는 "+ this.age+ "세 입니다.");
	}

	@Override 
	public int compareTo(Person o) {
		
		int result = 0;
//		
//		if(this.age>o.age) {
//			result = -1000;   				// 양수 
//		} else if (this.age <o.age) {
//			result = 1;  					// 음수
//		} else {
//			result = 0;
//		}
//	
		result = this.age - o.age;
		return result;
	}
	
	
	public static void name(String[] args) {
		
		TreeSet<Person> tree = new TreeSet<>();
		
		tree.add(new Person("Jay", 34));
		tree.add(new Person("bon", 27));
		tree.add(new Person("Main", 32));
		tree.add(new Person("Connie", 20));
	
		Iterator<Person> itr = tree.iterator();

		while(itr.hasNext()) {
			itr.next().showData();  //Person 객체 반환해줌 
		}
	}


}
