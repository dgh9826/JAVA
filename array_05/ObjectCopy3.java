package array_05;

public class ObjectCopy3 {

	public static void main(String[] args) { // 배열의 깊은 복사
		Book[] bookArray1 = new Book[3]; // 객체의 배열방 3개 생성
		Book[] bookArray2 = new Book[3];

		// stack 영역     //heap영역
		bookArray1[0] = new Book("태백산맥", "조정래");
		bookArray1[1] = new Book("어린왕자", "생택쥐페리");
		bookArray1[2] = new Book("어떻게 살 것인가", "유시민");

		for (int i = 0; i < 3; i++) {
			bookArray2[i] = new Book();		//기본 생성자로 객체 생성
		}
//		bookArray2[0]=new Book();
//		bookArray2[1]=new Book();
//		bookArray2[2]=new Book();
		for (int i = 0; i < bookArray1.length; i++) { // 각각의 요소를 직접 복사
			bookArray2[i].setBookName(bookArray1[i].getBookName());
			bookArray2[i].setAuther(bookArray1[i].getAuther());
		}
		for (int i = 0; i < bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}

		bookArray1[0].setBookName("나목");
		bookArray1[0].setAuther("박완서");

		System.out.println("=====bookArray1======");
		for (int i = 0; i < bookArray1.length; i++) {
			bookArray1[i].showBookInfo();
		}
		System.out.println("=====bookArray2======"); // bookArray2 출력
		for (int i = 0; i < bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}

	}

}
