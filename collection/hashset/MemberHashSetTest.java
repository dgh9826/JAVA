package collection.hashset;

import collection.Member;

public class MemberHashSetTest {

	public static void main(String[] args) {
		MemberHashSet mhs=new MemberHashSet();
		
		//hashset에 저장할 객체를 생성
		Member memberHong=new Member(1001,"홍길동");
		Member memberLee=new Member(1002,"이순신");
		Member memberSon=new Member(1003,"손흥민");
		
		System.out.println("====HashSet에 객체를 저장====");

		mhs.addMember(memberSon);
		mhs.addMember(memberLee);
		mhs.addMember(memberHong);
		mhs.showAll();
		
		/*
		 *Set에서 객체를 저장 할 때 중복된 값을 저장하지 않도록 하기 위해서는
		 *객체의 특정 변수에 대해서 equals() 메소드를 재정의 해줘야 한다.
		 */
		System.out.println("====HashSet에 중복된 값 저장====");

		Member memberSon2=new Member(1003,"손흥민");
		Member memberSon3=new Member(1003,"손흥민");
		mhs.addMember(memberSon3);
		mhs.addMember(memberSon2);
		mhs.showAll();
	}
}
