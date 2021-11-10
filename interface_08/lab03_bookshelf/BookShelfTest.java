package interface_08.lab03_bookshelf;

public class BookShelfTest {
	
	public static void main(String[] args) {
		
		Queue shelfQueue = new BookShelf();
		
		shelfQueue.enQueue("태백산맥1");					//ArrayList에 책을 추가
		shelfQueue.enQueue("태백산맥2");
		shelfQueue.enQueue("태백산맥3");
		shelfQueue.enQueue("태백산맥4");
		shelfQueue.enQueue("태백산맥5");
		System.out.println("책장의 책의 수량 : "+shelfQueue.getSize());
		System.out.println("========================");
		
		System.out.println(shelfQueue.deQueue());		//ArrayList에 책을 뺌
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		
		System.out.println("책장의 책의 수량 : "+shelfQueue.getSize());
	}
}
