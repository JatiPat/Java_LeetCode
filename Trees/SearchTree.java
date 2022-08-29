/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) {return null;} //boundary condtion #1: if no match is found, return null
        if (root.val == val) {return root;} //boundary condtion #2: we are returning the root of the value, which will give you the subtree beneath it
        
        if (val < root.val) { //if the value is less than the current root value
          return searchBST(root.left, val); //the value must be on the left branch, recusively call searchBST on the left side
        } else {
          return searchBST(root.right, val); //the value must be on the right branch, recusively call searchBST on the right side
        }
    }
}
