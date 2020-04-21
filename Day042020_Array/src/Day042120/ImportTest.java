package Day042120;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ImportTest {

	public static void main(String[] args) {
		 // java.util.Date
		// 날짜와 시간 정보를 하나로 표현 
		// 컨트롤+쉬프트+o 단축키
		Date today = new Date();
		
		System.out.println(today);  //today.toString() 
		// [실행결과] Tue Apr 21 15:06:48 KST 2020
		// 원하는형태로 바꿔보자
		//SimpleDateFormat적고 컨트롤+스페이스바 
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd. HH:mm");
		System.out.println(dateFormat.format(today));
		//import할 때 주의해야 할 점 : 같은 이름의 class 존재할 수 있는 점 주의할 것!! 
		//import할 때 잘하세요
		// 메서드도 달라지고 다 달라지기 때문에 꼭 주의해야할것 ! 
		

	}

}
