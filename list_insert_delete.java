Sample Input

5
12 0 1 78 12
2
Insert
5 23
Delete
0
Sample Output

0 1 78 12 23

/****************************************/


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        List <Integer> numList = new ArrayList<Integer>();

        for(int i=0; i<N; i++)
        {
            int n = sc.nextInt();
            numList.add(n);            
        } 
        int numQ = sc.nextInt();

        for(int i=0; i<numQ;i++)
        {
            String query = sc.next();
            if(query.equals("Insert"))
            {
                int idx = sc.nextInt();
                int val = sc.nextInt();
                numList.add(idx,val); 
            }
            else{
                int idx = sc.nextInt();
                numList.remove(idx);
            }
        }

        sc.close();       
        
        /* Print our updated Linked List */
        for (Integer num : numList) {
            System.out.print(num + " ");
        }
    
    }
}

