package Exception10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling01 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("c.txt");
		} catch (FileNotFoundException e) {			//try{}블락에서 예외가 발생시 catch{}블락이 작동
			System.out.println(e);
			System.out.println("catch 블락 작동");
		} finally {									//try{} 블락이 실행되면 finally{}은 반드시 실행(예외발생과 상관없이 작동}
			System.out.println("finally 블락 작동");
		}
		System.out.println("종료");
	}
}
