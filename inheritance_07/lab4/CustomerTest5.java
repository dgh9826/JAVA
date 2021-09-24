package inheritance_07.lab4;

public class CustomerTest5 {		//업캐스팅

	public static void main(String[] args) {
		int price=10000;
		
		Customer customerLee=new Customer("10010","이순신");
		System.out.println(customerLee.getCustomerName()+"님이 지불해야할 금액은 "+customerLee.calPrice(price)+"원입니다. "
				+"포인트는 "+customerLee.bonusPoint);
		
		VIPCustomer customerKim=new VIPCustomer("10020","김유신","12345");
		System.out.println(customerKim.getCustomerName()+"님이 지불해야할 금액은 "+customerKim.calPrice(price)+"원입니다. "
				+"포인트는 "+customerKim.bonusPoint);

		//업캐스팅: 자식객체를 생성해서 부모객체의 타입으로 형식을 변환 <= 부모객체의 필드나 메소드만 사용
		//		  단, 메소드 오버라이딩되어있으면 동적바인딩에 의해서 자식객체의 메소드 호출
		Customer vc=new VIPCustomer("10030","홍길동","23456");	//업캐스팅
		System.out.println(vc.getCustomerName()+"님이 지불해야할 금액은 "+vc.calPrice(10000)+"원입니다. "
				+"포인트는 "+vc.bonusPoint);
		
	}

}
