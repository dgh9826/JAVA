package Object06;

public class Circle2 { 		// 생성자가 2개인 circle class , 생성자(method) 오버로딩(같은 이름으로 매개변수에 따라서 호출)
	int radius; 			// 멤버변수 //생성자는 객체를 초기화 하는 역할을 한다.(멤버 변수에 기본값을 할당)
	String name; 			// 멤버변수 : 객체에 설정된 변수를 멤버변수 (Heap영역에 생성)

	public Circle2() {
		radius = 1;
		name = "";
	}
	public Circle2(int r, String n) { // overLoading
		radius = r;
		name = n;
	}
	public double getArea() {
		return radius * radius * 3.14;
	}
	public static void main(String[] args) {
			Circle2 pizza = new Circle2(10,"자바피자");		
			System.out.println(pizza.name +"의 면적은 "+ pizza.getArea());
			
			Circle2 donut = new Circle2();
			donut.name="자바 도넛";
			System.out.println(donut.name+"의 면적은 "+donut.getArea());

	}

}
