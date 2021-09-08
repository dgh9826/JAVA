package Object06.hide;

public class Student {
	int sutdentID;						//학생 학번
	private String studentName;			//학생 이름 , private => 외부에서의 정보의 은닉, setter를 사용해서 외부에 값을 할당.
	int grade;							//학년
	String address;						//주소

	
	public String getStudentName() {	//getter() 형식 => get+변수이름()
		return studentName;				//getter : private 변수의 값을 돌려줄때 사용 method, 외부에서도 사용해야하기 때문에 public 
	}	
	public void setStudentName(String studentName) {	//setter() 형식 => set+변수이름()
		this.studentName=studentName;				//setter : private 변수의 값을 할당할때 사용 method, 외부에서도 사용해야하기 때문에 public
	}

}
