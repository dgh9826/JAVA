package inheritance_07.lab4;

public class VIPCustomer extends Customer{
	private String agentID;
	double discount;
	
	public VIPCustomer() {		//super() 선언은 반드시 첫라인에 선언
		//super();	<== 슈퍼[부모]클래스의 생성자를 호출 (생략) - 컴파일러가 자동으로 넣는다. 
		customerGrade="VIP";
		bonusRatio=0.05;
		discount=0.1;
	}
	public VIPCustomer(String customerID,String customerName,String agentID) {
		super(customerID,customerName);	//Customer(String customerID,String customerName) 부모 생성자 호출 
		//super(, ,) 위의 super(customerID,customerName)이 선언 안되어있으면 super(, ,)가 
		//자동으로 생성되는데 부모클래스에 매개변수가 3개짜리 생성자가 있어야함
		customerGrade="VIP";
		bonusRatio=0.05;
		discount=0.1;
		this.agentID=agentID;
	}
	@Override
	public int calPrice(int price) {
		bonusPoint+=price*bonusRatio;
		return price -(int)(price*discount);
	} 
	public String getAgentID() {
		return agentID;
	}
	public void setAgentID(String agentID) {
		this.agentID = agentID;
	}
}
