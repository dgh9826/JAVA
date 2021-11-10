package gnenric_12.restrict;

public class Powder extends Material{	//재료

	@Override
	public void doPrinting() {
		System.out.println("파우더 재료를 출력 합니다.");
	}

	@Override
	public String toString() {
		return "재료는 Powder 입니다.";
	}
	
}
