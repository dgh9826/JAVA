package inheritance_07.lab4;

public class CustomerTest2 {		//매개변수가 3개인 VIPCustomer 생성자 호출

	public static void main(String[] args) {
		VIPCustomer customerkim=new VIPCustomer("10020","김유신","12345");
		//customerkim.setCustomerName("황희영");
		customerkim.bonusPoint=10000;
		customerkim.showCustomerInfo();
	}

}
