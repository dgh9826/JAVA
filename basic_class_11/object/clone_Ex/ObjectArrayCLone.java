package basic_class_11.object.clone_Ex;

import java.util.ArrayList;

class MyBook implements Cloneable{
	String title;
	public MyBook(String title) {
		this.title=title;
	}
	
	public void setTitle(String title) {
		this.title=title;
	}
	public String toString() {
		return title;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}
public class ObjectArrayCLone {

	public static void main(String[] args) {
		ArrayList <MyBook> bl = new ArrayList<MyBook>();
		MyBook b1 = new MyBook("자바");
		MyBook b2 = new MyBook("안드로이드");
		MyBook b3 = new MyBook("파이썬");
		
		bl.add(b1);
		bl.add(b2);
		bl.add(b3);
		
		ArrayList<MyBook> copyl=(ArrayList)bl.clone();
		copyl.add(new MyBook("C++"));
		
		System.out.println(bl);
		System.out.println(copyl);
		System.out.println("==============");
		
		b3.setTitle("C언어");
		System.out.println(bl);
		System.out.println(copyl);
		
	}
}
