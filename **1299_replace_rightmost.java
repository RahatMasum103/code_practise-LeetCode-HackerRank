Given an array arr, replace every element in that array with the greatest element among the elements to its right, and replace the last element with -1.

After doing so, return the array. 

Example 1:

Input: arr = [17,18,5,4,6,1]
Output: [18,6,6,6,1,-1]


class Solution {
    public int[] replaceElements(int[] arr) {
        
        int len = arr.length;
        int max = arr[len-1]; // setting rightmost element as initial Greatest
        
        arr[len-1] = -1; // setting last element to '-1' as required
        
        /* O(n) time | O(1) space */
        
        for(int i= len-2; i>=0; i--) // start from the right side of the array
        {
            int temp = arr[i]; // to save extra space, hold current element into temporary
            arr[i] = max; // replace with greatest value from right
            
            if(temp > max) // check to update MAX for next element
            {
                max = temp; //current value is greater than right most so far
            }
        }
        return arr; //same array without extra space
        
    }
}
