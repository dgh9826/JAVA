package Object06.hide.p;


public class B {
	
	public int n;		//public : 같은 패키지 및 다른 외부 패키지에서 사용 가능
	public void n() {
		n = 5;
	}
	protected int k;	//protected : 같은 패키지에서 접근 가능, 다른패키지의 상속관계에서는 접근 가능
	protected void k() {
		k = 4;
	}
	int m;				//default : (생략) 같은 패키지에서만 사용 가능
	void m() {
		m = 10;
	}
	//private int p;		//private : 오직 해당 클래스에서만 사용 가능(외부 접근 불가)
}
