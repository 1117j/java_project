package phoneBookEx_ver03;
/*배열을 이용하여 프로그램 사용자가 입력하는 정보가 최대 100개까지 유지되도록 프로그램을 변경
 ***추가기능
 * 1. 저장: N/P#/B 정보 대상으로하는 저장
 * 2. 검색: Name 기준으로 데이터 찾아서 해당 데이터의 정보를 출력
 * 3. 삭제: Name 기준으로 데이터 찾아서 해당 데이터를 삭제
 */

public class PhoneInfor {

	private String name;			//친구의 이름
	private String phoneNum;		//친구의 전화번호
	private String bday;			//친구의 생일 

	PhoneInfor(String name, String phoneNum, String bday){
		this.name = name;
		this.phoneNum = phoneNum;
		this.bday = bday;
	}
	
	PhoneInfor(String name, String phoneNum){
		this(name, phoneNum, null);
		}
	
	void showInfo(){
		if(this.bday == null) {
			System.out.println("이름: "+ this.name + ", 전화번호: " + this.phoneNum+", 생일: " + "입력하지 않았습니다 ");}
		else {
			System.out.println("이름: "+ this.name + ", 전화번호: " + this.phoneNum+", 생일: "+ this.bday);
		}}
		
	boolean checkName(String name) {
		return this.name.contentEquals(name);
	}
	
	}
	
