package stream_19.decorator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamTest {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("D:\\Temp\\data.txt");
		FileInputStream fis = new FileInputStream("D:\\TEmp\\data.txt");
		
		DataOutputStream dos = new DataOutputStream(fos);
		DataInputStream dis = new DataInputStream(fis);
			//다양한 형식의 자료형을 처리, 주의 : 아웃풋 자료형과 인풋 자료형이 동일해야됨.
			
			//오라클(MS-SQL,MY-SQL) - >HTML,CSS,JavaScript,JSP,Spring,리액트,파이썬...
			//ppt<==다음주 월요일까지 
		
		dos.writeByte(100);
		dos.writeChar('A');
		dos.write(10);
		dos.writeFloat(3.14F);
		dos.writeDouble(3.15159);
		dos.writeUTF("안녕하세요");
		System.out.println("출력완료 <=외부 파일에 저장");
		
		System.out.println(dis.readByte());
		System.out.println(dis.readChar());
		System.out.println(dis.read());
		System.out.println(dis.readFloat());
		System.out.println(dis.readDouble());
		System.out.println(dis.readUTF());
		
	}
}
