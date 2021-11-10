package datatype;

public class TypeCasting {

	public static void main(String[] args) {
//		묵시적 형변환 
//		작은그릇의 데이터를 -> 큰그릇에 넣을때
//		형변환이 자동으로 일어 남
		byte b1 =65;
		short s1;
		s1=b1;
		System.out.println("b1: "+b1+" s1: "+s1);
//		명시적 형변환
//		큰 그릇의 데이터를 -> 작은 그릇에 넣을때
//		자료의 손실이 일어 날 수도 있다.
		char c1= (char)b1;
		
		short s2=100;
		byte b2 = (byte)s2;
		System.out.println(b2);
		int num2 =300;
		b2 = (byte)num2;
		System.out.println(b2);

		double d1 = 3.14;
		int num = (int)(num2+d1);
		System.out.println(num);
	}

}
