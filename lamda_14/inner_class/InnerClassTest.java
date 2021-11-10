package lamda_14.inner_class;

class OutClass{						//외부 클래스 (인스턴스 외부 클래스: 인스턴스 변수, 정적변수 , 인스턴스 메소드, 정적메소드 선언이 가능)
	
	private int num = 10;			//외부 클래스의 private 변수, 인스턴스(멤버)변수, 객체화(사용)
	private static int sNum = 20;	//외부클래스의 private 변수, 정적변수, 객체화 없이도 사용(클래스이름 사용)
	
	private InClass inClass;		//외부의 클래스를 객체화 할때 내부 클래스도 객체화 하기 위한 변수
	
	public OutClass() {				//외부 클래스의 생성자 호출시 내부클래스의 객체화
		inClass = new InClass();
	}
	
	void outTest1() {
		System.out.println("인스턴스 외부 클래스의 인스턴스 메소드");
	}
	
	static void outTest2() {

		System.out.println("인스턴스 외부 클래스의 정적 메소드 사용 가능");
	}

	public void usingClass() {
		inClass.inTest();
	}

	class InClass{					//내부 클래스(인스턴스 내부 클래스) : 외부 클래스와 빈번하게 작업을 처리
									//정적 변수와 정적 메소드를 사용 할 수 없다.
		int inNum = 100;			//내부 클래스의 인스턴스 변수, 객체화 시켰을때 사용
//		static int sInNum =200;		//인스턴스 내부 클래스에서는 정적 변수를 사용 할 수 없다( 내부 클래스가 정적 클래스면 사용 가능)
		
		void inTest() {
			System.out.println("OutClass num = "+num+" (외부 클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum = "+sNum+" (외부 클래스의 정적 변수)");
			System.out.println("InClass inNum = "+inNum+" (내부 클래스의 인스턴스 변수)");
		}
		
		public void usingClass() {
			inTest();
		}
		
	}
	
	static class InStaticClass {				//정적 내부 클래스
		int inNum=100;
		static int sInNum=200;
		
		void inTest() {		//인스턴스 메소드 : 인스턴스변수를 사용,정적변수 사용가능
//			num+=10;		//외부 클래스의 인스턴스 변수를 사용 할 수 없다.
			inNum+=10;
			sInNum+=10;
			System.out.println("InStaticClass inNum = "+inNum+" (내부 클래스의 인스턴스 변수 사용");
			System.out.println("InStaticClass sInNum = "+sInNum+" (내부 클래스의 정적 변수 사용");
			System.out.println("outClass sNum = "+sNum+" (외부 클래스의 정적 변수 사용");
		}
		static void sTest(){	//정적메소드 : 인스턴스 변수 사용불가, 정적변수는 사용가능
//			num+=10;
//			inNum+=10;
			sInNum += 10;
			
			System.out.println("outClass sNum = "+sNum+" (외부 클래스의 정적 변수 사용");
			System.out.println("InStaticClass sInNum = "+sInNum+" (내부 클래스의 정적 변수 사용");
		}
	}
}
public class InnerClassTest {

	public static void main(String[] args) {
		OutClass outClass = new OutClass();
		System.out.println("외부 클래스 호출하여 내부클래스 기능을 호출");
		outClass.usingClass();
		System.out.println();
		
		OutClass.InClass inClass = outClass.new InClass();
		System.out.println("외부 클래스 변수를 사용하여 내부 클래스 객체 생성");
		inClass.inTest();
		System.out.println();
		
		OutClass.InStaticClass sInc = new OutClass.InStaticClass();
		sInc.inTest();
		System.out.println();
		
		System.out.println("정적 내부 클래스의 스태틱 메소드 호출");
		OutClass.InStaticClass.sTest();
	}
}
