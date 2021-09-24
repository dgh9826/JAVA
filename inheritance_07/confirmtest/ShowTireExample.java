package inheritance_07.confirmtest;
class Tire{
	public void run() {
		System.out.println("일반 타이어가 굴러갑니다.");
	}
}
class SnowTire extends Tire{
	@Override
	public void run() {
		System.out.println("스노우 타이어가 굴러갑니다.");
	}
}
public class ShowTireExample {

	public static void main(String[] args) {
		SnowTire st= new SnowTire();
		Tire t= new Tire();
		
		st.run();
		t.run();
	}

}
