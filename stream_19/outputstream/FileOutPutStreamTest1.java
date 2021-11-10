package stream_19.outputstream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutPutStreamTest1 {

	public static void main(String[] args) throws IOException {
		
		File file = new File("D:\\Temp\\output.txt");
		file.createNewFile();
		
		try(FileOutputStream fos = new FileOutputStream("D:\\Temp\\output.txt")) {
			
			fos.write(65);
			fos.write(66);
			fos.write(67);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("출력이 완료 되었습니다.");
	}

}
