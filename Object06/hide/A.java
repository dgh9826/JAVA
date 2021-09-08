package Object06.hide;

import Object06.hide.p.B;

public class A extends B{	//B클래스와 다른 패키지에 존재
	public void a() {
		B b = new B();		
		b.n = 3;			//public : 같은 패키지 및 다른 외부 패키지에서 사용 가능 =>사용 가능
		b.n();
		this.k = 4;			//protected : 같은 패키지에서 접근 가능, 다른패키지의 자식클래스에서는 접근 가능 => 다른 패키지지만 상속받았으므로 사용 가능
		this.k();			//				==> 생성자가 protected일때 new 연산자로 호출하는게 아닌 super();로 생성자를 호출해서 사용
//		b.m = 6;			//default : (생략) 같은 패키지에서만 사용 가능 => 다른패키지므로 사용 불가
//		b.m();
//		b.p = 10;			//private : 오직 해당 클래스에서만 사용 가능(외부 접근 불가) => 사용 불가
//		b.p();
		
		
		
	}
}
