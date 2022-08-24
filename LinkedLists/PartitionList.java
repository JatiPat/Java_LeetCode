/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) { //create two lists that hold the values less than x and more than x
        
        ListNode before_head = new ListNode(0); //making the two lists and attaching pointers to its heads
        ListNode before = before_head;
        ListNode after_head = new ListNode(0);
        ListNode after = after_head;
        
           while (head != null) { //while head node doesn't equal null
            if (head.val < x) { 
                before.next = head; //if head is less than x, put it in the before list
                before = before.next; //move to before pointer the next node
            } else {
                after.next = head; //if head is more than x, put it in the after list
                after = after.next; //move to aftter pointer the next node
            }
               
            head = head.next; //move to the next node in the original list
        }

        after.next = null; //to end the after list, add null to the end

        before.next = after_head.next; //combine the two lists together by attaching before-tail to after-head

        return before_head.next; //return the new list
    }
}
