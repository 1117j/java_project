package ex;

public class AccessWayMain {

	public static void main(String[] args) {
		
		
		System.out.println(AccessWay.num);
		//               클래스 이름, static 변수 이름
		
		AccessWay.num++;
		System.out.println(AccessWay.num);
		
		AccessWay ac = new AccessWay();
		
		System.out.println(ac.num2);

	}

}
