package tv;

public class TvMain {

	public static void main(String[] args) {
		// tv 인스턴스 설정 
		
		Tv tv = new Tv();
		
		System.out.println("TV의 속성값: 인스턴스 설정");
		System.out.println("TV의 컬러:"+ tv.color);
		System.out.println("Tv의 전원:"+ tv.power);
		System.out.println("Tv의 채널:"+ tv.channel);
		
		tv.channel = 11;
		System.out.println("Tv의 채널값:"+ tv.channel);
		
		tv.channelUp();
		System.out.println("Tv의 채널값:"+ tv.channel);		
		
		tv.channelChange(100);
		System.out.println("Tv의 채널값:"+ tv.channel);
		
		tv.channelDown();
		System.out.println("Tv의 채널값:"+ tv.channel);
	}

}
