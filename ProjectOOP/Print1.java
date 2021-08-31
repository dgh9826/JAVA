
class Print1{
	public String a="";
	public Print1(String a){//생성자 
		this.a=a;//클래스 안에 instance(여기서는 public String a)를 가리킨다
	}
	public void A() {
		System.out.println(this.a);
		System.out.println("A");
		System.out.println("A");
	}
	public void B() {
		System.out.println(this.a);
		System.out.println("B");
		System.out.println("B");
	}
}