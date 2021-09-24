package inheritance_07.lab14p_314;

public class Car {
	Tire forntLeftTire = new Tire("앞왼쪽",6);		//타이어 위치 별로 생성자 호출
	Tire forntRightTire = new Tire("앞오른쪽",2);
	Tire backLeftTire = new Tire("뒤왼쪽",3);
	Tire backRightTire = new Tire("뒤오른쪽",4);
	
	int run() {										//자동차 run 메소드
		System.out.println("[자동차가 달립니다.]");
		if(forntLeftTire.roll()==false) {			//타이어가 펑크나면(maxRotation = accumulatedRoration) false
			stop();
			return 1;								//return 1
		}
		if(forntRightTire.roll()==false) {
			stop();
			return 2;
		}
		if(backLeftTire.roll()==false) {
			stop();
			return 3;
		}
		if(backRightTire.roll()==false) {
			stop();
			return 4;
		}
		return 0;
	}
	
	void stop() {
		System.out.println("[자동차가 멈춥니다.]");
	}
}
