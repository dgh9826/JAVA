package array_05;

public class ArrayCopy {							//배열의 복사, 배열은 초기에 배열방의 갯수가 선언되고 자동으로 늘어나지 않는다.
													//배열의 더많은 정볼르 넣기위해서는 새로운 배열을 만들고 기존 배열의 값을 복사.
	public static void main(String[] args) {
		int[] array1 = {10,20,30,40,50};
		int[] array2 = {1,2,3,4,5};
		int[] array3 = new int[10];
		int[] array4 = new int[20];
		
	//System.arraycopy(복사할 배열, 복사할 배열의 첫 번째 인덱스, 복사해서 붙여 넣을 배열, 붙인 배열에서 붙여넣을 시작 인덱스, 복사할 갯수)
		System.arraycopy(array1, 0, array2, 1, 4);	
		System.arraycopy(array2, 0, array3, 2, array2.length);
		System.arraycopy(array1, 2, array4, 0, 3);
		for(int i=0;i<array2.length;i++) {
			System.out.println(array2[i]);
		}
		array3[5]=500;
		array3[6]=600;
		array3[7]=700;
		System.out.println("============");
		for(int i=0;i<array3.length;i++) {
			System.out.println(array3[i]);
		}

		System.out.println("============");
		for(int i=0;i<array4.length;i++) {
			System.out.println(array4[i]);
		}
	}

}
