package inheritance_07.abstarct_template;

public class CarTest {

	public static void main(String[] args) {
		System.out.println("=====자율 주행 자동차=====");
		Car mycar = new AICar();
		mycar.run();

		System.out.println("=====자율 주행 자동차=====");
		Car yourcar = new ManualCar();
		yourcar.run();
	}

}
