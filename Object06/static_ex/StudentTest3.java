package Object06.static_ex;

public class StudentTest3 {

	public static void main(String[] args) {
		Student3 studentLee = new Student3();
		studentLee.setStudentName("김자바");
		System.out.println(studentLee.getSerialNum());
		System.out.println();
		
		Student3 studentKim = new Student3();
		studentKim.setStudentName("이자바");
		System.out.println(studentKim.getSerialNum());
		System.out.println();
		
		Student3 studentHong = new Student3();
		studentHong.setStudentName("홍자바");
		System.out.println(studentHong.getSerialNum());
		System.out.println();
		
		
	}

}
