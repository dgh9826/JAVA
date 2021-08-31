class Print {
	public String delimiter;
	public void a() {
		System.out.println(this.delimiter);
		System.out.println("a");
		System.out.println("a");
	}
	public void b() {
		System.out.println(this.delimiter);
		System.out.println("b");
		System.out.println("b");
	}
	public static void c(String delimiter) {
		System.out.println(delimiter);
		System.out.println("c");
		System.out.println("c");
	}
}
public class StaticMethod {

	public static void main(String[] args) {
//		Print.a("-");
//		Print.b("-");
		//instance를 사용할때에는 method에 static 은 필요하지않다
		Print t1 = new Print(); // instance 선언 -> no static -> instance method
		t1.delimiter="-";
		t1.a();
		t1.b();
		//class 호출은 method에 static이 필요하다 
		Print.c(""); // -> static -> class method
		//..................
//		Print.a("*");
//		Print.b("*");
		
		Print t2 = new Print();
		t2.delimiter ="*";
		t2.a();
		t2.b();
	}

}
