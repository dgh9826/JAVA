package interface_08;

public interface PhoneInterface2 {			//인터페이스와 상수와 추상메소드,default메소드만 사용가능 <=변수는 올 수 없다.
											//인터페이스 내에서는 접근제한자가 생략되면 public이 생략되어있는 것이다.
											//왜냐하면 외부의 사용자들이 내부 시스템에 접근 하기 때문에.  
	public static final int timeout=10000;
	int timeout1 = 20000;					//=> 상수 : public static final 생략 가능
	public abstract void sandCall();
	void recieveCall();						//=> 추상 메소드 : public abstract 생략 가능
	default void printLogo() {				//=>default메소드 : public 생략 가능
		System.out.println("로고를 프린트 합니다.");
	}
}
