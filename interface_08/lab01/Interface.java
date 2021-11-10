package interface_08.lab01;

public class Interface {
	public static void main(String[] args) {
		SamsungPhone galaxy = new SamsungPhone();
		galaxy.printLogo();
		galaxy.sendCall();
		galaxy.receiveCall();
		galaxy.flash();					//SamsumgPhone에만 존재하는 메소드
		
		System.out.println("========================");
		//인터페이스는 객체를 생성할 수 없다.
		//PhoneInterface phone = new PhoneInterface();
		PhoneInterface phone = new SamsungPhone();	//업캐스팅은 가능
		phone.printLogo();
		phone.sendCall();
		phone.receiveCall();
		//PhoneInterface에 존재하는 기능만 사용가능
		//phone.flash();
		SamsungPhone ss = (SamsungPhone)phone;
		ss.flash();
	}
}
