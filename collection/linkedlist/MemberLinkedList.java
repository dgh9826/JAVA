package collection.linkedlist;

import java.util.LinkedList;

import collection.Member;

public class MemberLinkedList {

		private LinkedList<Member> linkedlist;
		public MemberLinkedList() {
			linkedlist = new LinkedList<Member>();
		}
		public void addMember(Member member) {
			linkedlist.add(member);
		}
		public void addMember(int a, Member member) {
			linkedlist.add(a,member);
		}
		public boolean removeMember(int memberid) {
			for(int i=0;i<linkedlist.size();i++) {
				Member member = linkedlist.get(i);
				int tempid = member.getMemberid();
				if(tempid==memberid) {
					linkedlist.remove(i);
					return true;
				}
			}
			System.out.println("아이디가 존재하지 않습니다.");
			return false;
		}
		public void showAll() {
			for(Member member : linkedlist) {
				System.out.println(member);
			}
			for(int i=0; i<linkedlist.size();i++) {
				Member member = linkedlist.get(i);
			}
		}
}
