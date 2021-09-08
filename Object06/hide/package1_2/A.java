package Object06.hide.package1_2;

public class A {
	public int field1;
	int field2;
	private int field3;
	
	public A() {
		field1 =1;					//public 변수 
		field2 =1;					//default 변수
		field3 =1;					//private 변수
		
		method1();
		method2();
		method3();
	}
	public void method1() {}		//public method
	void method2() {}				//default method
	private void method3() {}		//private method
}

