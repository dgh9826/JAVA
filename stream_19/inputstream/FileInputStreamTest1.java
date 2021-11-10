package stream_19.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest1 {

	public static void main(String[] args) {
		
		FileInputStream fis =null;
		
		try {
			fis = new FileInputStream("input.txt");
			//fis = new FileInputStream("D:\\Temp\\input.txt");
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			
			
			
		} catch (IOException e) {		//FileNotFoundException 상위 -> IOException
			System.out.println(e);
		} finally {
			try {
				fis.close();			//예외처리 필요
			} catch (IOException e) {
				System.out.println(e);
			}		
		}
	}
}
