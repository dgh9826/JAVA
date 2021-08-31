class Greeting{
	 /*public 공용 메소드
	 * protected
	 * private 해당 클래스에서만 사용가능한 메소드
	 * default 
	 * 
	 * static - class method
	 * no static - instance method
	 */

	public static void hi() {
		System.out.println("Hi");
	}
}
public class ModifiersMethod {

	public static void main(String[] args) {
		Greeting.hi();

	}

}
