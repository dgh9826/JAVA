package inheritance_07.lab14p_314;

public class Tire {
	public int maxRotation;							//최대 회전수
	public int accumulatedRotation;					//누적된 회전수
	public String location;							//타이어 위치
	
	public Tire(String location, int maxRotation) {	//타이어 생성자(타이어위치, 최대 회전수)
		this.location=location;
		this.maxRotation=maxRotation;
	}
	
	public boolean roll() {							//회전
		++accumulatedRotation;						//누적회전수 1회 추가
		if(accumulatedRotation<maxRotation) {		//누적된 회전수가 최대 회전수보다 작으면 true값 리턴
			System.out.println(location+" Tire 수명: "+(maxRotation-accumulatedRotation)+"회");
			return true;
		}else {
			System.out.println("***"+location+"Tire 펑크 ***");
			return false;
		}
	}
}
class HankookTire extends Tire{
	public HankookTire(String location,int maxRotation) {
		super(location,maxRotation);
	}
	@Override
	public boolean roll() {							//한국타이어로 변경된 후 타이어 회전
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location+" HankookTire 수명: "+(maxRotation-accumulatedRotation)+"회");
			return true;
		}else {
			System.out.println("***"+location+"HankookTire 펑크 ***");
			return false;
		}
	}
}
class KumhoTire extends Tire{
	public KumhoTire(String location,int maxRotation) {
		super(location,maxRotation);
	}
	@Override
	public boolean roll() {							//금호 타이어로 변경된 후 타이어 회전
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location+" KumhoTire 수명: "+(maxRotation-accumulatedRotation)+"회");
			return true;
		}else {
			System.out.println("***"+location+"KumhoTire 펑크 ***");
			return false;
		}
	}
}