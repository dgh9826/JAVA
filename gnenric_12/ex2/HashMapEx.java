package gnenric_12.ex2;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx {

	public static void main(String[] args) {
		//HashMpa<key,value>
		HashMap<String,String> dic = new HashMap<String,String>();
		Scanner sc = new Scanner(System.in);
				//(key, value) 로 key를 입력하면 value값이 출력
		dic.put("baby","아기");
		dic.put("love","사랑");
		dic.put("apple","사과");
		
		//영어 단어를 넣으면 한글 단어를 검색, "exit"를 입력 받으면 종료.
		
		while(true) {
			System.out.print("찾고 싶은 단어는? >> ");
			String eng = sc.next();
			if(eng.equals("exit")) {
				break;
			}
			
			String kor = dic.get(eng);
			if(kor == null) {
				System.out.println("검색 결과가 없습니다.");
			}else {
				System.out.println(kor);
			}
		}
	}
}
