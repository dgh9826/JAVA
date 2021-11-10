package Exception10.throws_ex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException2 {

	public Class loadClass (String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
		
		FileInputStream fis = new FileInputStream(fileName);
		Class c =Class.forName(className);	//클래스의 전체 이름을 받아서 존재하는지 확인
		return c;		//Class.forName(전체클래스) : 동적로딩이 지원
						// 동적로딩: 컴파일시에 이름을 확인하는 것이 아니라 실행시에 이름 확인.)
	}
	public static void main(String[] args) {
		
		ThrowsException test = new ThrowsException();
		try {
			test.loadClass("a.txt", "java.lang.String1");
		} catch (FileNotFoundException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			test.loadClass("b.tet","java.lang.String2");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			Class d = test.loadClass("g.txt","java.lnag.Stringaa");
			System.out.println(d.getClasses());
			d.getClass();
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("파일이 없습니다.");
			System.out.println("클래스파일이 없습니다.");
		}
		
	}
}
