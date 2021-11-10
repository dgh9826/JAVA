package stream_19.inputstream;

import java.io.IOException;

public class SysteminTest2 {

	public static void main(String[] args) {
		System.out.println("알파벳 여려개를 쓰고 Enter를 누르세요 >");
		
		int i;
		try {
			while((i=System.in.read()) != '\n') {			//enter를 누르면 while문 빠져나온다
					
			}
		}catch(IOException e) {
			System.out.println(e);
		}
		System.out.println();
	}
}
