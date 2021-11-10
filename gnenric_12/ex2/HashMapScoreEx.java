package gnenric_12.ex2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapScoreEx {

	public static void main(String[] args) {
		HashMap <String,Integer> javaScore = new  HashMap<String,Integer>();
		
		javaScore.put("정국",90);
		javaScore.put("지민",76);
		javaScore.put("RM",99);
		javaScore.put("뷔",83);
		javaScore.put("슈가",88);
		int _name;
		int[] st = new int[] {102,103};
		
		System.out.println("HashMap에 저장된 요소 갯수: "+javaScore.size());
		
		//모든 사람의 이름과 점수를 출력
		Set<String> keys = javaScore.keySet();
		
		//key 문자열을 순서대로 접근하는 Iterator 리턴
		Iterator<String> it = keys.iterator();		//Set에서 순환하면서 출력
		
		while(it.hasNext()) {
			String name = it.next();
			int score = javaScore.get(name);
			System.out.println(name+", "+score);
		}
		
	}
}
