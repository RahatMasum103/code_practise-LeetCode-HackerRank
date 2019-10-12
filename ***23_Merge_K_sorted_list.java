Merge k sorted linked lists and return it as one sorted list. Analyze and describe its complexity.

Example:

Input:
[
  1->4->5,
  1->3->4,
  2->6
]
Output: 1->1->2->3->4->4->5->6


/************************************************/



/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(ListNode node : lists)
        {
            while(node != null)
            {
                pq.offer(node.val);
                node = node.next;
            }
        }
        
        ListNode temp = new ListNode(0);
        ListNode head = temp;
        
        while(!pq.isEmpty())
        {
            head.next = new ListNode(pq.poll());
            head = head.next;
        }
        
        return temp.next;
    }
}
