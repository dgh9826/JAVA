package lamda_14.inner_class;

class Outer3 { // 외부 클래스(인스턴스 클래스)
	int outNum = 100;
	static int sNum = 200;

	Runnable getRunnable(int i) {
		
		int num = 100;
		
		return new Runnable(){ // 지역 내부 클래스 / 익명 클래스
			int localNum = 10;
			
			@Override
			public void run() {
//				num = 200;		//에러남, 지역 변수는 상수로 바뀐다.
//				i = 100;		//에러남, 매개변수 역시 지역 변수 처럼 상수로 바뀜
				
				System.out.println("i = "+i);
				System.out.println("num = "+num);
				System.out.println("localNum = "+localNum);
				
				System.out.println("outNum = "+outNum+"(외부 클스 인스턴스 변수)");
				System.out.println("Outter.sNum = "+Outer.sNum+"(외부 클래스의 정적변수)");
			}
		};
		
		
	}
}

public class LocalInnerClass2 {
	// 지역 내부 클래스(LocalInnerClass)
	// 메소드 내에 클래스를 정의
	// 메소드가 호출할 때 사용, 메소드가 호출이 끝나면 제거
	// 익명 내부 클래스 : 지역 내부 클래스에서 클래스 이름을 생략한 것
	// <= 람다식은 내부적으로 자바에서 익명 내부 클래스로 작동

	public static void main(String[] args) {

		Outer3 out = new Outer3();
		Runnable runner = out.getRunnable(1000);
		runner.run();
	}
}