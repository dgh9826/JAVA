package Object06.hide.package1_1;

public class A {
	A a1 = new A(true);
	A a2 = new A(1);
	A a3 = new A("문자열");
	
	public A(boolean b) {}		//public 모두 접근 가능
	A(int b) {}					//defualt 같은 패키지내에서만 접근 가능
	private A(String s) {}		//해당 class 에서만 접근 가능
}

