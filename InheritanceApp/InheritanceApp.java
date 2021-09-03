class Cal{
	int v1,v2;
	Cal(int v1,int v2){
		System.out.println("Cal In!!!");
		this.v1 =v1; this.v2= v2;
	}
	public int sum() {return this.v1+v2;}
//	public int sum(int v1, int v2) {
//		return v1+v2;
//	}
//	// Overloading -> (과적하다) 기존method와 동일한 이름의 method를 형태만 다르게 사용
//	public int sum(int v1, int v2,int v3) {
//		return this.sum(v1,v2)+v3; //this. -> 자기자신의 class method
//	}
}
class Cal3 extends Cal{
	Cal3(int v1, int v2) { //생성자가 있는 클래스를 상속받았다면 자식클래스도 생성자 생성해서 부모클래스 호출
		super(v1, v2);
		System.out.println("Cal3 IN!!");
	}
	public int minus() {return this.v1-v2;}
	public int sum() {
		System.out.println("????");
		return super.sum();
	}
}
//	public int minus(int v1, int v2) {
//		return v1-v2;
//	}
//	// Overriding -> 부모class의 method를 가져와서 재정의한 것
//	public int sum(int v1, int v2) {
//		System.out.println("Cal3!!");
//		return super.sum(v1, v2); // super. 부모class의 method
//		
//	}
public class InheritanceApp {

	public static void main(String[] args) {
//		Cal c =new Cal();
//		System.out.println(c.sum(2, 1));
//		System.out.println(c.sum(2, 1, 1));
//		Cal3 c3 = new Cal3();
//		System.out.println(c3.sum(2, 1));
//		System.out.println(c3.minus(2, 1));
		
		Cal c = new Cal(2,1);
		Cal3 c3 = new Cal3(2,1);
		System.out.println(c3.sum());
		System.out.println(c3.minus());		
//		System.out.println(c.sum(2,1));
//		System.out.println(c.sum(2,1,1));
//		System.out.println(c3.sum(2,1));
//		System.out.println(c3.minus(2,1));
//		System.out.println(c3.sum(2,1));
	}
}

