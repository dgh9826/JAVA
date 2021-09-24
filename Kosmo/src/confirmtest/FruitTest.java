package inheritance_07.confirmtest;

import java.util.ArrayList;

public class FruitTest {

	public static void main(String[] args) {
		ArrayList<Fruit> fruit = new ArrayList<Fruit>();
		Apple apple = new Apple("사과","빨강",5);
		Orange orange =	new Orange("오렌지","주황",10);
		Banana banana =	new Banana("바나나","노랑",3);
		
		fruit.add(apple);
		fruit.add(orange);
		fruit.add(banana);
		
		for(Fruit list : fruit) {
			list.showFruitInfo();
		}
		apple.app();
		orange.org();
		banana.ba();
		
		for(int i=0; i< fruit.size();i++) {
			Fruit f = fruit.get(i);
			if(f instanceof Apple) {
				Apple a = (Apple)f;
				a.app();
			}
			if(f instanceof Orange) {
				Orange o = (Orange)f;
				o.org();
			}
			if(f instanceof Apple) {
				Banana b = (Banana)f;
				b.ba();
			}
		}
	}

}
