package inheritance_07.abstarct_template;

public abstract class Car {
	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("시동을 켭니다");
	}
	public void turnOfF() {
		System.out.println("시동을 끕니다");
	}
	final public void run() {	// 템플릿 메소드 : 하위클래스에서 오버라이딩 할 수 없다.
		startCar();				//프로그램의 로직을 사용.
		drive();
		stop();
		turnOfF();
	}
}
