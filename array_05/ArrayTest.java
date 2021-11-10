package array_05;

public class ArrayTest {

	public static void main(String[] args) {
		int[] num = {1,2,3,4,5,6,7,8,9,10};
		
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]);
		}
		System.out.println("======================");
		System.out.println(num[0]);
		num[0]=50;
		num[1]=60;
		num[2]=70;
		num[03]=80;
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
		System.out.println(num[03]);
	}

}
