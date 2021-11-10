package Object06.coperation;

public class Student{
	public String studentName;				//학생이름
	public int grade;						//학년
	public int money;						//현재 가진 돈
	
	public Student() {}						//기본 생성자 (input값이 없고,실행부가 없는 생성자)
											//메모리를 초기화(생략 가능)  => studentName=null/grade=null/money=null
											//다른 생성자가 있을때 외부에서 호출 시 반드시 기본생성자 명시
	public Student (String studentName, int money) {		//학생이름과 가진돈을 초기화
		this.studentName=studentName;
		this.money=money;
	}
	public void takeBus(Bus bus) {								//버스를 탑승  Bus 객체가 input값으로 들어옴
		bus.take(1000);			//버스의 수입이 증가
		this.money-=1000;		//버스에 돈을 지불
	
	}
	public void takeSubway(Subway subway) {						//지하철 탑승 Subway 객체가 input값으로 들어옴
		subway.take(1500);		//지하철의 수입이 증가
		this.money-= 1500;	//this.money = this.monenny - money
	}
	public void showInfo() {
		System.out.println(studentName + "님의 남은 돈은" + money + "입니다.");
	}
	
}
