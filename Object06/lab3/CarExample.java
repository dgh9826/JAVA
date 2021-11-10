package Object06.lab3;

public class CarExample {

	public static void main(String[] args) {
		Car myCar=new Car();	//instance 생성
		myCar.keyTurnOn();		//객체의 keyTurnOn method 호출 
		myCar.run();			//객체의 run method 호출
		int speed = myCar.getSpeed(); // 객체의 현재 스피드 return받아 저장
		System.out.println("현재 속도: "+speed+"km/h");
	}

}



 