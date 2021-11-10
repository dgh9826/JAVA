package Exception10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling3 {				//catch{} 내에서 return;
												//finally는 catch{} 작동이 되면 반드시 return;과 상관없이실행

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
				} catch (IOException e) {
					System.out.println("객체 정상 메모리에서 제거 안됨(Null)");
				}
			}
		System.out.println("종료");
		}
	}
}
