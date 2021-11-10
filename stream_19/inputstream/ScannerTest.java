package stream_19.inputstream;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("직업 : ");
		String job = sc.nextLine();
		System.out.print("나이 : ");
		String age =sc.next();
		System.out.println("사각형의 세로 길이(double) : ");
		double width = sc.nextDouble();
		
		System.out.println(name);
		System.out.println(job);
		System.out.println(age);
		System.out.println(width);
		
		sc.close();
	}
}
