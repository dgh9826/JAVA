package inheritance_07.lab4.arraylist;

import java.util.ArrayList;

public class CustomerTest {
	public static void main(String[] args) {
		ArrayList<Customer> customer = new ArrayList<Customer>();

		Customer customerLee = new Customer("10010", "이순신");
		Customer customerShin = new Customer("10020", "신사임당");
		Customer customerHong = new GoldCustomer("10030", "홍길동");
		Customer customerYul = new GoldCustomer("10040", "이율곡");
		Customer customerKim = new VIPCustomer("10050", "김유신", "Frank");

		customer.add(customerLee);
		customer.add(customerShin);
		customer.add(customerYul);
		customer.add(customerHong);
		customer.add(customerKim);
		customer.add(new VIPCustomer("10060", "이방원", "shule"));

		System.out.println("=====고객정보 출력=====");
		for (Customer list : customer) {
			list.showCustomerInfo();
		}
		System.out.println("=====보너스 포인트와 할인율 계산=====");
		int price = 10000;
		for (Customer list : customer) {
			System.out.println(list.getCustomerName() + "님이" + list.calPrice(price) + "원 지불 하셨습니다.");
			System.out.println(list.getCustomerName() + "님의 현재 포인트는 " + list.bonusPoint + "점,입니다.");
		}
	}
}
