package operator2;

public class SansulOP {

	public static void main(String[] args) {
		/*
		 * 산술연산자(이항연산자)의 결과는 다양하다
		 * 살술연산자내 에서의 연산 우선순위
		 * (*,%,/)>(+,-)
		 * 우선순위가 같은 경우 왼쪽에서 오른쪽으로
		 * 산술 연산자를 써서 식을 만들면 산술식
		 */
		 int a=3,b=5;
		 System.out.println(a+b);
		 System.out.println(a-b);
		 System.out.println(a*b);
		 System.out.println(b/a);
		 System.out.println(b%a);
		 
		 short s1=100;
		 int s2=-s1;
		 System.out.println(s2);		 
		 short s3=++s1;
		 System.out.println(s3);
		 int s4=s2++;
		 System.out.println(s4);
		 
		 int result=3*2+5%2-6/3*5;
		 System.out.println(result);
		 
		 double d1=3;
		 double d2=5;
		 System.out.println(d1+d2);
		 System.out.println(d1-d2);
		 System.out.println(d1*d2);
		 System.out.println(d2/d1);
		 System.out.println(d2%d1);
		 
		 int num1=100;
		 int num2=num1;
		 num1+=200;
		 System.out.println(num1);
		 System.out.println(num2);
		 System.out.println(num1%=num2);
		
		 int o = 4;
		 if(!(o>3)&&!(o<5)) {
			 System.out.println("wow");
		 }else {
			 System.out.println(o);
		 }
		 
		 System.out.println(-8>>3);
				 
	}

}
