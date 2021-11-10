package stream_19.serialization;

import java.io.*;


//직렬화(Serializable) : 객체(인스턴스)를 파일에 저장
//1.Serializable : 간단한 컨트롤로 직렬화
//2.Externalizable : 세부적인 컨트롤이 가능한 직렬화 => 메소드가 제공됨.
//ObjectOutputStream : 객체를 파일에 저장 (직렬화)보조 스트림
//직렬화는 Serializable 인터페이스를 구현한 객체만이 직렬화를 할 수 있다.
// 직렬화의 serailVersionUID가 생성되어있어야 한다. <= 고유번호
//Serializble marker Interface(구현코드가 없는 인터페이스)

class Person implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	String name;
	transient String job; 	//transient: 직렬화에서 직렬화되지 않음. 해당 변수는 저장 되지 않음.
	
	public Person() {}
	public Person(String name,String job) {
		this.name=name;
		this.job=job;
	}
	
	@Override
	public String toString() {
		return name+", "+job;
	}
	
	
}
public class SerializationTest {

	public static void main(String[] args) throws IOException {
		Person pa = new Person("안재용","대표이사");
		Person pk = new Person("김철수","상무이사");
		
		FileOutputStream fos = new FileOutputStream("D:\\Temp\\serial.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(pa);
		oos.writeObject(pk);
		
	}
}
