package Exception10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling2 {				//catch{} 내에서 return;
												//finally는 catch{} 작동이 되면 반드시 return;과 상관없이실행
												//return이 finally 이후에 작동.ㅣ
	public static void main(String[] args) {
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("c.txt");
		} catch (FileNotFoundException e) {	
			System.out.println(e);
			System.out.println("catch 블락 작동");
			return;
		} finally {
			System.out.println("finally 블락 작동");
		}
		System.out.println("종료");
	}
}
