package inheritance_07.lab10_polymorphism;
class AnimalTest3{
	public static void moveAnimal(Animal animal) {
		animal.move();
	}
}
public class AnimalTest2 {	//Stack 영역에 메소드 저장(static)
	public static void moveAnimal(Animal animal) {		//업캐스팅
		animal.move();
	}
	public static void main(String[] args) {
		moveAnimal(new Human());
		moveAnimal(new Tiger());
		moveAnimal(new Eagle());
		
		Human human = new Human();
		Tiger tiger = new Tiger();
		Eagle eagle = new Eagle();
		AnimalTest3.moveAnimal(human);
		AnimalTest3.moveAnimal(tiger);
		AnimalTest3.moveAnimal(eagle);
		
	}
}
