package inheritance_07.lab10_downcasting;

public class DowncastingEx {

	public static void main(String[] args) {
		
		Person p = new Student("홍길동");		//업캐스팅 : 부모클래스의 필드,메소드 접근
											//단, 오버라이딩된 메소드 호출 시 동적바인딩 적용
		p.id="1000";
		System.out.println(p.id + ","+p.name);
		
		Student s = (Student) p; //강제적으로 자료형을 명시 //다운캐스팅 : 부모 자식클래스의 필드,메소드 모두 접근 가능
		
	}

}
