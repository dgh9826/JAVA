package inheritance_07.abstract_ex;

public class ComputerTest {

	public static void main(String[] args) {
		Desttop c2 = new Desttop();
		MyNoteBook c4 = new MyNoteBook();
		
		System.out.println("========myNoteBook객체정보=======");
		c2.display();
		c2.typing();
		c2.turnOn();
		c2.turnOff();

		System.out.println("========myNoteBook객체정보=======");
		c4.display();
		c4.typing();
		c4.turnOn();
		c4.turnOff();
	}

}
