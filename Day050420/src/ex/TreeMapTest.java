package ex;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> tMap = new TreeMap<Integer, String>();
		//key값은 중복되지 않지만, 중복저장도 가능하다(기존의 데이터를 바꿔줌) 
		//입력
		tMap.put(1, "data1");
		tMap.put(2, "data2");
		tMap.put(3, "data3");
		tMap.put(4, "data4");
		tMap.put(5, "data5");
		
		NavigableSet<Integer> navi = tMap.navigableKeySet();
		
		Iterator<Integer> itr = navi.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
