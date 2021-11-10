package interface_08.lab04;

public interface Cal {

	double PI=3.14;							//상수
	int ERROR = -999999;
	
	int add(int num1, int num2);			//추상메소드
	int substrace(int num1, int num2);
	int times (int num1, int num2);
	int divide (int num1,int num2);
	
	//인터페이스내에 구현코드가 있는 method
	//default method : 상속(o)
	//static method : 메모리의 stack영역에 저장, 객체 생성 없이 사용 가능
	//private method : 클래스내부에서만 사용. 상속(x)
	//private static method : 클래스 내부에서만 사용. 상속(x) , stack 공간에서만 사용
	default void description() {
		System.out.println("정수 계산기를 구현합니다.");
	}
	static int total (int [] arr) {		//static method :객체 사용 없이 사용.
		int total =0;
		for(int a : arr) {
			total += a;
		}
		return total;
	}
	//자바 9.0 이상 부터 지원
//	private void myMethod() {			
//		System.out.println("private method");
//	}
//	private static void myStaticMethod() {
//		System.out.println("private static method");
//	}
}
