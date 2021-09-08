package Object06.singleton;

public class Singleton {
	private static Singleton singleton=new Singleton();
	
	private Singleton() {}
	
	static Singleton getInsctance() {
		if(singleton==null) {
			singleton = new Singleton();
		}
		return singleton;
	}
}
