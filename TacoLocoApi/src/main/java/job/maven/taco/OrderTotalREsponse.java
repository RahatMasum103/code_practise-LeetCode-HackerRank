package job.maven.taco;

import java.util.List;

public class OrderTotalREsponse {

	private List<OrderResponse> orderList;
	private int totalQuantity;
	private double totalCost;
	
	
	public OrderTotalREsponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public List<OrderResponse> getOrderList() {
		return orderList;
	}
	public void setOrderList(List<OrderResponse> orderList) {
		this.orderList = orderList;
	}
	public int getTotalQuantity() {
		return totalQuantity;
	}
	public void setTotalQuantity(int totalQuantity) {
		this.totalQuantity = totalQuantity;
	}
	public double getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}
	
	
}
