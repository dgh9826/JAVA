package Exception10.Ex;

import java.util.Scanner;

public class CompleteCal extends Calculator implements Cal{

	int a,b;

	public CompleteCal(int a,int b) {
		this.a = a;
		this.b = b;
	}
	@Override
	public String toString() {
		return "합: "+add(a,b)+" 차: "+substract(a,b)+" 곱: "+times(a,b)+" 몫: "+(double)divide(a,b);
	}

	@Override
	public int add(int a, int b) {
		return a+b;
	}
	@Override
	public int times(int a, int b) {
		return a*b;
	}
	@Override
	int substract(int a, int b) {
		return a-b;
	}
	@Override
	int divide(int a, int b) {
		int c = 0;
		try {
			c = a/b;
		}catch(ArithmeticException e) {
			System.out.println("***예외 발생***");
			System.out.println("b = 0이 아니여야 한다.");
			e.printStackTrace();
		}
		return c;
	}
	public static void main(String[] args) {
		
		//Cal 인터페이스 구현, Calulator 추상클래스를 구현
		//스캐너로 두개의 정수를 인풋 받아서, 객체 자체를 print 했을 때 
		//a/b : b가 0인 경우 Exception 발생
		Scanner sc = new Scanner(System.in);
		System.out.print("a > ");
		int a=sc.nextInt();
		System.out.print("b > ");
		int b=sc.nextInt();	
		System.out.println(new CompleteCal(a,b));
		sc.close();
		

	}
}
