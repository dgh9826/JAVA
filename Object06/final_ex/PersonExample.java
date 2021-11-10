package Object06.final_ex;

public class PersonExample {

	public static void main(String[] args) {
		Person p1 = new Person("123456-1234567","계백");
		Person p2 = new Person("123457-1234568","을지");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		//p1.nation = "Dutch";			//변수(상수)의 값에 final키가 할당되어있어 수정 불가
		//p1.ssn="123451-1234501";		//변수(상수)의 값에 final키가 할당되어있어 수정 불가
		p1.name="을지문덕";				// 변수, 값을 할당 할 수 있다.
		System.out.println(p1.name);
	}

}
