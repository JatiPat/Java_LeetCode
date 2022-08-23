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
    public ListNode oddEvenList(ListNode head) {
            if (head == null) return null; //if nodelist is empty
        
        //making two nodelists: one odd, one even and adding them together at the end
        
        ListNode Oddlist = head; //first value of the nodelist is odd
        ListNode Evenlist = head.next; //second value is even
        ListNode Evenhead = Evenlist; //head of the even nodelist
        
        while (Evenlist != null && Evenlist.next != null){
            Oddlist.next = Evenlist.next; //the node after even must be odd
            Oddlist = Oddlist.next; //move to the next odd node
            Evenlist.next = Oddlist.next; //the node after odd must be even
            Evenlist = Evenlist.next; //move to the next even node
            
        }
        Oddlist.next = Evenhead; //connect the head of the even list to the odd list
        return head; //head is still at the beginning of the oddlist
    }
    
}
