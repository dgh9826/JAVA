package inheritance_07.r;

import inheritance_07.q.A;

public class B extends A{
	void set() {
		pub = 1;	//public
		pro = 2;	//protected
//		def = 3;	//default
//		pri = 4;	//private
	}
	public void showInfo() {
		System.out.println("pub : "+pub);
		System.out.println("pro : "+pro);
//		System.out.println("def : "+def);
//		System.out.println("pri : "+pri);

	}
}
