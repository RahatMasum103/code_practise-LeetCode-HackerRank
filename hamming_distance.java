/*
The Hamming distance between two integers is the number of positions at which the corresponding bits are different.
Given two integers x and y, calculate the Hamming distance.

Input: x = 1, y = 4
Output: 2

Explanation:
1   (0 0 0 1)
4   (0 1 0 0)
       ↑   ↑
*/

class Solution {
    public int hammingDistance(int x, int y) {
        
        int bitConv = x ^ y;
        int ham_dist =0;
        while (bitConv > 0)
        {
            ham_dist += bitConv & 1;
            bitConv >>= 1;
        }
        return ham_dist;
    }
}
