package stream_19.inputstream;

import java.io.IOException;

public class SysteminTest1 {

	public static void main(String[] args) {
		System.out.println("알파벳 하나를 쓰고 [Enter]를 누르세요");
		
		int i;
		try {
			i = System.in.read();			//한글자를 읽어서 아스킼 코드로 저장 //예외 처리를 해야 한다.
			System.out.println(i);		//아스키 코드 출력
			System.out.println((char)i);//아스키 코드의 문자값 출력
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
}
