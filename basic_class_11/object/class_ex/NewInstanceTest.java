package basic_class_11.object.class_ex;

public class NewInstanceTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Person person1 = new Person();
		System.out.println(person1);
		
		Class pclass = Class.forName("basic_class_11.object.class_ex.Person");
		Person person2 = (Person)pclass.newInstance();
							//newInstance() : *.class 파일로 객체 생성
		System.out.println(person2);
	}
}