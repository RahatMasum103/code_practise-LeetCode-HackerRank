





// IMPORT LIBRARY PACKAGES NEEDED BY YOUR PROGRAM
import java.util.List;
import java.util.ArrayList;
// SOME CLASSES WITHIN A PACKAGE MAY BE RESTRICTED
// DEFINE ANY CLASS AND METHOD NEEDED
// CLASS BEGINS, THIS CLASS IS REQUIRED
public class Solution
{        
  // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    public List<Integer> cellCompete(int[] states, int days)
    {
    // WRITE YOUR CODE HERE
    
    List<Integer> temp = new ArrayList<Integer> ();
    List<Integer> result = new ArrayList<Integer> ();
    int len = states.length;
    
    for(int i=0; i< len; i++)
    {
        temp.add(states[i]);
    }
    int t1, tN;
    while(days>0)
    {
        t1 = 0^states[1];
        tN= 0^states[len-2];

        temp.set(0,t1);
        temp.set(len-1,tN);
        for(int i=1; i<len-1; i++)
    {
        int val = states[i-1] ^ states [i+1];
        temp.set(i,val);
    }
    for(int i=0; i< len; i++)
    {
        states[i] = temp.get(i);
    }
    --days;
    }
    
    for(int i=0; i< len; i++)
    {
        result.add(states[i]);
    }
   
    
    return result;
    }
  // METHOD SIGNATURE ENDS
}
