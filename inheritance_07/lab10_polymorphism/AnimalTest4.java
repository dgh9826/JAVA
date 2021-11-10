package inheritance_07.lab10_polymorphism;

import java.util.ArrayList;


public class AnimalTest4 {	//Stack 영역에 메소드 저장(static)
	ArrayList<Animal> aniList = new ArrayList<Animal>();
	public void addAnimal() {		//업캐스팅 ArrayList에 객체를 추가하는 메소드
		
		aniList.add(new Human());	//객체가 ArrayList에 저장이 될때 캐스팅이 된다. <Animal 타입으로>
		aniList.add(new Tiger());
		aniList.add(new Eagle());
		
		for(Animal ani : aniList) {
			ani.move();
		}
	}
	public void testCating() {	//다운 캐스팅
		for(int i=0;i<aniList.size();i++) {	//배열에서는 .length()  ArrayList에서는 .size()
			Animal ani = aniList.get(i);
			if(ani instanceof Human) {
				Human h = (Human)ani;
				h.readBook();
			}else if(ani instanceof Tiger) {
				Tiger t = (Tiger)ani;
				t.hunting();
			}else if(ani instanceof Eagle) {
				Eagle e = (Eagle)ani;
				e.flying();
			}else {
				System.out.println("지원되지 않는 타입입니다.");
			}
		}
	}
	public static void main(String[] args) {
		AnimalTest4 aTest = new AnimalTest4();
		aTest.addAnimal();
		System.out.println("===========================");
		System.out.println("<원래타입으로 다운캐스팅 정보 출력>");
		System.out.println("===========================");
		aTest.testCating();
	}
}
