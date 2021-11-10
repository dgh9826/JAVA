package array_05;
class Make{
	static int[] makeArray() {
		int temp[]=new int[4];				//정수형 index 4개짜리 배열 생성
		for(int i=0;i<temp.length;i++) {	//for문을 사용해서 각방에 정수값을 할당.
			temp[i]=i;						//배열의 각방에 값 : 0,1,2,3
		}
		return temp;
	}
}
public class ReturnArray {

	public static void main(String[] args) {
		int[] intArray;
		intArray = Make.makeArray();		//메소드로부터 배열을 전달 받음
		for(int i=0;i<intArray.length;i++) {
			System.out.print(intArray[i]+" ");
		}
		intArray[0]=50;
		intArray[1]=60;
		intArray[2]=70;
		intArray[3]=80;
		System.out.println();
		for(int array : intArray) {
			System.out.print(array+" ");
		}
	}
}
