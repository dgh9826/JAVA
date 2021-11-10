package basic_class_11.object;

import java.util.Objects;


public class HashCodeExample {

	public static void main(String[] args) {
		Student s1 = new Student(1, "홍길동");
		Student s2 = new Student(1, "홍길");
		System.out.println(s1.hashcode());
		System.out.println(Objects.hashCode(s2));
	}
	static class Student{
		int sno;
		String name;
		Student(int sno,String name){
			this.sno=sno;
			this.name=name;
		}
		public int hashcode() {
			return Objects.hash(sno,name);
		}
	}
}
