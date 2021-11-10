package gnenric_12.restrict;

public class Water{
	
	public void doPrinting() {
		System.out.println("물로 프린트합니다.");
	}

	@Override
	public String toString() {
		return "재료는 물입니다.";
	}
	
}
