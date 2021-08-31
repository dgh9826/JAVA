import java.io.FileWriter;
import java.io.IOException;

public class FirstMethod {
	
	public static void main(String[] args) throws IOException {
		System.out.println("Hello Method");
		System.out.println(Math.floor(1.1));
		
					 //인자, argument
		printTwoTimes("-","a");
		System.out.println(twoTimes("a","-"));
//		FileWriter fw = new FileWriter("out.txt");
//		fw.write(twoTimes("a","-"));
//		fw.close();
		printTwoTimes("!","b");
	}
	public static String twoTimes(String text,String delimiter) {
		String out="";
		out = out +delimiter + "\n";
		out = out +text +"\n";
		out = out +text +"\n";
		return out;
	}
									//매개변수, parameter
	public static void printTwoTimes(String a,String x) {
		System.out.println(a);
		System.out.println(x);
		System.out.println(x);
		//refoactor extract method -> 코드를 메소드로 변경해주는 기능
	}
	public static void writeFileTwoTimes(String a,String x)throws IOException {
		FileWriter fw = new FileWriter("output.txt");
		fw.write(a+"\n");
		fw.write(x+"\n");
		fw.write(x+"\n");
		fw.close();
	}
}
