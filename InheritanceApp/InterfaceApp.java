interface Calculable{
	double pi=3.14;
	int sum(int v1, int v2); // 인터페이스에 어떤 형식의 변수가 들어가면 내용이 들어감
}
interface Printable{
	void print(); // 인터페이스에 메소드가 정의될땐 내용이 들어가지 않음
}
class RealCal implements Calculable, Printable{ //하나의 클래스엔 여러개의 인터페이스를 지정할 수 있다

	public int sum(int v1, int v2) {
		return v1+v2;
	}

	public void print() {
		System.out.println("This is RealCal!");
	}
	
}
class DummyCal implements Calculable{
	public int sum(int v1, int v2) {
		return 3;
	}
}
public class InterfaceApp {

	public static void main(String[] args) {
		//더하기 기능이 있는 클래스를 만들어주세요.
		RealCal c = new RealCal();
		//Printalbe c = new RealCal();  => Printable 의 기능만 사용하는 RealCal 메소드 =다형성
		//Calculable c =new RealCal();  => Calculable 의 기능만 사용 하는 RealCal =다형성
		System.out.println(c.sum(2,1));
		c.print();
		System.out.println(c.pi);
	}

}
