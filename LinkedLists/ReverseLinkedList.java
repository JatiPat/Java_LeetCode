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
// Going from 1 2 3 4 5 to 5 4 3 2 1 
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null; // creating nodelist with null in it
        
        while (head !=null){ //while the head is not null AKA there's still nodes left
            ListNode next = head.next; //find the next node in the list and put it in "ListNode next"
            head.next = prev; //the next head is pointing to the previous node Ex: 1 -> 2 changes to 2 -> 1
            prev = head; //list is now the new head
            head = next; //head is the next node in the linked list
        }
        
        return prev; //return reversed nodelist
    }
}
