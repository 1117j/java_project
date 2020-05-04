package phoneBookEx_ver05;

import java.util.InputMismatchException;

import phoneBookEx_ver05_Exception.BadNumberException;
import phoneBookEx_ver05_Exception.StringEmptyException;

public class PhoneBookMain {	
	
	public static void main(String[] args) {
	
		PhoneInfoHandler handler = PhoneInfoHandler.getInstace();
	
	while(true) {
		
		Menu.showMenu();
		
		int select = 0;
		
		try { select = handler.kb.nextInt();
		//정상범위 1~6
		//MenuNum.INSERT ~ MenuNum.EXIT
		
		if(!(select >= MenuNum.INSERT && select <= MenuNum.EXIT)) {
			BadNumberException e = new BadNumberException("메뉴 범위를 벗어나는 번호입니다");
			
			//강제적인 예외 발생
			throw e;
			}
		
		} catch(InputMismatchException e) {
			System.out.println("잘못된 메뉴 입력입니다.\n숫자로 입력하세요.");
//			handler.kb.nextLine();
			continue;
			
		} catch(BadNumberException e) {
			System.out.println("메뉴 범위를 벗어난 숫자 입력입니다.\n다시 확인 후 입력하세요.");
			continue;
			
		} catch(Exception e) {
			System.out.println("잘못된 메뉴 입력입니다.\n숫자로 입력하세요.");
			continue;
			
		} finally {
			handler.kb.nextLine();
		}
		
//		handler.kb.nextLine(); // 앞의 버퍼 클리어
		

		switch(select) {
		case MenuNum.INSERT:
			handler.createInfo();
			break;
		case MenuNum.SEARCH:
			handler.showInfo();
			break;
		case MenuNum.DELETE:
			handler.deleteInfo();
			break;
		case MenuNum.EDIT:
			handler.editInfo();
			break;
		case MenuNum.PRINT_ALL:
			handler.showAllInfo();
			break;
		case MenuNum.EXIT:
			System.out.println("프로그램을 종료합니다.");
			return;
			}
		
		
		
		}
	
	}

}

