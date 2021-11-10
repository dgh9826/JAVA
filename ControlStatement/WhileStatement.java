package ControlStatement;

import java.io.IOException;

public class WhileStatement {

	public static void main(String[] args) throws IOException {
		/*while
		 * 반복의 수가 정해져 있찌 않을때 주로 사용
		 * 조건식은 비교식 내지 논리식
		 * 조건식이 참일동안 반복수행
		 * 초기식은 반드시 초기화
		*/
		int i=1;
		int sum=0;
		while(i<=10) {
			sum +=i;
			i++;
		}
		System.out.println(sum);
		System.out.println(i);
		int a = 1;
		int sum1=0;
		while(a<=1000) {
			if((a%3==0||a%5==0)&&a%15!=0) {
				sum1+=a;
			}
			a++;
		}
		System.out.println(sum1);
		
//		System.out.print("문자열 입력: ");
//		char word;
//		//사용자가 몇 자를 입력할 지 모르는 경우 이므로 while문 사용
//		while((word=(char)System.in.read())!=13) {
//			System.out.print(word);
//		}
		System.out.println();
		int j=1;
		while(j<=4) {
			int k=1;
			while(k<=4) {
				if(j==k) {
					System.out.print("1");
				}else {
					System.out.print("0");
				}
				k++;
				}
			System.out.println();	
			j++;
		}
		System.out.println("=======*표 출력======");
		int x=0;
		while(x<=4) {
			int y=0;
			while(y<=x) {
				System.out.print("*");
				y++;
				}
			System.out.println();
			x++;
		}
		System.out.println("=======*표 역출력======");
		int f=0;
		while(f<=4) {
			int e=0;
			while(e<5) {
				if(f<=e)System.out.printf("*");
				else System.out.print(" ");
				e++;
			}
			System.out.println();
			f++;
		}
		System.out.println("=======구구단=======");
		int b=1;
		while(b<=9) {
			int c=2;
			while(c<=9) {
				System.out.printf("%d * %d = %2d|",c,b,c*b);
				c++;
			}
			System.out.println("");
			b++;
		}
	}
}
