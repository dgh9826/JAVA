package ControlStatement;

public class ForStatement {

	public static void main(String[] args) {
		//제일 주로 사용하는 반복문 for문
		//반복횟수가 정해진경우 주로 사용한다.
		//반복횟수를 모를 경우에는 while 문을 사용한다.
		int sum = 0;
		for(int i=0;i<=10;i++) {
			sum +=i;
		}
		System.out.println(sum);
		int sum1=0;
		for(int i=0;i<=10;i+=2) {
			sum1 += i;
		}
		System.out.println(sum1);
		int sum2 = 0;
		for (int i=0;i<=10;i++) {
			if(i%2==0) {
				sum2+=i;
			}
		}
		System.out.println(sum2);
		
		int sum4=0;
		for(int i=1;i<=100;i++) {
			if(i%3==0||i%5==0) {
				sum4+=i;
			}
		}
		System.out.println(sum4);
		int sum5=0;
		for(int i=1;i<=100;i++) {
			if((i%3==0||i%5==0)&&i%15!=0) {
				sum5+=i;
			}
		}
		System.out.println(sum5);
		int sum6=0;
		for(int i=1;i<=100;i++) {
			if(i%3==0^i%5==0){
				sum6+=i;
			}
		}
		System.out.println(sum6);
		
//		for(int i=0;i<2;i++) {
//			for(int j=0;j<2;j++) System.out.println("Hello World");
//		}

		for(int i=1;i<5;i++) {
			for(int j=1;j<5;j++) {
				if(i+j==5) {
					System.out.print("1");
				}else{
					System.out.print("0");
				}
				}
			System.out.println();
		}
		
		for(int i=1;i<=5;i++) {
			for(int j=0;j<i;j++) {
				System.out.printf("*");
			}
		System.out.println();
		}
		for(int i=1;i<=5;i++) {
			for(int j=5;j>0;j--) {
				if(j>i) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		for(int i=1;i<=9;i++) {
			for(int j=2;j<=9;j++) {
				int mul=j*i;
				System.out.printf("%2d * %2d = %2d|",j,i,mul);
			}
			System.out.println(); 
		}
		for(;;) {
			System.out.println("무한루프");
			break;
		}
	}
}