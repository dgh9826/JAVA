package Object06.singleton;

import java.security.Signature;

public class SingletonExample {

	public static void main(String[] args) {
		/*
		Singleton obj1 = new Singleton();
		Singleton obj2 = new Singleton();
		*/
		
		Singleton obj1 = Singleton.getInsctance();
		Singleton obj2 = Singleton.getInsctance();
		
		if(obj1==obj2) {
			System.out.println("같은 Singleton 객체입니다.");
		}else {
			System.out.println("다른 Singleton 객체입니다.");
		}
	}

}
