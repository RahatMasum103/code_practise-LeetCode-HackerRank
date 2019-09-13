Multiple parts create a total object. Find minimum time to complete whole parts

Input: 
- # of products
- List containing parts of each product

Output: minimum time

/************************/

// IMPORT LIBRARY PACKAGES NEEDED BY YOUR PROGRAM
// SOME CLASSES WITHIN A PACKAGE MAY BE RESTRICTED
// DEFINE ANY CLASS AND METHOD NEEDED
import java.util.List;
import java.util.*;
// CLASS BEGINS, THIS CLASS IS REQUIRED
public class Solution
{        
    // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    int minimumTime(int numOfParts, List<Integer> parts)
    {
        // WRITE YOUR CODE HERE
        int minTime = 0;
        
        PriorityQueue<Integer> priorQueue = new PriorityQueue<Integer>();
        
        //int len = parts.size();
        //System.out.println("total parts "+ numOfParts + " " + "List size: "+ len);
        for(int i=0; i<numOfParts; i++)
        {
            priorQueue.add(parts.get(i));
        }
        
        //int queueSize = priorQueue.size();
        //System.out.println("queue size: "+ priorQueue.size());
        
        //System.out.println("debug");
        
        while(priorQueue.size() > 1)
        {
            //System.out.println("debug...queue size: "+ priorQueue.size());
            int firstPick = priorQueue.poll();
            int nextPick = priorQueue.poll();
            
            //System.out.println("debug..."+ firstPick + " " + nextPick);
            
            minTime += firstPick+nextPick;
            priorQueue.add(firstPick+nextPick);
        }
        
        return minTime;
    }
    // METHOD SIGNATURE ENDS
}


