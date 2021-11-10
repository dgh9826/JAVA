package Exception10.auto_close;

public class AutoCloseTest {

	public static void main(String[] args) {
		
		try(AutoCloseObj obj = new AutoCloseObj()){
			
		}catch(Exception e) {
			System.out.println("예외 블락입니다.");
		}
		System.out.println("종료");
	}
}
