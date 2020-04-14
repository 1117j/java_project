package ex;

public class Method1 {

	public static void main(String[] args) {
	// 메서드를 사용하기 위해서 인스턴스(객체)를 생성한다.
		// 메서트 코드를 메모리에 로드한다.
		//인스턴스 생성(객체 생성)
	MyMath math = new MyMath();

	long result = math.add(10, 100);
	System.out.println(result);
	System.out.println(math.add(100000000000L, 200000000000L));
		
	}}
//	int add() {
//	return 10;
//	}
	

	
	
	
	
//	void add() {
//  메서드 기본 형태, 반환형 타입이 없으면 문제 발생, void하면 return 안해도 됨
//		return;
	
	


