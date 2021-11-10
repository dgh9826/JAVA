package interface_08.lab03_bookshelf;

public class BookShelfTest2 {
	
	public static void main(String[] args) {
		
		Queue shelfQueue =new BookShelf();
		
		for(int i = 1; i<=100;i++) {
			shelfQueue.enQueue("태백산맥 "+i);
		}
		System.out.println("책의 수량 : " + shelfQueue.getSize());
		System.out.println("=============");
		
		for(int i=1;i<=30;i++) {
			System.out.println(shelfQueue.deQueue());
		}
		System.out.println("책의 수량 : "+shelfQueue.getSize());
	}
}
