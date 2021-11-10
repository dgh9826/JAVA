package collection.arraylist;

import java.util.ArrayList;

class MyQueue{
	private ArrayList<String> arrayQueue = new ArrayList<String>();
	//큐에 값을 넣을떄 : enQueue
	public void enQueue(String data) {
		arrayQueue.add(data);
	}
	//큐에 값을 제거할때 : deQueue
	public String deQueue() {
		int len = arrayQueue.size();
		if(len == 0) {
			System.out.println("저장된 값이 없습니다.");
			return null;
		}
		System.out.println(arrayQueue.get(0));
		return arrayQueue.remove(0);
	}
	public void showAll() {
		for(int i=0;i<arrayQueue.size();i++) {
			System.out.println(arrayQueue.get(i));
		}
	}
}
public class QueueTest {						//FIFO : First-In-First-Out

	public static void main(String[] args) {
		MyQueue mq = new MyQueue();
		mq.enQueue("A");
		mq.enQueue("B");
		mq.enQueue("C");
		mq.enQueue("D");
		mq.enQueue("E");
		System.out.println("기존 데이터");
		mq.showAll();
		System.out.print("deQueue 호출 >> ");
		mq.deQueue();
		System.out.println("남은 데이터");
		mq.showAll();
	}
}
