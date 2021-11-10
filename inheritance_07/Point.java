package inheritance_07;

class Point {	//{x,y} 의 한점을 표현하는 Point 클래스와 이를 상속받아 색을 가진 점을 표현하는 colorpoint 클래스
	private int x,y;
	
	public void set(int x, int y) {
		this.x= x; this.y =y;
	}
	public void showPoint() {
		System.out.println("("+x+","+y+")");
	}
}
class ColorPoint extends Point{
	private String color;
	public void setColor(String color) {
		this.color=color;
	}
	public void showColorPoint() {
		System.out.print(color);
		showPoint();
	}
}