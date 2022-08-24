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
    public ListNode mergesort(ListNode list1, ListNode list2){ //Using a merge sort to sort the linked list in order
        ListNode sorted = new ListNode(0); //temporary sorted list
        ListNode current = sorted; //current pointer
        
        while (list1 != null && list2 != null){ //while neither list are empty
            if(list1.val > list2.val){ //if the value of list1 is greater than list two
                current.next = list2; //the next node is list2 since it's smaller (can switch it to list1 to make it descending order)
                list2 = list2.next; //move pointer to the next node
            } else{
                current.next = list1; //else, list1 is smaller and therefore next in the list
                list1 = list1.next; 
            }
            current = current.next; 
        }
        
        //edge case if either list reach null
        if (list1 != null){
            current.next = list1;
            list1 = list1.next;
        }
        
        if (list2 != null){
            current.next = list2;
            list2 = list2.next;
        }
    
        return sorted.next; //return sorted list
    }
    
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null){
            return head; //return the head if it's a single node, or null
        }
        
        ListNode oneStep = head;
        ListNode oneStepTail = head; //making a tail to end one list and begin a new list
        ListNode twoStep = head;
        
        while (twoStep != null && twoStep.next != null){ //same as Middle of the Linked List
            oneStepTail = oneStep;
            oneStep = oneStep.next;
            twoStep = twoStep.next.next;
        }
        
        oneStepTail.next = null; //Separate into two lists
        
        ListNode leftSide = sortList(head); //recursive calling the same function [causing the function to be O(nlogn)]
        ListNode rightSide = sortList(oneStep); //recursive calling the same function
        
        return mergesort(leftSide, rightSide); //return sorted list
    }
}
