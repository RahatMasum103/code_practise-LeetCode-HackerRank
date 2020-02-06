Reverse a singly linked list.

Example:

Input: 1->2->3->4->5->NULL
Output: 5->4->3->2->1->NULL

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        
        ListNode prev = null;
        ListNode next = null;
        ListNode curr = head;
        
        while(curr !=null)
        {
           
            next = curr.next;            
            curr.next = prev;
            prev = curr;
            curr = next;            

        }
        return prev;

        
    }
}
