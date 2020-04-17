package Homework02;

public class ex08 {

	public static void main(String[] args) {
		System.out.println("[1]-------------------------------");
		
//[1] 문자열 참조변수 str이 “yes”일 때 true인 조건식
		String str = "yes";
		boolean answer = true;
		if(str == "yes") {
			System.out.println(answer);}
		else {
			System.out.println(!answer);
		}
		System.out.println("[2]출력-------------------------------");
		
//[2] 1부터 20까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합을 구하시오		
		int sum = 0;
		for(int q2 = 1; q2 >= 1 && q2 <= 20; q2++) {
		if(q2 % 2 != 0 && q2 % 3 != 0) {
			sum += q2;}
		} 
		System.out.println("총합"+sum);	
		System.out.println("[3] 출력-------------------------------");
		
//[3] 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)의 결과를 계산하시오
		
		int i = 1, sum3 = 0, result = 0;
		while(i<=10) {
			sum3 += i;
			result += sum3;
			i++;
		}
		System.out.println("총 합은" + result);
		System.out.println("[4] 출력-------------------------------");
		
//[4] 1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때,
		//몇까지 더해야 총합이 100이상이되는지 구하시오.
			
		int a = 1, add = 0;
		while(true) {
			if (a % 2 == 0) 
			add -= a;
			else
			add += a;
			if (add >= 100)
				
			break;
			a++;
			}
			System.out.println("num="+a);
			System.out.println("sum="+add);
			
			System.out.println("[5]---------------------------------");
//[5]for문을 while문으로 변경하시오
		
			for(int b=0; b<=10; b++) {

				for(int c=0; c<=b; c++)

				System.out.print("*");}
				System.out.println("[6]---------------------------------");
			

//[6]두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을작성하시오.
			for(int d1 = 1; d1 < 7; d1++) {
				for(int d2 = 1; d2 < 7; d2++) {
					if(d1 + d2 == 6) {
						System.out.println(d1+","+ d2);}
					}
				}
			System.out.println("[7]---------------------------------");

//[7] Math.random()을 이용해서 1부터 6사이의 임의의 정수를 변수 value에 저장하는 코드를완성하라.
			//(1)에 알맞은 코드를 넣으시오.
//public static void main(String[] args) {
//int value = ( /* (1) */ );
//System.out.println("value:"+value);
//			int value = (int)(Math.random() * 7);
//			System.out.println("value:"+value);
				
			int value = (int)(Math.random()*6)+1;
			System.out.println("value:"+value);
			
			System.out.println("[8]---------------------------------");
			
//[8]방정식 2x+4y=10의 모든 해를 구하시오. 
//단, x와 y는 정수이고 각각의 범위는 0<=x<=10,  0<=y<=10 이다.
			// 실행결과 x=1, y=2  // x=3, y=1 // x=5, y=0
			for(int x = 0; x <11; x++) {
				for(int y= 0; y <11; y++) {
					if(x == 5 - 2*y){
						System.out.println("x="+x+",y="+y);
					}
				}
			}
			System.out.println("[9]---------------------------------");
//[9] 숫자로 이루어진 문자열 str이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코드를완성하라.
//만일 문자열이"12345"라면, ‘1+2+3+4+5’의 결과인 15를 출력이 출력되어야 한다. (1)에 알맞은코드를 넣으시오.
			String st = "12345";
			int sum1_5 = 0;
			for(int s=0; s < str.length();s++) {
				sum+= str.charAt(s)-'0';
			}
			System.out.println("sum="+sum1_5);
			// 모르겠습니다.... 아아아 ㅠㅠ 
			System.out.println("[10]---------------------------------");
			
			
			int num1 = 1;
			int num2 = 1;
			int num3 = 0; // 세번째 값
			System.out.print(num1+","+num2);
			for (int c = 0 ; c < 8 ; c++ ) {
			num3 = num1 + num2;
			num3 += c;
			 
			}
			System.out.println(num3);
		
	
	
	}
	
			
}			


