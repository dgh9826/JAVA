package Object06.hide.package1_3;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();				//instance 호출
		
		myCar.setSpeed(-50);				//-값 input
		
		System.out.println("현재 속도 : "+myCar.getSpeed()); //Car class 의 setSpeed method의 if문에 의해 0 return
		
		myCar.setSpeed(60); //속도 input
		
		System.out.println("현재 속도 : "+myCar.getSpeed());
		
		if(!myCar.isStop()) {		//getter(isStop)의 값이 false이면 setter(setStop)을 true로 호출
			myCar.setStop(true);	// setter가 true가 되어 speed 필드 0으로 변경
		}
		System.out.println("현재 속도 : "+myCar.getSpeed());
		
		
	}

}
