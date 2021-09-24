package inheritance_07.lab14p_314;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();
		
		for(int i=1;i<=5;i++) {
			int problemLocation = car.run();			//문제있는 위치는 car 클래스 run 메소드로 리턴받아 저장
			
			switch(problemLocation) {					//Car.run()메소드에서 리턴받은 값으로 switch문 선택
			case 1:
				System.out.println("앞왼쪽 HankookTire로 교체");
				car.forntLeftTire=new HankookTire("앞왼쪽",15);
				break;
			case 2:
				System.out.println("앞오른쪽 KumhoTire로 교체");
				car.forntRightTire=new KumhoTire("앞오른쪽",13);
				break;
			case 3:
				System.out.println("뒤왼쪽 HankookTire로 교체");
				car.backLeftTire=new HankookTire("뒤왼쪽",14);
				break;
			case 4:
				System.out.println("뒤오른쪽 KumhoTire로 교체");
				car.backRightTire=new HankookTire("뒤오른쪽",17);
				break;
			}
			System.out.println("----------------------");
		}
	}

}
