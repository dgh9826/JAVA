package Object06.coperation;

public class Subway{
	public String lineNum;			//호선번호
	public int passengerCount;		//승객수
	public int money;				//수입
	
	public Subway(String lineNum) {		//생성자. 초기값으로 호선을 등록
		this.lineNum=lineNum;
	}
	public void take(int money) {	//지하철의 수입 및 승객을 처리하는 메소드
		this.money+=money;
		passengerCount++;
	}
	public void showInfo() {
		System.out.println(lineNum+"의 승객은 "+passengerCount+"명이고, 수입은 "
				+money+ "원 입니다.");
	}
}
