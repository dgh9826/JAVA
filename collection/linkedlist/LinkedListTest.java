package collection.linkedlist;

import java.util.LinkedList;

public class LinkedListTest {					//빈번하게 값을 추가/삭제 할때 부하가 적게 걸린다.

	public static void main(String[] args) {
		
	LinkedList<String> myList = new LinkedList<String>();
	myList.add("A");
	myList.add("B");
	myList.add("C");
	
	System.out.println(myList);		//LinkedList의 toString이 재정의 되어 있음.
	System.out.println("====index 1번방에 D 추가====");
	myList.add(1,"D");
	System.out.println(myList);
	System.out.println("====addFirst()사용====");
	myList.addFirst("O");			//첫번재 자리 (index 0)에 값 추가
	System.out.println(myList);
	System.out.println("====addLast()사용====");
	myList.addLast("K");			//마지막 자리에 값을 추가
	System.out.println(myList);
	System.out.println("====remove()사용====");
	myList.remove(1); 				//index 1을 삭제
	System.out.println(myList);
	System.out.println("====removeFirst()사용====");
	myList.removeFirst();			//첫번째 값 삭제
	System.out.println(myList);
	System.out.println("====removeLast()사용====");
	myList.removeLast();			//마지막 값 삭제
	System.out.println(myList);
	}
}
