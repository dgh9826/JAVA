package Exception10.auto_close;

public class AutoCloseObj implements AutoCloseable{	//자동으로 객체를 해제 하려면 AutoCloseable 인터페이스를 구현 해야한다.
													//close() 메소드를 오버라이딩 해야한다.

	@Override
	public void close() throws Exception {
		System.out.println("리소스가 close() 되었습니다.");
	}

	
}
