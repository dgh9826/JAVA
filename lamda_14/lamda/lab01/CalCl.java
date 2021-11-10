package lamda_14.lamda.lab01;

public class CalCl implements CalInter {

	@Override
	public void cal(int a, int b) {
		System.out.println("합 : "+(int)(a+b));
		System.out.println("차 : "+(int)(a-b));
		System.out.println("곱 : "+(int)(a*b));
		double c = 0;
		try {
			c = a/b;
			System.out.println("몫 : "+c);
		}catch(ArithmeticException e) {
			System.out.println("***0으로 나눌 수 없습니다.***");
		}
	}
}
