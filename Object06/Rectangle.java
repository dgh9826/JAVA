package Object06;

import java.util.Scanner;

public class Rectangle {
	int width;//넓이
	int height;//높이
	
//	public Rectangle() {}				//기본 생성자는 생략 가능 (단, 다른 생성자가 없는 경우, 외부에서 호출하지 않는 경우)
	public int getArea() {				//int 값을 return 돌려주는 getArea 메소드			
		return width*height;
	}
	public static void main(String[] args) {
		Rectangle rect=new Rectangle();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("높이 입력: ");
		rect.width = sc.nextInt();
		System.out.print("너비 입력: ");
		rect.height = sc.nextInt();
		System.out.println("사각형의 면적은: "+rect.getArea());
			
		sc.close();
	}

}
