package collection.treeset;

import java.util.Iterator;
import java.util.TreeSet;

import collection.Member2;

public class MemberTreeSet {
	
	/*	TreeSet
	 * 	1.정렬해서 저장(오름차순) <= hashset과 차이점, Comparable 인터페이스를 구현 compareTo() 메소드를 재정의
	 *  2.중복된 데이터의 저장을 허용하지 않는다.
	 *  3.index를 가지고 있지 않다. Iterator 사용
	 */
	private TreeSet<Member2> treeSet;
	public MemberTreeSet() {					//생성자 호출시 객체 변수 생성
		treeSet = new TreeSet<Member2>();
	}
	public void addMember(Member2 member) {
		treeSet.add(member);
	}
	public boolean removeMember(int memberid) {	//삭제 할 경우 memberid에 해당하는 값을 검색
		Iterator<Member2> ir = treeSet.iterator();
		while(ir.hasNext()) {					//다음 값이 존재하면 true 없으면 false
			Member2 member = ir.next();			//객체를 가져와서 member변수에 저장
			int tempid = member.getMemberid();
			if(memberid==tempid) {
				treeSet.remove(member);
				return true;
			}
		}
		System.out.println("해당 아이디가 존재하지 않습니다.");
		return false;
	}
	public void showAll() {
		System.out.println("for문");
		for(Member2 m : treeSet) {
			System.out.println(m);
		}
		
		System.out.println("Iterator");
		Iterator<Member2> ir = treeSet.iterator();
		while(ir.hasNext()) {
			System.out.println(ir.next());
		}
	}
}
