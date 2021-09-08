package Object06.static_ex;

public class Student3 {
	private static int serialNum = 1000;	//외부 클래스에서 직접 접근을 차단. 
											//getter, setter를 통해서만 값에 접근 가능
											//무결성을 체크해서 적용 할 수 있다.

	int studentId;
	String studentName;
	int grade;
	String address;
	
	public Student3() {
		serialNum++;
		studentId=serialNum;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public static int getSerialNum() {
		int i = 10;
		return serialNum;
	}

	public static void setSerialNum(int serialNum) {
		Student.serialNum = serialNum;
	}
}
