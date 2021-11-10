package basic_class_11.object.garbage_collector;

class Employee{
	public int eno;
	public Employee(int eno) {
		this.eno=eno;
		System.out.println("Employee ( "+eno+" ) 가 메모리에 생성됨.");
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Employee ( "+eno+" ) 가 메모리에서 제거됨.");
	}
	
}

public class GcExample {

	public static void main(String[] args) {
		Employee emp = new Employee(1);
		emp = null; // 가비지 발생
		emp = new Employee(2);
		emp = new Employee(3);
		
		System.out.println("emp가 최종적으로 참조하는 사원번호: ");
		System.out.println(emp.eno);
		System.gc();
	}

}
