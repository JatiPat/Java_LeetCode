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
    public ListNode removeElements(ListNode head, int val) {
        ListNode temp = new ListNode(0); //temporary list connected to head
        temp.next = head; 
        ListNode current = temp; //current pointer at temp

        while(current != null && current.next != null) { //while there are still nodes
            if (current.next.val == val) { //if the values match
                current.next = current.next.next; //delete the node by skipping over it
            } else {
                current = current.next; //move to the next node normally
            }
        }

        return temp.next; //return the new list
    }
}
