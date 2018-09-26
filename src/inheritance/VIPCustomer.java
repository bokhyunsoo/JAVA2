package inheritance;

public class VIPCustomer extends Customer {

	private int agentID;
	double saleRatio;
	
	public VIPCustomer() {
		this.customerGrade = "VIP";
		this.bonusRatio = 0.05;
		this.saleRatio = 0.1;
	}

	public int getAgentID() {
		return agentID;
	}
}
