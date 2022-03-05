import java.util.HashMap;
import java.util.Map;

public class Maps {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, Float> map = new HashMap<String, Float>();   
		map.put("Chicken with mayonnaise",  350.8f);  
		map.put("Shawarma", 100.23f);   
		map.put("Sandwich with milkshake", 180.00f);   
		map.put("Fries with dip", 70.89f);   
		for (Map.Entry<String,Float> entry : map.entrySet()) 
		{    
		System.out.println("Item: " + entry.getKey() + ", Price: " + entry.getValue());   
		}
		
		
		Map<String,String> map1=new HashMap<String, String>();
		map1.put("Mohamed", "Anwar");
		map1.put("Pradeep", "Kumar");
		map1.put("Mohamed", "Aqeel");
		map1.put("Salman", "Farish");
		map1.put("Mohamed", "Aslam");
		
		for (String name: map1.keySet())         
		{  
		String lastname=map1.get(name);   
		System.out.println("Key: " + name + ", Value: " + lastname);   
		}     
	}
}
