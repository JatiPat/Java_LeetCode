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
import static java.lang.Math.*; //Make Sure to import Math class in a real file!
class Solution {
    public int maxDepth(TreeNode root) { //make a bottom up recursive method that starts at the end of both, the left and right branch, then take the maximum of the two depth searches
        if (root == null) { //boundary case, if the node is null, return 0
            return 0; 
        }
        int left_depth = maxDepth(root.left);  //recursively go through the left branch to find its depth
        int right_depth = maxDepth(root.right); //recursively go through the right branch to find its depth
        return Math.max(left_depth, right_depth) + 1; //find the max of the two and add 1 since the first root wasn't counted in 
    }
}
