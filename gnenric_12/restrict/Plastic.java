package gnenric_12.restrict;

public class Plastic extends Material{
	
	@Override
	public void doPrinting() {
		System.out.println("플라스틱 재료로 출력합니다.");
	}

	@Override
	public String toString() {
		return "재료는 Plastic 입니다.";
	}
	
}
