package basic_class_11.object;

public class Book {
	int bookNumber;
	String bookTitle;
	
	Book(){}		//기본 생성자, bookNumber <= 0, bookTitle <= null
	
	Book(int bookNumber, String bookTitle){
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;}
	
	public static void main(String[] args) {
		Book book1 = new Book(200,"제목");
		
		Object o = book1;
		
		System.out.println(book1);//객체 자체를 출력할 경우 : Object class toString();
		System.out.println(book1.toString());
		//class.toString() 객체의 주소를 출력
		//객체의 전체이름[패키지이름.클래스이름]@해쉬코드[주소]
	}
}
