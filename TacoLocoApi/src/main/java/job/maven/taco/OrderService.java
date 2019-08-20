package job.maven.taco;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class OrderService {

	List <ItemDetails> itemEntry = new ArrayList<ItemDetails>();
	
	public List<ItemDetails> getAllEntry()
	{
		ItemDetails itemA = new ItemDetails("Veggie Taco", 2.50);
		ItemDetails itemB = new ItemDetails("Chicken or Beef Taco", 3.00);
		ItemDetails itemC = new ItemDetails("Chorizo Taco", 3.50);
		
		itemEntry.add(itemA);
		itemEntry.add(itemB);
		itemEntry.add(itemC);
		
		return itemEntry;		
		
	}
	
	public ItemDetails getCost(String id)
	{
		//System.err.println("debug in function......."+ itemEntry.stream().filter(t -> t.getItemName().equals(id)).findFirst().get());
		return itemEntry.stream().filter(t -> t.getItemName().equals(id)).findFirst().orElse(null);
	}
}
