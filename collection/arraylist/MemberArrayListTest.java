package collection.arraylist;

import collection.Member;

public class MemberArrayListTest {
	
	public static void main(String[] args) {
		MemberArrayList memberArrayList = new MemberArrayList();
		
		Member memberLee = new Member(1001,"이지원");
		Member memberSon = new Member(1002,"손흥민");
		Member memberPark = new Member(1003,"박서원");
		Member memberHong = new Member(1004,"홍길동");
		Member memberSon2 = new Member(1002,"손흥민");
		Member memberPark2 = new Member(1003,"박서원");
		
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberSon);
		memberArrayList.addMember(memberPark);
		memberArrayList.addMember(memberHong);
		memberArrayList.addMember(memberSon2);
		
		/*
		 * ArrayList의 특징
		 * 1.방번호 (Index), 순차적으로 저장
		 * 2.중복된 값을 저장 할 수 있다.
		 * 3.방의 갯수가 무한적 늘어난다.(가변적)
		 * 4.삭제할 경우 다음 값이 자동으로 당겨온다.
		 * 5.특정방에 값을 넣을때도 자동으로 값이 뒤로 밀린다.
		 */
		
		memberArrayList.showAllMember();
		memberArrayList.addMember2(3,memberPark2);
		memberArrayList.showAllMember();
		System.out.println("====멤버비교 equalss()사용====");
		System.out.println(memberSon.equalss(memberSon2));
		System.out.println(memberSon.equalss(memberLee));
		
		System.out.println("====ArrayList의 값을 삭제====");
		memberArrayList.removeMember(1003);
		memberArrayList.removeMember(memberHong.getMemberid());
		memberArrayList.showAllMember();
	}

}
