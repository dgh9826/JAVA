
public class ExceptionApp {				//예외 처리
										//ArithmeticException 산술처리 예외
										//ArrayIndexOutOfBoundsException 배열의 없는 값을 가져오는 예외
	public static void main(String[] args) {
		System.out.println(1);
		int[] scores = {10,20,30};
		try {										//try-catch 구문
			System.out.println(2);					
			//System.out.println(scores[3]);			//처음의 Exception 의 catch구문 실행 후 try문 나감 
			System.out.println(3);
			System.out.println(2/0);
			System.out.println(4);
		} 
		catch(ArrayIndexOutOfBoundsException e){
		System.out.println("없는 값이야.");
		}
		catch(Exception e) {//e는 Exception의 변수	 			//Exception이 제일 부모 클래스이기에 Exception만 선언해줘도 됨
			System.out.println("오류 발생"+e.getMessage());	//e.getMessage() => 예외가 발생되는 이유를 출력 ex) /by zero
			e.printStackTrace();							//e.printStackTrace() => 예외발생하는 코드 출력
		}
//		catch(ArithmeticException e) {				//예외가 발생하면 대응하는 코드가 실행됨	
//			System.out.println("잘못된 계산이네요.");	//실행된 후 하단코드 순서대로 실행
//		}
		System.out.println(5);
	}

}
