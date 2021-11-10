package gnenric_12;

public class GenericPrinter<T> {	//다양한 재료를 사용하는 프린터(지능적인 프린터)
									//다양한 객체 데이터타입을 받아서 처리,
	
	private T material;				//객체 변ㅅ
	
	public void setMaterial(T material) {		//setter
		this.material = material;
	}
	public T getMaterial() {					//getter v
		return material;
	}
	public String toString() {
		return material.toString();
	}
	public void printing() {
//		material.doPrint();
	}
}
