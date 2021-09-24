package inheritance_07.lab4;

public class CustomerTest3 {		//method Overriding

	public static void main(String[] args) {
		Customer customerLee=new Customer("10010","이순신");
		customerLee.bonusPoint=1000;
		
		VIPCustomer customerkim=new VIPCustomer("10020","김유신","12345");
		customerkim.bonusPoint=10000;
		
		System.out.println(customerLee.getCustomerName()+"님이 지불해야할 금액은 "+customerLee.calPrice(10000)+"원입니다. "
				+"포인트는 "+customerLee.bonusPoint);

		System.out.println(customerkim.getCustomerName()+"님이 지불해야할 금액은 "+customerkim.calPrice(10000)+"원입니다. "
				+"포인트는 "+customerkim.bonusPoint);							//method Overriding
												//동적 바인딩:상속 관계에서 부모클래스와 자식클래스에서 동일한 메소드가 존재할 경우
												//			자식 클래스의 메소드로 바인딩이 된다.
	}

}
