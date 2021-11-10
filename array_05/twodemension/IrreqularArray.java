package array_05.twodemension;

public class IrreqularArray {

	public static void main(String[] args) {
		int intArray[][] = new int[4][];	//비정방형 배열 선언 : 행의 갯수만 선언
		intArray[0] = new int[3];	//행의 인데스 0에 열의 갯수 3
		intArray[1] = new int[2];	//행의 인데스 1에 열의 갯수 2
		intArray[2] = new int[3];	//행의 인데스 2에 열의 갯수 3
		intArray[3] = new int[2];	//행의 인데스 3에 열의 갯수 2
		
		for(int i=0;i<intArray.length;i++) { 		//배열의 각방에 값을 input 
			for(int j=0;j<intArray[i].length;j++) {
				intArray[i][j]=(i+1)*10+j;
			}
		}
		for(int i=0;i<intArray.length;i++) { 		//배열의 각 방의 값을 출력
			for(int j=0;j<intArray[i].length;j++) {
				System.out.print(intArray[i][j]+" ");
			}
			System.out.println();
		}
	}

}
