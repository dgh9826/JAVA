package Object06.hide.package1_2;

public class B {
	public B() {
		A a =new A();
		a.field1 = 1;		//public 변수이므로 접근 가능
		a.field2 = 1;		//default 변수이고 동일패키지므로 접근 가능
//	a.field3 = 1;		//private 변수이므로 접근 불가
		
		a.method1();		//public method이므로 접근 가능	
		a.method2();		//default method이고 동일패키지므로 접근 가능
//		a.method3();		//private method이므로 접근 불가
	}
}
