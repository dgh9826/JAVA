package lamda_14.inner_class;

class A{
	int a= 10;
	static int b=20;
	
	void a() {
		System.out.println(a);
	}
	static void b() {
		System.out.println(b);
	}
	
}
class B{
	int a =100;
	static int b = 200;
	
	Runnable c = new Runnable() {
		@Override
		public void run() {
			
		}
	};
}
public class AnonymousClassTest1 {

	public static void main(String[] args) {
	System.out.println("=====인스턴스 변수 출력하기=====");	
	A a = new A();
	a.a();
	a.b();

	System.out.println("=====인스턴스 생성없이 객체이름으로 변수 출력하기=====");	
	A.b();
	}
}
