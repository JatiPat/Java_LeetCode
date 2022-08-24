/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
// if headA and headB intersect at the same node, give node value

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null){
            return null; // if either list are empty return null
        }
        
        ListNode Apointer = headA; //creating pointers to compare one another
        ListNode Bpointer = headB;
        
        while (Apointer != Bpointer){
        //restart both pointers in a way that both travel the same distance of nodes to intersect no matter the difference in the size of nodelist A and B. AKA make pointers loop through again to interstect at the same spot.
            
            if (Apointer == null){ //if A pointer reaches the end of the list, restart at headB
                Apointer = headB;
            } else {
                Apointer = Apointer.next; //else, move to the next node
            }
            
            if (Bpointer == null){ //if B pointer reaches the end of the list, restart at headA
                Bpointer = headA;
            } else {
                Bpointer = Bpointer.next; //else, move to the next node
            }
            
        }
        
        return Apointer; //after the while loop ends, the meet at the same node, giving the intersection value
    }
}
