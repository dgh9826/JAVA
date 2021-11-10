package basic_class_11.object;
class Student{
	int studentId;
	String studentName;
	
	public Student(int studentId, String studentName) {
		this.studentId=studentId;
		this.studentName=studentName;
	}

	@Override
	public String toString() {
		return studentId+","+studentName;
	}
}
public class EqualTest {

	public static void main(String[] args) {
		Student stuLee=new Student(100,"이순신");
		Student stuLee2 = stuLee;
		Student stuLee3 = new Student(100,"이순신");
		
		if(stuLee == stuLee2) {
			System.out.println("주소가 같습니다.");
		} else {
			System.out.println("주소가 다릅니다.");
		}
		if(stuLee.equals(stuLee2)) {
			System.out.println("동일합니다.");
		} else {
			System.out.println("동일하지 않습니다.");
		}
		
		if(stuLee == stuLee3) {
			System.out.println("주소가 같습니다.");
		} else {
			System.out.println("주소가 다릅니다.");
		}
		if(stuLee.equals(stuLee3)) {
			System.out.println("동일합니다.");
		} else {
			System.out.println("동일하지 않습니다.");
		}
		
		Object o = stuLee;
		
		//Object class의 equals()메소드는 두객체의 주소를 비교함
		//객체의 값을 비교하기 위해서는 Object class의 equals() 메소드를 재정의 해야한다.
		
		System.out.println(stuLee);
		
	}
}
