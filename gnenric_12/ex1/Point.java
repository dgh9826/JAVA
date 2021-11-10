package gnenric_12.ex1;

public class Point<T,V> {	//제너릭클래스, 두점의 좌표를 입력받아서, 좌표와 넓이를 구함

	T x;
	V y;
	
	Point (T x, V y){
		this.x=x;
		this.y=y;
	}
	public T getX() {
		return x;
	}
	public V getY() {
		return y;
	}
}
	
