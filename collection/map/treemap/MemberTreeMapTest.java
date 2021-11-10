package collection.map.treemap;

import collection.Member2;

public class MemberTreeMapTest {
	
	public static void main(String[] args) {
		MemberTreeMap mtm = new MemberTreeMap();
		
		Member2 memberPark = new Member2(1001,"박문수");
		Member2 memberSong = new Member2(1002,"송윤아");
		Member2 memberKim = new Member2(1003,"김유신");
		Member2 memberSon = new Member2(1004,"손흥민");
		
		mtm.addMember(memberPark);
		mtm.addMember(memberSong);
		mtm.addMember(memberKim);
		mtm.addMember(memberSon);
		
		mtm.showAll();
	}

}
