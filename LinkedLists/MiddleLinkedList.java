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
    public ListNode middleNode(ListNode head) {
        ListNode oneStep = head; //both nodes start at the same head node
        ListNode twoStep = head;
        
        while (twoStep !=null && twoStep.next != null){ //while twoStep doesn't equal null or the next node after it
            oneStep = oneStep.next; //move by one step
            twoStep = twoStep.next.next; //move by two steps
        }
        return oneStep; //oneStep will always be half as far away as twoStep therefore the middle value must be where oneStep is at the end of the program
    }
}
