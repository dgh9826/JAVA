package interface_08.lab03_bookshelf;

public interface Queue {			//책장
	
	void enQueue(String title);		//책장에 책이 저장됨.
	String deQueue();				//책장의 책을 빼냄.
	int getSize();					//책장에 책의 갯수
}