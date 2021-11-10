package Object06.hide.p;

public class C {	//B클래스와 C클래스는 같은 패키지에 존재
	public void c() {
		
		B b=new B();			//B instance 생성
		b.n = 7;				//public : 같은 패키지 및 다른 외부 패키지에서 사용 가능 => 사용 가능
		b.n();
		b.k = 3;					//protected : 같은 패키지에서 접근 가능, 다른패키지의 상속관계에서는 접근 가능 => 같은 패키지므로 사용 가능
		b.k();
		b.m = 20;					//default : (생략) 같은 패키지에서만 사용 가능 => 같은 패키지므로 사용 가능
		b.m();
//		b.p = 10;					//private : 오직 해당 클래스에서만 사용 가능(외부 접근 불가) => 사용 불가
//		b.p();
	}
}
