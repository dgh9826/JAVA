package interface_08;

public interface PhoneInterface {	// 인터페이스 : 클라이언트가 회사내부의 서버 서비스를 사용할 수 있는 접점
									//상수와 추상메소드, default 메소드만 포함 가능 / 변수는 인터페이스에 올 수 없다. 객체는 생성할 수 없다.
									//인터페이스 내에 상수, 추상메소드, default 메소드를 JVM1.8[8.0] 이상부터 사용 가능
									//인터페이스 내에서 구현 코드가 사용된 메소드
									//=> default method (상속가능) / static method (stack공간에 저장) / private method (상속불가),인터페이스 내부에서만 사용가능
	public static final int timeout = 10000;
	public abstract void sandCall();
	public abstract void recieveCall();
	public default void printLogo() {
		System.out.println("로고를 프린트 합니다.");
	}
	
	
}
