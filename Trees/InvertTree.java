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
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {return null; } //boundary condtion for recusive calling invertTree
        
        TreeNode left = invertTree(root.left); //traveling down left branch, recusively called 
        TreeNode right = invertTree(root.right);//traveling down right branch, recusively called 
        
        root.left = right; //swapping the left root with the right branch 
        root.right = left; //swapping the right root with the left branch 
        
        return root; //return the new binary tree
    }
