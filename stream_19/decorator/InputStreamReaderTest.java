package stream_19.decorator;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {

	public static void main(String[] args) throws IOException {
		
		//FileInputStream : 기반스트림, 바이트 스트림(한글이 모두 깨어 져서 출력됨)
		//InputStreamReader : 보조 스트림, 바이트 스트림을 문자 스트림으로 변환.
		
		System.out.println("====한글이 모두 깨짐====");
		FileInputStream fis = new FileInputStream("reader.txt");
		int i;
		while((i=fis.read()) != -1) {
			System.out.print((char)i);
		}
		System.out.println();
		System.out.println("보조 스트림을 사용해서 한글 출력");
		InputStreamReader isr = new InputStreamReader(new FileInputStream("reader.txt"));
		int j;
		while((j=isr.read()) != -1) {
			System.out.print((char)j);
		}
	}
}
