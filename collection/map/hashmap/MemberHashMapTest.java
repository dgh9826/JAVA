package collection.map.hashmap;

import collection.Member;

public class MemberHashMapTest {

	public static void main(String[] args) {
		MemberHashMap mhm = new MemberHashMap();
		
		Member memberLee = new Member(1001,"이순신");
		Member memberKim = new Member(1002,"김유신");
		Member memberHong = new Member(1003,"홍길동");
		Member memberSong = new Member(1004,"송진원");
		
		mhm.addMember(memberLee);
		mhm.addMember(memberKim);
		mhm.addMember(memberHong);
		mhm.addMember(memberSong);
		
		mhm.showAll();
		System.out.println("===객체 삭제===");
		mhm.removeMember(1003);
		mhm.showAll();
	}
}
