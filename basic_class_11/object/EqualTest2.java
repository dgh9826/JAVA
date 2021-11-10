package basic_class_11.object;

class Student2 {
	int studentId;
	String studentName;

	public Student2(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}

	@Override
	public String toString() {
		return studentId + "," + studentName;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student2) {
			Student2 std = (Student2)obj;
			if(studentId == std.studentId) {
				return true;
			}else {
				return false;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		return studentId;
	}
	
}

public class EqualTest2 {

	public static void main(String[] args) {
		Student2 Lee = new Student2(100, "이순신");
		Student2 Lee2 = new Student2(100, "이순신");

		System.out.println(Lee);
		System.out.println(Lee == Lee2);
		System.out.println(Lee.equals(Lee2));
		
		System.out.println(Lee.hashCode());
		System.out.println(Lee2.hashCode());
		
		System.out.println(System.identityHashCode(Lee));
		System.out.println(System.identityHashCode(Lee2));
	}

}
