package stream_19.serialization;

import java.io.*;

class Student implements Serializable{		
	/**
	 * 
	 */
	private static final long serialVersionUID = 4690061131427350990L;
	
	String name;								//직렬화(D:\\Temp\\student.dat)
	transient int id;							//역질렬화 : 직열화된 파일에서 변수의 값을 읽어옴
	transient String PhoneNumber;
	String email;
	
	public Student (String name, int id, String PhoneNumber, String email) {
		this.name=name;
		this.id=id;
		this.PhoneNumber=PhoneNumber;
		this.email=email;
	}

	@Override
	public String toString() {
		return "이름: "+name+", 아이디: "+id+", 전화번호: "+PhoneNumber+", E-amil: "+email;
	}
	
}

public class Lab1_Serialization {

	public static void main(String[] args) throws IOException {
		Student sa=new Student("홍길동",1,"010-1111-1111","aaa@aaa.com");
		Student sb=new Student("김유신",2,"010-2222-2222","bbb@bbb.com");
		Student sc=new Student("강감찬",3,"010-3333-3333","ccc@ccc.com");
		
		FileOutputStream fos = new FileOutputStream("D:\\Temp\\studnet.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(sa);
		oos.writeObject(sb);
		oos.writeObject(sc);
	}
}
