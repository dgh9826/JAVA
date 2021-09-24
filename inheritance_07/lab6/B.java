package inheritance_07.lab6;

public class B extends A{
	public B() {	//<= 부모 클래스의 기본 생성자가 없기에 오류 발생
		//super();
		System.out.println("생성자 B");
	}
	public B(int x) {
		System.out.println("매개변수 생성자 B "+x);
	}

}
