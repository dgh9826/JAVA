package Object06.final_ex;

public class Person {
	final String nation ="Korea";	//기본 초기값 할당함 >> 
		//final 변수=>상수	: 상수값을 변경할 수 없다.
		//final 클래스	: 자식갱체를 허용 하지 않는다.
		//final 메소드	: 메소드 오버라이딩이 불가한 메소드
	
	/*
		method overloading :상속관계에서 부모클래스에 선언된 메소드를 자식클래스에서 재정의 해서 사용
		method overriding : 동일한 메소드 이름으로 매개변수를 달리해서 메소드를 실행
	*/
	final String ssn;			//주민번호, 객체를 생성할때 초기값 할당하고 변경 불가
	String name;				//변수는 소문자, 상수는 대문자
	
	public Person(String ssn,String name) {
		this.ssn=ssn;
		this.name=name;
	}
}
