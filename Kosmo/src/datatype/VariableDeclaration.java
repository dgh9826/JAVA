package datatype;

public class VariableDeclaration {

	public static void main(String[] args) {
		System.out.println("변수 선언");
		int num =10, pnum = 20, anum = 14 ;
		System.out.println(num+pnum+anum);
		num =23;
		char c1='A', c2=65, c3=0B1000001, c4='a';
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
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
	}
	
}
