package ex;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
	
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		
		treeSet.add(1);
		treeSet.add(2);
		treeSet.add(4);
		treeSet.add(3);
		treeSet.add(1);
		treeSet.add(2);
		//중복불가로 같은 데이터 입력안된다. 
		
		
		System.out.println(treeSet.size());
		// treeSet의 요소의 개수는? -> 출력:  4
		
		Iterator<Integer> itr = treeSet.iterator();
		//Iterator는 list의 모든 값을 가져온다. 
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
