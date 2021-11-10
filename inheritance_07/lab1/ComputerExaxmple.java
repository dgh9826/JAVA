package inheritance_07.lab1;
class Calculator{
	double areaCircle(double r) {
		System.out.println("Calculator 객체의 areaCircle() 실행");
		return 3.14159*r*r;
	}
}
class Computer extends Calculator{
	@Override
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI*r*r;
	}
}
public class ComputerExaxmple {

	public static void main(String[] args) {
		int r = 10;
		
		Calculator cal = new Calculator();
		System.out.println("원면적: "+cal.areaCircle(r));
		
		Computer com= new Computer();
		System.out.println("원면적: "+com.areaCircle(r));
	}

}
