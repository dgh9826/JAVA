import java.io.FileWriter;
import java.io.IOException;
// unchekckedExceptionApp => 선언하지 않아도 컴파일에 문제는 없지만 CheckedExceptionApp은 선언하지않으면 컴파일에 문제가 발생
public class CheckedExceptionApp {

	public static void main(String[] args) {
		FileWriter f = null;
		//try catch finally
		try {
			f = new FileWriter("date.txt");
			f.write("Hello");
			//close를 하기 전에 예외가 발생할 수 있기 때문에 finally로 처리해야 합니다.
			//f.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			//만약에 f가 null이 아니라면 
			if(f != null) {
				try {	
					f.close();
				} catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
