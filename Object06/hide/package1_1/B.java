package Object06.hide.package1_1;

public class B {
	A a1 = new A(true);		//(o)	public 모두 접근 가능하므로 접근 가능
	A a2 = new A(1);		//(o)	default 동일 패키지므로 접근 가능
//	A a3 = new A("문자열");	//(x)	private 해당 클래스가 아니기에 접근 불가
}
