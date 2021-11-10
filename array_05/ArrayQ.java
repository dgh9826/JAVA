package array_05;

import java.util.Scanner;

public class ArrayQ {

	public static void main(String[] args) {
		int arr[] = null;
		int count=0;
		int sum=0;
		double avg=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열의 크기는 > ");
		count = sc.nextInt();
		arr=new int[count];
		System.out.print("index 값 > ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		for(int array : arr) {
			System.out.println(array);
			sum+=array;
		}
		avg = (double)sum/arr.length;
		System.out.println("배열의 길이는 >> "+arr.length);
		System.out.println("평균은 >> "+avg);
		sc.close();
	}

}
