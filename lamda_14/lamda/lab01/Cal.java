package lamda_14.lamda.lab01;

import java.util.Scanner;

public class Cal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CalCl cal = new CalCl();
		System.out.print("num1 >>");
		int num1 = sc.nextInt();
		System.out.print("num2 >>");
		int num2 = sc.nextInt();
	
		System.out.println("=====객체 지향=====");
		cal.cal(num1, num2);
		
		System.out.println("======람다식======");
		CalInter cal2 = (n1,n2) -> System.out.println("합 : "+(n1+n2) +"\n차 : "+(n1-n2)+"\n곱 : "+(n1*n2));
		cal2.cal(num1, num2);
		try {
			CalInter cal4 = (n1,n2) -> System.out.println("몫 : "+(double)(n1/n2));
			cal4.cal(num1,num2);
		}catch(ArithmeticException e){
			System.out.println("***0으로 나눌 수 없습니다.***");
		}
		
		System.out.println("=====익명클래스=====");
		CalInter cal3 = new CalInter(){
			@Override
			public void cal(int n1, int n2) {
				System.out.println("합 : "+(n1+n2));
				System.out.println("차 : "+(n1-n2));
				System.out.println("곱 : "+n1*n2);
				try {
					System.out.println("몫 : "+(double)(n1/n2));
				}catch(ArithmeticException e) {
					System.out.println("***0으로 나눌 수 없습니다.***");
				}
			}
		};
		cal3.cal(num1, num2);
		sc.close();
	}
}
