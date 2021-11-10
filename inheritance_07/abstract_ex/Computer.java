package inheritance_07.abstract_ex;

public abstract class Computer {			//추상 클래스: 클래스 내부에 추상메소드가 1개 이상 존재하면
											//추상클래스는 객체화 할 수 없다. 추상클래스는 추상메소드를 구현하는 클래스가 존재(상속,오버라이딩)
	public abstract void display(); 		//추상 메소드 : 실행부가 없고 선언만 되어 있는 메소드
								//반드시 자식클래스에서 메소드 오버라이딩을 통해서 구현시켜 줘야함
								//=>사용하는 이유 : 메소드 이름 규칙
	public void display2() {	//일반 메소드 : () = 매개변수 입력, {} = 실행부
	}
	public abstract void typing();
	
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
}
