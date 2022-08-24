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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = new ListNode(0); //making new temporary list to act as a reference to head
        temp.next = head; //connect temp.next to head
        
        ListNode slow = temp; //start both fast and slow pointers at temp
        ListNode fast = temp;
        
        for (int i = 1; i <= n+1; i++){ //move fast pointer n+1 amount of times to reach the nth node
            fast = fast.next;
        }
        
        while (fast != null){ //while the fast pointer hasn't reached the end of the list
            slow = slow.next; //move slow to the n-1 node
            fast = fast.next;//move node to the end of the node
        }
        
        slow.next = slow.next.next; //delete the nth node by directly connecting n-1 to the end node
        return temp.next; //return new list
    }
}
