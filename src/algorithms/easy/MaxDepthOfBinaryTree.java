package algorithms.easy;

/**
 * @author Sandeep
 *Given a binary tree, find its maximum depth.

The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 */

 
public class MaxDepthOfBinaryTree {
	public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        if(root.left==null && root.right==null){
            return 1;
        }
        int leftDepth =Integer.MIN_VALUE;
        if(root.left!=null){
            leftDepth=maxDepth(root.left);
        }
        
        int rightDepth =Integer.MIN_VALUE;
        if(root.right!=null){
            rightDepth=maxDepth(root.right);
        }
        
        return 1+Math.max(leftDepth,rightDepth);
        
    }
}