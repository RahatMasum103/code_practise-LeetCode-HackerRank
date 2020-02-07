
Given a singly linked list, determine if it is a palindrome.

Example 1:

Input: 1->2
Output: false
Example 2:

Input: 1->2->2->1
Output: true
Follow up:
Could you do it in O(n) time and O(1) space?

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        
        Stack<Integer> elementStack = new Stack();
        ListNode temp = head;
        
        while(temp != null)
        {
            elementStack.push(temp.val);
            temp = temp.next;
        }
        
        //System.out.println(elementStack.size());
        
        while(head != null)
        {
            if(head.val != elementStack.pop())
            {
                return false;                
            }
            else{
                head = head.next;
            }
            
        }
        return true;
    }
}
