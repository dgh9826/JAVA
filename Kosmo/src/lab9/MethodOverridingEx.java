package inheritance_07.lab9;

public class MethodOverridingEx {
	static void paint(Shape p) {	//static 선언된 method , 매개변수가 Shape 객체
		p.draw();					//업캐스팅 : 오버라이딩된 메소드를 업캐스팅해서 하나의 메소드로 처리 : 다형성 구현
	}
	static void paint_l(Line l) {
		l.draw();
	}
	static void paint_r(Rect r) {
		r.draw();
	}
	static void paint_c(Circle c) {
		c.draw();
	}
	public static void main(String[] args) {
		System.out.println("=======업캐스팅 메소드 이용해서 출력=======");
		Line line = new Line();					//line 객체를 생성 후
		paint(line);							//paint 메소드에 line 객체 할당
		paint(new Shape());						//paint 메소드 내에서 객체를 생성 매개변수로 호출
		paint(new Line());
		paint(new Rect());
		paint(new Circle());
		System.out.println("===================================");
		paint_l(new Line());
		paint_r(new Rect());
		paint_c(new Circle());
		
	}

}
