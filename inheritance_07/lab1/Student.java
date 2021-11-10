package inheritance_07.lab1;

public class Student extends People {
	public int studnetNo;
	
	public Student(String name,String ssn,int studentNo) {
		super(name,ssn);
		this.studnetNo=studentNo;
	}
}
