package inheritance_07.lab4.arraylist;

public class Customer {
	protected String customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	public Customer() {
		initCustomer();
	}
	public Customer(String customerID,String customerName) {
		this.customerID=customerID;
		this.customerName=customerName;
		initCustomer();
	}
	private void initCustomer() {
		customerGrade="SILVER";
		bonusRatio=0.01;
	}
	public int calPrice(int price) {
		bonusPoint+=price*bonusRatio;
		return price;
	}
	void showCustomerInfo() {
		System.out.println(customerName+"님의 등급은 "+customerGrade+"이고, 보너스 포인트는 "+bonusPoint+"점 입니다. ");
	}
	public String getCustomerID() {
		return customerID;
	}
	public void setCustomerID(String customerID) {
		this.customerID=customerID;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName=customerName;
	}
	public String getCustomerGrade() {
		return customerGrade;
	}
	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
}