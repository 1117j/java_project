package homework;

public class ex11 {

	public static void main(String[] args) {
		// ContinueBasic.java의 내부에 존재하는
		//while 문을 for 문으로 변경하여 작성
		int num=0, count=0;
		while((num++)<100){
		if(num%5!=0 || num%7!=0)
		continue;
		count++;
		System.out.println(num);
		}
		System.out.println("count: " + count);
		}
		}