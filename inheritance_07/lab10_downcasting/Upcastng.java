package inheritance_07.lab10_downcasting;

public class Upcastng {

	public static void main(String[] args) {
		Person p; 
		Student s = new Student("홍길동");	//s 는 Person,Student의 필드와 메소드 접근
		
		p =s;		//업캐스팅된 Person p = new Student();
					//p는 Person의 필드와 메소드만 접근 단, 오버라이딩된 메소드는 접근 가능
		
		System.out.println(p.name);
		
		p.fly();
		
	//	p.grade = "A";
	//	p.department = "Com";
		
	}

}
