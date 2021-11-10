package Object06.static_ex;

public class Student {

	public static int serialNum=1000;			//static : 메모리의 stack영역에 저장
											//객체생성 (new로 선언) 없이도 접근 가능
											//각각의 객체가 공유하는 메모리 영역
											//instance 생성보다 먼저 생성됨.
	
	int studnetId;							//instance 선언 후 사용해야함					
	String studentName;
	int grade;
	String address;
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName=studentName;
	}
	public static int getSerialNum() {
		int i=10;
		return serialNum;
	}
	public static void setSerialNum(int serialNum) {
		Student.serialNum=serialNum;
	}
}
