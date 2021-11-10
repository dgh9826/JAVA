package inheritance_07.lab8;

public class SupersonicAirpalneExample {

	public static void main(String[] args) {
		SupersonicAirplane sa = new SupersonicAirplane();

		sa.takeOff();
		sa.fly();										//오버라이딩된 메소드 호출
		sa.flyMode=SupersonicAirplane.SUPERSONIC;		//static선언 되어있음으로 클래스이름으로 호출
		sa.fly();										//오버라이딩된 메소드 호출
		sa.flyMode=SupersonicAirplane.NORMAL;
		sa.fly();										//오버라이딩된 메소드 호출
		sa.land();
	}
}
