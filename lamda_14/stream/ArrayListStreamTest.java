package lamda_14.stream;

import java.util.*;
import java.util.stream.Stream;

public class ArrayListStreamTest {								//Stream : 배열,컬렉션의 연산을 간단하게 작성 (람다식 이용해서 연산)

	public static void main(String[] args) {
		List<String> slist = new ArrayList<String>();
		
		slist.add("Tomas");
		slist.add("Edward");
		slist.add("Jack");
		
		System.out.println("스트림을 사용하지 않고 출력");
		for(int i =0; i<slist.size();i++) {
			System.out.println(slist.get(i));
		}
		System.out.println();
		System.out.println("스트림을 사용해서 출력");
		Stream<String> stream = slist.stream();			//컬렉션의 스트림 인스턴스 생성
		
		//첫번째 스트림
		stream.forEach(s -> System.out.println(s));
		System.out.println();
		
		//두번째 스트림
		System.out.println("정렬해서 출력");
		slist.stream().sorted().forEach(s -> System.out.println(s));
		
		//세번째 스트림
		System.out.println("글자수 출력 : map() -> 모든 값에 적용");
		slist.stream().map(s->s.length()).forEach(n -> System.out.println(n));
		
		//네번재 스트림
		System.out.println("글자가 5자 이상인 이름을 출력 :filter() => 조건을 사용해서 걸러냄");
		slist.stream().filter(s -> s.length()>=5).forEach(s -> System.out.println(s));
		
		System.out.println();
		System.out.println("ABCDEF의 바이트 수는 : a.length()");
		String a = "ABCDEF";
		System.out.println(a.length());
	}
}
