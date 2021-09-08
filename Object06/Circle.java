package Object06;

class Circle {				//클래스 내부에는 field(멤버 변수), method , 생성자
	int radius;//원의 반지름			//정수형 변수 [기본타입의 자료형 : 8]
	String name;//원의 이름			//문자열 변수 [참조 자료형(객체형 자료형): 대문자 시작] 
															// 객체 이름 = stack 영역에 저장
															// 객체 생성 (new ~ ) = heap 영역에 저장
	public Circle() { 
															// 기본 생성자: 클래스 이름과 동일한 이름을 가진 메소드
	}														// -input 매개변수와 실행부가 없는 생성자를 기본 생성자라한다.
															// 기본 생성자는 생략 가능
	public Circle(int radius, String name) {
			this.radius=radius;											// - 생성자는 return을 돌려 주지 않는다.
			this.name=name;
	}
															//	-1.생성자 이름 앞에는 void(리턴이 없는 경우)
															//	-2.자료형이 명시(리턴이 있는 경우)
	
	public double getArea() {								//method(함수)
				return radius*radius*3.14;								
		}
									
	public static void main(String[] args) {
		
		Circle pizza = new Circle();			//Circle : 객체형 자료형식, pizza : 참조변수 , new : 생성자 호출 , 메모리의 힙영역에 저장
		
		pizza.radius = 10;
		pizza.name = "자바 피자";		
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은 " + area);
		
		Circle donut = new Circle();
		donut.radius = 2;
		donut.name = "자바 도넛";
		System.out.println(donut.name+"의 면적은 " + donut.getArea());
		
		Circle c2 = new Circle(3,"도미노");
		System.out.println(c2.name +"의 면적은 "+c2.getArea());
	}

}
