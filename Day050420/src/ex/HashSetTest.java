package ex;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class HashSetTest {

	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<String>();
//		HashSet<String> set = new HashSet<>();
//		Set<String> set = new HashSet<>();
		
		set.add(new SimpleNumber(10));
		set.add("First");
		set.add("Second");
		set.add("Third");
		set.add("First");
		
		//set: 순서를 유지하지 않는 데이터의 집합. 데이터의 중복을 허용하지 않는다. 

		System.out.println("저장된 데이터의 개수: "+ set.size());
		
		
		System.out.println("--------------------------");
		
		Iterator<String> itr = set.iterator();
		
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
			// 출력되는 값: Second Third First (Interator 내부에서 임의의 데이터순저장)
		}
		

	}

}
