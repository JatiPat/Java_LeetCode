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
//reverse the list half way through the nodelist and compare each value inside to check if the list is a palindrome

class Solution { 
    public ListNode reverseList(ListNode head){ //made a function to reverse the list (same as Reverse Linked List)
          ListNode prev = null; // creating nodelist with null in it

        while (head !=null){ //while the head is not null AKA there's still nodes left
            ListNode next = head.next; //find the next node in the list and put it in "ListNode next"
            head.next = prev; //the next head is pointing to the previous node Ex: 1 -> 2 changes to 2 -> 1
            prev = head; //list is now the new head
            head = next; //head is the next node in the linked list
        }

        return prev; //return reversed nodelist
    }

    public boolean isPalindrome(ListNode head) {
        ListNode oneStep = head; //both nodes start at the same head node (same as Middle of Linked List)
        ListNode twoStep = head;
        
        while (twoStep !=null && twoStep.next != null){ //while twoStep doesn't equal null or the next node after it
            oneStep = oneStep.next; //move by one step
            twoStep = twoStep.next.next; //move by two steps
        }
        oneStep = reverseList(oneStep); //reverse or flip half of the nodelist 
        twoStep = head;
        
        while (oneStep != null ){ //compare the two lists
            if (oneStep.val != twoStep.val){return false;}  //if they don't equal each other, they are not a palindrome
            oneStep = oneStep.next;
            twoStep = twoStep.next;
        }
        return true; //if all values are compared and correctly matched, the list is a palindrome
    }
}
