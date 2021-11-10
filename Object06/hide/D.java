package Object06.hide;

import Object06.hide.p.*;

public class D extends B{
	public void d() {
		B b= new B();			// 생성자가 public 일때
		this.k =4;
		this.k();
	
//	public D() {
//		super();				//생성자가 protected 일때
//		this.field = "vlaue";
//		this.method();
	}
}
