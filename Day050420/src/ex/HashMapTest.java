package ex;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
//		HashMap<Integer, String> map = new HashMap<Integer, String>();
//		Map<Integer, String> map = new HashMap<Integer, String>();
		
		
		map.put(1,"일번");
		map.put(2,"이번");
		map.put(3,"삼번");
		map.put(8,"팔번");
		
		//참조하는 방식
		System.out.println("1번 학생의 이름은 "+ map.get(1)+ "입니다." );
		System.out.println("8번 학생의 이름은 "+ map.get(8)+ "입니다.");
		
		//삭제 
		map.remove(8);
		
		System.out.println("8번 학생의 이름은 어떻게 되는가?  -> " + map.get(8));
		
	
	}
}
