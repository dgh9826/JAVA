package inheritance_07.lab10_polymorphism;

public class Eagle extends Animal{
	@Override
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
	}
	public void flying() {
		System.out.println("독수리가 고공비행 합니다.");
	}
}
