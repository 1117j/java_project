package phoneBookEx_ver02;

import java.util.Scanner;

/* 전화번호 정보저장하는 기능만을 포함하는 클래스
 1. 사용자로부터 데이터를 받아 인스턴스 생성
 1.1. 반환기능 
 2. 사용자가 입력할 수 있는 input
 
 */

public class PhoneBookManager {
	
/*1*/	PhoneInfor createInstance() { 

		PhoneInfor info = null;
	

/*2*/	Scanner sc = new Scanner(System.in);	
		
		System.out.println("정보를 저장하기 위한 데이터를 입력합니다.");
		System.out.println("이름을 입력해주세요. >>");
		String name = sc.nextLine();
		
		System.out.println("전화번호를 입력해주세요. >>");
		String phoneNum = sc.nextLine();	
		
		System.out.println("생년월일을 입력해주세요. >>");
		String bday = sc.nextLine();

		// 사용자의 입력 데이터에 따라 인스턴스 생성 방법을 구분 // ~~.isEmpty()//
		//~~.trim() -> 양쪽공백을 빼주는 역할의 메소드 -> 사용자가 공백을 입력해도 입력한거로 치기 때문에 공백을 빼주는 메소드가 필요 
		if (bday == null || bday.trim().isEmpty()) {
			info = new PhoneInfor(name,phoneNum);
		}else {
			info = new PhoneInfor(name,phoneNum,bday);
		}
	
/*1.1*/	return info;
						
		}
	
	}

