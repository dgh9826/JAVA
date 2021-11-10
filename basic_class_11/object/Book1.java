package basic_class_11.object;

public class Book1 {
	int bookNumber;
	String bookTitle;
	
	Book1(){}		//기본 생성자, bookNumber <= 0, bookTitle <= null
	
	Book1(int bookNumber, String bookTitle){
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}
	
	@Override
	public String toString() {
		return bookNumber +","+ bookTitle ;
		
	}
	
	public static void main(String[] args) {
		Book1 book = new Book1(200,"개미");
		
		System.out.println(book);
		System.out.println(book.toString());
	}
}
