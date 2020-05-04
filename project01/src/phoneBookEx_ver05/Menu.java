package phoneBookEx_ver05;

public class Menu {
	
	public static void showMenu() {
		System.out.println("===================");
		System.out.println("메뉴를 입력하세요");
		System.out.println(" "+MenuNum.INSERT+". 친구 정보 입력");
		System.out.println(" "+MenuNum.SEARCH+". 친구 정보 검색");
		System.out.println(" "+MenuNum.DELETE+". 친구 정보 삭제");
		System.out.println(" "+MenuNum.EDIT+". 친구 정보 수정");
		System.out.println(" "+MenuNum.PRINT_ALL+". 친구 정보 전체보기");
		System.out.println(" "+MenuNum.EXIT+". 프로그램 종료");
		System.out.println("===================");
	}

}