package array_05;

import java.util.Scanner;

public class ArrayAccess {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int array[]=new int[5];
		int max=0;
		System.out.print("양의 정수 5개를 입력 >>");
		for(int i=0;i<array.length;i++) {
			array[i]=sc.nextInt();
			if(array[i]>max) {
				max=array[i];
			}
		}
		System.out.println("max: "+max);
		
//		int[][] arr=new int[4][4];
//		
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr[i].length;j++) {
//				arr[i][j]=sc.nextInt();
//			}
//		}
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr[i].length;i++) {
//				System.out.print(arr[i][j]+" ");
//			}
//			System.out.println();
//		}
		sc.close();
	}

}
