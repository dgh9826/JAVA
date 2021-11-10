package lamda_14.stream;

import java.util.*;

public class InArrayTest {

	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,5};									//배열의 스트림 사용
		
		int sum = 0;
		for(int i =0;i<arr.length;i++) {
			sum += arr[i];
		}
		System.out.println(sum);
		int sumVal=Arrays.stream(arr).sum();					//배열의 모든 값을 더한 값
		int count = (int) Arrays.stream(arr).count();			//배열의 방의 개수
		double avgVal = Arrays.stream(arr).average().getAsDouble();	//배열방의 평균
		int minVal = Arrays.stream(arr).min().getAsInt();
		int maxVal = Arrays.stream(arr).max().getAsInt();
		
		System.out.println(sumVal);
		System.out.println(count);
		System.out.println(avgVal);
		System.out.println(minVal);
		System.out.println(maxVal);
	}
}
