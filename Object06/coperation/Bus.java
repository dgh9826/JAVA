package Object06.coperation;

public class Bus {
	int busNum;			//버스번호   /*
	int passengerCount; //승객수		필드
	int money;			//수입		*/
	
	public Bus(int busNum) {
		this.busNum=busNum;
	}
	public void take(int money) {	//버스의 수입 및 승객을 처리하는 메소드
		this.money += money;		//this.money = this.money +money
									//기존의 Bus수입에서 money를 추가해서 다시 메모리에 저장
		passengerCount++;			//승객수를 증가
		 
	}
	public void showInfo() {
		System.out.println("버스 "+busNum+"번 승객 수는 "+passengerCount+"명이고, 수입은 "
				+money+ "원 입니다.");
	}
}
