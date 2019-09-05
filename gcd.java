


// IMPORT LIBRARY PACKAGES NEEDED BY YOUR PROGRAM
// SOME CLASSES WITHIN A PACKAGE MAY BE RESTRICTED
// DEFINE ANY CLASS AND METHOD NEEDED
// CLASS BEGINS, THIS CLASS IS REQUIRED
class GCD
{
    // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    
    static int nGcd(int a, int b){
        if(a==0) return b;
        else return nGcd(b%a,a);
    }
    
    public int generalizedGCD(int num, int[] arr)
    {
        // WRITE YOUR CODE HERE
        int result_gcd = arr[0];
        for(int i=1; i<num; i++)
        {
            result_gcd = nGcd(arr[i],result_gcd);
        }
        return result_gcd;
    }
    // METHOD SIGNATURE ENDS
}
