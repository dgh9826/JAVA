package Exception10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling4 {				//여러개의 예외 처리

	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("e.txt");
		} catch (FileNotFoundException e) {	
			System.out.println(e);
			System.out.println("catch 블락 작동");
			return;
		} finally {
			System.out.println("finally 블락 작동");
			
			if(fis != null) { 
				try {
					fis.close();
					System.out.println("객체 정상 메모리에서 제거");
				} catch (IOException | NullPointerException e) {
					System.out.println("객체 정상 메모리에서 제거 안됨(Null)");
				}
			}
		System.out.println("종료");
		}
	}
}
