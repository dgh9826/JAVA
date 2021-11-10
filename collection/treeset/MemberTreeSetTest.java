package collection.treeset;

import collection.Member2;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		MemberTreeSet mts=new MemberTreeSet();
		
		Member2 memberPark = new Member2(1001,"박서원");
		Member2 memberLee = new Member2(1002,"이순신");
		Member2 memberSon = new Member2(1003,"손흥민");
		Member2 memberkim = new Member2(970,"김유신");
		
		mts.addMember(memberPark);
		mts.addMember(memberLee);
		mts.addMember(memberSon);
		mts.addMember(memberkim);
		
		mts.showAll();
	}
}
