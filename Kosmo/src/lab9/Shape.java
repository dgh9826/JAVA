package inheritance_07.lab9;

public class Shape {					//super 클래스, 메소드 재정의해서 다형성 구현
	//public Shape next;					//객체 선언 ,Shape : 객체형 데이터 타입, next: 인스턴스 변수
	
	public Shape() {			//생성자
		//next=null;
	}
	public void draw() {
		System.out.println("Shape");
	}
}
class Line extends Shape{
	@Override
	public void draw() {
		System.out.println("Line");
	}
}
class Rect extends Shape {
	public void draw() {
		System.out.println("Rectangle");
	}
}
class Circle extends Shape{
	public void draw() {
		System.out.println("Circle");
	}
}
