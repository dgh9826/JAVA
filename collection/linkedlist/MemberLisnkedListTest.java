package collection.linkedlist;

import collection.Member;

public class MemberLisnkedListTest {

	public static void main(String[] args) {
		MemberLinkedList mal = new MemberLinkedList();
		
		Member memberLee = new Member(1001,"이지원");
		Member memberSon = new Member(1002,"손민국");
		Member memberPark = new Member(1003,"박서원");
		Member memberHong = new Member(1004,"홍석원");
		
		mal.addMember(memberLee);
		mal.addMember(memberSon);
		mal.addMember(memberPark);
		mal.addMember(memberHong);
		System.out.println("====LinkedList 모든 객체 출력");
		mal.showAll();
		
		System.out.println("====LinkedList에 특정방에 값을 추가====");
		mal.addMember(1, memberHong);
		mal.showAll();
		System.out.println("====특정회원 삭제====");
		mal.removeMember(1002);
		mal.removeMember(memberHong.getMemberid());
		mal.showAll();
		
	}
}
