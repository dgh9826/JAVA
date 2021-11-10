package ControlStatement;

public class DoWhileStatement {

	public static void main(String[] args) {
		/* do-while
		 * 
		 * do{
		 * 	수행문1;
		 * 	[증감식;]
		 * 	...
		 * } while(조건식);
		 * 	조건식은 비교식 내지 논리식
		 * 	무조건 한번은 수행한다 그 외는 while문과 동일
		 * 	초기식 초기화 필요
		 */
		
//		int i=1;
//		int sum =0;
//		do {
//			sum+=i;
//			i++;
//		}while(i<=10);{
//		}
//		System.out.println(sum);
		
		int i=0;
		do {
			int j=0;
			do {
				if(i==j) {
					System.out.print("1");
				}else {
					System.out.print("0");
				}
				j++;
			}while(j<4);
			i++;
			System.out.println();
		}while(i<4);
		
		System.out.println("======*표 출력======");
		int j=0;
		do{
			int x=0;
			do {
				if(x<=j)System.out.print("*");
				x++;
			}while(x<=4);
		j++;
		System.out.println();
		}while(j<=4);
		
		System.out.println("======구구단 출력======");
		int a=1;
		do {
			int b=2;
			do {
				System.out.printf("%d * %d = %2d|",b,a,b*a);
				b++;
			}while(b<=9);
			a++;
			System.out.println();
		}while(a<=9);
	}

}
