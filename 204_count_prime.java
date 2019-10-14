Count the number of prime numbers less than a non-negative number, n.

Example:

Input: 10
Output: 4
Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.

/*****************************************************/
class Solution {
    public int countPrimes(int n) {
        
        int count = 0;      
        
        for(int i=2; i<=n; i++)
        {
            if(isPrime(i)) {
                //System.out.print(i);
                count++;
            }
        }      
        
        return count;
    }
    
    public boolean isPrime(int num)
    {
        if(num <=1) 
            return false;
        
        for(int i=2; i<num; i++)
        {
            if(num % i == 0)
            {
                return false;
            }                 
        }
        return true;       
        
    }
}
