package homework;

public class ex11 {

	public static void main(String[] args) {
		// ContinueBasic.java의 내부에 존재하는
		//while 문을 for 문으로 변경하여 작성
//		int num=0, count=0;
//		while((num++)<100){       
//		if(num%5!=0 || num%7!=0)
//			// 5의배수가 아니거나 7의 배수가 아닐 때 -> 다시해라 
//			// 5와7 의 배수일 때.
//		continue;
//		count++;
//		System.out.println(num);}
//		System.out.println("count: " + count);}}
//		//for(int num = 0;)
		
		for(int i = 1, count = 0; i <100; i++) {
			if(i%35!=0) {
				continue;}
				count++;
				System.out.println(i);
				System.out.println("count:"+ count);
			}}}
	