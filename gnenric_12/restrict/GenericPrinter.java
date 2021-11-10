package gnenric_12.restrict;

public class GenericPrinter<T extends Material> {	// Material을 상속한 클래스만 접근 가능
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
	public void Printing() {
		material.doPrinting();
	}

}
