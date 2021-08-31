public class MyOOP {
	
	public static void main(String[] args) {
		//........	
		Print1 p1= new Print1("====");
		p1.A();
		p1.A();
		p1.B();
		p1.B();
		
		Print1 p2 = new Print1("****");
		p2.A();
		p2.A();
		p2.B();
		p2.B();

		p1.A();
		p2.A();
		p1.B();
		p2.B();
	}
}
