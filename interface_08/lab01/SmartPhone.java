package interface_08.lab01;

public class SmartPhone extends PDA implements MobilePhone,MP3Interface {
			//SmartPhone 클래스는 PDA클래스를 상속받고 있고, MobliePhone,MP3Interface를 구현하고있다.
			//다중상속은 불가하나, 인터페이스는 다중 상속 가능
	@Override
	public void sendCall() {				//PhoneInterface에서 선언한 메소드
		System.out.println("따르르릉");
	}

	@Override
	public void receiveCall() {				//PhoneInterface
		System.out.println("전화가 왔습니다.");
	}

	@Override
	public void play() {					//MP3Interface
		System.out.println("음악을 재생합니다.");
	}

	@Override
	public void stop() {					//MP3Interface
		System.out.println("음악을 중지합니다.");
	}

	@Override
	public void sendSMS() {					//MobliePhone
		System.out.println("문자를 전송합니다.");
	}

	@Override
	public void receiveSMS() {				//MobliePhone
		System.out.println("문자를 수신합니다.");
	}
	public void schedule() {				//추가 작성한 메소드
		System.out.println("일정 관리를 합니다.");
	}
}
