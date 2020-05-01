package ex;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		/* 리스트는 반드시 객체를 저장.
		 * 리스트의 단점: 중간에 
		 * List<E> -> ArrayList 
		 * List<E> -> 저장 순서를 가진다. 데이터의 중복 저장 가능 
		 * 순서-> 일괄처리(반복적인 동일한 작업을 빠르게 처리할 수 있다.) 
		 * ArrayList 인스턴스 생성: Integer 타입의 객체만 저장
		 * ArrayList<Integer> list = new ArrayList<Integer>
		 * ArrayList<Integer> list = new ArrayList<>();
	   	*List<Integer> list = new ArrayList<>(); //다형성 
		*ArrayList<String> list = new ArrayList<String>();*/
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		/*
		 * List<E> 정의된 메서드 -> add<E> :인스턴스의 저장 remove(index) :해당 인덱스의 요소를 삭제 size() :
		 * List 요소 개수를 반환 get(index): 해당 인덱스 위치의 요소 반환 
		 * add(), remove(), size(), get()
		 */
		
		//데이터의 저장(저장한 순서대로 감)
		list.add(30);   //Auto-Boxing, Wrapper 클래스 평소에 잘 안쓰집만 기본형 데이터땜에 씀 
		list.add(new Integer(10));
		list.add(new Integer(20));
		list.add(new Integer(30));
		
		//데이터의 참조
		System.out.println("저장된 데이터를 확인합니다.");
		//반복문을 통해 일괄적으로 참조가 가능하다. 
		for(int i = 0; i < list.size() ; i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("==================");
		
		list.remove(1);
		System.out.println(" 두번째 데이터를 삭제하고, 데이터를 확인합니다.");
		for(int i = 0; i < list.size() ; i++) {
			System.out.println(list.get(i));
		}
		
		
	}

}
