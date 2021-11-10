package interface_08.lab01;

public interface PhoneInterface {				//인터페이스 : 상수+추상메소드+default메소드{실행코드}
	
	int TIMEOUT = 10000;						//상수 : public static final이 생략되어있다.
	void sendCall();							//추상메소드 : public abstract이 샹략되어있다.
	void receiveCall();							//추상메소드
	default void printLogo() {					//구현부가 들어간 default메소드 => public이 생략됨, 하위 클래스에서 상속되어 적용
		System.out.println("로고를 출력합니다.");
	}
	
	
}
