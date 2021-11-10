package collection.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
		/*
		 * 1.순서대로 출력되지 않는다.
		 * 2.중복된 값을 저장 할 수 없다.(아아디,주민번호,쇼핑몰에서 주문번호)
		 * 3.출력할때 삭제할때 Iterator(순회자)를 사용한다.
		 */
	
	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("임정순");
		hashSet.add("홍길동");
		hashSet.add("이순신");			//순서대로 저장되지 않는다.
		hashSet.add("강감찬");			//중복된 값을 저장되지 않는다
		hashSet.add("강감찬");
		hashSet.add("강감찬");
		hashSet.add("강감찬");
		
		System.out.println(hashSet);		//toString() 메소드가 재정의 되어있음
		System.out.println("====Iterator 사용====");
		
		Iterator<String> ir = hashSet.iterator();
		while(ir.hasNext()) {					//hasNext() 다음index에 값이 있으면 true 없으면 false
			System.out.println(ir.next());
		}
		
		System.out.println("====HashSet에서 삭제====");
		hashSet.remove("강감찬");
		Iterator<String> ir2 = hashSet.iterator();
		while(ir2.hasNext()) {					//hasNext() 다음index에 값이 있으면 true 없으면 false
			System.out.println(ir2.next());
		}
		System.out.println();
	}

}
