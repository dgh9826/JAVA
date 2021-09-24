package inheritance_07.lab12_method_overriding;
class Weapon{
	protected int fire() {
		return 1;			//무기의 레벨 , 기본적으로 무기는 한명만 살상가능
	}
}
class Cannon extends Weapon{
	@Override
	protected int fire() {
		return 10;
	}
	protected void info() {
		System.out.println("대포는 살상능력이 큽니다.");
	}
}

public class Overriding {

	public static void main(String[] args) {
		Weapon weapon = new Weapon();
		System.out.println("기본 살상 능력은"+weapon.fire());
		
		weapon=new Cannon();	//업캐스팅
		System.out.println("대포 살상 능력은"+weapon.fire());
		Cannon c = (Cannon)weapon;		//다운캐스팅
		c.info();
		System.out.println(weapon.fire());
	
	}

}
