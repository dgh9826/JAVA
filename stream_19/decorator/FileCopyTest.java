package stream_19.decorator;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyTest {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("D:\\Temp\\a.exe");		//기반 스트림(인풋)
		FileOutputStream fos = new FileOutputStream("D:\\Temp\\b.exe");		//기반 스트림(아웃풋)
		
		BufferedInputStream bis = new BufferedInputStream(fis);				//보조스트림(인풋)
		BufferedOutputStream bos = new BufferedOutputStream(fos);			//보조스트림(아웃풋)
		
		long ms = 0;
		ms = System.currentTimeMillis();
		
		int i;
		int j=1;			//총 byte
		while((i=bis.read())!=-1) {				//fis : 원본, 1byte씩 읽는다.
			bos.write(i);						//fos : 대상 , 1byre씩 읽는다.
			j++;
		}
		
		ms = System.currentTimeMillis() - ms ;
		System.out.println(ms);
		System.out.println(j);
	}
}
