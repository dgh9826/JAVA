package inheritance_07.abstarct_template;

public class AICar extends Car{

	@Override
	public void drive() {
		System.out.println("자율 주행을 합니다.");
		System.out.println("차가 스스로 방햐을 전환 합니다.");
	}

	@Override
	public void stop() {
		System.out.println("차가 멈춥니다.");
	}
	

}
