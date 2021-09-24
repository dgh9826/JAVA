package inheritance_07;

public class ColorPointEx {

	public static void main(String[] args) {
		Point p = new Point();
		p.set(1, 2);
		p.showPoint();
		
		System.out.println(p);
		ColorPoint cp = new ColorPoint();
		cp.set(3, 4);				//cp는 Point객체의 필드나 메소드를 불러 사용 할 수 있다.
		cp.setColor("red");
		cp.showColorPoint();
		
		System.out.println(cp);		//객체 자신을 출력했을 때 객체의 주소를 출력
	}
}
