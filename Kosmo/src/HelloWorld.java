import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World!!!");
		Date date = new Date();
		SimpleDateFormat format1, format2, format3; 
		format1 = new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss");
		format2 = new SimpleDateFormat("yy년MM월dd일 a E hh시mm");
		format3 = new SimpleDateFormat("MM월 dd일 E요일");
		String id = JOptionPane.showInputDialog("Enter");
		if(id.equals("오늘날짜")) {
		System.out.println("오늘 날짜 :"+format1.format(date));
		}else if (id.equals("요일")) {
			System.out.println(format3.format(date));
		}
		else {
			System.out.println(format2.format(date));
		}
		}
//		String id = args[0];
//		if(id.equals("")) {
//			System.out.println("right");
//		}else {
//			System.out.println("wrong");
//		}
	}
	
