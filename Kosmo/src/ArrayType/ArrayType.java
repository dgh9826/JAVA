package ArrayType;

import java.io.IOException;

public class ArrayType {

	public static void main(String[] args) {
		int [] arr= {10,20,30,40,50}; //배열 선언시 초기화 해야됨
		for(int i=0;i<arr.length;i++) {
			System.out.printf("arr[%d]: %d\n",i,arr[i]);
		}
		
		int arr2[];
		arr2 = new int [] {60,70,80,80,100};
		arr2[0] = 65;
		for(int i=0;i<arr2.length;i++) {
			System.out.printf("arr2[%d]: %d\n",i,arr2[i]);
		}
		//String
		String str[];
		str = new String[] {"이순신","강감찬","김시민"};
		str[0]="윤관";
		for(int i=0;i<str.length;i++) {
			System.out.printf("str[%d]: %s\n",i,str[i]);
		}
		
		int [][] arr3= {{10,20,30,40,50},{60,70,80,90,100}};
		for(int i=0;i<arr3.length;i++) {//행
			for(int j=0;j<arr3[i].length;j++) {
				System.out.printf("arr3[%d][%d]: %d\n",i,j,arr3[i][j]);
			}
		}
		System.out.println(arr3.length);
		System.out.println("향상된 for문");
		for(int [] i:arr3) {
			for(int j:i) {
				System.out.printf("%d\n",j);
			}
			
		}
	}
}
