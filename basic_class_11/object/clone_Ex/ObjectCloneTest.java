package basic_class_11.object.clone_Ex;

class Point {
	int x;
	int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		return "x= " + x + " , y= " + y;
	}
}

class Circle implements Cloneable {
	Point point;
	int radius;

	public Circle(int x, int y, int radius) {
		point = new Point(x, y);
		this.radius = radius;
	}
	public String toString() {
		return "원점은 " + point + "이고, 반지름은 " + radius + "입니다.";
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
public class ObjectCloneTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		Circle c = new Circle(10, 20, 30);

		Circle copyc = (Circle) c.clone(); // 객체복사

		System.out.println(c); // 객체 원본
		System.out.println(copyc); // 객체의 복사본

		System.out.println(System.identityHashCode(c));
		System.out.println(System.identityHashCode(copyc));
	}
}
