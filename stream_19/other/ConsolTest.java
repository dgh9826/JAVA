package stream_19.other;

import java.io.Console;

public class ConsolTest {						//명령프롬프트에서 입력을 받도록 함, 명령프롬프트에서 실행
												//JVM 1.8까지만 사용
	public static void main(String[] args) {
		
		//출력시 주의할 점
		//컴파일된 bin 폴더에서 명령이름 실행.
		//java 전체패키지이름.클래스이름 ex) > java stream_19.other.ConsolTest
		
		Console cs = System.console();
		
		System.out.println("이름 : ");
		String name = cs.readLine();
		System.out.println("직업 : ");
		String job = cs.readLine();
		System.out.println("비밀번호 : ");
		char[] pass =cs.readPassword();
		String strpass = new String(pass);			//pass 배열의 값을 String으로 변환
		
		System.out.println("=====출력 구문=====");
		System.out.println(name);
		System.out.println(job);
		System.out.println(strpass);
		
		
	}
}
