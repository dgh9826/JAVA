package ControlStatement;

public class BreakStatemnet {

	public static void main(String[] args) {
		/*
		 * break문
		 * switch-case문에서 사용하듯 다른 조건을 비교하지 않고 빠져나온다
		 * 반복문에서도 break 사용시 하위 반복문 실행하지 않고 탈출
		 */
		//1부터 100까지의 합
		int num=0;
		int sum=0;
		for(num=0;num<=100;num++)
			sum+=num;
		System.out.println(sum);
		System.out.println(num);
		//1부터 100까지 반복 합계중 합이 100이상이면 반복문을 빠져나오시오.
		sum=0;
		for(num=0;num<=100;num++) {
			sum+=num;
			if(sum>=100)
				break;
		}
		System.out.println(sum);
		System.out.println(num);
		//중첩 반복문에서 break문
		//break문이 사용된 루프문만 빠져나옴

		sum=0;
		for(num=0;num<=2;num++) {
			System.out.print("outter");
			for(int num2=0;num2<=5;num2++) {
				if(num2==2) {
					System.out.print("inner ");
					break;
				}
			}
			System.out.println();
		}
		//중첩 포문에서 라벨 사용시 모두 탈출
		outter:for(num=0;num<=2;num++) {
			System.out.print("outter2");
			for(int num2=0;num2<=5;num2++) {
				if(num2==2) {
					System.out.print("inner2");
					break outter;
				}
			}
			System.out.println();
		}
		//while 문에서 break
		sum=0;
		num=1;
		while(num<=10) {
			if(num==5)break;
			sum+=num;
			num++;
		}
		System.out.println(sum);
		
		sum=0;
		num=1;
		do {
			if(num==5)break;
			sum+=num;
			num++;
		}while(num<=10);
		System.out.println(sum);
	}
}
