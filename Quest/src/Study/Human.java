package Study;

public class Human {
	String name;
	int hp=100;
	
	public Human(String name) {
		this.name=name;
	}
	public void attack(Slime s) {
		System.out.println(name+"은 "+s.name+"를 공격했습니다.");
		s.hp=s.hp-30;
		if(s.hp <1) {
			System.out.println(s.name+"를 처치했습니다.\n");
		}else {
		System.out.println("현재 "+s.name+"의 체력은 "+s.hp+"입니다.\n");
		}
	}
}
