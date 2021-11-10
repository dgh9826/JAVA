package basic_class_11.object;

class Student3 {
	int studentId;
	String studentName;
	int grade;

	public Student3(int studentId, String studentName ,int grade) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.grade = grade;
	}

	@Override
	public String toString() {
		return studentName + "," + grade;
	}
	
	@Override
	public int hashCode() {
		return studentId;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student3) {
			Student3 std = (Student3)obj;
			if(studentName == std.studentName) {
				return true;
			}else {
				return false;
			}
		}
		return false;
	}
}

public class EqualTest3 {

	public static void main(String[] args) {
		Student3 std1 = new Student3(100, "강감찬",6);
		Student3 std2 = new Student3(200, "강감찬",5);
		Student3 std3 = new Student3(300, "이순신",4);
		Student3 std4 = std3;
		
		System.out.println(std1);								//16진수 hashcode 
		System.out.println(System.identityHashCode(std1));		//10진수
		System.out.println(System.identityHashCode(std2));
		System.out.println(System.identityHashCode(std3));
		System.out.println(System.identityHashCode(std4));
		
		System.out.println(std1==std2);
		System.out.println(std1.equals(std2));
		
	}

}
