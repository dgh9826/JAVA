package Object06.singleton;

public class Company {	//싱글톤 : 클래스에서 단 하나의 객체만 생성하도록 구현한 디자인패턴
	
	private static Company instance = new Company();
			//객체 생성을 Heap 영역이 아니라 stack 영역에 저장함.
			//싱글톤 객체는 private static 으로 클래스 내부에서 선언,생성
	
	private Company() {} 		//기본 생성자를 private로 선언한다.
								//외부 클래스에서 생성자를 호출하지 못하도록 설정
	
	public static Company getInstance() {	//외부에서 객체를 생서할때, 생성자로 호출을 하는게 아니고 getInstance method로 호출
		if (instance == null) {				//객체가 생성되도록(return)설정
			instance = new Company();		//method는 static으로 키가 설정되어있어야 외부에서 객체생성없이 클래스이름을 호출
		}
		return instance;
	}
}
