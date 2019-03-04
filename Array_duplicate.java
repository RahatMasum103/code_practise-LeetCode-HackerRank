/*
In a array A of size 2N, there are N+1 unique elements, and exactly one of these elements is repeated N times.
Return the element repeated N times.

Example 1:

Input: [1,2,3,3]
Output: 3

Input: [2,1,2,5,3,2]
Output: 2
/*
import java.util.Map.Entry;
import java.util.Set;
class Solution {
    public int repeatedNTimes(int[] A) {
        int x=0;
        int size = A.length;
        HashMap<Integer, Integer> hmap = new HashMap<>();
         
    for (int number : A) 
    {   
        if(hmap.get(number) == null)
        {
            hmap.put(number, 1);
        }
        else
        {
            hmap.put(number, hmap.get(number)+1);
        }
    }
         
    Set<Entry<Integer, Integer>> entrySet = hmap.entrySet();

    for (Entry<Integer, Integer> entry : entrySet) 
    {               
        if(entry.getValue() > 1)
        {
            System.out.println("Duplicate Element : "+entry.getKey()+" - found "+entry.getValue()+" times.");
            x= entry.getKey();
        }
        
    }
        return x;
        
    }
    
}
