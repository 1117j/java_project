package phoneBookProject;

import java.util.Scanner;
/* Version 0.2
 * 작성자 : 이혜진
 * 작성일: 2020.04.21
 * 작성내용: 전화번호 입력 창 input 버전
*/

public class PhoneInforInput {
	
	String name;
	String phoneNumber;
	String birthday;
	private Scanner input;
	private Scanner yesorNo;
	
	PhoneInforInput(String name, String phoneNumber, String birthday){
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.birthday = birthday;
	}
	
	PhoneInforInput(String name, String phoneNumber){
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
		
	public PhoneInforInput() {
	}


	void showData() {
		input = new Scanner(System.in);
			
			while(true) {
			System.out.println("이름을 입력하시오");	
			String name= input.next();
			
			System.out.println("핸드폰 번호 입력해주세요");
			phoneNumber = input.next();
			
			System.out.println("생년월일을 숫자로 입력해주세요~(YYMMDD)");
			birthday = input.next();
			
			System.out.printf("입력된 이름:  %s, 핸드폰 번호:  %s, 생년월일:  %s가 맞습니까? \n", name, phoneNumber, birthday);
			
			System.out.println("맞으면 1, 맞지않다면 1을 제외한 아무숫자나 눌러주세요");
			
			yesorNo = new Scanner(System.in);
			
			int Saved  = yesorNo.nextInt();
			
			if (Saved != 1) {
				System.out.println("다시입력하십시오.");
				}
			else { 
				System.out.println("저장되었습니다.");
				if(birthday==null)
					System.out.println("이  름: "+ name +", 전화번호: " + phoneNumber + ", 생년월일 : 입력하지 않았습니다." );
				else
					System.out.println("이  름: "+ name +", 전화번호: " + phoneNumber + ", 생년월일 : "+ birthday );
					break;
			}
			}
			}

	

	public static void main(String[] args) {
		
		PhoneInforInput user01 = new PhoneInforInput();
			
		user01.showData();
	}
}

		
		

