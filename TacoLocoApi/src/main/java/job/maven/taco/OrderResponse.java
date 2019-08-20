package job.maven.taco;


public class OrderResponse {

	private String itemName;
	private int itemQuantity;
	private double itemCost;
		
	public OrderResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}


	public int getItemQuantity() {
		return itemQuantity;
	}


	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}


	public double getItemCost() {
		return itemCost;
	}


	public void setItemCost(double itemCost) {
		this.itemCost = itemCost;
	}	
	
	
	



	
	
	
	
}
