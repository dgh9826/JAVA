package inheritance_07.lab11_instanceof;
class Animal{}
class Human extends Animal{}
class Tiger extends Animal{}
class Eagle extends Animal{}
class Lion extends Animal{}
class HumanChild extends Human{}
class HumanChildSon extends HumanChild{}

public class InstanceOfEx2 {
	static void print(Animal ani) {
		if(ani instanceof Animal) {
			System.out.println("Animal");
		}
		if(ani instanceof Human) {
			System.out.println("Human");
		}
		if(ani instanceof Tiger) {
			System.out.println("Tiger");
		}
		if(ani instanceof Lion) {
			System.out.println("Lion");
		}
		if(ani instanceof Eagle) {
			System.out.println("Eagle");
		}
		if(ani instanceof HumanChild) {
			System.out.println("HumanChild");
		}
		if(ani instanceof HumanChildSon) {
			System.out.println("HumanChildSon");
		}
	}
	public static void main(String[] args) {
		System.out.print("new Animal() -> \t"); print(new Animal());
		System.out.print("new Human() -> \t");	print(new Human());
		System.out.print("new Tiger() -> \t");	print(new Tiger());
		System.out.print("new Lion() -> \t");	print(new Lion());
		System.out.print("new Eagle() -> \t");	print(new Eagle());
		System.out.print("new HumanChild() -> \t");	print(new HumanChild());
		System.out.print("new HumanChildSon() -> \t");	print(new HumanChildSon());
		
	}

}
