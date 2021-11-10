package lamda_14.lamda.lab01;

public class StringConcatTest {

	public static void main(String[] args) {
		
		String s1 = "Hello";
		String s2 = "World";
		
		// 1.객체 지향으로 출력 : 객체의 메소드로 호출	 => 구현클래스를 생성해야함
		System.out.println("1.객체 지향으로 출력 : 객체의 메소드로 호출");
		StringConcatImple sci1 = new StringConcatImple();
		sci1.makeString("Hello", "World");
		
		//2.람다식을 사용해서 출력 => 임시적으로 사용 / 구현 클래스 생성 없이 작동 가능
		// 람다식은 익명 내부 클래스로 작동이 됨.
		System.out.println("2.람다식을 사용해서 출력"); 
		StringConcat sci2 = (s,v) -> System.out.println(s +", "+ v);
		sci2.makeString(s1, s2); 	//람다식으로 던져 주는 변수
		
		//3.익명 내부 클래스 사용해서 출력 => 임시적으로 사용 / 구현 클래스를 직접 내부에서 생성
		StringConcat sci3 = new StringConcat(){
			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1+", "+s2);
			}
		};
		sci3.makeString(s1, s2); 	//익명 내부 클래스 호출
	}
}
