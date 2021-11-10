package collection.hashset;

import java.util.HashSet;
import java.util.Iterator;

import collection.Member;

public class MemberHashSet {

	private HashSet<Member> hashSet;
	public MemberHashSet() {					//생성자 호출시 객체 변수 생성
		hashSet = new HashSet<Member>();
	}
	public void addMember(Member member) {
		hashSet.add(member);
	}
	public boolean removeMember(int memberid) {	//삭제 할 경우 memberid에 해당하는 값을 검색
		Iterator<Member> ir = hashSet.iterator();
		while(ir.hasNext()) {					//다음 값이 존재하면 true 없으면 false
			Member member = ir.next();			//객체를 가져와서 member변수에 저장
			int tempid = member.getMemberid();
			if(memberid==tempid) {
				hashSet.remove(member);
				return true;
			}
		}
		System.out.println("해당 아이디가 존재하지 않습니다.");
		return false;
	}
	public void showAll() {
		for(Member member : hashSet) {
			System.out.println(member);
		}
		System.out.println();
		
	}
}
