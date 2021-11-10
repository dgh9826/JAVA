package collection.map.hashmap;

import java.util.HashMap;
import java.util.Iterator;

import collection.Member;

public class MemberHashMap {

	private HashMap<Integer,Member> hashMap;
	public MemberHashMap() {
		hashMap = new HashMap<Integer,Member>();
	}
	
	public void addMember(Member member) {
		hashMap.put(member.getMemberid(), member);			//hashmap에 값을 저장할 때는 put() 사용
	}
	public boolean removeMember(int memberid) {
		if(hashMap.containsKey(memberid)) {					//hashmap에서 검색할때 key를 사용해서 검색을
			hashMap.remove(memberid);						//containsKey()키 값을 검색
			return true;
		}
		System.out.println(memberid+"가 존재하지 않습니다.");
		return false;
	}
	
	public void showAll() {
		Iterator<Integer> ir = hashMap.keySet().iterator();
		while(ir.hasNext()) {				//iterator 사용해서 출력
			int key = ir.next();
			Member member = hashMap.get(key);
			System.out.println(member);
		}
		System.out.println();
		
		for(Integer i : hashMap.keySet()) {	//for문 사용해서 출력
			Member member = hashMap.get(i);
			System.out.println(member);
		}
	}
	
}
