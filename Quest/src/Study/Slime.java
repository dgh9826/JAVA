package Study;

import javax.swing.JOptionPane;

public class Slime {

	String name;
	int hp=80;
	
	public Slime(String name) {
		this.name=name;
	}
	public void attack(Human h) {
		if(hp>0) {
			System.out.println(name+"는 "+h.name+"을 공격했습니다.");
			h.hp = h.hp-10;
			if(h.hp<1) {
				JOptionPane.showMessageDialog(null, "Game Over");
				System.exit(0);
			}
			System.out.println("현재 "+h.name+"의 체력은 "+h.hp+"입니다.\n");
		}
	}

}
