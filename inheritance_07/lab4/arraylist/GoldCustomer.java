package inheritance_07.lab4.arraylist;

public class GoldCustomer extends Customer {
	double discount; 
	public GoldCustomer() {
		customerGrade="Gold";
		discount=0.05;
	}
	public GoldCustomer (String customerID,String customerName) {
		super(customerID,customerName);
		customerGrade="Gold";
		bonusRatio=0.02;
		discount=0.05;
	}
	@Override
	public int calPrice(int price) {
		bonusPoint += price*bonusRatio;
		return price - (int)(price*discount);
	}
}
