


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class MaxFrequency {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String thisLine = null;
	    
	    Scanner sc = new Scanner(System.in);
	    
	    int n = sc.nextInt();
	    int a[]= new int[n];
	    
	    for(int i=0;i<n;i++)
	    {
	    	a[i] = sc.nextInt();
	    }
	    
	    HashMap <Integer,Integer> hmap = new HashMap<Integer,Integer>();
	    
	    for(int i=0;i<n;i++)
	    {
	    	if(hmap.containsKey(a[i]))
	    	{
	    		int count = hmap.get(a[i]);
	    		hmap.put(a[i], count+1);
	    	}
	    	else {
	    		hmap.put(a[i], 1);
	    	}
	    	
	    }
	    
	    int maxVal = Collections.max(hmap.values());
	    System.out.println("max: "+ maxVal);
	    for(Map.Entry<Integer,Integer> e:hmap.entrySet())
	    {
	    	if(e.getValue() == maxVal)
	    	{
	    		System.out.println("number: "+e.getKey());
	    	}
	    }
	    
	    /*
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    while ((thisLine = br.readLine()) != null) {        
	        
	            System.out.println(thisLine);
	         }	         
*/
	}

}



