package collection.arraylist;

import java.util.ArrayList;

class MyStack{
	private ArrayList<String> arrayStack = new ArrayList<String>();
	//Stack 자료구조에 값을 할당 할때: push
	public void push(String data) {
		arrayStack.add(data);
	}
	//Stack 자료구조에 값을 제거 할때 : pop
	public String pop() {
		int len = arrayStack.size();
		if(len ==0) {
			System.out.println("저장된 값이 없습니다.");
			return null;
		}
		System.out.println(arrayStack.get(len-1));
		return arrayStack.remove(len-1);
	}
	public void showAll() {
		for(int i=0;i<arrayStack.size();i++) {
			System.out.println(arrayStack.get(i));
		}
	}
}
public class StackTest {					//자료구조:LIFO
	
	public static void main(String[] args) {
		MyStack stack = new MyStack();

		stack.push("A");
		stack.push("B");
		stack.push("C");
		stack.push("D");
		System.out.println("기존 데이터");
		stack.showAll();
		System.out.println("pop() 호출");
		stack.pop();
		System.out.println("남은 데이터");
		stack.showAll();
		System.out.println("pop() 호출");
		stack.pop();
		System.out.println("남은 데이터");
		stack.showAll();
	}
}
