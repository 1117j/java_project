package Homework02;

public class ex08 {

	public static void main(String[] args) {
		
	// String str= 	"abc" -> 인스턴스 생성
	//	new String ("abc") -> 새로운 객체 생성
	// "abc" == "abc""  -> 같은 인스턴스의 주소값을 갖는다.
	// object 클래스의 equals는 참조변수를 비교
	// ㄴ if(str.equal("abc")) 
				
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
//풀이    1~20까지의 정수 : (반복문 for), 총합구하기식 (int sum = 0, sum = sum + i) 
		int sum = 0;
		for(int q2 = 1; q2 <= 20; q2++) {
		if(q2 % 2 != 0 && q2 % 3 != 0) {
			// if (!(q2 % 2==0 || q2 % 3 ==0)과 같은.
			sum += q2;}
		} 
		System.out.println("총합"+sum);	
		
		
		
		
		
		System.out.println("[3] 출력-------------------------------");
		
//[3] 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)의 결과를 계산하시오
//풀이: 
		
	//for(int i = 1; i <= 10 ; i++){
		// for(int j = 1; j <= i; J++){
		// int sum = 0, k = 0 ;
		// k = k+j;
		//sum += k;
		
		
		int i = 1, sum3 = 0, result = 0;
		while(i<=10) {
			sum3 += i;
			result += sum3;
			i++;
		}
		System.out.println("총 합은" + result);
		System.out.println("[4] 출력-------------------------------");
		
//[4] 1+(-2)+3+(-4)+...과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이 100이상이되는지 구하시오.
//풀이 :  for(int i = 1; 조건비워줘도 된다->무한반복) ; (i++)*(-1)	{? xxxxxx
	// int i4 = 1, sum4 = 0;
		// while(true){
		// i4++;
		// if (i4 % 2 == 0){
		// sum4 = sum4 - i;
		// else {
		// sum4 = sum4 + 1;
		
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
			
//풀이: math.random (스태틱) , 상수 static final PI;
//   0.0 <= x < 1.0 (double형 실수 임의의 숫자를 반환)
//  답: (int)(math.random()*6)+1
//       ㄴ6을 곱하면 6미만이나옴 				
			int value = (int)(Math.random()*6)+1;
			System.out.println("value:"+value);
			
			System.out.println("[8]---------------------------------");
			
//[8]방정식 2x+4y=10의 모든 해를 구하시오. 
//단, x와 y는 정수이고 각각의 범위는 0<=x<=10,  0<=y<=10 이다.
// 실행결과 x=1, y=2  // x=3, y=1 // x=5, y=0

//풀이 : 반복문 문제
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
//풀이: 패턴 -> 자릿수 뽑는것  
// 인덱스:  0~ (n-1)  //!!중요!!//
// 0 ~ str.length()-1 까지 자릿수 
// 문자열은 인덱스를 이용해 for문으로 일괄처리  -> charAt(index)
			
			String str1 = "12345";
			int sum9 = 0;
			for(int s=0; s < str1.length();s++) {
				sum9 += str1.charAt(s)-'0';
			}
			System.out.println("sum="+sum9);
			// 모르겠습니다.... 아아아 ㅠㅠ 
			
			System.out.println("[10]---------------------------------");
					
			
//[10] int타입의 변수 num 이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코드를 완성하라.
//만일 변수 num의 값이 12345라면, ‘1+2+3+4+5’의 결과인 15를 출력하라. (1)에 알맞은 코드를넣으시오.
//[주의] 문자열로 변환하지 말고 숫자로만 처리해야 한다.
			
//풀이 1. 12345 %10 => 5
//  2.  (12345/10) % 10 -> 1234 %10  => 4  반복 -> .... 3.....2
// 12345/10000 => 1 ,   (12345%10000)/1000 = 2 ,   (2345%1000)/100 = 3  .... 반복
//                           나머지인 ( 2345)/1000이니까 2
			int num1 = 1;
			int num2 = 1;
			int num3 = 0; // 세번째 값
			System.out.print(num1+","+num2);
			for (int c = 0 ; c < 8 ; c++ ) {
			num3 = num1 + num2;
			num3 += c;
			 
			}
			System.out.println(num3);
		
			System.out.println("[11]---------------------------------");
			
//[11] 피보나치(Fibonnaci) 수열(數列)은 앞을 두 수를 더해서 다음 수를 만들어 나가는수열이다. 
//예를 들어 앞의 두 수가 1과 1이라면 그 다음 수는 2가 되고 그 다음 수는 1과 2를더해서 3이 되어서  1,1,2,3,5,8,13,21,... 과 같은 식으로 진행된다. 
//1과 1부터 시작하는피보나치수열의 10번째 수는 무엇인지 계산하는 프로그램을 완성하시오.	[실행결과]: 1,1,2,3,5,8,13,21,34,55
//풀이: 
 			
			int num11 = 1;
			int num12 = 1;
			int num13 = 0; // 세번째 값
			System.out.print(num11+","+num12);
			for (int e = 0 ; e < 8 ; e++ ) {
			num13 = num11 + num12;
			System.out.println(num13);
			num11 = num12;
			num12 = num13;
			}
			
			System.out.println("[13]-----------------------------------");
			
//[13]다음은 주어진 문자열(value)이 숫자인지를 판별하는 프로그램이다. (1)에 알맞은 코드를넣어서 프로그램을 완성하시오.
//
			String val = "12o34";
			char ch1 = ' ';
			boolean isNumber = true;
			// 반복문과 charAt(inti)를 이용해서 문자열의 문자를
			// 하나씩 읽어서 검사한다.
			for(int t=0; t < val.length() ;t++) {
			/*
			(1) 알맞은 코드를 넣어 완성하시오.
			*/
			}
			if (isNumber) {
			System.out.println(val+"는 숫자입니다.");
			} else {
			System.out.println(val+"는 숫자가 아닙니다.");
			}
			
			
			System.out.println("[14]-----------------------------------");
//[14]다음은 숫자 맞추기 게임을 작성한 것이다. 1과 100사이의 값을 반복적으로 입력해서컴퓨터가 생각한 값을 맞추면 게임이 끝난다. 
//사용자가 값을 입력하면, 컴퓨터는 자신이 생각한값과 비교해서 결과를 알려준다. 사용자가 컴퓨터가 생각한 숫자를 맞추면 게임이 끝나고 몇 번만에 숫자를 맞췄는지 알려준다.
//(1)~(2)에 알맞은 코드를 넣어 프로그램을 완성하시오.
			 int answer1 = (int)(Math.random()*100)+1; 
			 // 1~100사이의 임의의 값을 얻어서 answer에 저장(+1해줘야 100까지 나옴)
			 int input = 0; // 사용자입력을 저장할 공간
			 int count = 0; // 시도횟수를 세기위한 변수
			 // 화면으로 부터 사용자입력을 받기 위해서 Scanner클래스 사용
			 java.util.Scanner s = new java.util.Scanner(System.in);
			 do {
			 count++;
			 System.out.print("1과 100사이의 값을 입력하세요 :");
			 input = s.nextInt(); // 입력받은 값을 변수 input에 저장한다.
			 /*
			 (2) 알맞은 코드를 넣어 완성하시오.
			 */
			 } while(true); // 무한반복문
		
	}
			 			
}			


