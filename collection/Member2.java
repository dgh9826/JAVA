package collection;

public class Member2 implements Comparable<Member2>{
			//Comparable => TreeSet에서 중복을 없애고 정렬을 해주는 인터페이스.
			//TreeSet 구현하기 위해서는 Comparable 인터페이스를 구현해야 한다.
			// Comparable 인터페이스의 compareTo()메소드를 재정의 해야한다.
			//comparesTo() 추상 메소드를 재정의, 정렬을 오름차순,내림차순으로 정렬
	private int memberid;
	private String mamberName;
	
	public Member2(int memberid,String memberName) {
		this.memberid=memberid;
		this.mamberName=memberName;
	}
	public int getMemberid() {
		return memberid;
	}

	public void setMemberid(int memberid) {
		this.memberid = memberid;
	}

	public String getMamberName() {
		return mamberName;
	}

	public void setMamberName(String mamberName) {
		this.mamberName = mamberName;
	}
	@Override
	public String toString() { 				//객체를 출력하면 Object(toString()) 객체의 주소를 출력
											//재정의
		return mamberName + "회원님의 아이디는 "+memberid+"입니다.";
	}
	//Object equals 메소드는 객체의 주소를 비교 : true,false를 리턴
	//재정의 : 객체내의 memberid를 비교해서 true,false 리턴.
	@Override
	public boolean equals(Object obj) {		//(객체를 Object 타입으로 업캐스팅)
		if(obj instanceof Member2) {
			Member2 member = (Member2)obj;	//Member 타입으로 다운캐스팅
			if(this.memberid == member.memberid) {
				return true;
			}else {
				return false;
			}
		}
		return false;
	}
	public String equalss(Object obj) {		//(객체를 Object 타입으로 업캐스팅)
		if(obj instanceof Member2) {
			Member2 member = (Member2)obj;	//Member 타입으로 다운캐스팅
			if(this.memberid == member.memberid) {
				return "동일한 회원입니다.(같은 객체 입니다.)";
			}else {
				return "다른 회원입니다.(다른 객체 입니다.)";
			}
		}
		return "회원정보를 찾을 수 없습니다.";
	}
	@Override
	public int hashCode() {
		return memberid;
	}
	
	public int compareTo(Member2 member) {
//		return (this.memberid - member.memberid);		//오름차순 정렬	(a~z)
		return (this.memberid - member.memberid)*(-1);	//내림차순 정렬 (z~a)
	}

	
}
