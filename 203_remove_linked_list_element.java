Remove all elements from a linked list of integers that have value val.

Example:

Input:  1->2->6->3->4->5->6, val = 6
Output: 1->2->3->4->5


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode prev = new ListNode(-1);
        
        ListNode result = prev;
        while(head != null)
        {
            if(head.val == val)
            {
                prev.next = head.next;
                head = head.next;
            }
            else{
                prev.next = head;
                head = head.next;
                prev = prev.next;
            }
        }
        
        return result.next;
    }
}
