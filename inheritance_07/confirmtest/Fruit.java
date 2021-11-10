package inheritance_07.confirmtest;

import java.util.ArrayList;

class Apple extends Fruit{
	public Apple(String name,String color,int size) {
		super(name,color,size);
	}
	@Override
	public void showFruitInfo() {
		super.showFruitInfo();
	}
	public void app() {
		System.out.println("청주 사과입니다.");
	}
}
class Orange extends Fruit{
	public Orange(String name,String color,int size) {
		super(name,color,size);
	}
	@Override
	public void showFruitInfo() {
		super.showFruitInfo();
	}
	public void org() {
		System.out.println("델몬트 오렌지입니다.");
	}
}
class Banana extends Fruit{
	public Banana(String name,String color,int size) {
		super(name,color,size);
	}
	@Override
	public void showFruitInfo() {
		super.showFruitInfo();
	}
	public void ba() {
		System.out.println("필리핀산 바나나 입니다.");
	}
}
public class Fruit {
	String name;
	String color;
	int size;

	public Fruit(String name, String color, int size) {
		this.name=name; this.color=color;this.size=size;
	}
	public void showFruitInfo() {
		System.out.println("이과일은 "+name+"이고, 색은 "+color+"색이고, 크기는 "+size+"입니다.");
	}
	

	public static void main(String[] args) {
		ArrayList<Fruit> fruit = new ArrayList<Fruit>();
		
		fruit.add(new Apple("사과","빨강",5));
		fruit.add(new Orange("오렌지","주황",8));
		fruit.add(new Banana("바나나","노랑",3));
		
		for(Fruit list : fruit) {
			list.showFruitInfo();
		}
	}
}

