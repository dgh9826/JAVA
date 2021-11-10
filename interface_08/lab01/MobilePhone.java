package interface_08.lab01;

public interface MobilePhone extends PhoneInterface{
							//인터페이스가 인터페이스를 상속 받을 때
	
//	void sendCall();		//PhoneInterface 상속되어서 내려옴
//	void receiveCall();		//상속
	void sendSMS();			//추상메소드
	void receiveSMS();		//추상메소드

}
