/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null) { //if the head is null then return false. Need this to avoid java.lang.NullPointerException
            return false;
        }
        
        ListNode oneStep = head; //checking each node one step at a time
        ListNode twoStep = head.next; //checking each node TWO step at a time
        
        while (oneStep != twoStep){ //while they don't equal the same node then
            
            
            if (twoStep == null || twoStep.next == null){  //make sure twoStep hasn't reached end of the list
                return false;
            }
            
            oneStep = oneStep.next; //move one step
            twoStep = twoStep.next.next; //move two step
    
        }
        
        return true; //if they do equal each other, it must mean they both point to the same node and it's a linked list cycle
    }
}
