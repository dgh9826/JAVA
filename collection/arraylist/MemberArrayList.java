package collection.arraylist;

import java.util.ArrayList;
import collection.Member;

public class MemberArrayList {

	private ArrayList<Member> arrayList;		//ArrayList<Member>변수 arrayMember 선언
	
	public MemberArrayList() {					//생성자
		arrayList = new ArrayList<Member>();	//ArrayList<Member> 생성
	}
	public void addMember(Member member) {
		arrayList.add(member);
	}
	public void addMember2(int a, Member member) {
		arrayList.add(a, member);
	}
	public boolean removeMember(int memberid) {
		for(int i = 0;i<arrayList.size();i++) {	//모든 방을 검색
			Member member = arrayList.get(i);	//각방의 객체를 가져와서 member변수에 할당.
			
			int tempid = member.getMemberid();
			
			if(tempid == memberid) {
				arrayList.remove(i);
				return true;					//삭제된 삭제된 정보를 출력
			}
		}
		System.out.println(memberid+"가 존재하지 않습니다.");
		return false;
	}
	public void showAllMember() {
//		for(Member member : arrayList) {
//			System.out.println(member);
//		}
		for(int i = 0; i<arrayList.size();i++) {
			Member member = arrayList.get(i);
			System.out.println(member + "index "+i);
		}
				System.out.println();
	}
	
}
