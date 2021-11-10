package stream_19.serialization;

import java.io.*;

class Animal implements Externalizable{
	String name;
	int age;
	
	public Animal() {}
	public Animal(String name, int age) {
		this.name=name;
		this.age=age;
	}
	@Override
	public String toString() {
		return "이름: "+name+", 나이: "+age;
	}
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeUTF(name);
		out.writeInt(age);
		
	}
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name = in.readUTF();
		age=in.readInt();
	}
	
}
public class LAb2_Externalizable {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Animal lion = new Animal("사자",10);
		Animal tiger = new Animal("호랑이",20);
		
		FileOutputStream fos = new FileOutputStream("D:\\Temp\\animal.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(lion);
		oos.writeObject(tiger);
		
		System.out.println("===Complete===\n");
		
		System.out.println("=====Call=====");
		FileInputStream fis = new FileInputStream("D:\\Temp\\animal.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Animal calllion =(Animal)ois.readObject();
		Animal calltiger = (Animal)ois.readObject();
		
		System.out.println(calllion);
		System.out.println(calltiger);
	}
}
