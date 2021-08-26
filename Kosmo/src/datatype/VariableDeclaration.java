package datatype;

import java.math.BigDecimal;

public class VariableDeclaration {
	public static void circle(int x,double y) {
		double sum = x*x*y;
		System.out.println("원 넓이: "+sum);
	}
	public static void main(String[] args) {
		System.out.println("변수 선언");
		int num =10, pnum = 20, anum = 14 ;
		System.out.println(num+pnum+anum);
		num =23;
		char c1='A', c2=65, c3=0B1000001, c4='a';
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println((char)(c1+num));
		System.out.println(num);

		byte b1=(byte)130;  //1000010
		System.out.println(b1);
		int n = 10111101;
		System.out.println(num+n);
		long a = 22000000000L;
		
		System.out.println(a);
		
		int b = 0412;
		System.out.println(b);
		
		//문제 
		int kor = 89, eng = 99, math = 78, sum;
		sum = kor + eng + math;
		System.out.println("국어 :"+kor +" 영어 :"+eng+" 수학 :"+math+" 총합 : "+sum);
		//문제
		int radius=10;
		double pi=3.14;
		int circle1= (int)(radius*radius*pi);
		float circle2 = (float)(radius*radius*pi);
		double circle =radius*radius*pi;
		System.out.println("int형 : "+circle1);
		System.out.println("float형 : "+circle2);
		System.out.println("double 형 : "+circle);
		circle(radius,pi);
		
		double d1 =0.1;
		double d2 =0.2;
		
		System.out.println(d1+d2);
		System.out.println(d1*d2);
		
		BigDecimal big1 = new BigDecimal("0.1");
		BigDecimal big2 = new BigDecimal("0.2");
		BigDecimal big4 = new BigDecimal("0.3");
		BigDecimal big3 =big1.add(big2);
		System.out.println(big3);
		
		System.out.println(big3.compareTo(big4));
		
		
	}
}
