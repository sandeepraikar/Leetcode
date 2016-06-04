package algorithms.easy;


public class MinDepthOfBinaryTree {
	public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }
    public int minDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        if(root.left==null && root.right==null){
            return 1;
        }
        int leftDepth =Integer.MAX_VALUE;
        if(root.left!=null){
            leftDepth=minDepth(root.left);
        }
        
        int rightDepth =Integer.MAX_VALUE;
        if(root.right!=null){
            rightDepth=minDepth(root.right);
        }
        
        return 1+Math.min(leftDepth,rightDepth);
        
    }
}