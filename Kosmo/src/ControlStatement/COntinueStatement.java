package ControlStatement;

public class COntinueStatement {

	public static void main(String[] args) {
		/* continue 문
		 * 반복문과 함께쓰임
		 * 반복문에서 continum 문을 만나면 이후의 문장은 수행하지 않고
		 * for문의 처음으로 돌아가 증감식을 수행
		 */
		
		int num=0;
		int sum=0;
		for(num=0; num<=100;num++) {
			if(num%2 !=0)
				sum+=num;
		}
		System.out.println(sum);
		num=0;
		sum=0;
		for(num=0; num<=100;num++) {
			if(num%2 ==0)
					continue;// 조건식,증감식으로 돌아감
				sum+=num;
		}
		System.out.println(sum);
		
		num=0;
		sum=0;
		while(num<=100) {
			if(num%2==0)
			sum+=num;
			num++;
		}
		System.out.println("dse"+sum);
		num=0;
		sum=0;
		while(num<=100) {
			if(num%2==0) {
				continue;
			}
			sum+=num;
			num++;
		}
		System.out.println("dfs"+sum);
			
	}

}
