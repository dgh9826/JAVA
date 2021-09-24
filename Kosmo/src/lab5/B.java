package inheritance_07.lab5;

public class B extends A{
	public B() {
		System.out.println("생성자 B");
	}
	public B(int x) {
		//super(); <=상속받으면 생성자에 기본적으로 생략되어서 생성됨 
		super(x); //<= 매개변수 값에 따라 부모클래스 생성자 호출 할 수 있음
		System.out.println("매개변수 생성자 B"+x);
	}
}
