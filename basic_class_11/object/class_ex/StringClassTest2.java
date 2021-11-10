package basic_class_11.object.class_ex;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class StringClassTest2 {

	public static void main(String[] args) throws ClassNotFoundException {
		Class strClass = Class.forName("basic_class_11.object.class_ex.Person");
		
		Constructor[] cons =strClass.getConstructors();
		for(Constructor c : cons) {
			System.out.println(c);
		}
		System.out.println("c");
		Field[] fields = strClass.getFields();
		for(Field f : fields) {
			System.out.println(f);
		}
		System.out.println("f");
		Method[] methods = strClass.getMethods();
		for(Method m : methods) {
			System.out.println(m);
		}
		System.out.println("m");
	}
}
