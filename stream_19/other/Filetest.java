package stream_19.other;

import java.io.File;
import java.io.IOException;

public class Filetest {

	public static void main(String[] args) throws IOException {
		File file = new File("D:\\YDH\\workspace\\java\\newFile.txt");
		file.createNewFile();	// 지정된 경로에 파일을 생성
		
		System.out.println(file.isFile()); 		//파일이 지징된 경로에 존재 하면 true, 아니면 false
		System.out.println(file.isDirectory());	//폴더 = true/ 파일 =false
		System.out.println(file.getName());
		System.out.println(file.getAbsolutePath());
		
		System.out.println(file.getPath());
		System.out.println(file.canRead());
		
		file.delete();
		System.out.println(file.isFile());
	}
}
