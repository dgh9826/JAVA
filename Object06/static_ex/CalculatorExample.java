package Object06.static_ex;

public class CalculatorExample {

	public static void main(String[] args) {
		double result1= 10*10*Calculator.pi;
		int result2=Calculator.plus(10,5);
		int result3=Calculator.minus(10, 5);
		
		System.out.println("resutl1 : " +result1);
		System.out.println("resutl2 : " +result2);
		System.out.println("resutl3 : " +result3);
	}

}
