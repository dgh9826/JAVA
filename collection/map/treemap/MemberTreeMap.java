package collection.map.treemap;

import java.util.Iterator;
import java.util.TreeMap;
import collection.Member2;

/*
 * TreeMap
 * 1.key - value 쌍으로 저장, Key는 중복된 값을 넣을 수 없다. value는 다른키에 중복된 값을 넣을 수 있다.
 * 2.Tree는 정렬해서 저장, 출력 <Comarable 인터페이스의 compareTo() 재정의 해야한다.
 * compareTo() => 오름차순, 내림차순 정의
 */
public class MemberTreeMap {

	private TreeMap<Integer,Member2> treeMap;
	
	public MemberTreeMap() {
		treeMap= new TreeMap<Integer,Member2>();			//TreeMap 생성
	}
	public void addMember(Member2 member) {
		treeMap.put(member.getMemberid(), member);
	}
	public boolean removeMember(int memberid) {
		if(treeMap.containsKey(memberid)) {
			treeMap.remove(memberid);					//Map에서 remove(삭제) Key를 삭제.
			return true;
		}
		System.out.println(memberid+"가 존재하지 않습니다.");
		return false;
	}
	public void showAll() {
		System.out.println("====iterator====");
		Iterator<Integer> ir = treeMap.keySet().iterator();
		while(ir.hasNext()) {
			Member2 member = treeMap.get(ir.next());
			System.out.println(member);
		}
		System.out.println("====for====");
		for(Integer i : treeMap.keySet()) {
			Member2 member = treeMap.get(i);
			System.out.println(member);
		}
	}
}
