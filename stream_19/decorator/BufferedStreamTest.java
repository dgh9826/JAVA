package stream_19.decorator;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedStreamTest {

	public static void main(String[] args) throws IOException {
		//D:\Temp\a.exe ==> D:\Temp\c.exe => BufferedStream을 사용(RAM 8Kbyte 처리)
		//BufferedStream : 보조스트림 ,RAM사용, 8KB처리
		
		FileInputStream fis = new FileInputStream("D:\\Temp\\a.exe");
		FileOutputStream fos = new FileOutputStream("D:\\Temp\\c.exe");
		
		long ms = 0;
		ms = System.currentTimeMillis();
		
		int i;
		int j=1;			//총 byte
		while((i=fis.read())!=-1) {				//fis : 원본, 1byte씩 읽는다.
			fos.write(i);						//fos : 대상 , 1byre씩 읽는다.
			j++;
		}
		
		ms = System.currentTimeMillis() - ms ;
		System.out.println(ms);
		System.out.println(j);
	}
}
