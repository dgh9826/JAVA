import java.io.FileWriter;
import java.io.IOException;

public class OthersAppOOP {

	//일회용 단기로 끝내는 작업들은 그냥 class로 불러와 사용하는데
	public static void main(String[] args) throws IOException {
		//Math는 class/ (Math).PI, .floor, .ceil은 method	
		//class : System, MAth, FileWriter 
		//instance : f1, f2
		System.out.println(Math.PI);
		System.out.println(Math.floor(1.8));
		System.out.println(Math.ceil(1.8));
		
		FileWriter f1 = new FileWriter("data.txt");
		f1.write("Hello");
		f1.write(" JAVA");
		
		
		FileWriter f2 = new FileWriter("data2.txt");
		f2.write("Hello");
		f2.write(" JAVA");
		f2.close();
		
		f1.write("!!!");
		f1.close();
		//instance는 중간중간 달라질수 있는 작업들에서 사용해서 그대로 불러서 사용한다.


	}

}
