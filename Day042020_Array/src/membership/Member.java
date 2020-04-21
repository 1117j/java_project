package membership;


//회원 정보를 저장하기 위한 클래스 생성
public class Member {
	
	String memberId;
	String memberName;
	String memberEmail;
	
	//데이터에 직접참조하지 못하도록 보호
	//생성자(초기화해주기)(**생성자의 특징: 클래스이름으로) 
	Member(String memberId, String memberName, String memberEmail){
		//우선순위.. 메서드에 이름이 같은 경우, 지역변수에 넣지않음 
		//this키워드를 사용해서 나 자신을 가지는 참조변수
		//지역변수 	
		this.memberId= memberId;
		this.memberName = memberName;
		this.memberEmail = memberEmail;
	}
	
	
	void showInfo(){
		System.out.println("아이디: "+ this.memberId);
		System.out.println("이   름: "+ this.memberName);
		System.out.println("이메일: "+ this.memberEmail);
		
		}


	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", memberName=" + memberName + ", memberEmail=" + memberEmail + "]";
	}
	
	}

