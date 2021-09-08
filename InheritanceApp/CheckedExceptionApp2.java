import java.io.FileWriter;
import java.io.IOException;

public class CheckedExceptionApp2 {

	public static void main(String[] args) {
		//try with resource statements
		try(FileWriter f = new FileWriter("date.txt")) {
			f.write("Hello");
			f.close();
		}catch(IOException e) {
			e.printStackTrace();
		}

	}
}
