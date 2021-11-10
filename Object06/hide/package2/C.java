package Object06.hide.package2;

import Object06.hide.package1.*;

public class C {
	//A a;	//default 접근 불가 why? default는 동일패키지에서만 접근 가능
	B b;	//public 접근 가능	 why? public은 동일패키지,외부패키지 모두 접근 가능
}
