package stream_19.serialization;

import java.io.Externalizable;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

//Externalizble : 세부적인 컨트롤을 하면서 직렬화 가능
class Dog implements Externalizable{
	String name;
	int age;
	public Dog() {}
	public Dog(String name,int age) {
		this.name=name;
		this.age=age;
	}
	@Override
	public String toString() {
		return "이름: "+name+", 나이: "+age;
	}
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeUTF(name);		//출력 시 호출되는 메소드 (아웃풋 스트림)
		out.writeInt(age);
	}
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name = in.readUTF();		//입력시 호출되는 메소드(인풋 스트림)
		age = in.readInt();
	}
	
}
public class ExternalizableTest {

	public static void main(String[] args) throws IOException {
		Dog dog1 = new Dog("밀리",3);
		Dog dog2 = new Dog("필리",5);
		
		FileOutputStream fos = new FileOutputStream("D:\\Temp\\dog.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(dog1);
		oos.writeObject(dog2);
		
		System.out.println("===직렬화 성공===");
	}
}
