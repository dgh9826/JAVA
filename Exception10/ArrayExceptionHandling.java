package Exception10;

public class ArrayExceptionHandling {

	public static void main(String[] args) {
		int[] arr = new int[5];
		
		try {
		for(int i=0;i<=5;i++) {				//ArrayIndexOutOFBoundsException 발생
			arr[i] = i;
			System.out.println("arr["+i+"] = "+arr[i]);
		}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("arr[5] = 예외발생");
			System.out.println("오류 발생 이유 >> "+e.getMessage());	//예외가 발생되는 이유 출력
			e.printStackTrace();									//예외 발생하는 코드 출력
		}
		System.out.println("종료");
	}
}

/*
 * try{
 * 
 * }catch(*******Exception e){
 * 
 * }
 */ 
