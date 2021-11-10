package array_05.arraylist;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student(1001,"Lee");
		studentLee.addSubject("국어", 100);
		studentLee.addSubject("수학", 50);
		studentLee.addSubject("영어", 80);
		
		Student studentKim = new Student(1002,"Kim");
		studentKim.addSubject("국어", 70);
		studentKim.addSubject("수학", 85);
		studentKim.addSubject("영어", 100);
		
		Student studentPark = new Student(1003,"Park");
		studentPark.addSubject("국어", 90);
		studentPark.addSubject("수학", 70);
		studentPark.addSubject("영어", 85);
		studentPark.addSubject("화학", 40);
		studentPark.addSubject("물리", 50);
		
		studentLee.showStudentInfo();
		System.out.println("==================");
		studentKim.showStudentInfo();
		System.out.println("==================");
		studentPark.showStudentInfo();
		
	}

}
