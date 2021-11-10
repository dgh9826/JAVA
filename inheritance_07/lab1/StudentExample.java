package inheritance_07.lab1;

public class StudentExample {

	public static void main(String[] args) {
		Student stu= new Student("홍길동","123456-1234567", 1);
		System.out.println("name: "+stu.name);
		System.out.println("ssn: "+stu.ssn);
		System.out.println("studentNo: "+stu.studnetNo);
	}

}
