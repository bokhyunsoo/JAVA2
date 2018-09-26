package polymorphism;

public class VIPCustomer extends Customer {

	private int agentID;
	double saleRatio;
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		this.customerGrade = "VIP";
		this.bonusRatio = 0.05;
		this.saleRatio = 0.1;
		this.agentID = agentID;
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * this.bonusRatio;
		return price - (int)(price * this.saleRatio);
	}
	
	public String showCustomerInfo() {
		return super.showCustomerInfo() + " 담당 상담원 번호는 " + getAgentID() + "입니다.";
	}

	public int getAgentID() {
		return agentID;
	}
}
