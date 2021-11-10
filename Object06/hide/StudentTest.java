package Object06.hide;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student();
		//studentLee.studentName ="이똘똘"; 		studentName 이 private라 접근 불가
		studentLee.setStudentName("이똘똘");		//private으로 선언된 변수에 setter를 통한 변수 값 할당
		studentLee.sutdentID=201321315;
		studentLee.address="서울시 똘똘구";
		studentLee.grade=99;
		System.out.println(studentLee.getStudentName()+"학생의학번은 "+ // getter로 studentName 불러옴
					studentLee.sutdentID+"이고, 주소는 "+studentLee.address+"이고, 이번 점수는 "+studentLee.grade+"점이다."); 
	}

}
