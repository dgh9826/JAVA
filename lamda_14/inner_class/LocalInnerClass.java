package lamda_14.inner_class;

/*지역 내부 클래스(Local Inner Class) : 메소드 내부에 클래스를 생성. <== 익명클래스
 *추상클래스의 추상메소드, 인터페이스의 추상메소드를 구현할때 별도의 구현 클래스를 만들지 않고 사용
 *1.구현클래스를 생성 : 지속적으로 사용할 때
 *2.익명클래스를 생성 : 잠시 사용할 때
 *메소드 내의 변수를 지역변수, 메소드 내에서만 생성, 메소드가 호출이 끝나면 사라짐.
 */


class Outer { // 외부 클래스(인스턴스 클래스)
	int outNum = 100;
	static int sNum = 200;

	Runnable getRunnable(int i) {
		
		int num = 100;
		//메소드에서 선언된 변수나 매개변수는 지역내부클래스에서는 상수(final)로 변경된다. <= 변경 불가.
		class MyRunnable implements Runnable{
			int localNum = 10;
			
			@Override
			public void run() {
//				num = 200;		//에러남, 지역 변수는 상수로 바뀐다.
//				i = 100;		//에러남, 매개변수 역시 지역 변수 처럼 상수로 바뀜
				
				System.out.println("i = "+i);
				System.out.println("num = "+num);
				System.out.println("localNum = "+localNum);
				
				System.out.println("outNum = "+outNum+"(외부 클래스 인스턴스 변수)");
				System.out.println("Outter.sNum = "+Outer.sNum+"(외부 클래스의 정적변수)");
			}
		}
		
		return new MyRunnable();
	}
}

public class LocalInnerClass {
	// 지역 내부 클래스(LocalInnerClass)
	// 메소드 내에 클래스를 정의
	// 메소드가 호출할 때 사용, 메소드가 호출이 끝나면 제거
	// 익명 내부 클래스 : 지역 내부 클래스에서 클래스 이름을 생략한 것
	// <= 람다식은 내부적으로 자바에서 익명 내부 클래스로 작동

	public static void main(String[] args) {

		Outer out = new Outer();
		Runnable runner = out.getRunnable(1000);		//메소드 호출시 Runnable 객체를 리턴 받음
		runner.run();
	}
}
