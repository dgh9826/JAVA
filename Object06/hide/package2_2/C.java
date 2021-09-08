package Object06.hide.package2_2;

import Object06.hide.package1_2.A;

public class C {
	public C() {
		A a =new A();
		a.field1 = 1;		//public 변수이므로 접근 가능
//		a.field2 = 1;		//default 변수이지만 동일패키지가 아님으로 접근 불가
//		a.field3 = 1;		//private 변수임으로 접근 불가
		
		a.method1();		//public method임으로 접근 가능	
//		a.method2();		//default method이지만 동일패키지가 아님으로 접근 불가
//		a.method3();		//private method이므로 접근 불가
	}
}
