package phoneBookEx_ver05;

public interface MenuNum {


	/*  1. 친구 정보 입력
	 	2. 친구 정보 검색
	 	3. 친구 정보 삭제
	 	4. 친구 정보 수정
	 	5. 친구 정보 전체 보기
	 	6. 프로그램 종료	 	*/
	//public static final 자료형 상수 = 리터럴;
	
	//상수로 하게 되면 가독성이 높아진다.
	
	int INSERT=1;     	//1. 친구 정보 입력
	int SEARCH=2;		//2. 친구 정보 검색
	int DELETE=3;		//3. 친구 정보 삭제
	int EDIT=4;			//4. 친구 정보 수정
	int PRINT_ALL=5;	//5. 전체 정보 보기
	int EXIT=6;			//6. 프로그램 종료 
	
	
	int UNIV=1;  
	int COMPANY=2;
	int CAFE=3;
	
	char INSERT_CHAR = 'i'; 
	
	
	
	
}
