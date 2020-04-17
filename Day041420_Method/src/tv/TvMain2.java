package tv;

public class TvMain2 {

	public static void main(String[] args) {
		 
		Tv tv1 = new Tv();
		Tv tv2 = new Tv();				// 서로 다른 공간이 만들어짐
		
		System.out.println(tv1 == tv2);
		
		System.out.println("=============================");
		System.out.println("tv1의 채널:" +tv1.channel);
		System.out.println("tv2의 채널:" +tv2.channel);
		
		System.out.println("-------------------------------");
		
		tv1.channel = 10;
		System.out.println("tv1의 채널을 10으로 변경");
		
		System.out.println("tv1의 채널:" +tv1.channel);
		System.out.println("tv2의 채널:" +tv2.channel);
		//서로 독립되어 있는 채널
		
		 
		 

		
	

	}

}
