package array_05;

public class BookArray {

	public static void main(String[] args) {
		Book[] library =new Book[5];		//Book이라는 객체를 저장하는 index=5  library 배열 생성
		
		for(int i=0;i<library.length;i++) {
			System.out.println(library[i]);
		}
	}

}
