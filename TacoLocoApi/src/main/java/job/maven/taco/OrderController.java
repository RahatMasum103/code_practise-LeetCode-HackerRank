package job.maven.taco;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

	public static final int DIS_ORDER = 4;
	@Autowired
	private OrderService tacoOrderService;	
		
	
	@RequestMapping("/hello")
	public String welcome()
	{
		return "Welcome to Taco Loco";
	}
	
	@RequestMapping("/item/details")
	public List<ItemDetails> getTacoItems()
	{
		return tacoOrderService.getAllEntry();
	}
	
	@RequestMapping("/item/{id}")
	public ItemDetails getItemDetails(@PathVariable String id)
	{
		System.err.println("debug in path variable.........."+id);
		return tacoOrderService.getCost(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/item/entry")
	public OrderTotalREsponse orderCalculation(@RequestBody List<OrderRequest> tcReq)
	{	
		OrderTotalREsponse totalRes = new OrderTotalREsponse();
		
		List<OrderResponse> tcRes = new ArrayList<OrderResponse>();
		
		//System.err.println("debug........."+tcReq.get(1).getItemName());
		
		double totalCost=0.0;
		int totalAmount =0;
		
		for(int i=0;i<tcReq.size();i++)
		{
			String name =tcReq.get(i).getItemName();
			int amount = tcReq.get(i).getItemQuantity();
			
			ItemDetails itemReq = tacoOrderService.getCost(name);			
			double cost = itemReq.getItemPrice();
			
			totalAmount += amount;
			totalCost += (cost*amount);
			
			//System.err.println("debug........."+cost);
			
			OrderResponse costItem = new OrderResponse();
			
			costItem.setItemName(name);		
			costItem.setItemCost(cost*amount);
			costItem.setItemQuantity(amount);
			tcRes.add(costItem);
		}
		
		if(totalAmount >= DIS_ORDER)
		{
			double discount = totalCost * 0.20;
			totalCost = totalCost - discount;
		}
		
		totalRes.setOrderList(tcRes);
		totalRes.setTotalCost(totalCost);
		totalRes.setTotalQuantity(totalAmount);
				
		return totalRes;
	}
	
	/* DEBUG Block
	@RequestMapping(method = RequestMethod.POST, value = "/item/entry")
	public List<OrderResponse> orderCalculation(@RequestBody List<OrderRequest> tcReq)
	{	
		List<OrderResponse> tcRes = new ArrayList<OrderResponse>();
		
		//System.err.println("debug........."+tcReq.get(1).getItemName());
		
		for(int i=0;i<tcReq.size();i++)
		{
			String name =tcReq.get(i).getItemName();
			int amount = tcReq.get(i).getItemQuantity();
			
			ItemDetails itemReq = tacoOrderService.getCost(name);			
			double cost = itemReq.getItemPrice();
			
			//System.err.println("debug........."+cost);
			
			OrderResponse costItem = new OrderResponse();
			
			costItem.setItemName(name);		
			costItem.setItemCost(cost*amount);
			costItem.setItemQuantity(amount);
			tcRes.add(costItem);
		}	
				
		return tcRes;
	}
	
	*/
	/* DEBUG BLOCK
	public List<OrderRequest> orederInput(@RequestBody List<OrderRequest> tcReq)
	{		
		return tcReq;
	}
	*/
}
