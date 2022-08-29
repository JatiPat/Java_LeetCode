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
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null) { //boundary condtion for recusive calling mergeTree
            return root2;
        }
        
        if (root2 == null) { //boundary condtion for recusive calling mergeTree
            return root1;
        }
        
        root1.val += root2.val; //add the values that overlap one another to root 1
       
        root1.right = mergeTrees(root1.right, root2.right); //for the right nodes, merge recusively for both overlapping nodes
        root1.left = mergeTrees(root1.left, root2.left); //for the left nodes, merge recusively for both overlapping nodes
        
        return root1; //return final binary tree
    }
    
}
